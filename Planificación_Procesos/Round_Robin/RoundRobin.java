import java.util.*;

class Proceso {
    String nombre;
    int llegada;
    int rafaga;
    int restante;
    int finalizacion;
    int turnaround;
    int espera;
    boolean enCola = false;

    public Proceso(String nombre, int llegada, int rafaga) {
        this.nombre = nombre;
        this.llegada = llegada;
        this.rafaga = rafaga;
        this.restante = rafaga;
    }
}

public class RoundRobin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // === Entrada de datos ===
        System.out.print("Ingrese número de procesos: ");
        int n = sc.nextInt();

        List<Proceso> procesos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Nombre del proceso: ");
            String nombre = sc.next();
            System.out.print("Tiempo de llegada: ");
            int llegada = sc.nextInt();
            System.out.print("Ráfaga (CPU burst): ");
            int rafaga = sc.nextInt();
            procesos.add(new Proceso(nombre, llegada, rafaga));
        }

        System.out.print("Ingrese el Quantum: ");
        int quantum = sc.nextInt();

        // === Simulación Round Robin ===
        Queue<Proceso> cola = new LinkedList<>();
        int tiempo = 0;
        List<String> gantt = new ArrayList<>();

        // Ordenar por llegada inicial
        procesos.sort(Comparator.comparingInt(p -> p.llegada));

        while (true) {
            // 1) Agregar procesos listos
            for (Proceso p : procesos) {
                if (p.llegada <= tiempo && p.restante > 0 && !p.enCola) {
                    cola.add(p);
                    p.enCola = true;
                }
            }

            // 2) Si la cola está vacía
            if (cola.isEmpty()) {
                // Verificar si todos terminaron
                if (procesos.stream().allMatch(p -> p.restante == 0)) break;

                // Avanzar al siguiente tiempo de llegada
                int siguienteLlegada = procesos.stream()
                        .filter(p -> p.restante > 0)
                        .mapToInt(p -> p.llegada)
                        .min()
                        .orElse(tiempo);
                gantt.add("Idle(" + tiempo + "-" + siguienteLlegada + ")");
                tiempo = siguienteLlegada;
                continue;
            }

            // 3) Ejecutar siguiente proceso
            Proceso actual = cola.poll();
            actual.enCola = false;

            int ejecucion = Math.min(quantum, actual.restante);
            gantt.add(actual.nombre + "(" + tiempo + "-" + (tiempo + ejecucion) + ")");

            tiempo += ejecucion;
            actual.restante -= ejecucion;

            // 4) Agregar procesos que llegaron mientras tanto
            for (Proceso p : procesos) {
                if (p.llegada <= tiempo && p.restante > 0 && !p.enCola) {
                    cola.add(p);
                    p.enCola = true;
                }
            }

            // 5) Si no terminó, reencolar
            if (actual.restante > 0) {
                cola.add(actual);
                actual.enCola = true;
            } else {
                actual.finalizacion = tiempo;
                actual.turnaround = actual.finalizacion - actual.llegada;
                actual.espera = actual.turnaround - actual.rafaga;
            }
        }

        // === Resultados ===
        System.out.println("\nResultados Round Robin (Corregido):\n");
        System.out.printf("%-6s %-8s %-8s %-12s %-12s %-8s\n",
                "Proc", "Llegada", "Ráfaga", "Finalización", "Turnaround", "Espera");

        int totalTA = 0, totalW = 0;
        for (Proceso p : procesos) {
            totalTA += p.turnaround;
            totalW += p.espera;
            System.out.printf("%-6s %-8d %-8d %-12d %-12d %-8d\n",
                    p.nombre, p.llegada, p.rafaga, p.finalizacion, p.turnaround, p.espera);
        }

        System.out.println("\nPromedios:");
        System.out.printf("Turnaround promedio: %.2f\n", (double) totalTA / n);
        System.out.printf("Tiempo de espera promedio: %.2f\n", (double) totalW / n);

        // === Diagrama de Gantt ===
        System.out.println("\nDiagrama de Gantt:");
        for (String bloque : gantt) {
            System.out.print(" | " + bloque);
        }
        System.out.println(" |");
    }
}

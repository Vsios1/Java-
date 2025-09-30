import java.util.*;

class Proceso {
    String nombre;
    int tiempoRestante;

    public Proceso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempoRestante = tiempo;
    }
}

public class RoundRobin {
    public static void main(String[] args) {
        Queue<Proceso> cola = new LinkedList<>();

        // Lista de procesos con su tiempo total de ejecución
        cola.add(new Proceso("P1", 10));
        cola.add(new Proceso("P2", 4));
        cola.add(new Proceso("P3", 6));

        int quantum = 3;
        System.out.println("Planificación Round Robin:");

        while (!cola.isEmpty()) {
            Proceso actual = cola.poll(); // Extrae el primer proceso

            int tiempoEjecutado = Math.min(quantum, actual.tiempoRestante);
            actual.tiempoRestante -= tiempoEjecutado;

            System.out.println("→ " + actual.nombre + " ejecuta " + tiempoEjecutado + " unidades");

            if (actual.tiempoRestante > 0) {
                cola.add(actual); // Vuelve al final de la cola
            } else {
                System.out.println("✓ " + actual.nombre + " ha terminado");
            }
        }
    }
}

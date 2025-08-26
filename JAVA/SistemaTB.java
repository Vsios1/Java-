import java.util.Scanner;

public class SistemaTB {
    public static void main(String[] arg) {

        Scanner tb = new Scanner(System.in);
        String Nombre = "";
        int Clave = 0, Antiguedad = 0;

        System.out.println("******************************************************");
        System.out.println("*Bienvenido al sistema vacacional de Coca-Cola Companyjava*");
        System.out.println("******************************************************\n");

        System.out.print("¿Cuál es tu nombre?: ");
        Nombre = tb.nextLine();

        System.out.print("¿Cuál es su Tiempo de Servicio en la Empresa?: ");
        Antiguedad = tb.nextInt();

        System.out.print("¿Cuál es su Clave?: ");
        Clave = tb.nextInt();
        System.out.println();

        if (Clave == 1) {
            if (Antiguedad == 1) {
                System.out.println("El Trabajador " + Nombre + " tiene derecho a 6 días de vacaciones");
            } else if (Antiguedad >= 2 && Antiguedad <= 6) {
                System.out.println("El Trabajador " + Nombre + " tiene derecho a 14 días de vacaciones");
            } else if (Antiguedad >= 7) {
                System.out.println("El Trabajador " + Nombre + " tiene derecho a 20 días de vacaciones");
            } else {
                System.out.println("El Trabajador " + Nombre + " aún no tiene derecho a vacaciones");
            }

        } else if (Clave == 2) {
            if (Antiguedad == 1) {
                System.out.println("El Trabajador " + Nombre + " tiene derecho a 7 días de vacaciones");
            } else if (Antiguedad >= 2 && Antiguedad <= 6) {
                System.out.println("El Trabajador " + Nombre + " tiene derecho a 15 días de vacaciones");
            } else if (Antiguedad >= 7) {
                System.out.println("El Trabajador " + Nombre + " tiene derecho a 22 días de vacaciones");
            } else {
                System.out.println("El Trabajador " + Nombre + " aún no tiene derecho a vacaciones");
            }

        } else if (Clave == 3) {
            if (Antiguedad == 1) {
                System.out.println("El Trabajador " + Nombre + " tiene derecho a 10 días de vacaciones");
            } else if (Antiguedad >= 2 && Antiguedad <= 6) {
                System.out.println("El Trabajador " + Nombre + " tiene derecho a 20 días de vacaciones");
            } else if (Antiguedad >= 7) {
                System.out.println("El Trabajador " + Nombre + " tiene derecho a 30 días de vacaciones");
            } else {
                System.out.println("El Trabajador " + Nombre + " aún no tiene derecho a vacaciones");
            }

        } else {
            System.out.println("Error! El departamento no existe.");
        }

        tb.close();
    }
}

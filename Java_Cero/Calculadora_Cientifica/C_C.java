import java.util.Scanner; 

public class C_C {

    public static void main(String args[]) {

        Scanner cc = new Scanner(System.in);
        int val_uno = 0, val_dos = 0, Proc = 0; 

        System.out.println("=====================================");
        System.out.println("Bienvenido a la Calculadora Universal");
        System.out.println("=====================================");

        System.out.println("Ingresa el primer valor: ");
        val_uno = cc.nextInt();

        System.out.println("Ingresa el segundo valor: ");
        val_dos = cc.nextInt();

        System.out.println("==============================================");
        System.out.println("Elige el tipo de operacion que deseas realizar");
        System.out.println("==============================================");
        System.out.println("1. Operaciones Basica");
        System.out.println("2. Operaciones Avanzada");
        System.out.println("3. Funciones Trigonometricas");
        System.out.println("Elegi una opción: ");
        System.out.println("==============================================");

        int Opc = cc.nextInt();
    }
}
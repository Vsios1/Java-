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
        System.out.println("1. Operaciones Basicas");
        System.out.println("2. Operaciones Avanzadas");
        System.out.println("3. Funciones Trigonometricas");
        System.out.println("Elegi una opción: ");
        System.out.println("==============================================");
        
        int Opc = cc.nextInt();
        switch (Opc) {
            case 1:
                System.out.println("=================");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. Divición");
                System.out.println("=================");
                int Opc_1 = cc.nextInt();
                switch (Opc_1) {
                case 1: 
                    Proc = val_uno + val_uno;
                    System.out.println("El producto es: " + Proc);
                    break;
                case 2: 
                    Proc = val_uno - val_uno;
                    System.out.println("El producto es: " + Proc);
                    break;
                case 3 : 
                    Proc = val_uno * val_uno;
                    System.out.println("El producto es: " + Proc);
                    break;
                case 4 :
                    if (val_dos != 0) {
                    Proc = val_uno / val_dos;
                    System.out.println("El resultado es: " + Proc);
                    } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                default:
                    System.out.println("Error, la opción no existe");
            
                break;
            case 2:
                
                break; 
    
        }
    }
}
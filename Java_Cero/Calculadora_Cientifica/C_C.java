import java.util.Scanner; 

public class C_C {

    public static void main(String[] args) {

        Scanner cc = new Scanner(System.in);
        double val_uno = 0, val_dos = 0, Proc = 0; 

        System.out.println("=====================================");
        System.out.println("Bienvenido a la Calculadora Universal");
        System.out.println("=====================================");

        System.out.println("Ingresa el primer valor: ");
        val_uno = cc.nextDouble();

        System.out.println("Ingresa el segundo valor: ");
        val_dos = cc.nextDouble();

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
                System.out.println("4. División");
                System.out.println("=================");
                int Opc_1 = cc.nextInt();
                switch (Opc_1) {
                    case 1: 
                        Proc = val_uno + val_dos;
                        System.out.println("La suma es: " + Proc);
                        break;
                    case 2: 
                        Proc = val_uno - val_dos;
                        System.out.println("La resta es: " + Proc);
                        break;
                    case 3 : 
                        Proc = val_uno * val_dos;
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
                }
                break;

            case 2:
                System.out.println("==================================");
                System.out.println("1. Raiz Cuadrada del Primer Valor");
                System.out.println("2. Raiz Cuadrada del Segundo Valor");
                System.out.println("3. Potenciación");
                System.out.println("=================");
                int Opc_2 = cc.nextInt();
                switch (Opc_2) {
                    case 1:
                        if (val_uno >= 0) {
                            System.out.println("La raíz cuadrada de " + val_uno + " es: " + Math.sqrt(val_uno));
                        } else {
                            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                        }
                        break;
                    case 2:
                        if (val_dos >= 0) {
                            System.out.println("La raíz cuadrada de " + val_dos + " es: " + Math.sqrt(val_dos));
                        } else {
                            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                        }
                        break;
                    case 3:
                        Proc = Math.pow(val_uno, val_dos);
                        System.out.println("El resultado es: " + Proc);
                        break;
                    default:
                        System.out.println("Error, la opción no existe"); 
                }
                break; 

            case 3:
                break;

            default:
                System.out.println("Error, la opción no existe");
        }
    }
}

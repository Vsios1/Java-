import java.util.Scanner;
public class Seleccion {
    public static void main(String args[]){
        Scanner Op = new Scanner(System.in);

        int operación = 0;
        int num_uno = 78;
        int num_dos = 69;
        double resultado = 0.00;

        System.out.println("Operacoines que se  puede ejecutar.");
        System.out.println("1. Suma");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicación");
        System.out.println("4. Divición");
        System.out.println("Que operación desea realizar?");
        operación = Op.nextInt();
        System.out.println("-------------------------------");

        if(operación == 1){
            resultado = num_uno + num_dos; 
            System.out.println("El resultado de la operacion es: " + resultado);
        }else if(operación == 2){
            resultado = num_uno - num_dos; 
            System.out.println("El resultado de la operacion es: " + resultado);
        }else if(operación == 3){
            resultado = num_uno * num_dos; 
            System.out.println("El resultado de la operacion es: " + resultado);
        }else if(operación == 4){
            resultado = num_uno / num_dos; 
            System.out.println("El resultado de la operacion es: " + resultado);
        }else {
            System.out.println("La opcion no existe");
        }

        Op.close();
    }
    
}

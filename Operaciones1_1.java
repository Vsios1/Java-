import java.util.Scanner;

public class Operaciones1_1 {
    public static void main(String args[]) {
        Scanner Pr = new Scanner(System.in);

        int num_1 = 0, num_2 = 0, resultado = 0;

        System.out.println("");
        System.out.println("Bienvenido a la calculadora");
        System.out.println("");

        System.out.print("Ingresa tu primer valor: ");
        num_1 = Pr.nextInt();

        System.out.print("Ingresa tu segundo valor: ");
        num_2 = Pr.nextInt();

        System.out.println("");
        System.out.println("Elige qué operación deseas realizar");
        System.out.println(" 1. SUMAR ");
        System.out.println(" 2. RESTAR ");
        System.out.println(" 3. MULTIPLICAR ");
        System.out.println(" 4. DIVIDIR ");
        System.out.println(" 5. SENO (de num_1)");
        System.out.println(" 6. COSENO (de num_1)");
        System.out.println(" 7. TANGENTE (de num_1)");
        System.out.println(" 8. RAÍZ CUADRADA (de num_1)");
        System.out.print("Elige una opción (1-8): ");
        System.out.println("");

        int parametro = Pr.nextInt();

        switch (parametro) {
            case 1:
                resultado = num_1 + num_2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 2:
                resultado = num_1 - num_2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 3:
                resultado = num_1 * num_2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 4:
                if (num_2 != 0) {
                    resultado = num_1 / num_2;
                    System.out.println("El resultado es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            case 5:
                System.out.println("El seno de " + num_1 + " es: " + Math.sin(Math.toRadians(num_1)));
                break;
            case 6:
                System.out.println("El coseno de " + num_1 + " es: " + Math.cos(Math.toRadians(num_1)));
                break;
            case 7:
                System.out.println("La tangente de " + num_1 + " es: " + Math.tan(Math.toRadians(num_1)));
                break;
            case 8:
                if (num_1 >= 0) {
                    System.out.println("La raíz cuadrada de " + num_1 + " es: " + Math.sqrt(num_1));
                } else {
                    System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                }
                break;
            default:
                System.out.println("Error, la opción no existe");
        }

        Pr.close();
    }
}
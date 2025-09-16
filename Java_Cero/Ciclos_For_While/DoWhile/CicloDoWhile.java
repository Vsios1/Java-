public class CicloDoWhile {

    public static void main(String arg[]){

        int num_1 = 20, num_2 = 14, resultado = 0;

        do {

            resultado = num_1 * num_2;
            
            System.out.print("Tu resultado es: " + resultado);
        } while(resultado < 500);  
    }
}
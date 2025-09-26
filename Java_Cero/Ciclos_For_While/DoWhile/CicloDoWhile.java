public class CicloDoWhile {

    public static void main(String arg[]){

        int num_1 = 20, num_2 = 14, resultado = 0;

        do {
            
            System.out.print(" Tu resultado es: " + resultado);
            resultado = num_1 * num_2;
            num_1++;
            num_2++;
        } while(resultado <= 500);  
    }
}
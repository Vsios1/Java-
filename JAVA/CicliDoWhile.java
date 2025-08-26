public class CicliDoWhile {
 public static void main( String arg[]){
  
   int num_1 = 5, num_2 = 6, resultado = 0;
   
  do{
   
   resultado = num_1 * num_2;
   System.out.print("Tu resultado mayor es: " + resultado);
  
  }while(resultado > 5000);
 }
}
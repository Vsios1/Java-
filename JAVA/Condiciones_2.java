public class Condiciones_2 {
   public static void main (String args[]){

   int operación=5;
   int num_uno=4;
   int num_dos=6;
   int resultado=0;

   if(operación == 1){
      resultado = num_uno + num_dos;
      System.out.println("El resultado de la suma es:" + resultado);
    } else if(operación == 2){
      resultado = num_uno - num_dos;
      System.out.println("El resultado de la resta es:" + resultado);
    } else if(operación == 3){
      resultado = num_uno * num_dos;
      System.out.println("El resultado de la multiplicación es:" + resultado);
    } else if(operación == 4){
      resultado = num_uno / num_dos;
      System.out.println("El resultado de la división  es:" + resultado);
    } else {
      System.out.println("La opción no existe");
    }
  }
}
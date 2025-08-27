public class Operaciones {
  public static void main(String args[]){
   int num_uno=4;
   int num_dos=6;
   double resultado=0;
   resultado = num_uno + num_dos / 9;
   System.out.println("El resultado incorrecto es" + resultado);


   resultado = (num_uno + num_dos) / 9;
   System.out.println("El resultado correcto es" + resultado);
 }
}
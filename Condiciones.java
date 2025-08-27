public class Condiciones {
  public static void main (String args[]){


   int nota_uno=58;
   int nota_dos=34;
   int nota_tres=15;
   int promedio=0;

  promedio = (nota_uno + nota_dos + nota_tres) / 3;
  
  if(promedio >= 51){
    System.out.println("El alumno aprobó "+ promedio);
   } else {
    System.out.println("El alumno reprobo  "+ promedio);
   }
 }
}
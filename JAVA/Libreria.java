import java.util.Scanner;

public  class Libreria {
 public static void main(String args[]){
  Scanner in = new  Scanner(System.in);
  String nombre=""; 
  int num_uno=0, num_dos=0, resultado=0;

  System.out.println("¿Cual es tu nombre?");
  nombre = in.nextLine();

  System.out.println("Dame tu Primer valor para la suma");
  num_uno = in.nextInt();
  
  System.out.println("Dame tu Segundo valor para la suma");
  num_dos = in.nextInt();

  resultado = num_uno + num_dos;
  System.out.println("Holi "+ nombre + "tu resultado resultado es "+ resultado);
  in.close(); //Buena Practica: Cerrar el Scanner 
 }
}
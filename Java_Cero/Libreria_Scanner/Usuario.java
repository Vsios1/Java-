import java.util.Scanner; 

public class Usuario {

    public static void main(String args[]){
        Scanner Us = new Scanner(System.in);
        String Name = " ";
        int num_uno = 0, num_dos = 0, resultado = 0;

        System.out.println("Su Nombre Completo: ");
        Name = Us.nextLine();

        System.out.println("Ingrese el primer valor:");
        num_uno = Us.nextInt();

        System.out.println("Ingrese el segundo valor:");
        num_dos = Us.nextInt();

        resultado = num_uno + num_dos; 
        System.out.println("Hola " + Name + "el resultado de la suma es de: " + resultado); 
        Us.close();
    }
}
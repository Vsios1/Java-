public class Promedio {

    public static void main(String args[]) {

        int nota_uno = 46;
        int nota_dos = 68;
        int nota_tres = 52;
        int promedio = 0;

        promedio = (nota_uno + nota_dos + nota_tres) / 3;

        if(promedio >= 51){
            System.out.println("El alumno aprobo: " + promedio);
        } else  {

            System.out.println("El alumno reprobo: " + promedio);
        }
    }
    
}

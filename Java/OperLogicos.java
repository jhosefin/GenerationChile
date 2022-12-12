import java.io.Console;

public class OperLogicos {
    public static void main( String[] args) {
        //operadores logicos en javascript 
        /*
         * y -> &&
         * o -> ||
         * negación logica -> !
         * 
         */

         //Operadores de comparación
        /*
         * comparaciones de numeros
         * 4>7 -> falso
         * 5<10 -> verdadero
         * 9==4 -> falso
         */

        Console console = System.console();
        String numero = console.readLine("Ingresa el numero 1 : ");
        int numeroInt1 = Integer.parseInt(numero);

        int numero2 = Integer.parseInt(console.readLine("Ingresa el numero 2 : "));
        
        if(numeroInt1 > numero2){
            System.out.println("El primer número es mayor");
        }else{
            System.out.println("El Segundo número es mayor");

        }
    }

}

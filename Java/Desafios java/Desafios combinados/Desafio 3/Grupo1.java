import java.io.Console;

public class Grupo1 {
    public static void main(String[] args) {

        Console console = System.console();
        int suma = 0;
        int Resta = 0;
        int Multipli = 1;
        int division = 1;

        
        for(int i = 0; i < 5; i++){
            int numeros = Integer.parseInt(console.readLine("Ingrese un numero: " ));

            suma += numeros;

            Resta = Resta - numeros;

            Multipli *= numeros;

            division = numeros / division;


        }
        System.out.println("La Suma de todos los numeros ingresados es: "+suma);
        System.out.println("La Resta de todos los numeros ingresados es: "+Resta);
        System.out.println("La Multiplicación de todos los numeros ingresados es: "+Multipli);
        System.out.println("La División de todos los numeros ingresados es: "+division);
    }
}

import java.io.Console;

/*Desafio 2
Cree un proyecto nombre libre pista Vamos a encontrar el área y el perímetro de un círculo.
Escriba una aplicación Java que solicite al usuario que ingrese el diámetro de un círculo y calcule el área y el perímetro del círculo.
Realice una operación de conversión ampliada (de entero a doble) al almacenar el resultado de las operaciones.
Imprime los resultados de las dos operaciones en la consola.*/

public class PeriyDia {

    public static void main ( String [] args ){
        Console console = System.console();
        String diametro = console.readLine("Ingrese el diametro de un circulo: ") ;
        int dimetro1 = Integer.parseInt(diametro);

        int radio = dimetro1 / 2;
        double radio1 = (double) radio;
        Double area = Math.PI * Math.pow(radio1, 2);

        Double perimetro = (2 * Math.PI * radio1);
        


        System.out.println("El area es: "+area);
        System.out.println("El perimetro es: "+perimetro);


    }
    
}

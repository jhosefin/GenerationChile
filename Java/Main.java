import java.io.Console;

public class Main {

    //Imprimir en consola en javascript -> console.log();

    public static void main (String [] args ){
        System.out.print("Este es un mensaje");//imprime sin salto de linea
        System.out.println("Este es un mensaje"); // imprime con salto de linea
        //Imprimir en java -> System.out.print();
        //para pedirle información al usuario se ocupa

        Console console = System.console();
        //Solicitando un nombre y guardando en la variable nombre
        String nombre = console.readLine("Ingrese el nombre: ") ;
        System.out.println("Este es el nombre "+nombre);

        //Solicitando un numero y guardando en la variable nuevoNum
        String num = console.readLine("Inserte numero:");
        int nuevoNum = Integer.parseInt(num);
        System.out.println("El numero es: "+nuevoNum);

        //sumando numeros
        //Solicitando primer numero
        String num1 = console.readLine("Inserte numero 1: ");
        int nuevoNum1 = Integer.parseInt(num1);

        //solicitando segundo numero
        String num2 = console.readLine("Inserte numero 2: ");
        int nuevoNum2 = Integer.parseInt(num2);
        
        //Sumando numeros
        int suma = nuevoNum1 + nuevoNum2;
        System.out.println("La suma de los numeros es: " + suma);

        //suma de forma optimizada
        int suma2 = Integer.parseInt(num1) + Integer.parseInt(num2);
        System.out.println("La suma de los numeros es: " + suma2);
        


        
    }
    
}
    

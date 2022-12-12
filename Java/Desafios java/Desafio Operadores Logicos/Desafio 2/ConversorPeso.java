

/*Cree una clase que se llame conversorPeso
cree un menú en donde se le pida al usuario ingresar:
1 si desea covertir el peso en marte
2 si desea convertir el peso en luna.
Luego pida al usuario el peso que desea convertir.
realice la busqueda de cuantos kilos en tierra son en marte y en la luna
calcule cuanto sería el peso ingresado
muestre en pantalla el siguente mensaje según la seleccion del usuario
"El peso ingresado en la luna sería de: ...."
"El peso ingresado en Marte sería de: ...."*/
import java.io.Console;

public class ConversorPeso {
    public static void main( String[] args) {

        Console console = System.console();

        int eleccion = Integer.parseInt(console.readLine("Ingrese 1 : si desea covertir el peso en marte \n Ingrese 2 : si desea covertir el peso en la luna \n"));
            while(eleccion <= 0 || eleccion >= 3){
                eleccion = Integer.parseInt(console.readLine("Oups!! Recuerda Ingrese 1 : si desea covertir el peso en marte \n Ingrese 2 : si desea covertir el peso en la luna \n"));
            }


        if(eleccion == 1 || eleccion == 2){ 
        int peso = Integer.parseInt(console.readLine("Ingrese su peso: "));
    
        
        switch(eleccion){
            case 1 :
            Float martes = (float)((peso / 9.81 ) * 3.711) ;

            System.out.println("El peso ingresado en Marte sería de: "+ martes);
            break;

            case 2 :
            Float Luna = (float) (peso  /  9.81 * 1.622) ;

            System.out.println("El peso ingresado en La luna sería de: "+ Luna);
            break;


        }
        }else{
            System.out.println("No seleccionaste La opcion. 1 para martes y 2 para luna");
        }
        
    }

    
}

/*Desafio 1:
Cree una clase titulada "Perfil de usuario"
crear funcion main
Escriba el código para que la aplicación almacene el nombre, la edad, el género, la preferencia laboral, la nacionalidad y el tipo de sangre de los usuarios.
Piense en los nombres de variables que desea asignar a las propiedades anteriores y las convenciones de nombres de variables que se deben seguir.
Utilice la edad para calcular el año en que nació un usuario.
Imprima los valores en la consola de un usuario.*/

import java.io.Console;

public class Perfilusuario {
    public static void main (String [] args ){

        Console console = System.console();
        String nombre = console.readLine("Ingrese el nombre: ") ;

        String edad = console.readLine("Ingrese su edad: ") ;
        int NuevaEdad =  Integer.parseInt(edad);

        String genero = console.readLine("Ingrese su genero: ") ;

        String laboral = console.readLine("Ingrese su preferencia laboral: ") ;

        String nacionalidad = console.readLine("Ingrese su nacionalidad: ") ;

        String tipo_sangre = console.readLine("Ingrese su tipo de sangre: ") ;


        System.out.println("-------------------------------------------- ");
        System.out.println(" -------------------------------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+NuevaEdad);
        System.out.println("Genero: "+genero);
        System.out.println("Preferencia Laboral: "+laboral);
        System.out.println("Nacionalidad: "+nacionalidad);
        System.out.println("Tipo de sangre: "+tipo_sangre);

        int añoNacimiento = 2022 - NuevaEdad;
        System.out.println("El año de su nacimiento: " + añoNacimiento);
        System.out.println("-------------------------------------------- ");
        System.out.println(" -------------------------------------------");






    }

    
}

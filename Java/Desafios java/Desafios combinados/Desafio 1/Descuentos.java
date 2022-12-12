import java.io.Console;

/*Una sala de cine hace descuentos en los precios según la edad del cliente.
La aplicación solicita al usuario que ingrese su edad en la consola de IntelliJ, luego de lo cual verifica si el usuario cumple con las condiciones del descuento.
Rango de edad	Precio del boleto
*billete normal	7 euros
*Por debajo de 5	60% de descuento
*Más de 60	55% de descuento
Escriba la aplicación para que se cumplan las condiciones anteriores y se devuelva el precio del billete correcto.*/

public class Descuentos {
    public static void main(String[] args) {

        Console console = System.console();
        System.out.println("Bienvenidos al cine ");
        System.out.println("-----------------------------------------");


        int edad = Integer.parseInt(console.readLine("Indicanos tu edad: "));
        int boletoNormal = 7 ;
        while(edad <0 ){
            edad = Integer.parseInt(console.readLine("Porfavor Indicanos una edad correcta: "));
        }

        if(edad > 0 && edad < 5){

            System.out.println("Usted obtiene un 60% de Descuento");
            Double ninos = boletoNormal - (boletoNormal * 0.60);

            double scale = Math.pow(10, 3);
            double doubleM1 = Math.round(ninos*scale)/scale;
            System.out.println("Su total a pagar es:"+doubleM1+" Euros");

        }else if(edad > 60){
            System.out.println("Usted obtiene un 55% de Descuento");
            Double ninos = boletoNormal - (boletoNormal * 0.55);
            System.out.println("Su total a pagar es:"+ninos+" Euros");
        }else{
            System.out.println("El valor de su Boleto es de 7 euros");
        }
        
    }
    
}
/*double d = 9.4568982982989;
double scale = Math.pow(10, 3);
double doubleM1 = Math.round(d*scale)/scale;
System.out.println("Math1 Rounded off: "+doubleM1);*/


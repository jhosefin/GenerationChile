import java.io.Console;

//CTRL + SHIFT + A
/* Usando IntelliJ, escriba una aplicación Java que tome la entrada numérica de un usuario
La aplicación debe calcular la comisión en función de este gráfico utilizado por la tienda minorista.
Rango de ventas	Comisión
por encima de 10000$	30%
5001 - 9999$	20%
1001 - 4999$	10%
por debajo de 1000$	N / A
Ejemplo: si un usuario ingresa 7677 como su cifra de ventas, debe calcular una comisión del 20%. */

// CTRL + }
// Usando IntelliJ, escriba una aplicación Java que tome la entrada numérica de un usuario
// La aplicación debe calcular la comisión en función de este gráfico utilizado por la tienda minorista.
// Rango de ventas	Comisión
// por encima de 10000$	30%
// 5001 - 9999$	20%
// 1001 - 4999$	10%
// por debajo de 1000$	N / A
// Ejemplo: si un usuario ingresa 7677 como su cifra de ventas, debe calcular una comisión del 20%.

public class Calculadora {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("-----------------Bienvenidos------------------ ");
        System.out.println("-----------------------------------------");

        int ventas = Integer.parseInt(console.readLine("Indicanos el monto de las ventas: "));
        while(ventas <0 ){
            ventas = Integer.parseInt(console.readLine("Porfavor Indicanos un monto positivo: "));
        }


        int repeticiones = Integer.parseInt(console.readLine("Ingrese cuantas comisiones va a calcular"));
        for(int i = 0; i < repeticiones ; i++){
        int venta = Integer.parseInt(console.readLine("Ingrese su cifra de ventas"));
    
        if(venta > 10000){
            System.out.print("Su comision es de: "+ (venta * 0.3) + " correspondientes al 30%");
        }else if( venta >= 5000 && venta <= 9999){
            System.out.print("Su comision es de: "+ (venta * 0.2) + " correspondientes al 20%");
    
        }else if(venta >= 1001 && venta <= 4999){
            System.out.print("Su comision es de: "+ (venta * 0.1) + " correspondientes al 10%");
    
        }else{
            System.out.print("No le corresponde comision");
    
        }
        }
        
    }
}

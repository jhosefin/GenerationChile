import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArreglosBucles {
    /*Bucles Javascript
     *for, for each, while, do while
     * for en javascript -> for (var i = 0; i < 2 ; i++){}
     * for en java -> for (int i = 0; i < 2; i++){}
     * for each en javascript -> nomArreglo.forEach(Element)
     * for each en java -> for(String nomArreglo: element){}
     * While en javascript -> while(condicion){}(verificar que en algun momento se cumpla la condición)
     * while en java -> while(condicion){}(igual que javascript)
     * do while javascript -> do {se hace la operación}while(condicion);
     * do while java -> do{se hace la operacion}while(condicion);
     * el do while se ocupa en casos donde si o si reuieere ingresar al menos una vez.
     */



     //EJERCICIO CON WHILE
     //-------------------------------------------------------------
//     public static void main(String[] args) {
//         Console console = System.console();
//         System.out.println("*******Bienvedidos********");
//         int contador = 0;

//         int repeticiones = Integer.parseInt(console.readLine("Ingrese cuantas comisiones va a calcular"));
//         while(contador != repeticiones){
//         int venta = Integer.parseInt(console.readLine("Ingrese su cifra de ventas"));

//         if(venta > 10000){
//             System.out.print("Su comision es de: "+ (venta * 0.3) + " correspondientes al 30%");
//         }else if( venta >= 5000 && venta <= 9999){
//             System.out.print("Su comision es de: "+ (venta * 0.2) + " correspondientes al 20%");

//         }else if(venta >= 1001 && venta <= 4999){
//             System.out.print("Su comision es de: "+ (venta * 0.1) + " correspondientes al 10%");

//         }else{
//             System.out.print("No le corresponde comision");

//         }
//         System.out.println(contador);
//         contador++;
//         }
//     }
// }


//EJERCICIO CON FOR
//------------------------------------------------------------
public static void main(String[] args) {
    Console console = System.console();
    System.out.println("*******Bienvedidos********");

/*   int repeticiones = Integer.parseInt(console.readLine("Ingrese cuantas comisiones va a calcular"));
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
    }*/
    ArrayList <Integer> miArray = new ArrayList <Integer>(Arrays.asList(1, 2, 3, 4));
    ArrayList <String> miArrayString = new ArrayList <String>(Arrays.asList("a", "b", "c", "d"));
    System.out.println(miArray);
//formas de rrecorrer hashmap
    Map<String, ArrayList> miHashMap = new HashMap<String, ArrayList>();
    miHashMap.put(" Tenis ", miArrayString);
    miHashMap.put(" Futbol ", miArray);
    System.out.println(miHashMap);

    int [] miArreglo = new int[3];
    miArreglo[0]=7;
    miArreglo[1]=8;
    miArreglo[2]=9;

    System.out.println(miArreglo);// no se ocupa para hashmap
    System.out.println(miArreglo.toString());//tampoco se ocupa

    //forEach
    for(int i: miArreglo){
        System.out.println(i);
    }

    //hashMap con foreach

    for(String i : miHashMap.keySet()){
        System.out.println("key: " + i + "  value: "+miHashMap.get(i));
    }
    //formas de rrecorrer foreach
    miHashMap.forEach((k,v)-> System.out.println("key: " + k + " Value: " + v));
//para solo traer la llave
//miHashMap.get("Tenis");
    
}
}
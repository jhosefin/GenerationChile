import java.io.Console;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio {

    public static void main(String[] args) { 

        //ArrayList <Integer> valorNotas = new ArrayList <Integer>();
        Map<String, ArrayList> miHashMap = new HashMap<String, ArrayList>();
        Console console = System.console();
        System.out.println("*******Bienvedidos********");
        //a DecimalFormat df = new DecimalFormat("#0.0");
        DecimalFormat df = new DecimalFormat("#.0");


        int cantidad = Integer.parseInt(console.readLine("Ingrese la cantidad de Alumnos/as que va a ingresar al sistema: "));
        while(cantidad < 0){
            cantidad = Integer.parseInt(console.readLine("Ingrese una cantidad correcta porfavor: "));

        }
        
        
while(cantidad!=0){
    String Alumnos = console.readLine("Ingrese El nombre del Alumno/a: " );
    ArrayList <Float> valorNotas = new ArrayList <Float>();

    for(int i = 1; i < 4; i++){ 
        Float notas = Float.parseFloat(console.readLine("Ingrese la Nota " + i + ": "));
        while(notas < 0 || notas > 7){
            System.out.println("Oups!! Porfavor Ingrese una nota correcta comprendida entre 0 y 7 ");
            notas = Float.parseFloat(console.readLine("Ingrese la Nota " + i + ": "));
        }
        valorNotas.add(notas); 
    }
        System.out.println("*********************************");
        miHashMap.put(Alumnos,valorNotas);
        cantidad--;
}

    /*for(int i = 0; i < cantidad ; i++){ 
        ArrayList <Integer> valorNotas = new ArrayList <Integer>();
        String Alumnos = console.readLine("Ingrese El nombre del Alumno/a: " );

        for(int j = 1; j < 4; j++){ 
        int notas = Integer.parseInt(console.readLine("Ingrese la " + j + " Nota: "));
        valorNotas.add(notas); 
        }
        System.out.println("*********************************");
        miHashMap.put(Alumnos,valorNotas);
    }*/
    //System.out.println(miHashMap);
    miHashMap.forEach((k,v)-> System.out.println("Nombre: " + k + " Notas: " + v));

    for(String i : miHashMap.keySet()){
        float suma = 0.0f;
        for(Object x: miHashMap.get(i)){
        suma = (Float) x + suma;
        }
        //float promedio = suma/3;
       // int promedio1 = (int)promedio;
       // double scale = Math.pow(10, 3);
        //double doubleM1 = Math.round(promedio*scale)/scale;


       // System.out.println("El promedio de: "+i+" Fue de: "+ df.format(suma/3));
        System.out.printf("El promedio de: "+i+" Fue de: %.1f",suma/3);
    }
    }
    
}
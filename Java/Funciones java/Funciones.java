public class Funciones {

    //Retorna valor
    static String Suma (int num1, int num2, String mensaje){
        int resultado = 0;
        resultado = num1 + num2;
        int x= 10;
        if(x > resultado){
            return mensaje + num1 + num2;
        }else{
            return "X no era mayor";
        }
    }

    //No retorna valor
    static void SumaVoid (int num1, int num2, String mensaje){
        int resultado = 0;
        resultado = num1 + num2;
        int x= 10;
        if(x > resultado){
            System.out.println(mensaje + num1 + num2);
        }else{
            System.out.println("X no era mayor");
        }
    }

    public static void main(String[] args) {
        System.out.println(Suma(3, 6, "X es mayor a la suma: "));
        SumaVoid(10, 6, "X era mayor que el resultado de: ");
    }
    
}

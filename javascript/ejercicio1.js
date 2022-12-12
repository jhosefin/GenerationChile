/*Ejercicio #1: crea una función que tenga un número y comprueba si el número es mayor que 10. 
Imprime en la consola verdadero si es mayor y de lo contrario falso. */
/*var num = 5

    if(num > 10 ){
        console.log("Verdadero");
    }else{
        console.log("falso");
    }*/

  /*  function testingNum(numero) {
        if (numero >= 10){
            console.log(true);
        }else{
            console.log(false);
        }
        
    }
    testingNum(4)
    testingNum(10)
    testingNum(3)*/

    function testingNum(numero) {
        if (numero >= 10){
            return true;
        }else{
            return false;
        }
        
    }
console.log(testingNum(10));



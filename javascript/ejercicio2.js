/*Ejercicio #2: Crea una función que tome un número y comprueba si es divisible entre 4 o divisible entre 9.
Imprime en la consola verdadero si un número es divisible entre 4 o 9, y falso si un número no es divisible entre ninguno de los dos números.*/

/*var num= 5
if (num % 4 == 0 || num % 9 == 0){
    console.log("verdadero");

}else{
    console.log("falso");
}*/



function testingNum(num) {
    //comparando si num es divisible entre 4 o 9
    if (num % 4 == 0 || num % 9 == 0){
        console.log("verdadero");
    //Si no es divisible imprime falso
    }else{
        console.log("falso");
    }
}
//Llamando a la función
testingNum(10)
testingNum(1)
testingNum(9)
testingNum(4)
testingNum(200)


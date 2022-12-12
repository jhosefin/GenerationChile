
function saludo (nombre){
    console.log("Hola como estás?, "+nombre);
}
//Operadores lógicos
/* Nos ayudan a verificar si algo es verdadero o falso
Y - O - No (negación)
&& - || - !(condición)
lógica:
verdadero y verdadero -> verdadero
falso y verdadero -> falso
verdadero y falso -> falso
falso y falso -> falso
verdadero o verdadero -> verdadero
falso o verdadero -> verdadero
verdadero o falso -> verdadero
   falso o falso -> falso  */

//Operadores Aritméticos
/* Nos ayudan a hacer operación matemáticas
Suma -> + -> 2+6
Resta -> - -> 2-6
División -> /
Multiplicación -> *
Resto %
PLUS
Adicción (incremento) -> i++ (suma 1 a i)
Sustrabción(Decremento) -> i-- (resta 1 a i)  */

// Condicionales
/* 
if - else if - else
*/

// Operadores de comparación
/*
> mayor que 
< menor que
<= menor igual que
>= mayor igual que
== igual
!= distinto de 
=== igual esctricto
!== Distinto estricto
 */

// Funciones básicas de cadenas
/*
toUpperCase() -> convierte todo string a mayúsculas
toLowerCase() -> convierte todo string en minúsculas
chartAt() -> Toma una cadena de texto y la separa en caracteres, si no le colocas nada,asume que es 0
concat() -> une dos o mas string
parseInt() -> toma string y los convierte a number

*/

var oracion = "Esta es una oración 1";
var oracion2 = "Esta es una oración 2";
var num = "24";
console.log(oracion.toUpperCase());
console.log(oracion2.toLowerCase());
console.log(oracion.charAt(5));
console.log(oracion.concat( oracion2));
console.log(typeof( num));
var numInt = parseInt(num);
console.log(typeof( numInt));
console.log(numInt);

//Como dejar mayúscula la primera letra de una función

var oracion3 = "esta es otra oración";
var primeraLetra = oracion3.charAt(0);
var restoOracion = oracion3.slice(1,);
var oracion4 = primeraLetra.toUpperCase().concat(restoOracion);

var oracion5 = oracion3.charAt(0).toUpperCase().concat(oracion3.slice(1,));
console.log(oracion4);
console.log(oracion5); 
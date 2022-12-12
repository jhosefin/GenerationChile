//Matrices

/*

CRUD 
C -> create
R -> read
U -> update
D -> delete

Creación de matrices
var matriz = [1,2,4,5]; -> con datos
var matriz2 = []; -> vacía

Cómo poder acceder a elemento de la matriz
var elemento = matriz[1] -> va a devolver que elmento = 2

Cómo editar una matriz
matriz[2] = 3  -> [1,2,3,5];

Cómo imprimir los elementos de una matriz
*la vamos a ejemplificar mas abajo
se ocupan los ciclos for o forEach

*/

//Funciones

var matriz = [1,5,2,3,6,7];

/*indexOF -> yo le entrego un elemento y me devuelve la posición en la que está-
si no esta el elemnto retorna -1, si hay mas de un elemento me entrega la posición del primero que encuentra de izquierda a derecha*/

console.log(matriz.indexOf(2));
console.log(matriz.indexOf(10));

//pop -> Elimina el ultimo elemento de la matriz
console.log(matriz.pop());

//push -> Agrega un elemento al final de la matriz

console.log(matriz.push(8));
console.log(matriz);

//splice -> Sirve para insertar,editar y eliminar objetos de una matriz de un indiice determinado

/*matriz.splice(1,0,5);//insertar en la posicion 1 el objeto que le ingrese,depende del numero que le ingrese en la segunda variable
console.log(matriz);*/

const matriz3 = [1,5,2,3,6,8,8];
matriz3.splice(3,1,22);//cambia en la posicion 3 el objeto que le ingrese,depende del numero que le ingrese en la segunda variable
matriz3.splice(2);
console.log(matriz3);

//UnShift -> Agrega elemento al inicio d ela matriz
const matriz4 = [1,5,2,3,6,8,8];
matriz4.unshift("palabra",8);
console.log(matriz4);

//Shift -> Elimina el primer objeto en la matriz
const matriz5 = [1,5,2,3,6,8,8];
matriz5.shift("palabra",8);
console.log(matriz5);

//Slice -> Devuelve una copia de una parte del array, dentro del array
const matriz6 = [1,5,8,4,6,9,8];
const slicematriz1 = matriz6.slice(2,5);
const slicematriz2 = matriz6.slice(2);
const slicematriz3 = matriz6.slice(-3);
const slicematriz4 = matriz6.slice(2,-1);
console.log(slicematriz4);

//Tipos de declaración de variables
/*
var -> Se ocupa cuando uno declara una variable GLOBAL
const -> Se ocupa cuando uno declara una variable LOCAL
let -> Se ocupa cuando uno declara una variable que no debe cambiar
*/

var y=2;
let x=1;
function f (){
    let y = 0;
    x = 2;
}
f ();
console.log(x);

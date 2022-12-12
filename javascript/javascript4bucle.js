//Qué es un bucle? -> algo que se repite
/*
Bucles:
for -> for - forEach
while -> while - do while

for(var i =0; i < 9; i ++){
    proceso
}

pensado para matrices

var matriz = [1,5,8,7,4,6];
matriz.forEach(x=>console.log(x))


*/
var matriz = [1,5,8,7,4,6];
matriz.forEach(x=>console.log(x))
console.log(matriz.length);

for(var i =0; i < matriz.length; i ++){
    console.log(matriz[i]);
}

var matrizPrecios = [1000,500,800,7000,400,600];
var nuevosPrecios = [];
matrizPrecios.forEach(x => nuevosPrecios.push(x*0.85));
console.log(nuevosPrecios);

/*
Ciclos while
while(condicion){

}

do{

}while(condicion);


*/

var x=4;

while(x >= 3){
console.log("si");
x--;
console.log(x);
}

do{
    x--;
console.log(x);
if(x == 0){
    break;
}

}while (x <= 3);


//Refactorizar -> Optimizar el codigo

/*
Caracteristicas
1.- Fácil de mantener (escalable) -> puede crecer y mejorar sin problemas con el tiempo
2.- Buena legibilidad 
3.- Mejora la eficacia
*/



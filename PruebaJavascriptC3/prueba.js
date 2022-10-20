//? Don José todos los martes y jueves realiza un 20% de descuento en el total de las
//		compras, crea una función la cual debe recibir un parámetro del día y el arreglo de
//		valores de los productos a comprar, esta debe retornar el total final de la compra según
//		corresponda o no descuento.



//se realiza una función de un array 
// se reccorre el array con forEach para encontrar el dia 
//si el dia correpsonde se le hace el descuento y se muestra el valor total
// si no, no se le realiza nada. 

var dias = ["martes"];
var valorProducto = [1200,50000,300,6000,500,400,6000];



    if (dias == "jueves" || dias == "martes"){

        for (var i = 0; i < valorProducto.length;i++){
            var descuento = valorProducto[i] * 0.2;
            var total = valorProducto[i] - descuento;
            console.log(total);
        }
    
    }


//    ? Don José hace un 5% de descuento a los clientes que compran más de 3 productos y al
//		menos uno de ellos tiene un valor mayor a 10.000, realiza una función que calcule el
//		total verificando si corresponde o no el descuento.


function totalDescuento(){
    // si el cliente compra tres productos y se verifica que alguno de ellos tenga un valor mayor a 10.000 se le hace el descuento
    //con un for se reccorre los valore y con una condicion if se verica si alguno de esos precios es mayor a 10.000
    //se le realiza el descuento del 5%


}



//			? Se desea tener una función verificadora encargada de revisar si dentro de el arreglo de
//				valores de los productos a comprar no existan valores negativos ingresados por error,
//				en caso de no existir debe retornar un mensaje de éxito, en caso contrario debe retornar
//				un mensaje de error junto con el número negativo y el índice en el que se encontraba.





//				? Dado el siguiente arreglo [200,5500,900,7000,500,300] con los valores de cada
//				producto


//				? Crea una función que retorne el valor del producto más costoso.

//				? Crea una función que retorne el valor del producto menos costoso.






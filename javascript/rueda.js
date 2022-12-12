/*Crea un script que pida al usuario el diámetro de una rueda y su grosor (en metros) y a través de condicionales if realice las siguientes operaciones:

a) Si el diámetro es superior a 1.4 debe mostrarse el mensaje “La rueda es para un vehículo grande”. Si es menor o igual a 1.4 pero mayor que 0.8 debe mostrarse el mensaje “La rueda es para un vehículo mediano”. Si no se cumplen ninguna de las condiciones anteriores debe mostrarse por pantalla el mensaje “La rueda es para un vehículo pequeño”.

b) Si el diámetro es superior a 1.4 con un grosor inferior a 0.4, ó si el diámetro es menor o igual a 1.4 pero mayor que 0.8, con un grosor inferior a 0.25, deberá mostrarse el mensaje “El grosor para esta rueda es inferior al recomendado”

Ejecuta el código y comprueba sus resultados. Para comprobar si es correcta tu solución puedes consultar en los foros aprenderaprogramar.com.*/

function Rueda(diametro,grosor){
    if(diametro > 1.4){
        console.log("La rueda es para un vehículo grande");
    }

else if(diametro <= 1.4 && diametro > 0.8){
    console.log("La rueda es para un vehículo mediano");
}
else{
    console.log("La rueda es para un vehículo pequeño");
}

if(diametro > 1.4 && grosor < 0.4 || diametro <= 1.4 && diametro > 0.8 && grosor < 0.25 ){
    console.log("El grosor para esta rueda es inferior al recomendado");
}

else{
console.log("No hay opción");
}
}
Rueda(1.8,0.2)
Rueda(0.8,1.2)


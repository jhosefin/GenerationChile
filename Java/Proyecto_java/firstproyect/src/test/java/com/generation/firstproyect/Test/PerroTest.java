package com.generation.firstproyect.Test;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.generation.firstproyect.models.Perro;
//se borra el public porque solo lo vere yo
class PerroTest {

    //Avisando que vamos a usar un test
    @Test
    //declaro una función para mi test
    void testAdopcion() {
        //creo mi objeto para testear
        Perro perro = new Perro();
        //comparo mi resultado esperado con la función que debe responder
        assertEquals(false, perro.adopcion());  
}

@Test
void testTruco(){
    Perro perro = new Perro();
    assertEquals("doy la pata", perro.truco("da la pata"));
}

@Test
void testTrucoFail(){
    Perro perro = new Perro();
    assertEquals("no hago nada :c", perro.truco("Hazte el muerto"));

}

@Test
void testLogin(){
    Perro perro = new Perro();
    assertEquals("nombre aceptado",perro.login("polo","oso"));
}

@Test
void testLoginFail(){
    Perro perro = new Perro();

    assertEquals("nombre aceptado",perro.login("polo","oso"));

}


}

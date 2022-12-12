package com.generation.firstproyect;

import java.io.Console;
import java.util.ArrayList;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.firstproyect.models.Conejo;
import com.generation.firstproyect.models.Gato;
import com.generation.firstproyect.models.Mandarina;
import com.generation.firstproyect.models.Perro;

@SpringBootApplication
public class FirstproyectApplication {

	public static void main(String[] args) {
		/*Aun no nos sirve esta linea 02/11 */
		//SpringApplication.run(FirstproyectApplication.class, args);

		System.out.println("");
		System.out.println("PROYECTO PERROS");
		System.out.println("");

	    /*--------------------------------------------------------------------------------------------------------------------- */
		//------------------------------- PERROS -----------------------------------------------------------------------------

		Perro perroDefault = new Perro();//Estoy creando un perro con el constructor por defecto
		Perro perroCompleto = new Perro("Max", "rulos","salchicha",true);
        Perro perroQuiltro = new Perro("pelusa","liso");

		//Dandole valores a perro default
		perroDefault.setNombre("copi-copi");
		perroDefault.setPelaje("pelo duro");
		perroDefault.setRaza("gucci");
		perroDefault.setVacunado(true);

		// Usando el get y guardando variable
		String nombrePerro = perroDefault.getNombre();
		String nombrePerro2 = perroCompleto.getNombre();

		System.out.println(nombrePerro);
		System.out.println(nombrePerro2);
		System.out.println(perroQuiltro.toString());
		perroQuiltro.setVacunado(false);


		//Mostrando resultados de perros
		System.out.println("Perro por Default"+perroDefault.toString());
		System.out.println("Perro por Completo"+perroCompleto.toString());
		System.out.println("Perro por Quiltro"+perroQuiltro.toString());

		/*perroDefault.ladrar();
		perroCompleto.caminar();
		System.out.println(perroQuiltro.truco("da la pata"));
        System.out.println();
		System.out.println(perroCompleto.adopcion());
		System.out.println(perroQuiltro.adopcion());*/

			System.out.println("");
			System.out.println("PROYECTO MANDARINA");
			System.out.println("");
		/*--------------------------------------------------------------------------------------------------------------------- */
		//------------------------------- MANDARINA-----------------------------------------------------------------------------


		//Creando un objeto vacio
        Mandarina mandarinaVacia = new Mandarina();//Estoy creando una mandarina con el constructor por defecto (vacio)

        //Creando un objeto con todo los parametros
		Mandarina mandarinaCompleto = new Mandarina("naranja", "dulce", true, "redonda", "pequeña");

		//Mostrando 1
		System.out.println("");
		System.out.println("***************** OBJETO VACIO ******************");
        System.out.println(mandarinaVacia);

		System.out.println("");
		System.out.println("**************** OBJETO COMPLETO *****************");
        System.out.println(mandarinaCompleto);

        //Dandole valores a mi objeto vacio con set
        mandarinaVacia.setColor("ANaranjado");
		mandarinaVacia.setSabor("Acida");
		mandarinaVacia.setFruta(true);
		mandarinaVacia.setForma("Globosa");
        mandarinaVacia.setTamanno("Grande");

		//Mostrando 2
		System.out.println("");
		System.out.println("**************** OBJETO VACIO CON VALORES ************");
		System.out.println(mandarinaVacia);


        //Editando el objeto completo con set
        mandarinaCompleto.setSabor("Acida y dulce");
        mandarinaCompleto.setFruta(true);
        mandarinaCompleto.setForma("Forma de pera");

		//Mostrando 3
		System.out.println("");
		System.out.println("**************** OBJETO COMPLETO CON DISTINTOS VALORES *********");
		System.out.println(mandarinaCompleto);


        //Guardando en variables atributos con el metodo get

        String Sabor_Mandarinav = mandarinaVacia.getSabor();
		String Forma_Mandarinac = mandarinaCompleto.getForma();
        String Tamanno_Mandarinav = mandarinaVacia.getTamanno();
        Boolean Fruta_Mandarinac = mandarinaCompleto.getFruta();


        //Mostrando 4
		System.out.println("");
		System.out.println("**************** MOSTRANDO VARIABLES CON GET ****************");
		System.out.println(Sabor_Mandarinav);
		System.out.println(Forma_Mandarinac);
        System.out.println(Tamanno_Mandarinav);
        System.out.println(Fruta_Mandarinac);


		//Mostrando resultado final
		System.out.println("");
		System.out.println("***************** OBJETO VACIO *************************");
		System.out.println("Mandarina Vacia"+mandarinaVacia.toString());
		System.out.println("");
		System.out.println("***************** OBJETO VACIO COMPLETO ****************");
		System.out.println("Mandarina Completo"+mandarinaCompleto.toString());

		System.out.println(mandarinaVacia.remedios(false));
        System.out.println();
		System.out.println(mandarinaCompleto.remedios(true));
	



	Console console = System.console();

	//Ejercico mandarina mio
	int cantidad = Integer.parseInt(console.readLine("ingrese la cantidad de mandarinas que quiere realizar"));
	ArrayList<Mandarina> Frutas = new ArrayList<Mandarina>();

	for(int i = 0; i < cantidad; i++) {
		Mandarina mandarinas = new Mandarina();
        mandarinas.setSabor(console.readLine("sabor: "));
		mandarinas.setForma(console.readLine("forma: "));
		mandarinas.setTamanno(console.readLine("tamanno:"));

		Frutas.add(mandarinas);
		System.out.println(Frutas);

	}

	//Ejercicio que hizo la profe pame de ArrayList

	ArrayList<Perro> Perros = new ArrayList<Perro>();

	int cantidad2 = Integer.parseInt(console.readLine("Ingrese la cantidad de perros a inscribir: "));
	for(int i = 0; i < cantidad2; i++) {

		Perro perro = new Perro();
		perro.setNombre(console.readLine("Ingresa el nombre del perro: "));
		perro.setPelaje(console.readLine("Ingrese el pelaje del perro: "));
		perro.setRaza(console.readLine("Ingrese la raza del perro: "));
		int vacunado = Integer.parseInt(console.readLine("Ingrese 1 si esta vacunado, o ingrese 2 si no esta vacunado: "));
		
		while(vacunado < 1 || vacunado > 3 ) {
			vacunado = Integer.parseInt(console.readLine("Ingrese 1 si esta vacunado, o ingrese 2 si no esta vacunado: "));
		}

		if(vacunado == 1) {
			perro.setVacunado(true);
			} else if(vacunado == 2) {
            perro.setVacunado(false);
			}else if(vacunado == 3) {
				perro.setVacunado(null);
			}

		Perros.add(perro);
		System.out.println(Perros);
		System.out.println();

	}

/*Aca mostramos los resultdos */
	Gato gato = new Gato();
	System.out.println(gato);
    Gato gatoCompleto = new Gato(3,"juan","siames","peludo",true);
	System.out.println(gatoCompleto);

	Conejo conejo = new Conejo();
	conejo.saltarAlto();

	conejo.comer();
	gato.comer();
}




}

package ar.edu.unlam.pb2.magiayhechiceria;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibroDeHechizosTest {

	/*
	 * a) Generar la estructura de proyecto adecuada. 
	 * b) Implementar la totalidad de las clases que involucran la solución al problema. 
	 * c) Implementar al menos CINCO (5) casos de prueba representativos.
	 */

	@Test
	public void queSePuedaAgregarUnHechizoAlLibro() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Expelliarmus();
		libro.agregarHechizo(desarme);
		//DEBO SOBREESCRIBIR EQUALS EN HECHIZO PARA QUE ESTO FUNCIONE
		assertEquals(desarme, libro.buscar("Expelliarmus"));
	}

	@Test
	public void verSiUnHechizableEstaHechizado() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Expelliarmus desarme = new Expelliarmus();
		Hechizable perro = new Animal();
		libro.agregarHechizo(desarme);
		Hechizo hechizo = libro.buscar("Expelliarmus");
		hechizo.aplicarHechizo(perro);
		assertEquals("Me desarmaron", perro.getEstado());
	}

	@Test
	public void verSiUnHechizableCrece() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo crecer = new Agrandar();
		Hechizable mesa = new Mueble();
		libro.agregarHechizo(crecer);
		Hechizo hechizo = libro.buscar("Enormuvus");
		hechizo.aplicarHechizo(mesa);
		assertEquals("Ahora soy más grande", mesa.getEstado());
	}
	
	@Test 
	public void ordenarHechizosAlfabeticamente() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo crecer = new Agrandar();
		Hechizo desarme = new Expelliarmus();
		Hechizo muerte = new Avadakedabra();
		Hechizo atraer = new Accio();
		Hechizo levitar = new Wingardiumleviosa();
		Hechizo alerta = new Periculum();
		Hechizo leerMente = new Legeremens();
		Hechizo iluminar = new Lumos();
		libro.agregarHechizo(crecer);
		libro.agregarHechizo(desarme);
		libro.agregarHechizo(muerte);
		libro.agregarHechizo(atraer);
		libro.agregarHechizo(levitar);
		libro.agregarHechizo(alerta);
		libro.agregarHechizo(leerMente);
		libro.agregarHechizo(iluminar);
		
		libro.ordenarHechizosAlfabeticamente();
		
		//CREO UN ARRAY DE CLAVES LUEGO DE ORDENAR PARA LLAMAR A LOS HECHIZOS POR ORDEN 
		String[] arrayDeClaves = libro.conjuntoDeHechizos.keySet().toArray(new String[0]);
		
		
		assertEquals(atraer.getNombre(), arrayDeClaves[0]);
		
		
	}
	

}

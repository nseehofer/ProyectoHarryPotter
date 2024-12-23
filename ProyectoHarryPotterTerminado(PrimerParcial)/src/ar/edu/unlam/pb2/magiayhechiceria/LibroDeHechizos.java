package ar.edu.unlam.pb2.magiayhechiceria;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LibroDeHechizos {

	// ¿POR QUE HASHMAP? en realidad por descarte, no veo logica a que esten
	// ordenados de menor a mayor

	protected Integer idHechizo = 0;
	Map<String, Hechizo> conjuntoDeHechizos = new HashMap<String, Hechizo>();

	public void ordenarHechizosAlfabeticamente() {
		if (this.conjuntoDeHechizos != null) {
			Map<String, Hechizo> conjuntoDeHechizosOrdenado = new TreeMap<>(this.conjuntoDeHechizos);
			this.conjuntoDeHechizos = conjuntoDeHechizosOrdenado;
		}
	}

	public void agregarHechizo(Hechizo hechizo) {
		// COMO OBTENGO EL NOMBRE DEL HECHIZO SI JAMAS ME LO PASARON POR PARAMETRO? SOLO
		// PUEDO CONSEGUIR LA CLASE
		this.conjuntoDeHechizos.put(hechizo.getNombre(), hechizo);

	}

	// ME FALTA COMPLETAR ESTE METODO, DEBERIA SOBREESCRIBIR EQUALS COMO DIJE EN EL
	// TEST
	public Hechizo buscar(String hechizo) {

		if (this.conjuntoDeHechizos.containsKey(hechizo) == true) {
			return this.conjuntoDeHechizos.get(hechizo);
		}

		return null;
	}

}

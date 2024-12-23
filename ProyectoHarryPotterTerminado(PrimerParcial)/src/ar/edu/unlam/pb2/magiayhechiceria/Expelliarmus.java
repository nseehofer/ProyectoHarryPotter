package ar.edu.unlam.pb2.magiayhechiceria;

public class Expelliarmus extends Hechizo {

	// ME LO PASO BLACKBOX
	// La palabra clave super se utiliza para referirse a la clase padre (en este
	// caso, Hechizo).
	// Al llamar a super("Expelliarmus");, estamos invocando el constructor de la
	// clase Hechizo y pasándole el string "Expelliarmus" como argumento.
	// Esto permite que la clase Hechizo inicialice su atributo nombre con el valor
	// "Expelliarmus".

	public Expelliarmus() {
		super("Expelliarmus","Me desarmaron"); // Aca pasa el String que pide el constructor de Hechizo
	}
}

package ar.edu.unlam.pb2.magiayhechiceria;

public class Hechizo {

	// desde aca me paso black box
	private String nombre;
	private String reaccion;

	// Constructor que acepta el nombre del hechizo
	public Hechizo(String nombre, String reaccion) {
		this.nombre = nombre;
		this.reaccion = reaccion;// Inicializa el atributo nombre
	}

	// Método para obtener el nombre del hechizo
	public String getNombre() {
		return this.nombre; // Devuelve el nombre del hechizo
	}

	// hasta aca me paso black box

	public void aplicarHechizo(Hechizable perro) {
		perro.setEstado(this.reaccion);

	}
	
	//AQUI SOBREESCRIBI EQUALS DECLARANDO "ENTRE OTRAS COSAS" QUE SI TIENE MISMO NOMBRE, ENTONCES SE TRATA DEL MISMO HECHIZO
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hechizo other = (Hechizo) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}

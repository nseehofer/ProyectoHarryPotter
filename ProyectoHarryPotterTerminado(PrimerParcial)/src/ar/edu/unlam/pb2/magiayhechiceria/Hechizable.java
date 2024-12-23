package ar.edu.unlam.pb2.magiayhechiceria;

public class Hechizable {
	
	protected String estado;

	public String getEstado() {
		// TODO Auto-generated method stub
		return this.estado;
	}

	public void setEstado(String reaccion) {
		this.estado = reaccion;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
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
		Hechizable other = (Hechizable) obj;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		return true;
	}
	
	

}

package cl.inacap.registroModel.dto;

public class IngresoSolicitud {
	private String rut;
	private String nombre;
	private String tipoSolicitud;
	private int numSolicitado;

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoSolicitud() {
		return tipoSolicitud;
	}

	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}
public int getNumSolicitado() {
	return numSolicitado;
}
public void setNumSolicitado(int numSolicitado) {
	this.numSolicitado=numSolicitado;
}

}

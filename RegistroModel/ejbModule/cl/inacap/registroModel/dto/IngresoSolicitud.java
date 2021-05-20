package cl.inacap.registroModel.dto;

public class IngresoSolicitud {
       private String RutCliente;
       private String NombreCliente;
       private String TipoSolicitud;
	public String getRutCliente() {
		return RutCliente;
	}
	public void setRutCliente(String rutCliente) {
		RutCliente = rutCliente;
	}
	public String getNombreCliente() {
		return NombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		NombreCliente = nombreCliente;
	}
	public String getTipoSolicitud() {
		return TipoSolicitud;
	}
	public void setTipoSolicitud(String tipoSolicitud) {
		TipoSolicitud = tipoSolicitud;
	}
       
}

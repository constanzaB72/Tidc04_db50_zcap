package cl.inacap.registroModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.registroModel.dto.IngresoSolicitud;

@Local
public interface IngresoSolicitudDAOLocal {
	void save(IngresoSolicitud Solicitud);

	List<IngresoSolicitud> getAll();

	void delete(IngresoSolicitud Solicitud);

	IngresoSolicitud findByNumber(int numSolicitado);

	List<IngresoSolicitud> filterByName(String TipoSolicitud);

}

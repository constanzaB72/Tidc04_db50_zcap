package cl.inacap.registroModel.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.registroModel.dto.IngresoSolicitud;

/**
 * Session Bean implementation class IngresoSolicitudDAO
 */
@Stateless
@LocalBean
public class IngresoSolicitudDAO implements IngresoSolicitudDAOLocal {
    private static List<IngresoSolicitud> solicitudes=new ArrayList<>();
	@Override
	public void save(IngresoSolicitud solicitud) {
		solicitudes.add(solicitud);
		System.out.println("cantidad de solicitudes registradas"+solicitudes.size());
	}

	@Override
	public List<IngresoSolicitud> getAll() {
		
		return solicitudes;
	}

	@Override
	public void delete(IngresoSolicitud solicitud) {
		solicitudes.remove(solicitud);
		
	}

	@Override
	public List<IngresoSolicitud> filterByName(String TipoSolicitud) {
	return solicitudes.stream().filter(s -> s.getTipoSolicitud().contains(TipoSolicitud)).collect(Collectors.toList());
	}



    /**
     * Default constructor. 
     */
    

}

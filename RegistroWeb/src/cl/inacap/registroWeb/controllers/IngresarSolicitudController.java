package cl.inacap.registroWeb.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.registroModel.dao.IngresoSolicitudDAOLocal;
import cl.inacap.registroModel.dto.IngresoSolicitud;

/**
 * Servlet implementation class IngresarSolicitudController
 */
@WebServlet("/IngresarSolicitudController.do")
public class IngresarSolicitudController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AtomicInteger incremental= new AtomicInteger(0);
    @Inject
    private IngresoSolicitudDAOLocal ingresoSolicitudDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IngresarSolicitudController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("WEB-INF/vistas/ingresarSolicitud.jsp").forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		    List<String> errores = new ArrayList<>();
			String rut = request.getParameter("rut-txt").trim();
			if(rut.isEmpty()) {
				errores.add("debe ingresar un rut");
			}
			String nombre = request.getParameter("nombre-txt").trim();
			if(nombre.isEmpty()) {
				errores.add("debe ingresar un nombre");
			}
			String tipoSolicitud = request.getParameter("tipo-txt").trim();
			if (tipoSolicitud.isEmpty()) {
				errores.add("debe seleccionar solicitud");
			}
			if(errores.isEmpty()) {
				IngresoSolicitud registro=new IngresoSolicitud();
				registro.setNombre(nombre);
				registro.setRut(rut);
				registro.setTipoSolicitud(tipoSolicitud);
				int numSolicitado=incremental.getAndIncrement();
				registro.setNumSolicitado(numSolicitado);
				ingresoSolicitudDAO.save(registro);
				request.setAttribute("mensaje", "Solicitud Registrada");
				
			}else {
				request.setAttribute("errores", errores);
				
			}
			doGet(request, response);
		}
		
	}



package cl.inacap.registroWeb.controllers;

import java.awt.List;
import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.registroModel.dao.IngresoSolicitudDAO;
import cl.inacap.registroModel.dto.IngresoSolicitud;

/**
 * Servlet implementation class AtenderSolicitudesController
 */
@WebServlet("/AtenderSolicitudesController.do")
public class AtenderSolicitudesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private IngresoSolicitudDAO ingresoSolicitudDAO;

	public AtenderSolicitudesController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("solicitudes", ingresoSolicitudDAO.getAll());
		request.getRequestDispatcher("WEB-INF/vistas/atenderSolicitud.jsp").forward(request, response);
		
		if(request.getParameter("numEliminar") !=null) {
			int numSolicitado =Integer.parseInt(request.getParameter("numEliminar").trim());
			IngresoSolicitud numAEliminar =ingresoSolicitudDAO.findByNumber(numSolicitado);
			if(numAEliminar !=null) {
			ingresoSolicitudDAO.delete(numAEliminar);
	         }
		}
		}
	
	/**;
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

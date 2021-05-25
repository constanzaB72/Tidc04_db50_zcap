<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="../templates/header.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<main class="container mt-6">
		<!-- mensaje de error -->
		<c:if test="${mensaje !=null }">
			<div class="columns is-centered">
				<div class="column is-6">
					<div class="notification is-primary">
						<p>${mensaje}</p>
					</div>
				</div>
			</div>
		</c:if>
		<c:if test="${errores !=null}">
			<div class="columns is-centered mb-6">
				<div class="column is-6">
					<div class="notification is-primary">
						<h6>Existen errores en el Formulario</h6>
						<div class="content">
							<ul>
								<c:forEach var="error" items="${errores}">
									<li>${error}</li>
								</c:forEach>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</c:if>


		<!-- formulario -->
			<div class="columns is-centered">
				<div class="column is-8 ">
					<form action="IngresarSolicitudController.do" method="POST">
					<div class="card">
						<div class="card-header has-background-primary">
							<span class="card-header-title">Ingreso de Solicitudes</span>
						</div>
						<div class="card-content">
							<div class="field">
								<label class="label" for="nombre-txt">Nombre Cliente</label>
								<div class="control">
									<input class="input" type="text" name="nombre-txt"
										id="nombre-txt">
								</div>
							</div>

							<div class="field">
								<label class="label" for="rut-txt">Rut Cliente</label>
								<div class="control">
									<input class="input" type="text" placeholder="25.365.159-4"
										name="rut-txt" id="rut-txt"> 
								</div>
							</div>


							<div class="field">
								<label class="label" for="tipo-txt">Tipo de Solicitud</label>
								<div class="control">
									<div class="select">
										<select name="tipo-txt" id="tipo-txt">
											<option>Seleccionar</option>
											<option>Solicitud de Cédula de Indentidad</option>
											<option>Retiro de Cédula de Identidad</option>
											<option>Solicitud de Certificado de Nacimiento</option>
											<option>Solicitud de Certificado de Defunción</option>
										</select>
									</div>
								</div>
							</div>
							<div class="field">
								<label class="label" for="NumSolicitud-txt">Numero de Solicitud</label>
								<div class="control">
									<input class="input" type="text" placeholder="0000" name="NumSolicutud-txt"
										id="NumSolicitud-txt">
								</div>
							</div>

							<div class="card-footer">

								<button type="submit" class="button is-primary is-outlined ">Ingresar
									Solicitud</button>

							</div>
						</div>
					</div>
				</form>
				</div>
			</div>
	</main>
</tbody>
</html>
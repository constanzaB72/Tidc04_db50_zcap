<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="../templates/header.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>
	<main class="container mt-6">
		<!-- mensaje de error -->
		<c:if test="${mensaje !=null }">
			<div class="columns is-centered">
				<div class="column is-8">
					<div class="notification is-primary">
						<p>${mensaje}</p>
					</div>
				</div>
			</div>
		</c:if>
		<!-- formulario -->
		<div class="container">
			<div class="columns is-centered">
				<div class="column is-8 ">
					<form action="IngresarSolicitudController.do" method="post"></form>
					<div class="card">
						<div class="card-header has-background-primary">
							<span class="card-header-title">Ingreso de Solicitudes</span>
						</div>
						<div class="card-content">
							<div class="field">
								<label class="label">Nombre Cliente</label>
								<div class="control">
									<input class="input is-primary" type="text">
								</div>
							</div>

							<div class="field">
								<label class="label">Rut Cliente</label>
								<div class="">
									<input class="input is-primary" type="text"
										placeholder="25.365.159-4"> <span
										class="icon is-small is-left"> <i class="fas fa-user"></i>
									</span> <span class="icon is-small is-right"> <i
										class="fas fa-check"></i>
									</span>
								</div>
							</div>


							<div class="field">
								<label class="label">Tipo de Solicitud</label>
								<div class="control">
									<div class="select">
										<select>
											<option>Seleccionar</option>
											<option>Solicitud de Cédula de Indentidad</option>
											<option>Retiro de Cédula de Identidad</option>
											<option>Solicitud de Certificado de Nacimiento</option>
											<option>Solicitud de Certificado de Defunción</option>
										</select>
									</div>
								</div>
							</div>

							<div class="card-footer">
								<div class="field">
									<div class="control">
										<button class="button is-primary is-outlined ">Ingresar
											Solicitud</button>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>
</body>
</html>
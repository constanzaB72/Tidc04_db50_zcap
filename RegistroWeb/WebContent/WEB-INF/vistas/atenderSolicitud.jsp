<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="../templates/header.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container mt-6">
		<div class="columns is-centered">
			<div class="column is-8 ">
				<div class="card">
					<div class="card-header has-background-primary">
						<span class="card-header-title">Atender Solicitudes</span>
					</div>
					<div class="card-content">
						<div class="field">
							<label class="label">Tipo de Solicitud</label>
							<div class="control">
								<div class="select">
									<select>
										<option>Seleccionar</option>
									</select>
								</div>
							</div>
						</div>
						<div class="field">
							<div class="control">
								<button class="button is-primary is-outlined ">Filtrar</button>
							</div>
						</div>
						<div class="field">
							<table class="table is-hovered is-bordered is-fullwidth">
								<thead class=" has-background-primary">
									<tr class="">
										<th>Nro de Atencion</th>
										<th>Nombre del Cliente</th>
										<th>Tipo de Solicitud</th>
										<th>Atencion</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td></td>
										<td></td>
										<td></td>
										<td><a href="" class="has-text-danger">Atender</a></td>
									</tr>
								</tbody>
							</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
</body>
</html>
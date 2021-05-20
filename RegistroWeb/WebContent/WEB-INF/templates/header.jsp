<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link rel="stylesheet" href="vendor/bulma/css/bulma.min.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro Civil</title>
</head>
<body>
	<header>
		<div class="container">
			<nav class="navbar" role="navigation" aria-label="main navigation">
				<div class="navbar-brand has-background-primary">
					<a class="navbar-item"> <img src="img/logo1.png" width="32"
						height="32">
					</a>
				</div>
				<div id="navbarBasicExample"
					class="navbar-menu has-background-primary">
					<div class="navbar-start ">
						<a class="navbar-item" href="Index.jsp"> Home </a>
						
						<div class="navbar-item has-dropdown is-hoverable">
							<a class="navbar-link"> Solicitudes </a>



							<div class="navbar-dropdown">
								<a class="navbar-item" href="IngresarSolicitudController.do">
									Ingresar Solicitud </a> <a class="navbar-item" href="AtenderSolicitudesController.do"> AtenderSolicitudes </a>
							</div>
						</div>
					</div>
				</div>
			</nav>
		</div>
	</header>
</body>
</html>
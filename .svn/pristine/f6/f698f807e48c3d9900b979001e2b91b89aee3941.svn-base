<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<div class="container">
	<form class="form-group">
		<div class="row">
			<input class="col-sm-2" type="text" id="idFiltro" name="filtro">
			<input class="col-sm-1 btn-primary" type="submit" value="filtrar">
		</div>
	</form>


	<h2>Lista de empleados</h2>
	<table class="table table-striped">
		<tr>
			<th>Nombre</th>
			<th>Primer apellido</th>
			<th>Segundo apellido</th>
			<th>Teléfono</th>
			<th>Ciudad de nacimiento</th>
			<th>Lenguajes de programación que conoce</th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach var="empleado" items="${empleados}">
		<tr>
			<td>${empleado.nombre}</td>
			<td>${empleado.apellido1}</td>
			<td>${empleado.apellido2}</td>
			<td>${empleado.telefono}</td>
			<td>${empleado.ciudad.nombre}</td>
			<td>
			<c:forEach var="lp" items="${empleado.lps}">
				${lp.nombre} 
			</c:forEach>
			</td>
			<td>
				<form id="idFormedit" action="${baseURL}t8/ej07/empleado/editar" method="post">
					<input type="hidden" name="id_empleado" value="${empleado.id}">
					<button onclick="function f() {document.getElementById('idFormEdit').submit();}"><span class="glyphicon glyphicon-pencil"></span></button>
				</form>
			</td>
			<td>
				<form id="idFormRemove" action="${baseURL}t8/ej07/empleado/borrar" method="post">
					<input type="hidden" name="id_empleado" value="${empleado.id}">
					<input type="hidden" name="v" value="listarTodos">
					<button onclick="function f() {document.getElementById('idFormRemove').submit();}"><span class="glyphicon glyphicon-remove"></span></button>
				</form>
				
			</td>
			
		</tr>
		</c:forEach>
	</table>
</div>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>



<div class="container">

<form class="form-group">
	<div class="row">
		<input class="col-sm-2" type="text" id="idFiltro" name="filtro">
		<input class="col-sm-1 btn-primary" type="submit" value="filtrar">
	</div>
</form>


<h3>Lista de ciudades</h3>

<table class="table table-striped">

	<tr><th>Nombre de la ciudad</th> <th></th> <th></th> </tr>

	<c:forEach var="ciudad" items="${ciudades}">
	     <tr>
	     	<td>${ciudad.nombre}</td>

			<td>
				<form id="idFormedit" action="${baseURL}t8/ej07/ciudad/editar" method="post">
					<input type="hidden" name="id_ciudad" value="${ciudad.id}">
					<button onclick="function f() {document.getElementById('idFormEdit').submit();}"><span class="glyphicon glyphicon-pencil"></span></button>
				</form>
			</td>
			
			<td>
				<form id="idFormRemove" action="${baseURL}t8/ej07/ciudad/borrar" method="post">
					<input type="hidden" name="id_ciudad" value="${ciudad.id}">
					<input type="hidden" name="v" value="listarTodos">
					<button onclick="function f() {document.getElementById('idFormRemove').submit();}"><span class="glyphicon glyphicon-remove"></span></button>
				</form>
			</td>

	     </tr>
	</c:forEach>
</table>
</div>
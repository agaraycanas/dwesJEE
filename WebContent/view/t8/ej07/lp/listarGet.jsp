<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>



<div class="container">

<form class="form-group">
	<div class="row">
		<input class="col-sm-2" type="text" id="idFiltro" name="filtro">
		<input class="col-sm-1 btn-primary" type="submit" value="filtrar">
	</div>
</form>


<h3>Lista de lenguajes de programación</h3>

<table class="table table-striped">

	<tr><th>Nombre del L.P.</th> <th></th> <th></th> </tr>

	<c:forEach var="lp" items="${lps}">
	     <tr>
	     	<td>${lp.nombre}</td>

			<td>
				<form id="idFormedit" action="${baseURL}t8/ej07/lp/editar" method="post">
					<input type="hidden" name="id_lp" value="${lp.id}">
					<button onclick="function f() {document.getElementById('idFormEdit').submit();}"><span class="glyphicon glyphicon-pencil"></span></button>
				</form>
			</td>
			
			<td>
				<form id="idFormRemove" action="${baseURL}t8/ej07/lp/borrar" method="post">
					<input type="hidden" name="id_lp" value="${lp.id}">
					<input type="hidden" name="v" value="listarTodos">
					<button onclick="function f() {document.getElementById('idFormRemove').submit();}"><span class="glyphicon glyphicon-remove"></span></button>
				</form>
			</td>

	     </tr>
	</c:forEach>
</table>
</div>
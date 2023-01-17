<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<table>
<tr>
	<th>Nombre</th>
	<th>Sexo</th>
	<th>Color favorito</th>
</tr>
	<c:forEach var="persona" items="${personas}">
		<tr>
			<td>${persona.nombre}</td>
			<td>${persona.sexo}</td>
			<td>${empty persona.colorFavorito ? NINGUNO : persona.colorFavorito.nombre}</td>
			<td><a href="${baseURL}persona/borrar?id=${persona.id}">Borrar</a></td>
		</tr>
	</c:forEach>
</table>
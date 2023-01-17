<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<table>
<tr>
	<th>Nombre</th>
</tr>
	<c:forEach var="color" items="${colores}">
		<tr>
			<td>${color.nombre}</td>
		</tr>
	</c:forEach>
</table>
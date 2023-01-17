<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<h3>
FORMULARIO de CREACIÛN de PERSONAS
</h3>

<form action="${baseURL}persona/crear" method="post">
	Nombre<input type="text" name="nombre"><br/>

	<fieldset><legend>Sexo</legend>
	<input type="radio" name="sexo" value="hombre" checked="checked">HOMBRE
	<input type="radio" name="sexo" value="mujer">MUJER<br/>
	</fieldset>

	<fieldset><legend>Color favorito</legend>
	<c:forEach var="color" items="${colores}">
		<input type="radio" name="color" value="${color.id}">${color.nombre}<br/>
	</c:forEach>
	</fieldset>
	
	<input type="submit">
</form>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<div class="container">
	<h2>Introduce los datos del nuevo empleado</h2>
	<form class="form" action="${baseURL}t8/ej07/empleado/crear" method="post">
		<div class="form-group">
			<label for="idNombre">Nombre</label> <input  class="form-control" type="text" name="nombre"
				id="idNombre">
		</div>
		
		<div class="form-group">
			<label for="idApe1">Primer apellido</label> <input  class="form-control" type="text"
				name="ape1" id="idApe1">
		</div>

		<div class="form-group">
			<label for="idApe2">Segundo apellido</label> <input  class="form-control" type="text"
				name="ape2" id="idApe2">
		</div>

		<div class="form-group">
			<label for="idPwd">Contraseña</label> <input  class="form-control" type="password"
				name="pwd" id="idPwd">
		</div>

		<div class="form-group">
			<label for="idTlf">Teléfono</label> <input  class="form-control" type="text" name="tlf"
				id="idTlf">
		</div>
		
		<div class="form-group">
			<label for="idCiudad">Ciudad de nacimiento</label> 
			<select name="idCiudad">
				<c:forEach var="ciudad" items="${ciudades}">
     				${objeto.atributo}
					<option value="${ciudad.id}">${ciudad.nombre}</option>
				</c:forEach>
			</select>
		</div>
		
		<div class="form-group">
			<fieldset>
			<legend>Lenguajes de programación que conoce</legend> 
				<c:forEach var="lp" items="${lps}">
					<input id="id${lp.id}" type="checkbox" value="${lp.id}" name="idLP[]">
					<label for="id${lp.id}">${lp.nombre}</label>
				</c:forEach>
			</fieldset>
		</div>
		

		<div class="form-group">
			<input  class="form-control" type="submit">
		</div>
		
		
	</form>
</div>
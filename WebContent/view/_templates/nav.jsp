<nav class="container navbar navbar-inverse">
  <div class="navbar-header">
    <a class="navbar-brand" href="${baseURL}t8/ej07/home">CRUD-emple</a>
  </div>
  <div class="collapse navbar-collapse" id="myNavbar">
    <ul class="nav navbar-nav">
    
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
           Empleado<span class="caret"></span>
        </a>
		<ul class="dropdown-menu">
		
		  <?php if (isset($header['empleado']['nombre'])): ?>
		  <li><a href="${baseURL}t8/ej07/empleado/crear">Crear</a></li>
		  <li><a href="${baseURL}t8/ej07/empleado/modificar">Modificar</a></li>
		  <li><a href="${baseURL}t8/ej07/empleado/borrar">Borrar</a></li>
		  <?php endif;?>
		  
		  <li><a href="${baseURL}t8/ej07/empleado/listar">Listar</a></li>

	     </ul>
      </li>

      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
           Ciudad<span class="caret"></span>
        </a>
		<ul class="dropdown-menu">
		  <?php if (isset($header['empleado']['nombre'])): ?>
		  <li><a href="${baseURL}t8/ej07/ciudad/crear">Crear</a></li>
		  <li><a href="${baseURL}t8/ej07/ciudad/modificar">Modificar</a></li>
		  <li><a href="${baseURL}t8/ej07/ciudad/borrar">Borrar</a></li>
		  <?php endif;?>

		  <li><a href="${baseURL}t8/ej07/ciudad/listar">Listar</a></li>
	     </ul>
      </li>

      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
           Lenguaje de programación<span class="caret"></span>
        </a>
		<ul class="dropdown-menu">
		  <?php if (isset($header['empleado']['nombre'])): ?>
		  <li><a href="${baseURL}t8/ej07/lp/crear">Crear</a></li>
		  <li><a href="${baseURL}t8/ej07/lp/modificar">Modificar</a></li>
		  <li><a href="${baseURL}t8/ej07/lp/borrar">Borrar</a></li>
		  <?php endif;?>
		  <li><a href="${baseURL}t8/ej07/lp/listar">Listar</a></li>
	     </ul>
      </li>



    </ul>
  </div>
</nav>



package pruebas.mvcEjemplo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import org.mvc.Controller;

@SuppressWarnings("serial")
@WebServlet("/home")
public class HomeController extends Controller {
	public void indexGet() throws ServletException, IOException {
		view("home/indexGet.jsp");
	}
}

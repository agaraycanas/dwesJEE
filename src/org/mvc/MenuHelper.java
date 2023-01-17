package org.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServlet;

public class MenuHelper {
	private String baseURL = "";
	private HttpServlet servlet;
	private static MenuHelper menuHelper=null;

	public void setBaseURL(String baseURL) {
		this.baseURL = baseURL;
	}

	private MenuHelper() {

	}

	private MenuHelper(HttpServlet servlet) {
		this.servlet = servlet;
		this.menus = new XMLHelper().getMenus(this.servlet);
	}


	private String[][] menus;

	private boolean esPadre(String idp) {
		for (String[] fila : menus) {
			if (fila[1].equals(idp)) {
				return true;
			}
		}
		return false;
	}

	private String[][] hijos(String idp) {
		ArrayList<String[]> hijosAL = new ArrayList<String[]>();
		for (String[] candidato : menus) {
			if (candidato[1].equals(idp)) {
				hijosAL.add(candidato);
			}
		}
		return toArray(hijosAL);
	}

	private String[][] toArray(ArrayList<String[]> hijosAL) {
		int tam = hijosAL.size();
		String[][] array = new String[tam][4];
		for (int i = 0; i < tam; i++) {
			array[i][0] = hijosAL.get(i)[0];
			array[i][1] = hijosAL.get(i)[1];
			array[i][2] = hijosAL.get(i)[2];
			array[i][3] = hijosAL.get(i)[3];
		}
		return array;

	}

	public String dibujarMenu(String id) {
		String html = "";
		if (esPadre(id)) {
			html += "<ul" + (id.equals("0") ? " id=\"navigation\"" : "") + ">" + "\n";
			for (String[] hijo : hijos(id)) {
				html += "<li>" + "\n";
				html += "<a ";
				html += (!hijo[3].equals("")) ? "href=\"" + baseURL + hijo[3] + "\"" : "";
				html += ">" + hijo[2] + "</a>" + "\n";
				html += dibujarMenu(hijo[0]);
				html += "</li>" + "\n";
			}
			html += "</ul>" + "\n";
		}
		return html;
	}
	
	public static MenuHelper getInstance(HttpServlet servlet) {
		if (menuHelper==null) {
			menuHelper=new MenuHelper(servlet);
		}
		return menuHelper;
	}
}

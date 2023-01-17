package org.mvc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class XMLHelper {
	public String[][] getMenus(HttpServlet servlet) {
		ArrayList<String[]> menus = new ArrayList<String[]>();
		String rootPath = servlet.getServletConfig().getServletContext().getRealPath("/");
		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File(rootPath + "config/menus.xml");

		try {
			Document document = (Document) builder.build(xmlFile);
			Element rootNode = document.getRootElement();
			@SuppressWarnings("rawtypes")
			List list = rootNode.getChildren("menu");
			for (int i = 0; i < list.size(); i++) {
				Element menu = (Element) list.get(i);
				String[] menuArray = new String[4];
				menuArray[0] = menu.getAttributeValue("id");
				menuArray[1] = menu.getAttributeValue("idp");
				menuArray[2] = menu.getAttributeValue("etiqueta");
				menuArray[3] = menu.getAttributeValue("accion");
				menus.add(menuArray);
			}
		} catch (IOException io) {
			System.out.println(io.getMessage());
		} catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
		}
		return this.toArray(menus);
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
}

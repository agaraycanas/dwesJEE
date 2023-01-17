package t7.ej07.utilidades;

import java.util.List;
import java.util.Map;

public class HelperHtml {
	
	public static String generaRadio(String nombre, Map<String,String> datos, String seleccionado) {
		String html = "";
		for (String k:datos.keySet()) {
			html += ("<input id=\"id"+ k + nombre +"\" type=\"radio\" name=\"" + nombre +"\" value=\""+ k +"\" "+ (seleccionado.equals(k)?"checked=\"checked\"":"")+"> \n" );
			html += ("<label for=\"id" + k + nombre + "\">"+ datos.get(k) +"</label> <br/>\n\n");
		}
		return html;
	}
	
	public static String generaCheckBox(String nombre,Map<String,String> datos,List<String> seleccionados) {
		String html = "";
		for (String k:datos.keySet()) {
			html += ("<input id=\"id"+ k + nombre +"\" type=\"checkbox\" name=\"" + nombre +"[]\" value=\""+ k +"\" "+ (seleccionados.contains(k)?"checked=\"checked\"":"")+"> \n" );
			html += ("<label for=\"id" + k + nombre + "\">"+ datos.get(k) +"</label> <br/>\n\n");
		}
		return html;
	}
	
	public static String generaSelect(String nombre,Map<String,String> datos,List<String> seleccionados, boolean multiple) {
		String html = "";
		
		html += ("<select name=\""+ nombre + (multiple ? "[]\" multiple=\"multiple\"" : "\"") +"> \n");
		
		for (String k:datos.keySet()) {
			html += ("<option value=\""+ k +"\" "+ (seleccionados.contains(k)?"selected=\"selected\"":"")+">"+ datos.get(k) +"</option> \n" );
			
		}
		
		html += "</select>";
		
		return html;
	}
	
	
	
}

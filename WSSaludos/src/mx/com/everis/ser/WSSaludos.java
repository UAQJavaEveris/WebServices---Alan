package mx.com.everis.ser;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public class WSSaludos {
	@WebMethod
	public String getSaludo(String nombre){
		return "Hola mundo";
	}
	@WebMethod
	public String getSaludoByName(String nombre){
		return "Hola mundo: " + nombre;
	}
}

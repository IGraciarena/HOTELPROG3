package clases;

public class Pasajero {
	
	// ATRIBUTOS
	protected String nombre;
	protected String DNI;
	protected String origen;
	protected String domicilio;
	
	// CONTRUCTORES
	public Pasajero(String nombre, String DNI, String origen, String domicilio) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.origen = origen;
		this.domicilio = domicilio;
	}
	public Pasajero(){
		nombre = "";
		DNI = "";
		origen = "";
		domicilio = "";
	}
	
	// SET & GET
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
	
}

package clases;

public class Habitacion {
	//ATRIBUTOS
	private String numHabitacion;
	private String tipoHab;
	private boolean estado;
	private double costo;
	
	//CONSTRUCTORES
	public Habitacion(){
		numHabitacion = "";
		tipoHab = "";
		estado = true;
		costo = 0;
	}
	
	public Habitacion(String numHabitacion, String tipoHab, boolean estado, double costo) {
		this.numHabitacion = numHabitacion;
		this.tipoHab = tipoHab;
		this.estado = estado;
		this.costo = costo;
	}
	
	// GET & SET
	public String getNumHabitacion() {
		return numHabitacion;
	}
	public void setNumHabitacion(String numHabitacion) {
		this.numHabitacion = numHabitacion;
	}
	public String getTipoHab() {
		return tipoHab;
	}
	public void setTipoHab(String tipoHab) {
		this.tipoHab = tipoHab;
	}
	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	
}

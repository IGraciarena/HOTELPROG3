package clases;

public class Factura {
	// ATRIBUTOS
	private Cliente cliente;
	private String numFactura;
	private double costoTotal;
	private double costoHab;
	
	// CONSTRUCTOR
	public Factura(Cliente cliente, String numFactura, double costoTotal, double costoHab) {
		this.cliente = cliente;
		this.numFactura = numFactura;
		this.costoTotal = costoTotal;
		this.costoHab = costoHab;
	}

	
	// GET & SET
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public double getCostoTotal() {
		return costoTotal;
	}

	public void setCostoTotal(double costoTotal) {
		this.costoTotal = costoTotal;
	}

	public double getCostoHab() {
		return costoHab;
	}

	public void setCostoHab(double costoHab) {
		this.costoHab = costoHab;
	}
	
	// METODOS
	/*
	calcularCostoHabitacion()
	calcularCostoTotal()
	*/
	
	
	
}

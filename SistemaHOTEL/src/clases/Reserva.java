package clases;

import java.util.ArrayList;
import java.util.Date;

public class Reserva {
	//ATRIBUTOS
	private String numReserva;
	private Habitacion habitacion;
	private Cliente cliente;
	private Date checkIn;
	private Date checkOut;
	private ArrayList <Pasajero> pasajeros;
	
	//CONSTRUCTORES
		
	public Reserva(String numReserva, Habitacion habitacion, Cliente cliente, Date checkIn, Date checkOut,
			ArrayList<Pasajero> pasajeros) {
		this.numReserva = numReserva;
		this.habitacion = habitacion;
		this.cliente = cliente;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.pasajeros = pasajeros;
	}
	
	//GET & SET
	public String getNumReserva() {
		return numReserva;
	}
	public void setNumReserva(String numReserva) {
		this.numReserva = numReserva;
	}
	public Habitacion getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	public ArrayList<Pasajero> getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(ArrayList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	
}

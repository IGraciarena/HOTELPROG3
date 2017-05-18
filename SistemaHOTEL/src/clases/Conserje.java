package clases;

import java.util.ArrayList;

public class Conserje {
	// ATRIBUTOS
	private ArrayList <Habitacion> listaHabitacion;
	private ArrayList <Reserva> listaReserva;
	
	
	// CONSTRUCTORES
	public Conserje(ArrayList<Habitacion> listaHabitacion, ArrayList<Reserva> listaReserva) {
		this.listaHabitacion = listaHabitacion;
		this.listaReserva = listaReserva;
	}

	// GET & SET
	public ArrayList<Habitacion> getListaHabitacion() {
		return listaHabitacion;
	}


	public void setListaHabitacion(ArrayList<Habitacion> listaHabitacion) {
		this.listaHabitacion = listaHabitacion;
	}


	public ArrayList<Reserva> getListaReserva() {
		return listaReserva;
	}


	public void setListaReserva(ArrayList<Reserva> listaReserva) {
		this.listaReserva = listaReserva;
	}
	
	// METODOS
	/*
	comprobarEstadoHab()
	nuevaReserva()
	cancelarReserva()
	modificarReserva()
	darAltaHab()
	darBajaHab()
	emitirFactura()
	*/
	
}

package clases;


public class Cliente extends Pasajero{
	//ATRIBUTOS
	private Reserva reserva;


	//CONSTRUCTORES
	public Cliente(String nombre, String DNI, String origen, String domicilio, Reserva reserva) {
		super(nombre, DNI, origen, domicilio);
		this.reserva = reserva;
	}
	
	// GET & SET
	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
}

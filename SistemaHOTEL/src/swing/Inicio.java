package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 446, 279);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNuevaReserva = new JButton("Nueva Reserva");
		btnNuevaReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNuevaReserva.setBounds(10, 31, 141, 23);
		frame.getContentPane().add(btnNuevaReserva);
		
		JButton btnListaReserva = new JButton("Lista de Reservas");
		btnListaReserva.setBounds(10, 65, 141, 23);
		frame.getContentPane().add(btnListaReserva);
		
		JButton btnListaHab = new JButton("Lista de Habitaciones");
		btnListaHab.setBounds(10, 99, 141, 23);
		frame.getContentPane().add(btnListaHab);
	}
}

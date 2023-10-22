package Main;

import javax.swing.SwingUtilities;

import Personaje.Ventana;

public class Principal {

	public static void main(String[]args) {
		
	
		        SwingUtilities.invokeLater(() -> {
		            new Ventana();
		        });
		Ventana V= new Ventana();
		V.setVisible(true);
		V.setLocationRelativeTo(null);	
	
}
}


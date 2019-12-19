package Geometria;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DisegnaQuadrato extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// si assegna il colore rosso al contesto grafico
		g.setColor(Color.red);
		// si disegna un quadrato con vertice in alto a sinistra posto 
		// nel punto (20, 20) con base e altezza di 150 pixel
		g.fillRect(20, 20, 150, 150);
		}
}	


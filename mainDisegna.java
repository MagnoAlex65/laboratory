package Geometria;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Panel;
import java.awt.EventQueue;

import java.io.*;
import java.util.Scanner;

public class mainDisegna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double raggio = 20;
		double pos_x = 0;
		double pos_y = 0;
		double pos_z = 10;
		double lato_A = 10;
		double lato_B = 20;

		System.out.println("Quale tipologia di figura vuoi disegnare ");
		Scanner inp = new Scanner(System.in);
		int figura = inp.nextInt();

		switch (figura) {
//		
		case 1:
			// Disegna Cerchio nella frame dedicata
//			DisegnaCerchio discer = new DisegnaCerchio();
//			discer.paintComponent(null);
			System.out.println("CERCHIO");
			Cerchio cir = new Cerchio(raggio, pos_x, pos_y);
			System.out.println("Il perimetro del cerchio  .....: " + cir.calcolaPerimetro());
			System.out.println("La superficie del cerchio .....: " + cir.calcolaSuperficie());
			break;
		case 2:
			// Disegna Sfera nella frame dedicata
//			DisegnaSfera dissph = new DisegnaSfera();
//			dissph.paintComponent(null);
			System.out.println("SFERA");
			Sfera sph = new Sfera(raggio, pos_x, pos_y, pos_z);
			System.out.println("La superficie della sfera .....: " + sph.calcolaSuperficie());
			System.out.println("Il volume della sfera .........: " + sph.calcolaVolume());
			break;
		case 3:
			// Disegna Quadrato nella frame dedicata
			DisegnaQuadrato disqua = new DisegnaQuadrato();
			disqua.paintComponent(null);
			System.out.println("QUADRATO");
			Quadrato qua = new Quadrato(lato_A);
			System.out.println("Il perimetro del quadrato  ....: " + qua.calcolaPerimetro());
			System.out.println("La superficie del quadrato  ...: " + qua.calcolaSuperficie());
			break;
		case 4:
			//* Disegna Rettangolo nella frame dedicata  
			System.out.println("RETTANGOLO");
			Rettangolo ret = new Rettangolo(lato_A, lato_B);
			System.out.println("Il perimetro del rettangolo  ..: " + ret.calcolaPerimetro());
			System.out.println("La superficie del rettangolo ..: " + ret.calcolaSuperficie());
			break;
		case 5:
			// Disegna Cubo nella frame dedicata
//			DisegnaSfera discub = new DisegnaCubo();
//			discub.paintComponent(null);
			System.out.println("CUBO");
//			System.out.println("La superficie del cubo ........: " + cub.calcolaSuperficie());
//			System.out.println("Il volume del cubo ............: " + cub.calcolaVolume());
			break;
		case 6:
			// Disegna Parallelepipedo
			System.out.println("PARALLELEPIPEDO");
			break;
		default:
			System.out.println("FIGURA INESISTENTE");

		}
		inp.close();
		
	}

}

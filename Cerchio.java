package Geometria;

public class Cerchio extends FiguraBiDimensionale {

	private double raggio;	// raggio del cerchio
		
	public Cerchio(double x_asc, double y_ord, double r) {
		super(x_asc, y_ord);
		this.raggio = r;
	}

	public Cerchio() {
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double r) {
		this.raggio = r;
	}

	public double getX_asc() {
		return x_asc;
	}

	public void setX_asc(double x_asc) {
		this.x_asc = x_asc;
	}

	public double getY_ord() {
		return y_ord;
	}

	public void setY_ord(double y_ord) {
		this.y_ord = y_ord;
	}

	@Override
	public double calcolaPerimetro() {
		return ((this.raggio * 2) * Math.PI); 
	}

	@Override
	public double calcolaSuperficie() {
		return ((this.raggio * this.raggio) * Math.PI);
	}

	// Metodo per il calcolo del raggio conoscendo l'area
	public double calcolaRaggiodaArea() {
		int Raggio = 0;
		return Raggio;
	} 
	
	// Metodo per il calcolo del raggio conoscendo il perimetro
	public double calcolaRaggiodaPerimentro() {
		int Raggio = 0;
		return Raggio;
		} 
		
}

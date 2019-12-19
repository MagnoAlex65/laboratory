package Geometria;

public class Sfera extends FiguraTriDimensionale {
	 
	private double raggio;
	
	public Sfera(double x_asc, double y_ord, double z_polar, double r) {
		super(x_asc, y_ord, z_polar);
		this.raggio = r;
	}
	
	public Sfera() {
	}

	@Override
	public double calcolaSuperficie() {		
		return 4 * Math.PI * (Math.pow(2, this.raggio));
	}
	
	@Override
	public double calcolaVolume() {
		return 4/3 * Math.PI * (Math.pow(3, this.raggio));
	}

}

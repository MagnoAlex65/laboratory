package Geometria;

public abstract class FiguraTriDimensionale {
	
	double x_asc = 0.00;	// punto sulle ascisse
	double y_ord = 0.00; 	// punto sulle ordinate
	double z_pol = 0.00; 	// punto polare
		
	public FiguraTriDimensionale() {
		// TODO Auto-generated constructor stub
	}

	public FiguraTriDimensionale(double x_asc, double y_ord, double z_pol) {
		// TODO Auto-generated constructor stub
	}
		
	public abstract double calcolaSuperficie();
	
	public abstract double calcolaVolume();
		
}

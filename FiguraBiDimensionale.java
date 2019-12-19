package Geometria;

public abstract class FiguraBiDimensionale {

	double x_asc = 0.00;	// punto sulle ascisse
	double y_ord = 0.00; 	// punto sulle ordinate
		
	public FiguraBiDimensionale() {
		// TODO Auto-generated constructor stub
	}
	
	public FiguraBiDimensionale(double x_asc, double y_ord) {
		// TODO Auto-generated constructor stub
	}
		
	public abstract double calcolaPerimetro();
	
	public abstract double calcolaSuperficie();	
		

}

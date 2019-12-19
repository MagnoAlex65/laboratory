package Geometria;

public class Rettangolo extends FiguraBiDimensionale {
	
	private double lato_A;
	private double lato_B;

	public Rettangolo(double lato_1, double lato_2) {
		super();
		this.lato_A = lato_1;
		this.lato_B = lato_2;
	}
	
	public Rettangolo(double lato_1) {
		super();
		this.lato_A = lato_1;
	}

	public Rettangolo() {
	}
	
	public double getLato_A() {
		return lato_A;
	}

	public void setLato_A(int lato_1) {
		this.lato_A = lato_1;
	}

	public double getLato_B() {
		return lato_B;
	}
 
	public void setLato_B(int lato_2) {
		this.lato_B = lato_2;
	}

	@Override
	public double calcolaPerimetro() {
		return (this.lato_A * 2) + (this.lato_B * 2); 
	}

	@Override
	public double calcolaSuperficie() {
		return 2 * (this.lato_A * this.lato_B) ;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}

package Geometria;

public class Quadrato extends Rettangolo {
	
	public Quadrato() {
	}
	
	public Quadrato(double lato_A) {
		super(lato_A);
	}

	@Override
	public double getLato_A() {
		return super.getLato_A();
	}

	@Override
	public void setLato_A(int lato_A) {
		super.setLato_A(lato_A);
	}

	@Override
	public double calcolaPerimetro() {
		return 4 *super.getLato_A();
		
	}
		//return super.calcolaPerimetro();	}

	@Override
	public double calcolaSuperficie() {
		return (super.getLato_A() * super.getLato_A());
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}

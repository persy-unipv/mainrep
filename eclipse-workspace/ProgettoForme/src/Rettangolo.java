
public class Rettangolo {
	
	private double altezza;
	private double base;
	
	public Rettangolo() {
		altezza = 0; 
		base=0; 
	}
	
	
	public double getAltezza() {
		return altezza; 
	}
	public double getBase() {
		return base; 
	}
	

	
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getArea() {
		
		double area = base*altezza; 
		return area; 
	}
	
	
	public double getPerimetro() {
	
		double perimetro = 2*(base+altezza);
		return perimetro; 
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rettangolo r = new Rettangolo();
		r.setAltezza(6);
		r.setBase(5);
		double area  = r.getArea();
		
		
		System.out.println("L'area del rettangolo è:"+area);

	}

}

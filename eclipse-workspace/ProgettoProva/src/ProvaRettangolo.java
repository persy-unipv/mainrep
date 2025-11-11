import java.util.Scanner;


public class ProvaRettangolo {
	
	 final int  NUMEROELEMENTI = 2;
	  
	 private double  [] dimensione;
	 

	 
	 public ProvaRettangolo() {
		 /*dimensione[0] = 0;  Non serve tanto lo inizializza lui: lo faccio solo se devo usare degli indici e quindi incrementare dei valori
		  * 				Servirebbe solo se devo essre sicuro che siano 0 
		  * 
		 dimensione[1] = 0;
		 */
		 dimensione = new double[NUMEROELEMENTI];
	 }


	 public double  [] getDimensione() {
		return dimensione;
	 }


	 public void setDimensione(double  [] dimensione) {
		this.dimensione = dimensione;
	 }
	 
	 public double getArea() {
		 
		 double area; 
		 area = dimensione[0] * dimensione[1]; 
		 return area;
	 }
	 
	 

	 public double getPerimetro() {
		 
		 double perimetro;
		 perimetro = 2*(dimensione[0]+dimensione[1]);
		 
		 return perimetro;
				 
		
	}
	
	 public static void main(String[] args) {
		 
	
		ProvaRettangolo rettangolo = new ProvaRettangolo();
		double[] dim = new double[rettangolo.NUMEROELEMENTI];
		System.out.println("inserisci la base\n");
		Scanner scanner =  new Scanner(System.in);
		dim[0]= scanner.nextDouble(); 
		System.out.println("Inseriesci l'altezza\n");
		dim[1] = scanner.nextDouble(); 
		System.out.println("Hai inserito come base:"+dim[0]+"\n"+"E come altezza"+dim[1]);
		rettangolo.setDimensione(dim);

		System.out.println("Area:"+rettangolo.getArea()+"\n"+"Perimetro:"+rettangolo.getPerimetro());

		scanner.close();
		
		

		
		
		
	}

}

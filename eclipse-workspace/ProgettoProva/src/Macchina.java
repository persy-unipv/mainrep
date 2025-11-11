import java.util.ArrayList;
import java.util.LinkedList;


public class Macchina implements Guidabile {
	
	private ArrayList<Integer> prova;
	private LinkedList<Integer> interi = new LinkedList<>();
	
	

	public Macchina() {
		super();
		prova =  new ArrayList<>();
		
	}

	public ArrayList<Integer> getProva() {
		return prova;
	}

	public void setProva(ArrayList<Integer> prova) {
		this.prova = prova;
	}

	public Macchina(ArrayList<Integer> prova) {
		super();
		this.prova = prova;
	}

	@Override
	public void checkCavalli() {
		// TODO Auto-generated method stub
		int x = Guidabile.cavalli;
		
	}

	@Override
	public double checkCoppia(double caratteristica) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public void checkProva() {
		if(interi.get(0)>0)
			System.out.println();
		else 
			System.out.println();
	}
	public static void main(String[] args) {
	
		Macchina m = new Macchina();
		m.setProva(null);
		m.interi.add(1);
		
		
		
		
	}
}

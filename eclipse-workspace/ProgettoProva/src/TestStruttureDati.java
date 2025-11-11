import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestStruttureDati {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Posso cambiare il tipo di sstruttura dati mettendo LinkedList e il codice funziona uguale 
		List <String> l = new ArrayList<>();
		l.add("ciao");
		
		LinkedList<String> kista  =(LinkedList<String>) l;
		kista.add(null); 
		
		
		List <Integer> interi = new ArrayList<>();
		List <Integer> l1 = new LinkedList<>();
		//Costo di inserimento O(1) se la preallocazione non saturata(Arraylist non piena)
		interi.add(1);
		interi.add(10);
		interi.add(8);
		interi.add(5);
		
		int res = interi.get(0); //Costo di accesso O(1) costante. 
		
		l1.add(15);//O(1)
		l1.add(20);
		
		int res1 = l1.get(0); //O(n) costo di accesso di un elemento 
		
		
		System.out.println(res);
		
		for(int i=0;i<interi.size();i++) {
			int a = interi.get(i);
			System.out.println(a);
		}
		
		for(Integer a : interi) {
			System.out.println(a);
			//interi.remove(0); non si può alterare la struttura mentre la stiamo iterando dato che L'iteratore perde il riferimento 
			
			
		}
		//prendo l'iteratore della lista 
		Iterator<Integer> iter = interi.iterator();
		while(iter.hasNext()) {
			int val = iter.next();
			System.out.println(val);
			iter.remove();
		}
		
		
		

	}

}

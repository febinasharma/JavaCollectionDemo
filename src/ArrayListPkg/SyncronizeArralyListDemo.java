package ArrayListPkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncronizeArralyListDemo {

	public static void main(String[] args) {
		
		List<String> empnames= Collections.synchronizedList(new ArrayList<String>());
		empnames.add("Norah");
		empnames.add("Tara");
		empnames.add("Vedha");
		
		synchronized (empnames)
		{
			Iterator<String> it=empnames.iterator();
			while(it.hasNext())
				System.out.println(it.next());
		}
		
    System.out.println("************************************");
    
    CopyOnWriteArrayList<String> namelist=new CopyOnWriteArrayList<String>();
    namelist.add("Norah");
    namelist.add("Vedha");
    namelist.add("Tara");
    Iterator<String> it= namelist.iterator();
    while(it.hasNext())
    	System.out.println(it.next());
	}

	
		
}

package ArrayListPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> aList= new ArrayList<Integer>();
		aList.add(10);
		aList.add(200);
		System.out.println(aList);
		System.out.println("***************");
		
        ArrayList<String> nameList= new ArrayList<String>(Arrays.asList("Norah","Prabhu", "Tina","Norah"));
        //nameList.retainAll(Collections.singleton("Norah")); // to retail only the data mentioned 
        System.out.println(nameList);
        
        System.out.println("***************");
        
        ArrayList<Integer> numberList= new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
        //numberList.removeIf(e -> e%2!=0);
        System.out.println(numberList);
        System.out.println("***************");
        System.out.println(numberList.indexOf(2));
        System.out.println(numberList.indexOf(4));
        //System.out.println(numberList.subList(3, 8));
        
        System.out.println("***************");
        
        ArrayList<String> newnameList= new ArrayList<String>(Arrays.asList("Norah", "Tara", "Vedha", "Zara"));
        Object arr[]= newnameList.toArray();
      //  System.out.println(Arrays.toString(arr));
        for(Object o:arr)
        	System.out.println(o);
        
        
        System.out.println("***************");
        
        ArrayList<String> newnameList1= new ArrayList<String>(Arrays.asList("Norah", "Tara", "Vedha", "Zara"));
        
	}

}

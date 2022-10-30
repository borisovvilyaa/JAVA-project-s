package ua.khpi.oop.borusov06;
import java.io.Serializable;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class textReplace implements Serializable {


	public static void replace() {
		String str = "Як умру то поховайте мене на могилі"; 
		
	    String[] words = str.split(" ");
	    
	    ArrayList<String> arrayList1 = new ArrayList<> (); 
	     for(String subStr:words) {
	    	 arrayList1.add(subStr);
	     }  

	   
	    //String toString()
	    System.out.println("toString():" + arrayList1.toString());
	    
	    //void add(String string)
	    System.out.println("add(String string):" + arrayList1.add("Т. Шевченко"));
	    
	    //boolean remove(String string)
	    System.out.println("remove(String string):" + arrayList1.remove("поховайте"));
	    
	    //Object[] toArray()
	    // Create an array from the ArrayList
	    String arraylist2[] = new String[arrayList1.size()];
	    arraylist2 = arrayList1.toArray(arraylist2);
	    arrayList1.toArray(arraylist2);
	    for (String item : arraylist2) {
	        System.out.println("Item in Object[] toArray() = " + item);
	    }
	    
	    //int size()
	    System.out.println("size():" + arrayList1.size());
	    
	    //boolean contains(String string)
	    System.out.println("contains(String string):" + arrayList1.contains("мене"));
	    
	    //boolean containsAll(Container container) 
	    //Creating another empty List
	    List<String> listTemp = new ArrayList<String>();
        listTemp.add("то");
        listTemp.add("Україна");
        listTemp.add("переможе");
	    System.out.println("containsAll(Container container):" + arrayList1.contains(listTemp));
	    
	    String wordDel = "умру";
	    String word;
	    
	    Iterator<String> iterator = arrayList1.iterator();
	   
	    while(iterator.hasNext()) {
	    	word = iterator.next();
	    	System.out.println("Iterator has next, word is - " + word);
	    	if (wordDel.equals(word)) {
	    		iterator.remove();
	    		System.out.println("Word '" + word + "' was be deleted");
	    	}
	    }
	    System.out.print("\n\n");
	  
	}
}

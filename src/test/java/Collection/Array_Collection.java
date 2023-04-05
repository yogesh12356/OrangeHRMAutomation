package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Array_Collection {
	public static void main(String[] args) {
			//List
		ArrayList al = new ArrayList();
		al.add(111);
		al.add("test");
		al.add(true);
		al.add("a");
		al.add(111);
		al.add(null);
		al.add(null);
		System.out.println(al);
		System.out.println(al.get(5));
		//add();  to add the data in collection object
	   //remove(); to delete specific data from collection
	  //get();     to get/retrieve the data from collection
		System.out.println("------------ArrayLst-----------");
		
		//Set
		HashSet hs= new HashSet();
	    hs.add(111);
	    hs.add("test");
	    hs.add(true);
	    hs.add("a");
	    hs.add(111);
	    hs.add(null);
	    hs.add(null);
		System.out.println(hs);
		System.out.println("--------------HashSet------------");
		HashSet hs1= new HashSet();
		hs1.addAll(al);            //adding one collection into another
		System.out.println(hs1);
		System.out.println("--------LinkedHashSet------------");
		
		LinkedHashSet linkedhs= new LinkedHashSet();
		linkedhs.add(111);
		linkedhs.add("test");
		linkedhs.add(true);
		linkedhs.add("a");
		linkedhs.add(111);
		linkedhs.add(null);
		linkedhs.add(null);
		linkedhs.add(null);
		System.out.println(linkedhs);
		
		HashSet hs2= new HashSet();
		hs2.add("aa"); 
		hs2.add("bb"); 
		hs2.add("cc"); 
		hs2.add("abc"); 
		System.out.println(hs2);
		System.out.println("--------TreesSet------------");
		
		TreeSet ts= new TreeSet();
		ts.add(11);
		ts.add(33);
		ts.add(22);
		ts.add(10);
		ts.add(11);
		System.out.println(ts);
		
		ArrayList a12 = new ArrayList();
		a12.addAll(ts); 	
		System.out.println(a12.get(2));
		
		
		
		
		
	}

}

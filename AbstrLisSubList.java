// Java program to demonstrate 
// subList() method for String value 
  
import java.util.*; 
  
public class AbstrLisSubList { 
    public static void main(String[] argv) 
        throws Exception 
    { 
  
        try { 
  
            // Creating object of AbstractList<Integer> 
            ArrayList<String> 
                arrlist = new ArrayList<String>(); 
  
            // Populating arrlist1 
            arrlist.add("A"); 
            arrlist.add("B"); 
            arrlist.add("C"); 
            arrlist.add("D"); 
            arrlist.add("E"); 
  
            // print arrlist 
            System.out.println("Original AbstractList: "
                               + arrlist); 
  
            // getting the subList 
            // using subList() method 
            List<String> arrlist2 = arrlist.subList(2, 4); 
  
            // print the subList 
            System.out.println("Sublist of AbstractList: "
                               + arrlist2); 
        } 
  
        catch (IndexOutOfBoundsException e) { 
            System.out.println(e); 
        } 
  
        catch (IllegalArgumentException e) { 
            System.out.println(e); 
        } 
    } 
} 






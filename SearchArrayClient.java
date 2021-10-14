public class SearchArrayClient 
{  
   public static void main(String[] args)  
   {   
      // WRITE THIS - construct an SearchArray object 
      SearchArray client = new SearchArray();
      // WRITE THIS - print the array and its length      
      client.print();
      // WRITE THIS - search the array for 182, 39, and 20 using a linear search    
      // and output the results
      System.out.println("\nLinear Search");
      int n182 = client.linSearch(182);
      if(n182 >= 0)
      {
         System.out.println("\n" + 182 + " occurs at index " + n182);
      }
      else
         System.out.println("\n" + 182 + " does not occur in the array ");
      int n39 = client.linSearch(39);   
      if(n39 >= 0)
      {
         System.out.println("\n" + 39 + " occurs at index " + n39);
      }
      else
         System.out.println("\n" + 39 + " does not occur in the array ");
      int n20 = client.linSearch(20);  
      if(n20 >= 0)
      {
         System.out.println("\n" + 20  + " occurs at index " + n20);
      }
      else
         System.out.println("\n" + 20  + " does not occur in the array ");
      
      // WRITE THIS - sort the array using a selection sort 
      // WRITE THIS - print the array and its length
      System.out.println("\nSort the array\n"); 
      client.selectionSort(); 
      client.print();  
      System.out.println();   
            
      // WRITE THIS - search the array for 10, 150, and 97 using a binary search    
      // and output the results      
      System.out.println("\nBinary Search\n");
      int n10 = client.binSearch(10);
      if(n10 >= 0)
      {
         System.out.println("\n" + 10 + " occurs at index " + n10);
      }
      else
         System.out.println("\n" + 10 + " does not occur in the array ");
      int n150 = client.binSearch(150);
      if(n150 >= 0)
      {
         System.out.println("\n" + 150 + " occurs at index " + n150);
      }
      else
         System.out.println("\n" + 150 + " does not occur in the array ");
      int n97 = client.binSearch(97);   
      if(n97 >= 0)
      {
         System.out.println("\n" + 97  + " occurs at index " + n97);
      }
      else
         System.out.println("\n" + 97  + " does not occur in the array ");

      System.out.println("Remove 150");
      client.remove(150);
      client.print();
      
      System.out.println("Insert 30");
      client.insert(30);
      client.print();
      
      
      System.out.println("Remove 60");     
      client.remove(60);
      client.print();
      
      System.out.println("Remove 38");
      client.remove(38);
      client.print() ;
      
      System.out.println("Insert 313");
      client.insert(313);
      client.print();
      
      System.out.println("Insert 0");
      client.insert(0);
      client.print();
      
      System.out.println("Remove 12");
      client.remove(12);
      client.print();
      
      System.out.println("Insert 87");
      client.insert(87);
      client.print();


      // WRITE THIS - remove 150 from the array
      // WRITE THIS - print the array and its length
      
      // WRITE THIS - insert 30 into the array
      // WRITE THIS - print the array and its length
      
      // WRITE THIS - remove 60 from the array
      // WRITE THIS - print the array and its length
      
      // WRITE THIS - remove 38 from the array
      // WRITE THIS - print the array and its length
      
      // WRITE THIS - insert 313 into the array
      // WRITE THIS - print the array and its length
      
      // WRITE THIS - insert 0 into the array
      // WRITE THIS - print the array and its length
      
      // WRITE THIS - remove 12 from the array
      // WRITE THIS - print the array and its length
      
      // WRITE THIS - insert 87 into the array
      // WRITE THIS - print the array and its length
   } 
} 
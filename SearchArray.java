import java.util.Scanner; 
import java.io.File; 
import java.io.IOException; 

public class SearchArray
{
   private int[] myNumList;
   private int myLength; //stores the theoretical length of the array
   
   // constructs myNumList so that it holds 100 ints and calls the fillArray method 
   // initializes myLength to 100  
   public SearchArray()
   {
      myLength = 100;
      myNumList = new int [100];
      fillArray();
   } 
   
   // fills myNumList with ints that are read from numfile1.txt  
   // you should not modify this method  
   private void fillArray()  
   {       
      try       
      {        
         int i = 0;        
         File inFile = new File ("numfile1.txt"); 
        
         Scanner sc = new Scanner (inFile);        
         while (sc.hasNextLine())        
         {          
               int num = sc.nextInt();          
               myNumList[i] = num;          
               i++;        
         }       
      }
      
      catch (java.io.FileNotFoundException fnf)        
      {    
         System.out.println("Input File not Found: " + fnf.getMessage());   
      }     
   }    
   
   // prints the elements of myNumList with a space between each element and   
   // prints 10 elements on each line, then prints myLength on its own line  
   public void print()  
   {  int length = 0; 
      for(int i = 0; i < myLength; i++)
      { 
         if ( i % 10 == 9 )
         {
            System.out.println(myNumList[i] + " ");
         }
         else
         System.out.print(myNumList[i] + " ");
         
         length++;
      }
      System.out.print("\nLength=" + length + "\n") ;  
     
   } 
   
   // searches for item in myNumList, returns the index of where item first occurs  
   // if item is not in myNumList, returns -1  
   public int linSearch(int item)  
   {   
      boolean found = false;
      int index = 0;
      
      while(!found && index < myLength )
      {
         if(item == myNumList [index])
         {
            found = true;
         }
         else
         {
            index++;
         }
      }
      if(found)
      {
         return index;
      }
      else
      {
         return -1;
      }
        
   }
   
   // sort myNumList in ascending order using a selection sort  
   public void selectionSort()  
   {   
      int x , y , i;
        for( i = 0; i < myNumList.length; i++)
        {
            y = i;
            for( int j = 1 + i; j < myLength; j++)
            {
               if(myNumList[j] < myNumList[y])
                  y = j;
            }
            
            x = myNumList[y];
            myNumList[y] = myNumList[i];
            myNumList[i] = x;
        }
   } 
   
   // searches for item in myNumList, returns the index of where item occurs  
   // if item is not in myNumList, returns -1  
   public int binSearch(int item)  
   {  
      int low = 0; 
      int high = myNumList.length - 1;
      while(low <= high)
      {
         int mid = (low + high) / 2;
         if(myNumList[mid] == item)
            return mid;
         else if(myNumList[mid] > item)
            high = mid - 1;
         else
            low = mid + 1;
      }
      return -1;
   }
   
   // removes item from myNumList, if item is in myNumList
   // otherwise, prints “Item not found”.
   // if item occurs multiple times, only remove the first occurrence.
   // removing an element should do what to myLength?
   // DO NOT make a new array
   // This should require only one loop
   public void remove(int item)
   {
      int occur = linSearch(item);
      if(occur >= 0)
      {
         for(int i = occur; i < myLength-1; i++)
         {
            myNumList[i] = myNumList[i+1];
         }
         myLength = myLength - 1;
      }
      else System.out.println("Item not found");
   }
   // inserts item into myNumList so that myNumList is still sorted
   // if item can be inserted, otherwise, prints “Can’t insert item”.
   // inserting an element should do what to myLength?
   // DO NOT make a new array
   // This should require only one loop
   public void insert(int item)
   {
      if(myLength < myNumList.length)
      {  
         int i = myLength - 1;
         myNumList[i+1] = myNumList[i];
         while(myNumList[i] > item && i >0)
         {
            myNumList[i] = myNumList[i-1];
            i--;
         }
         myNumList[i] = item;
         
         /*int num = 0;
         for(int i = myLength - 2;i >= 0; i--)
         {  
            if(myNumList[i] > item)
            {
               if (myNumList[i+1] <= item)
               {
                  myNumList[i] = item;
                  break;
               }      
            }
            else if (myNumList[i] > item)
            {
               myNumList[i+1] = myNumList[i];
            }
         }*/
         myLength++;
      }
      else System.out.println("Can’t insert item");
   }
    
}
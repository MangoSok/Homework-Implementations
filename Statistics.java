import java.util.*;
import java.io.File;
import java.io.IOException;

public class Statistics
{
	private ArrayList<Integer> myNumList;
   private ArrayList<Integer> copy;
   // private ArrayList<Integer> sorted;
		
	// constructs myNumList and calls the fillList method
	public Statistics()
	{
		myNumList = new ArrayList<Integer>();
      copy = new ArrayList<Integer>();
	}
	
	// fills myNumList with Integers that are read from numbers.txt
	// you should not modify this method
	public void fillList()
	{
    	try
    	{
    		File inFile = new File ("numbers1.txt");

    		Scanner sc = new Scanner (inFile);
    		while (sc.hasNext())
    		{
      		int num = sc.nextInt();
      		myNumList.add(num);
    		}
    	}
    	catch (java.io.IOException ioe) 	
		{
			System.out.println("Problems Reading File:" +ioe.getMessage());
  		}
	}
   
   public void fillCopy()
   {
      for(int i = 0; i < myNumList.size(); i++)
      {
         copy.add(myNumList.get(i));
      }
   }

	// returns the average of all the numbers in myNumList
	public double average()
	{
      long sum = 0;
      int count = 0;
		for(int i = 0; i < myNumList.size(); i++)
      {
         sum += myNumList.get(i);
         count++;
      }
      return (double)sum/count;
	}

	// returns the standard deviation of all the numbers in myNumList
	public double standardDeviation()
	{
		double ave = average();
      double sum = 0;
      double diff = 0;
      for(int i = 0; i < myNumList.size(); i++)
      {
         diff = myNumList.get(i) - ave;
         sum += diff * diff;
      }
      sum = sum/(myNumList.size()-1);
      sum = Math.sqrt(sum);
      return sum;

      
	}
	
	// returns an ArrayList of the modes of the numbers in myNumList
	// THERE IS MORE THAN ONE MODE!!!
	public ArrayList<Integer> modes()
	{
      List<Integer> sorted = mergeSort(copy);
		ArrayList<Integer> allModes = new ArrayList<Integer>();
      int biggest = repititions(sorted.get(0),sorted);
      int i = diffValue(sorted.get(0), 0, sorted);
      while(i!=-1)
      {
         int j = sorted.get(i);
         int k = repititions(j,sorted);
            if(k > biggest)
            {
               empty(allModes);
               biggest = k;
               allModes.add(j);
            }
            else if(k == biggest)
            {
               allModes.add(j);
            }
         i = diffValue(sorted.get(i), i,sorted);
       }
       return allModes;
    }
	
   private int repititions(int num, List<Integer> sorted)
   {
      int count = 0;
      for(int i = 0; i < sorted.size(); i++)
      {
         if(sorted.get(i) == num)
            count++;
      }
      return count;
   }
   
   //finds and index of the next value in myNumList that is different from num
   private int diffValue(int num, int start,List<Integer> sorted)
   {
      int index = -1;
      for(int i = start; i < sorted.size(); i++)
      {
         if(sorted.get(i) != num) 
         {
            index = i;
            break;
         }
      }
      return index;
   }
   
   private ArrayList<Integer> merge(List<Integer> list1, List<Integer> list2)
   {
      int i = 0, j = 0;
      ArrayList<Integer> sorted = new ArrayList<Integer>();
      while(i < list1.size() && j < list2.size())
      {
         if(list1.get(i) < list2.get(j))
         {
            sorted.add(list1.get(i));
            i++;
         }
         else
         {
            sorted.add(list2.get(j));
            j++;
         }
      }
      
      while(i < list1.size())
      {
         sorted.add(list1.get(i));
         i++;
      }
      
      while(j < list2.size())
      {
         sorted.add(list2.get(j));
         j++;
      }
      
      return sorted;
   }
      

   public List<Integer> mergeSort(List<Integer> list)
   {
      
      if(list.size() > 1)
      {
         int mid = 1;
         mid = list.size()/2;
         List<Integer> list1 = mergeSort(list.subList(0, mid));
         List<Integer> list2 = mergeSort(list.subList(mid, list.size() - 1));
         return merge(list1, list2);
      } 
         return list;
       
   }
   
   public void printModes()
   {
      for(int e : modes())
      {
         System.out.print(e + " ");
      }
   }
   
   private void empty(ArrayList<Integer> list)
   {
      int i = list.size();
      while(i > 0)
      {
         list.remove(0);
         i--;
      }
   }
   
   // You should include private helper methods 
	
}

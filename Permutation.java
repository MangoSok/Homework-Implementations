import java.util.ArrayList;
public class Permutation
{
   private int run;
   private ArrayList<Integer> list;
   private ArrayList<Integer> perm ;
   
   public Permutation()
   {
      run = 0;
      list = new ArrayList<Integer>();
      perm = new ArrayList<Integer>();
   }
   
   public void fillList()
   {  
      int i = 10;
      while(list.size() != 10)
      {
         list.add(0, i);
         i--;
      }
   }
   
   public void mix()
   {
      int index = 0;
      for(int i = 9; i >= 0; i--)
      {
         index = (int)(Math.random() * i);
         perm.add(list.get(index));
         list.remove(index);
      }
   }
   
   public void printPermutation()
   {
      for(int i = 0; i < perm.size(); i++)
      {
         System.out.print(perm.get(i) + " ");
      }
      System.out.println();
   }
   
   public void reset()
   {
      fillList();
      int i = 0;
      while(perm.size() != 0)
      {
         perm.remove(i);
      }
   }
}
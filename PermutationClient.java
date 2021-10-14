public class PermutationClient
{
   public static void main (String[] args)
   {
      Permutation client = new Permutation(); 
      
      client.fillList(); 
      for(int i = 0; i < 10; i++)
      {
         client.mix();
         client.printPermutation();
         client.reset();
      }
      
      
   }
}
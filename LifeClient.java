public class LifeClient
{
   public static void main(String[] args)
   {
      Life client = new Life();
      client.fillBoard();
      client.printBoard();
      for(int i = 0; i < 6; i++)
      {
         client.nextGeneration();
         client.printBoard();
      }
   }
}
public class KnightClient
{
   public static void main(final String[] args)
   {
      Knight client = new Knight();
      while(client.freeToMove())
      {
         client.makeMove();
      }
      client.printBoard();
   }
}
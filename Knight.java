public class Knight
{
   private int [][] board;
   private int steps; // num of squares visited
   private int row;//current position
   private int column;// current position
   private int[] horizontal = {1,2,2,1,-1,-2,-2,-1};
   private int[] vertical = {-2,-1,1,2,2,1,-1,-2};
   //static method doesn't need an object to be called by
   
   public Knight()
   {
      board = new int[8][8];
      steps = 0;
      column = 0;
      row = 0;
   } 
   
   public void printBoard()
   {
      for(int r = 0; r < board.length; r++)
      {
         for(int c = 0; c < board[r].length; c++)
         {
            System.out.print(board[r][c]+" ");
         }
         System.out.println();
      }
   }
   
   public void makeMove()
   {
      if(board[0][0] == 0)
      {
         board[0][0] = 1;
         steps ++;
      }
      
      if(steps < 64)
      {
         boolean found = false;
         while(!found)
         {
            int index = (int)(Math.random() * 7 );
            int r = row + horizontal[index];
            int c = column +vertical[index];
            if(isOnBoard(r, c) && board[r][c]==0)
            {
               board[r][c] = steps + 1;
               steps++;
               row = r;
               column = c;
               found = true;
            }
            
         }
      } 
   }
   
   public boolean freeToMove()
   {
      for(int i = 0; i < horizontal.length; i++)
         {
            int r = row + vertical[i];
            int c = column + horizontal[i];
            if( isOnBoard(r, c) && board[r][c] == 0 )
               return true;
         }
      return false;
   }
   
   private boolean isOnBoard(int row, int col)
   {
      if(row >= 0 && row < 8 && col >= 0 && col < 8)
         return true;
      else
         return false;
   }
}
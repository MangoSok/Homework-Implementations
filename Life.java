import java.util.Scanner;
import java.io.File;
public class Life
{
	private String[][] myBoard;
   private int[] row = { 0, 1, 1, 1, 0, -1, -1, -1}; 
   private int[] col = { 1, 1, 0, -1, -1, -1, 0, 1};
   private int run;
	// other additional instance variables?
	
	public Life()
	{
		myBoard = new String[20][20];
      run = 0;
	}
	
	// DO NOT MODIFY THIS METHOD!!
	public void fillBoard()
	{
		try
    	{
    		File inFile = new File("life.txt");
   		Scanner sc = new Scanner(inFile);
   		while (sc.hasNext())
   		{
     			int row = sc.nextInt();
				int column = sc.nextInt();
				myBoard[row-1][column-1] = "*";
   		}
   	}
    	
   	catch (java.io.FileNotFoundException fnf) 
   	{
			System.out.println("Input File not Found: " + fnf.getMessage());
		}
		
	}
	
	public void printBoard()
   {
      int starSum = 0;
      for(int r = 0; r < myBoard.length; r++)
      {
         for(int c = 0; c < myBoard[r].length; c++)
         {
            if(myBoard[r][c]!= null)
               starSum++;
         }
      }
      int count10Col = 0;
      for(int r = 0; r < myBoard.length; r++)
      {
         if(myBoard[r][9]!= null)
            count10Col++;
      }
      int count10Row = 0;
      for(int c = 0; c < myBoard[0].length; c++)
         {
            if(myBoard[9][c]!= null)
               count10Row++;
         }

      
      System.out.println("Generation " + run + ": Number of bacteria = " + starSum );
      System.out.println("\n" + "   12345678901234567890" + "\n");
      
      for(int r = 0; r < myBoard.length; r++)
      {  
         System.out.print(((r+1)%10) + "  ");
         for(int c = 0; c < myBoard[r].length; c++)
         {
            if(myBoard[r][c] == null)
               System.out.print(" ");
            else
               System.out.print(myBoard[r][c]);   
         }
         System.out.println();
      }
      System.out.println("Bacteria in 10th row: " + count10Row);
      System.out.println("Bacteria in 10th column: " + count10Col + "\n" +"\n" );
      
   }
   
   public void nextGeneration()
   {
      for(int r = 0; r < myBoard.length; r++)
      {
         for(int c = 0; c < myBoard[r].length; c++)
         {
            int num = countNeighbors(r,c);
            if(myBoard[r][c]!= null)
            {
               if(num < 2 || num > 3)
                  myBoard[r][c] = null;
            }
            else
               if(num == 3)
                  myBoard[r][c]="*";
         }
      } 
      run++;
   }
   
   private int countNeighbors(int rows, int cols)
   {
      int count = 0;
      if(rows > 0 && cols > 0 && rows < 19 && cols < 19)
      for(int i = 0; i < row.length;i ++)
      {
         if(myBoard[rows + row[i]][cols + col[i]]!= null)
            count++;
      }
      else if(rows == 0 && cols == 0)
      {
         for(int i = 0; i < 3; i++)
         {
            if(myBoard[rows+row[i]][cols+col[i]]!= null)
               count++;
         }
      }
      else if(rows == 0 && cols == 19)
      {
         for(int i = 2;i < 5; i++)
         {
            if(myBoard[rows+row[i]][cols+col[i]]!= null)
               count++;
         }

      }
      else if(rows == 19 && cols == 19)
      {
         for(int i = 4;i < 7; i++)
         {
            if(myBoard[rows+row[i]][cols+col[i]]!= null)
               count++;
         }

      }
      else if(rows == 19 && cols == 0)
      {
         for(int i = 6;i < 8; i++)
         {
            if(myBoard[rows+row[i]][cols+col[i]]!= null)
               count++;
         }
         if(myBoard[rows+row[0]][cols+col[0]]!= null)
            count++;

      }
      else if (rows == 0 )
      {
         for(int i = 0;i < 5; i++)
         {
            if(myBoard[rows+row[i]][cols+col[i]]!= null)
               count++;
         }

      }
      else
      {  
         if(rows > 0 && cols == 0)
            {
            for(int i = 0; i < 3; i++)
            {
               if(myBoard[rows+row[i]][cols+col[i]]!= null)
                  count++;
            }
            
            for(int i = 6; i < 8; i++)
            {
               if(myBoard[rows+row[i]][cols+col[i]]!= null)
                  count++;
            }
         }


      }


      return count;
   }

   
}
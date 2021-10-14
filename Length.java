public class Length
{
   private int myInches; // 0 to 11
   private int myFeet;   // 0 to 2
   private int myYards;  // a non-negative integer

   public Length()
   {
   	myInches	= 0;
   	myFeet =	0;
   	myYards = 0;
   }

   private void setLength(int	yards, int feet,	int inches)
   {
      myInches = inches % 12;
      myFeet = (feet + (inches / 12)) % 3;
      myYards = yards + ((feet + (inches / 12)) / 3);
   }

   public Length(int	yd, int ft,	int in)
   {
      if (yd < 0 || ft < 0 || in < 0) throw new IllegalArgumentException();
      setLength(yd, ft, in);   
   }

   public void	addInches(int in)
   {
      setLength(myYards, myFeet, myInches + in);
   }
   
   public void printLength()
   {
      System.out.println(toString());
    
   }
   
   public String toString()
   {
      return myYards + " yd\n" + myFeet + " ft\n" + myInches + " in";
   }
   
   public int getYd()
   {
      return myYards;
   }
   
   public int getFt()
   {
      return myFeet;
   }
   
   public int getIn()
   {
      return myInches;
   }

   

}
public class Rectangle
{
   private int myLength;
   private int myWidth;
   
   public Rectangle()
   { 
      myLength = 0;
      myWidth = 0;
   }
   
   public Rectangle (int length, int width)
   {
      myLength = length;
      myWidth = width;
   }
      
   public int getLength()
   {
      return myLength;
   }
   
   public int getWidth()
   {
      return myWidth;
   }
   
   public int findArea()
   {
      return myLength * myWidth;
   }
   
   public int findPerimeter()
   {
      return myLength * 2 + myWidth * 2;
   }
   
   public String toString()
   {
      return "length = " + myLength + " width = " + myWidth;
   }
}
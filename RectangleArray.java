public class RectangleArray
{
   private Rectangle[] myList;
   
   public RectangleArray()
   { 
      myList = new Rectangle[20];
   }
   
   public void fillArray(int maxLength, int maxWidth)
   {  
      int myLength;
      int myWidth;
      for(int i = 0; i < myList.length; i++)
      {
         myLength = (int)(Math.random() * (maxLength) + 1);
         myWidth = (int)(Math.random() * (maxWidth) + 1);
         myList[i] = new Rectangle (myLength , myWidth);
      }
   }
   
   public void print()
   {
      for(Rectangle e : myList)
      {
         System.out.println(e);
      }
   }
   
   public int search(int length, int width)
   {
      for(int i = 0; i < myList.length; i++)
      {
         if(length == myList[i].getLength() && width == myList[i].getWidth())
         {
            return i;
         }
      }
      return -1;
   }
   
   public Rectangle largestArea()
   {  
      int largestArea = 0;
      Rectangle rect = null;
      for(Rectangle e : myList)
      {  int area = e.findArea();
         if (largestArea < area)
         {
            largestArea = area;
            rect = e;
         }
         
      }
      return rect;
   }
   
   public Rectangle smallestArea()
   { 
      int smallestArea = 0;
      Rectangle rect = myList[0];
      for(int i = 1; i < myList.length; i++)
      {  
         int area = myList[i].findArea();
         if (smallestArea > area)
         {
            smallestArea = area;
            rect = myList[i];
         }
         
      }
      return rect;
   }
   
   public Rectangle largestPerimeter()
   {
      int largPer = 0;
      Rectangle rect = null;
      for(Rectangle e : myList)
      {  int per = e.findPerimeter();
         if (largPer < per)
         {
            largPer = per;
            rect = e;
         }
         
      }
      return rect;

   }
   
   public Rectangle smallestPerimeter()
   {
      int smalPer = 0;
      Rectangle rect = myList[0];
      for(int i = 1; i < myList.length; i++)
      {  
         int per = myList[i].findPerimeter();
         if (smalPer > per)
         {
            smalPer = per;
            rect = myList[i];
         }
         
      }
      return rect;

   }
}
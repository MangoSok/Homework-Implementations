public class CO2calculator
{
   private double milesToday;// 31 miles = average in US per vehicle per day 
   private static double CO2byCarPerDay = 0.93; // 28.7 pounds is average CO2 pounds per vehicle daily
   private double milesPerGallon;
   //private int bath;
   //private int showers;
   //private double minInBath;
   //private double minInShower;
   //private boolean recycleCans; // aluminum and steel cans
   //private boolean recyclePlastic;
   //private boolean recycleGlass;
   //private boolean recycleNewspaper;
   //private boolean recycleMagazines;
   
   public CO2calculator()
   {
      milesToday = 0;
      milesPerGallon = 22;
      //minInShower = 0;
      //baths = 0;
      //showers = 0;
      //recycleCans = false;
      //recyclePlastic = false;
      //recycleGlass = false;
      //recycleNewspaper = false;
      //recycleMagazines = false;
   }
   
   public void fillMiles(double num)
   {
      milesToday = num;
   }
   
   public void fillMilesPerGallon(double num)
   {
      milesPerGallon = num;
   }

   public double calculate()
   {
      return milesToday/milesPerGallon*19.64;
   }
   
}
public class StatisticsClient
{
   public static void main (String[] args)
   {
      Statistics client = new Statistics();
      client.fillList();
      client.fillCopy();
      System.out.print("Average = " + client.average() + "\n");
      System.out.print("Standard Deviation = " + client.standardDeviation() + "\n");
      System.out.print("Modes = " );
      client.printModes();
      
   }
}
public class Menu
{
   private QueueList list;
   
   public Menu()
   {
      list = new QueueList();
   }
   
   public void menuChoice(int num)
   {
      if(num == 1)
         System.out.print("What do you want to add?  ");
      else if(num == 2)
      {
         list.remove();
         System.out.println("Done.");
      }
      else if(num == 3)
         print();
      else if(num == 4)
         printOdds();
      else if(num == 5)
         printInReverse();
      else if(num == 6)
         deleteZeros();
      else if(num == 7)
         insertOne();
      else 
         System.out.println("Error. There is no such option.");
   }
   
   public void addNum(int num)
   {
      list.add(num);
      System.out.println("Done.");
   }
   
   private void print()
   {
      if(list.isEmpty())
         System.out.println("Queue is empty, nothing to print.");
      else
      {
         QueueList q = new QueueList();
         System.out.print("The queue is:  ");
         while(!list.isEmpty())
         {
            System.out.print(list.peek() + "  ");
            q.add(list.remove());
         }
         while(!q.isEmpty())
            list.add(q.remove());
         System.out.println();
      }
   }
   
   private void printOdds()
   {
      if(list.isEmpty())
         System.out.println("Queue is empty, nothing to print.");
      else
      {
         QueueList q = new QueueList();
         System.out.print("The queue is:  ");
         while(!list.isEmpty())
         {
            if((int)list.peek() % 2 == 1)
               System.out.print(list.peek() + "  ");
            q.add(list.remove());
         }
         while(!q.isEmpty())
            list.add(q.remove());
         System.out.println();
      }
   }
   
   private void printReverse(QueueList q)
   {
      if(!q.isEmpty())
      {
         Object obj = q.remove();
         printReverse(q);
         System.out.print(obj + "  ");
         q.add(obj);
      }
   }
   
   private void reverseQueue(QueueList q)
   {
      if(!q.isEmpty())
      {
         Object obj = q.remove();
         reverseQueue(q);
         q.add(obj);
      }
   }
   
   private void printInReverse()
   {
      if(list.isEmpty())
         System.out.println("Queue is empty, nothing to print.");
      else
      {
         System.out.print("The queue is:  ");
         printReverse(list);
         reverseQueue(list);
         System.out.println();
      }
   }
   
   private void deleteZeros()
   {
      if(list.isEmpty())
         System.out.println("Queue is empty, nothing to delete.");
      else
      {
         QueueList q = new QueueList();
         while(!list.isEmpty())
         {
            q.add(list.remove());
         }
         while(!q.isEmpty())
         {
            if((int)q.peek()!=0)
               list.add(q.peek());
            q.remove();
         }
         System.out.println("Done.");
      }
   }
   
   private void insertOne()
   {
      QueueList q = new QueueList();
      while(!list.isEmpty())
      {
         q.add(list.remove());
      }
      
      list.add(1);
      
      while(!q.isEmpty())
      {
         list.add(q.remove());
      }
      System.out.println("Done.");
   }
   
}
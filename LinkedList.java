public class LinkedList
{
   private ListNode first;
   
   public LinkedList()
   {
      first = new ListNode(null, null);
   }
   
   public void AddNode(int number)
   {
      if(first == null)
      {
         first = new ListNode(number , null);
      }
      else
      {
         ListNode temp = first;
         while(temp.getNext() != null)
         {
            temp = temp.getNext();
         }
         temp.setNext(new ListNode(number , null));
      }
   }

   public void Print()
   {
      ListNode temp = first;
      while( temp != null )
      {
         System.out.print(temp.getValue() + " ");
         temp = temp.getNext();
      }
      System.out.println();
   }
   
   public void ReversePrint(ListNode node)
   {
      if(node != null)
      {
         ReversePrint(node.getNext());
         System.out.print(node.getValue() + " ");
      }
   }
   public void Count()
   {
      int count = 0;
      ListNode temp = first;
      while( temp != null )
      {
         count++;
         temp = temp.getNext();
      }
      System.out.println("There are " + count + " nodes in the list.");
   }
   
   public void PrintRepeat(ListNode head, ListNode node)
   {
      if(node != null)
      {
      int count = 0;
      boolean nonRepeat = true;
      ListNode temp = head;
      int num = (int)node.getValue();
      
      
      while(temp != node)
      {
         if((int)temp.getValue() == num)
            nonRepeat = false;
         temp = temp.getNext();
      }
      
      temp = head; 
      
      while(temp != null && nonRepeat)
      {
         if((int)temp.getValue() == num)
            count++;
         temp = temp.getNext();
      }
      if(count == 1)
      {
         System.out.println(node.getValue() + " (none) ");
         PrintRepeat(head, node.getNext());
      }
      else if(count > 1)
      {
         count--;
         System.out.println(node.getValue() + "( " + count + " )");
         PrintRepeat(head, node.getNext());
      }
      else
         PrintRepeat(head, node.getNext());
      }
   }
   
   public void PrintEven()
   {
      ListNode temp = first;
      while( temp != null )
      {
         if((int)temp.getValue() % 2==0)
         {
            System.out.print(temp.getValue() + " ");
         }
         temp = temp.getNext();
      }
      System.out.println();
   }
   
   public void AddOne()
   {
      ListNode temp = first;
      while( temp != null )
      {
         temp.setValue((Integer)((int)temp.getValue()+1));
         temp = temp.getNext();
      }
   }
   
   public ListNode RemoveZeros(ListNode node)
   {
      if(node == null)
         return null;
      if((int)node.getValue() == 0)
         return RemoveZeros(node.getNext());
      node.setNext(RemoveZeros(node.getNext()));
      return node;
   }
   
   public ListNode getFirst()
   {
      return first;
   }
   
   
}
public class LinkedList
{
   private ListNode front;
   
   public LinkedList()
   {
      front = null;
   }
   
   public void fillList(int num)
   {
         if(front == null)
         {
            front = new ListNode(num , null);
         }
         else
         {
            ListNode temp = front;
            while(temp.getNext() != null)
            {
               temp = temp.getNext();
            }
            temp.setNext(new ListNode(num , null));
         }
   }
   public ListNode giveFront()
   {
      return front;
   }

   public void printInOrder()
   {
      ListNode temp = front;
      while(temp != null)
      {
         System.out.print(temp.getValue() + "  ");
         temp = temp.getNext();
      }
   }
   
   public void printInReverse(ListNode temp)
   {
      if(temp != null)
      {
         printInReverse(temp.getNext());
         System.out.print(temp.getValue() + "  ");
      }
         
     /* if(front == null)
         System.out.print("null");
      else if(front.getNext() == null)
         System.out.print(front.getValue());
      else
      {
         ListNode temp = new ListNode (front.getValue(), null); 
         ListNode node = new ListNode(temp.getNext().getValue(), new ListNode(front.getValue() , null));
         temp = temp.getNext();
         while(temp != null)
         {
            node = new ListNode(temp.getNext().getValue(), temp);
            temp = temp.getNext();
         }
         
         while(node != null)
         {
            System.out.print(node.getValue() + "  ");
            node = node.getNext();
         }
      }*/
   }
   
   public int numNodes()
   {
      int count = 0;
      ListNode temp = front;
      while(temp != null)
      {
         count++;
         temp = temp.getNext();
      }
      return count;
   }
   
   public void printRepeat(ListNode head, ListNode node)
   {
      if(node != null)
      {
         int count= 0;
         ListNode temp = head;
         int num = (Integer)node.getValue();
         boolean nonRepeat = true;
         while(temp != node)
         {
            if((Integer)temp.getValue() == num)
               nonRepeat = false;
            temp = temp.getNext();
         }
         
         temp = head;
         while(temp != null && nonRepeat)
         {
            if((Integer)temp.getValue() == num)
            {
               count++;
            }
            temp = temp.getNext();
         }
         if(count == 1)
         {
            System.out.println(node.getValue() + " (none) ");
            printRepeat(head, node.getNext());
         }
         else if(count > 1)
         {
            count--;
            System.out.println(node.getValue() + "( " + count + " )");
            printRepeat(head, node.getNext());
         }
         else
            printRepeat(head, node.getNext());
      }
   }
   
   public void printEvens()
   {
      ListNode temp = front;
      while(temp != null)
      {
         if((Integer)temp.getValue() % 2 == 0)
            System.out.println(temp.getValue());
         temp = temp.getNext();
      }
   }
   
   private ListNode getListWithRemovedZeroes(ListNode head) {
      if (head == null) 
         return null;
      if ((Integer)head.getValue() == 0) 
         return getListWithRemovedZeroes(head.getNext());
      head.setNext(getListWithRemovedZeroes(head.getNext()));
      return head;
   }
   
   public void removeZeros(ListNode node)
   {
      front = getListWithRemovedZeroes(front);
      /*
      if(node != null && (Integer)node.getValue() == 0)
      {
         node = node.getNext();
         removeZeros(node);
      }
      else if(node != null && (Integer)node.getNext().getValue() == 0 && node.getNext() != null)
      {
         node.setNext(node.getNext().getNext());
         removeZeros(node.getNext());
      }
      else
      {
         if(node != null)
            removeZeros(node.getNext());
      }
      /*ListNode temp = front;
      if((Integer)front.getValue() == 0)
         front = front.getNext();
      while(temp.getNext() != null)
      {
         if((Integer)temp.getNext().getValue() == 0)
            temp.setNext(temp.getNext().getNext());
         temp = temp.getNext();
      }*/
   }
   
   public void add1()
   {
      ListNode temp = front;
      while(temp != null)
      {
         temp.setValue((Integer)temp.getValue() + 1);
         temp = temp.getNext();
      }
   }
   
}
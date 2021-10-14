public class DoublyLinkedList 
{
   private DoublyListNode first;
   private DoublyListNode last;
   
   public DoublyLinkedList()
   {
      first = null;
      last = null;
   }
   
   public DoublyListNode getFirst()
   {
      return first;
   }
   
   public DoublyListNode getLast()
   {
      return last;
   }
   
   public void add(String str)
   {
      if(first == null)
      {
         first = new DoublyListNode(str, null, null);
         last = first;
      }
      else if(first == last)
      {
         last = new DoublyListNode(str, first, null);
         first.setNext(last);
      }
      else
      {
         DoublyListNode temp = last;
         last.getPrevious().setNext(temp);
         last = new DoublyListNode(str , temp, null);
         temp.setNext(last);
         
      }
   }
   
   public void printInOrder()
   {
      DoublyListNode temp = first;
      while(temp != null)
      {
         if(temp.getValue() != null)
            System.out.print(temp.getValue() + "  ");
         temp = temp.getNext();
      }
      System.out.println();
      System.out.println();
   }
   
   public void printInReverse()
   {
      DoublyListNode temp = last;
      while(temp != null)
      {
         if(temp.getValue() != null);
            System.out.print(temp.getValue() + "  ");
         temp = temp.getPrevious();
      }
      System.out.println();
      System.out.println();
   }
   
   public void removeHarout()
   {
      DoublyListNode temp = first;
      while(temp != null)
      {
         if(temp.getValue() != null && temp.getValue().equals("Harout"))
         {
            DoublyListNode prev = temp.getPrevious();
            DoublyListNode next = temp.getNext();
            if(first == last)
            {
               first = null;
               last = null;
            }
            else if(temp == first)
            {
               next.setPrevious(null);
               first = next;
            }
            else if(temp == last)
            {
               prev.setNext(null);
               last = prev;
            }
            else
            {
               if(prev != null)
               prev.setNext(next);
               
               if(next != null)
               next.setPrevious(prev);
            }
         }
         temp = temp.getNext();
      }
   }
   
   public void addKosbab()
   {
      String str = "Kosbab";
      if(first != null && last != null)
      {
         DoublyListNode temp = first;
         while(temp.getNext() != null)
         {
            addNode(str, temp, temp.getNext());
            temp = temp.getNext().getNext();
         }
      }
   }
   
   private void addNode(String str, DoublyListNode head, DoublyListNode tail)
   {
      DoublyListNode node = new DoublyListNode(str, head, tail);
      head.setNext(node);
      tail.setPrevious(node);
   }
   
   public int countVeronika()
   {
      int count = 0;
      if(first != null)
      {
         DoublyListNode node =  first;
         while(node != null)
         {
            if(node.getValue() != null && node.getValue().equals("Veronika"))
               count++;
            node = node.getNext();
         }
      }
      return count;
   }
   /*
      while(first.getNext() != null && first.getNext() != last && first.getValue().equals("Harout"))
      {
           first.getNext().setPrevious(null);
           first = first.getNext();
      }
      while(last.getPrevious() != first && last.getValue().equals("Harout"))
      {
           last.getPrevious().setNext(null);
           last = last.getPrevious();
      }

      if(first.getNext() == last)
      {
         if(first.getValue().equals("Harout"))
                  first.setValue(null);
         if(last.getValue().equals("Harout"))
               last.setValue(null);
      }
      else
      {
         DoublyListNode temp = first;
         while(temp != null)
         {
            if(temp.getPrevious()!=null && temp.getNext() != null && temp.getValue().equals("Harout") )
            {
               temp.getPrevious().setNext(temp.getNext());
               DoublyListNode node = temp.getPrevious();
               temp.getNext().setPrevious(node);   
            }
            temp = temp.getNext();
          }
       }
     
     if(first.getValue() != null && first.getValue().equals("Harout"))
            first.setValue(null);
     if(last.getValue() != null && last.getValue().equals("Harout"))
            last.setValue(null);*/

}
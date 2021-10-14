public class CircularlyLinkedList
{
   private ListNode last;
   
   public CircularlyLinkedList()
   {
      last = null;
   }
   
   public void addValue(int num)
   {
      if(last == null)
      {
         last = new ListNode(num, last);
      }
      
      else if(last.getNext() == last)
      {
         //ListNode node = new ListNode(num, new ListNode(last.getValue(), null));
         last = node;
      }
      
      else
      {
         
      }
   }
}
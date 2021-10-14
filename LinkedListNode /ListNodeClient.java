public class ListNodeClient
{
   public static void main(String[] arg)
   {
      ListNode node = new ListNode("one", null);
      ListNode nodeTwo = new ListNode("two", null);
      ListNode nodeThree = new ListNode("three", null);
      nodeThree.setNext(nodeTwo);
      nodeTwo.setNext(node);
      ListNode temp = nodeThree;
      while(temp != null)
      {
         System.out.println(temp.getValue());
         temp = temp.getNext();
      }
   }
   
}
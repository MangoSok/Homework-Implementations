public class DoublyListNode
{
	private Object value;
	private DoublyListNode next;
	private DoublyListNode previous;

	public DoublyListNode(Object initValue, DoublyListNode initPrev, DoublyListNode initNext)
	{
		value = initValue;
  	  	next = initNext;
  		previous = initPrev;
   	}

   	public Object getValue()
   	{
	  	return value;
   	}

   	public DoublyListNode getPrevious()
   	{
	  	return previous;
   	}

   	public DoublyListNode getNext()
   	{
	  	return next;
   	}

   	public void setValue(Object theNewValue)
   	{
	  	value = theNewValue;
   	}

   	public void setPrevious(DoublyListNode theNewPrevious)
   	{
	  	previous = theNewPrevious;
   	}

   	public void setNext(DoublyListNode theNewNext)
   	{
	  	next = theNewNext;
   	}
}
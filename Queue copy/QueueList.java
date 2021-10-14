import java.util.ArrayList;
public class QueueList
{
   private ArrayList<Object> list;
   
   public QueueList()
   {
      list = new ArrayList<Object>();
   }
   
   public boolean isEmpty()
   {
      return (list.size()==0);
   }
   
   public void add(Object obj)
   {
      list.add(obj);
   }
   
   public Object peek()
   {
      return list.get(0);
   }
   
   public Object remove()
   {
      return list.remove(0);
   }
}
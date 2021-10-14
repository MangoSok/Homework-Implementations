import java.util.Stack;
public class StackClass
{
   private Stack <Integer> stack;
   
   public StackClass()
   {
      stack = new Stack <Integer>();
   }
   
   public void selectMenu(int num)
   {
      if(num == 1)
      {
         System.out.print("What do you want to push?  ");
      }
      else if(num == 2)
         pop();
      else if(num == 3)
         printTopToBottom();
      else if(num == 4)
         printOdds();
      else if(num == 5)
         printBottomToTop();
      else if(num == 6)
         deleteZeros();
      else if(num == 7)
         insertOneAtBottom();
      else 
         System.out.println("Error. There is no such option.");
   }
   
   public void pushNum(int num)
   {
      stack.push(num);
   }
   
   private void pop()
   {
      if(stack.isEmpty())
      {
         System.out.println("Stack is empty, cannot pop off the stack.");
      }
      else
         stack.pop();
   }
   
   private void printTopToBottom()
   {
      if(!stack.isEmpty())
      {
         Stack<Integer> s = new Stack<Integer>();
         for(Integer temp : stack)
         {
            s.push(temp);
         }
         System.out.print("The stack is: ");
         while(!s.isEmpty())
         {
            System.out.print(s.pop() + "  ");
         }
         System.out.println();
      }
      else
         System.out.println("Stack is empty, nothing to print.");
   }
   
   private void printOdds()
   {
      if(stack.isEmpty())
      {
         System.out.println("Stack is empty, cannot print the odds.");
      }
      else
      {
         Stack<Integer> s = new Stack<Integer>();
         for(Integer temp : stack)
         {
            s.push(temp);
         }
         System.out.print("The odds in stack are: ");
         while(!s.isEmpty())
         {
            if(s.peek() % 2 == 1)
               System.out.print(s.pop() + "  ");
            else
               s.pop();
         }
         System.out.println();
      }
   }
   
   private void printBottomToTop()
   {
      if(stack.isEmpty())
         System.out.println("Stack is empty, nothing to print.");
      else
      {
         for(Integer temp : stack)
         {
            System.out.print(temp + "  ");
         }
      }
   }
   
   private void deleteZeros()
   {
      if(stack.isEmpty())
         System.out.println("Stack is empty, nothing to delete.");
      else
      {
         Stack<Integer> s = new Stack<Integer>();
         while(!stack.isEmpty())
         {
            s.push(stack.pop());
         }
         while(!s.isEmpty())
         {
            if(s.peek() == 0)
               s.pop();
            else
               stack.push(s.pop());
         }
      }
   }
   
   private void insertOneAtBottom()
   {
      int num = 1;
      if(stack.isEmpty())
         stack.push(num);
      else
      {
         Stack<Integer> s = new Stack<Integer>();
         while(!stack.isEmpty())
         {
            s.push(stack.pop());
         }
         stack.push(num);
         while(!s.isEmpty())
         {
            stack.push(s.pop());
         }
      }
   }
}
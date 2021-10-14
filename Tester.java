import java.util.Scanner;

class Tester 
{
    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();
        Scanner input = new Scanner(System.in);
        int number = 0;
        do
        {
            System.out.println("Enter a non-negative number: ");
            number = input.nextInt();
            if(number >= 0)
            {
               list.AddNode(number);
            }
        } while(number >= 0);
        list.Print();
        list.ReversePrint(list.getFirst());
        list.Count();
        list.PrintRepeat(list.getFirst(), list.getFirst());
        list.PrintEven();
        list.RemoveZeros(list.getFirst());
        list.Print();
        list.AddOne();
        list.Print();
    }
}
import java.util.Stack;

class Boo
{
    int number;
    int maximum;

    Boo(int num, int max)
    {
        this.number = num;
        this.maximum = max;
    }
}

public class GoogleTask
{
    public static void main(String[] args)
    {
        Stack<Boo> stack = new Stack<>();

        for (int i = 0; i < 10; i++)
        {
            int num = (int)(Math.random() * 100);

            if (stack.empty())
                stack.push(new Boo(num, num));
            else
                if (stack.peek().maximum < num )
                    stack.push(new Boo(num, num));
                else
                    stack.push(new Boo(num, stack.peek().maximum));
        }

        for (Boo obj : stack)
            System.out.println("number " + obj.number + " - maximum " + obj.maximum);
    }
}

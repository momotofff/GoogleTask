import java.util.Stack;

class StackWithMax<E extends Comparable<E>> extends Stack<E>
{
    @Override
    public E push(E item)
    {
        if (m_maximum.empty() || m_maximum.peek().compareTo(item) < 0)
            m_maximum.push(item);
        else
            m_maximum.push(m_maximum.peek());

        return super.push(item);
    }

    @Override
    public E pop()
    {
        m_maximum.pop();
        return super.pop();
    }

    public E getMaximum()
    {
        return m_maximum.peek();
    }

    private final Stack<E> m_maximum = new Stack<>();
}

public class GoogleTask
{
    public static void main(String[] args)
    {
        StackWithMax<Integer> stack = new StackWithMax<>();

        for (int i = 0; i < 10; i++)
            stack.push((int) (Math.random() * 100));

        while (!stack.empty())
        {
            int max = stack.getMaximum();
            int element = stack.pop();
            System.out.printf("number %d - maximum %d%n", element, max);
        }
    }
}

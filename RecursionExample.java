public class RecursionExample
{
    public static void main(String... args)
    {
        RecursionExample recursion = new RecursionExample();
        System.out.println(recursion.doFactorial(Integer.parseInt(args[0])));
    }

    public int doFactorial(int n)
    {
        if (n == 0)
          return 1;
        return n * doFactorial(n-1);
    }
}

/*
Visibility modifier
4) public - everyone
1) private - class itself only
3) protected - package and subclasses, class itself
2) package private default - only package can access, class itself
*/

public class Driver
{
  public static void main(String[] args)
  {
    UselessClass uselessClass = new UselessClass();
  }
}

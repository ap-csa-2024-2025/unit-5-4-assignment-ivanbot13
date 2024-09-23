public class Main
{
  public static void main(String[] args)
  {
    // test your functions here to make sure they work
    System.out.println(distance(0, 5, 0, 0));
    System.out.println(quadPos(1, 3, 2));
    System.out.println(quadNeg(1, 3, 2));
  }

  // Implement distance formula method here
  public static double distance(int x, int y, int x2, int y2)
    {
      double dis = Math.sqrt(((x2 - x) * (x2 - x)) + ((y2 - y) * (y2 - y)));
      return(dis);
    }
  // implement one of your quadratic formula methods here
  public static double quadPos(double a, double b, double c)
  {
    double ans = (-b + Math.sqrt((b * b) - (4 * a * c)))/(2 * a);
    return(ans);
  }
  // implement the other quadratic formula here
  public static double quadNeg(double a, double b, double c)
  {
    double ans = (-b - Math.sqrt((b * b) - (4 * a * c)))/(2 * a);
    return(ans);
  }
}

public class Distance {

  public Point point1; //точка 1.
  public Point point2; //точка 2.
  public Distance(Point p1, Point p2) {
    this.point1 = p1;
    this.point2 = p2;
  }
  public static void main(String[] args) {
    Point p1 = new Point(5, 7);
    Point p2 = new Point(3, 4);
    Distance D = new Distance(p1, p2);
    System.out.println("Расстояние между точками p1 и p2 = ");
  }
}

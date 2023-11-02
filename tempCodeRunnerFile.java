class Rect {
  public int leng;
  public int bred;

  int area() {
    return leng * bred;
  }

  int preimeter() {
    return 2 * (leng * bred);
  }
}

public class RectClass {
  public static void main(String ar[]) {
    Rect r1 = new Rect();
    r1.leng = 5;
    r2.bred = 9;
    System.out.println("Area of Rectangle= " + r1.area());
    System.out.println("Perimeter of Rectangle= " + r1.preimeter());
  }
}
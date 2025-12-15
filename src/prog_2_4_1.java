import java.util.Scanner;
class Rectangle{
    int length;
    int breadth;
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    void area() {
        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
    void perimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }
}
public class prog_2_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int l = sc.nextInt();
        System.out.println("Enter breadth: ");
        int b = sc.nextInt();
        Rectangle r = new Rectangle(l, b);
        r.area();
        r.perimeter();
    }
}

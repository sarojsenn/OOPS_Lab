import java.util.Scanner;
class Rectangle_1{
    int length;
    int breadth;
    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the rectangle: ");
        length = sc.nextInt();
        System.out.println("Enter breadth of the reactangle: ");
        breadth = sc.nextInt();
    }
    void calculate(){
        double area = length*breadth;
        int perimeter = 2*(length+breadth);
        System.out.println("Area of the rectangle is: " + area);
        System.out.println("Perimeter of the rectangle is: "+ perimeter);
    }
    void display(){
        System.out.println("Length of the rectangle is: " + length);
        System.out.println("Breadth of the rectangle is: "+ breadth);

    }
}
public class prog_2_4 {
    public static void main(String[] args){
        Rectangle_1 myrect = new Rectangle_1();
        myrect.read();
        myrect.calculate();
        myrect.display();
    }
}

package Day_3;

import java.util.Scanner;

class TwoD{
    double length;
    double breadth;
    int costtwo = 40;
    TwoD(double l, double b){
        length = l;
        breadth = b;
    }
    double costtwo(){
        return costtwo*length*breadth;
    }
        }
        class ThreeD extends TwoD{
            double height;
            int costthree = 60;
            ThreeD(double l, double b, double h){
                super(l,b);
                height = h;
            }
            double costthree(){
                return costthree*length*breadth*height;
            }
        }
public class prog_3_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        double l = sc.nextDouble();
        System.out.println("Enter breadth: ");
        double b = sc.nextDouble();
        TwoD sheet = new TwoD(l,b);
        System.out.println("Cost of 2D is: " + sheet.costtwo());
        System.out.println("Enter height: ");
        double h = sc.nextDouble();
        ThreeD box = new ThreeD(l,b,h);
        System.out.println("Cost of 3D is: " + box.costthree());
    }
}

package Day_3;

import java.util.Scanner;

class plate{
    int length;
    int width;
    plate(int l, int w){
        length = l;
        width = w;
    }
    void display(){
        System.out.println("Length of the plate: " + length);
        System.out.println("Width of the plate: " + width);
    }
}
class box extends plate{
    int height;
    box(int l, int w, int h){
        super(l,w);
        height = h;
    }
    void display(){
        System.out.println("Length of the box: " + length);
        System.out.println("Width of the box: " + width);
        System.out.println("Height of the box: " + height);
    }
}
class woodbox extends box{
    int thick;
    woodbox(int l, int w, int h, int t){
        super(l,w,h);
        thick = t;
    }
    void display(){
        System.out.println("Length of the woodbox: " + length);
        System.out.println("Width of the woodbox: " + width);
        System.out.println("Height of the woodbox: " + height);
        System.out.println("Thickness of the woodbox: " + thick);
    }
}
public class prog_3_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Length: " );
        int length = sc.nextInt();
        System.out.println("Width: ");
        int width = sc.nextInt();
        System.out.println("Height: ");
        int height = sc.nextInt();
        System.out.println("Thickness: ");
        int thickness = sc.nextInt();
        plate myplate = new plate(length,width);
        box mybox = new box(length,width,height);
        woodbox mywoodbox = new woodbox(length,width,height,thickness);
        System.out.println("Dimensions of Plate");
        myplate.display();
        System.out.println("Dimensions of Box");
        mybox.display();
        System.out.println("Dimensions of WoodenBox");
        mywoodbox.display();
    }
}

import java.util.Scanner;
public class basics{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = 3.14f * a * b;
        System.out.println(c);
    }
}
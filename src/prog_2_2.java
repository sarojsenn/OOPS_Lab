import java.util.Scanner;

class number{
    static int count = 0;
    number(){
        count++;
    }
}
public class prog_2_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of objects: ");
        int num = sc.nextInt();
        for (int i = 0; i< num; i++){
            number obj = new number();
        }
        System.out.println("Total number of objects: " + number.count);
    }
}

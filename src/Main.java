import java.util.Scanner;

public class Main {
    static Scanner sc =new Scanner (System.in);
    static int[] Inputline(){
        System.out.println("Enter line coordinates");
        System.out.println("Enter the x coordinates of point 1: ");
        int x1=sc.nextInt();
        System.out.println("Enter the y coordinates of point 1: ");
        int y1=sc.nextInt();
        System.out.println("Enter the x coordinates of point 2: ");
        int x2=sc.nextInt();
        System.out.println("Enter the y coordinates of point 2: ");
        int y2=sc.nextInt();
        return new int[] {x1,y1,x2,y2};
    }
    static double LineLength(int x1,int x2,int y1,int y2){
        double length=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return length;
    }

    static void UC1_LineLength(){
        int[] coordinates=Inputline();
        double len1=LineLength(coordinates[0],coordinates[1],coordinates[2],coordinates[3]);
        System.out.printf("Length of line : %.2f",len1);
    }
    public static void main(String[] args) {
//        Scanner sc =new Scanner (System.in);
        System.out.println("Welcome to Line Comparison Computation Program");
        UC1_LineLength();


    }
}
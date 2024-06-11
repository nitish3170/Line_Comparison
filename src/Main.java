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
    static void UC2_LineEquality(){
        System.out.println("Enter coordinates of two lines for checking equality:");
        int[] coordinates1= Inputline();
        int[] coordinates2= Inputline();
        double len1=LineLength(coordinates1[0],coordinates1[1],coordinates1[2],coordinates1[3]);
        double len2=LineLength(coordinates2[0],coordinates2[1],coordinates2[2],coordinates2[3]);

        if (len1==len2)System.out.println("Lines are equal");
        else System.out.println("Lines are not equal");

    }
    public static void main(String[] args) {
//        Scanner sc =new Scanner (System.in);
        System.out.println("Welcome to Line Comparison Computation Program");
        UC1_LineLength();
        UC2_LineEquality();
    }
}
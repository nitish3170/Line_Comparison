import java.util.Scanner;

public class LineComparision {
    private  int x1;
    private  int x2;
    private  int y1;
    private  int y2;
    static Scanner sc =new Scanner (System.in);
    LineComparision(){
        this.Inputline();
    }
    public void Inputline(){
        System.out.println("Enter line coordinates");
        System.out.println("Enter the x coordinates of point 1: ");
        x1=sc.nextInt();
        System.out.println("Enter the y coordinates of point 1: ");
        y1=sc.nextInt();
        System.out.println("Enter the x coordinates of point 2: ");
        x2=sc.nextInt();
        System.out.println("Enter the y coordinates of point 2: ");
        y2=sc.nextInt();
    }
    private double LineLength(){
        double length=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return length;
    }

    static void UC4_CompareTo(LineComparision l1,LineComparision l2){
        double len1=l1.LineLength();
        double len2=l2.LineLength();
//        System.out.println(len1+" "+len2);

        if (len1==len2)System.out.println("Lines are equal");
        else System.out.println("Lines are not equal");

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        LineComparision l1=new LineComparision();
        LineComparision l2=new LineComparision();
        UC4_CompareTo(l1,l2);
    }
}
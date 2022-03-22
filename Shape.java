import java.util.*;

class Shape{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Circle c = new Circle();
    Rectangle r = new Rectangle();
    Triangle t = new Triangle();
    if(n==1){
        double rad = sc.nextDouble();
       System.out.println((double)(3.14*rad*rad));
    }
    else if(n==2){
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        r.computeArea(length, breadth);
    }
    else if(n==3){
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        t.computeArea(base, height);
    }
    else{
        System.out.println("Invalid Input");
    }
    }
}

class Circle extends Shape{
     double radius;
     double area;

}

class Rectangle extends Shape{
    private double length;
    private double breadth;
    private double area;
 public void computeArea(double length,double breadth){
     this.length = length;
     this.breadth = breadth;
     area=length*breadth;
     System.out.println(area+"0");
 }   
}

class Triangle extends Shape{
    private double base;
    private double height;
    private double area;
 public void computeArea(double base,double height){
     this.base=base;
     this.height=height;
     area=(0.5)*base*height;
     System.out.println(area+"0");
 }   
}




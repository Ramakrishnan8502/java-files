import java.util.*;
class Person{
       public  void person(String a, String b,int c){
        System.out.println("Name: "+b+" "+a);
        System.out.println("ID: "+c);

    }
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
    String fn =sc.nextLine();
    String ln=sc.nextLine();
    
    int id=sc.nextInt();
    int d=sc.nextInt();

    int arr[] = new int[d];
    
    for(int i=0;i<d;i++){
        arr[i]=sc.nextInt();
        }
        Person obj1= new Person();
        obj1.person(fn, ln, id);
        Student obj2 = new Student();
        obj2.student(arr);
    }

}class Student extends Person{
    void student(int [] array){
        int count=0;
        int ans;
        int a=array.length;
        for(int i=0;i<a;i++){
            count=count+array[i];
        }
        ans = count/a;
        if(ans>=90 && ans <=100){
            System.out.println("Grade: O");
        }
        if(ans>=80 && ans <90){
            System.out.println("Grade: E");
        }
        if(ans>=70 && ans <=80){
            System.out.println("Grade: A");
        }
        if(ans>=55 && ans <70){
            System.out.println("Grade: P");
        }
        if(ans>=40 && ans <55){
            System.out.println("Grade: D");
        }
        if(ans<40){
            System.out.println("Grade: T");
        }
        
    }
    
}


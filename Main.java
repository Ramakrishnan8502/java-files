class Main{
public static void main(String ar[]){
int a = 0;
int b = 1;
for(int i=0;i<5;i++){
b=b+(a++)+(++b)+i;

}
System.out.println(b+" "+a);
}
}
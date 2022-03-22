abstract class Abstract1 {
    abstract void power(int a, int b);
}

class Main extends Abstract1{
    void power(int a, int b){
        System.out.println(Math.pow(a,b));
    }
    public static void main(String[] args) {
      Abstract1 a = new Main();
      a.power(10,2);
    }
}

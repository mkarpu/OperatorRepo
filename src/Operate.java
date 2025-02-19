public class Operate {
    int a,b;

    public Operate(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int add(){
        return a+b;
    }
    public int sub(){
        return a-b;
    }

    public static void main(String[] args) {
        Operate operate = new Operate(10, 20);
        System.out.println("addition is: " +operate.add());
        System.out.println("sub is:" +operate.sub());
    }

}

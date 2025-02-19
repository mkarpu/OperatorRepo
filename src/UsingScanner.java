import java.util.Scanner;

class MainScanner {
    int a;
    int b;

    public MainScanner(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int add(){
        return a+b;
    }
    public int sub(){
        return a-b;
    }
}
public class UsingScanner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        MainScanner ms = new MainScanner(a,b);
        System.out.println("Sum = " + ms.add());
        System.out.println("Diff = " + ms.sub());
    }
}

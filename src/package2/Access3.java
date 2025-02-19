package package2;

import package1.Access1;

public class Access3 {
    public static void main(String[] args) {
    Access1 a = new Access1();
    System.out.println("new package Hours is " + a.hours);
    System.out.println("new package Minutes is " + a.minutes);
    }
}

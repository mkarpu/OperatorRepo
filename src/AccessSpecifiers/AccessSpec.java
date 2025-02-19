package AccessSpecifiers;

class Access {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private final int privateVar = 40;

    public void publicMethod() {
        System.out.println("Public Method: " + publicVar);
    }
    protected void protectedMethod() {
        System.out.println("Protected Method: " + protectedVar);
    }
    void defaultMethod() {
        System.out.println("Default Method: " + defaultVar);
    }
    private void privateMethod() {
        System.out.println("Private Method: " + privateVar);
    }

    public void accessPrivate(){
        privateMethod();
    }
}

public class AccessSpec{
    public static void main(String[] args) {
        Access a = new Access();

        System.out.println("public variable" + a.publicVar);
        System.out.println("protected variable" + a.protectedVar);
        System.out.println("default variable" + a.defaultVar);
        //System.out.println("private variable" + a.privateVar);

        a.publicMethod();
        a.protectedMethod();
        a.defaultMethod();
        a.accessPrivate();
    }
}

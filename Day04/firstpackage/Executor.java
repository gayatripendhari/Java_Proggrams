public class Executor{
    public static void main(String[] args){
        Base b = new Base();
        b.methodDefault();
        b.methodProtected();
        b.methodPublic();

        //change the value
        b.varDefault = 50;
        b.varProtected = 24;
        b.varPublic = 67;

        b.methodDefault();
        b.methodProtected();
        b.methodPublic();

        //b.methodPrivate(); //not visible
    }
}
package Day04.thirdpackage;

public class Demo {
    public static void main(String[] args) {
        MyClass m = MyClass.getObject();
        m.setId(10);
        System.out.println(m);

        MyClass m1 = MyClass.getObject();
        m1.setId(11);
        System.out.println(m1);
        System.out.println(m);
    }
}

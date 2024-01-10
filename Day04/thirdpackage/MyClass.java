package Day04.thirdpackage;

public class MyClass{
//data member
    private int id;
    private static MyClass obj = new MyClass();

    //gettter and setter
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    //private constructor
    private MyClass(){
        System.out.println("Private Constructor is created ");
    }

    //Factory method 
    public static MyClass getObject(){
        return obj;
    }

    @Override
    public String toString(){
        return "MyClass [id=" + id +"]";
    }
    
}

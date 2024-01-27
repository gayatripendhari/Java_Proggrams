public class Person {
    //data members
    private String name;
    private int age;
    private String bloodGroup;

    //default constructor
    public Person(){
        this.name = " Gayatri ";
        this.age= 22 ;
        this.bloodGroup="B positive";
    }

    //parameterized constructor
    public Person(String name , int age , String bloodGroup){
        super();
        this.name= name;
        this.age = age;
        this.bloodGroup = bloodGroup;
    }

    //getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getBloodGroup(){
        return bloodGroup;
    }
    public void setBloodGroup(String bloodGroup){
        this.bloodGroup = bloodGroup;
    }
    @Override
    public String toString(){
        return "Person [name= "+ name +", age= "+age+",bloodGroup= "+bloodGroup+"]";
    }
}

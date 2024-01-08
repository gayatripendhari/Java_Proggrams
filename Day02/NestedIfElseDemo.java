public class NestedIfElseDemo{
    public static void main(String[] args) {
        int a =20 , b = 12 , c= 25;
        if (a>b) {
            if (a>c) 
            {
                System.out.println("a is the largest number");
            }
            else
            {
            System.out.println("c is the largest number");
            }   
        }
        else{
            if (b>c) {
                System.out.println("b is the largest number");
            }
            else{
                System.out.println("c is the larggest number");
            }
        }
    }
}
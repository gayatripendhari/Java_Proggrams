package Day08.abstractclassdemo;

public abstract class Shape {
   // public abstract class Shape {
        protected float area;
        
        //abstract method
        abstract void calArea();
        
        
        //concrete method
        public void show() {
        System.out.println("Area of the shape is "+area);	
        }
    
    }


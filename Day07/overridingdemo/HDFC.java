package Day07.overridingdemo;
//Program to demonstrate method overriding - Runtime Polymorphism
public class HDFC extends RBI{
//subclass
//public class HDFC extends RBI {
	@Override
	public float getRateOfInterest() {
		return 6;
	}
    
}

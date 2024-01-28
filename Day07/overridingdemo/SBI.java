//Program to demonstrate method overriding - Runtime Polymorphism
package Day07.overridingdemo;

public class SBI extends RBI{
//subclass
//public class SBI extends RBI {
	@Override
	public float getRateOfInterest() {
		return 7.0f;
	}
   
}

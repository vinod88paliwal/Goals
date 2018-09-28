package staticmethod;

public class MyDataImpl implements MyData {

	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}

	public static void main(String args[]) {
		
		MyDataImpl obj = new MyDataImpl();
		
		obj.print("");
		obj.isNull("abc");

		//MyData obj = new MyDataImpl(); then compile time error because 1. It can`t override as its static in MyData,
		//2. Since its a static method in MyData interface so it can only be accessed through interface reference like Mydata.isNull()


	}
}

/*Output : 
Interface Null Check
Impl Null Check

 */
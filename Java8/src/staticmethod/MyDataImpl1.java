package staticmethod;

public class MyDataImpl1 implements MyData1{

//Note that isNull(String str) is a simple class method, it�s not overriding the interface method.
//For example, if we will add @Override annotation to the isNull() method, it will result in compiler error	
//check below.
	//@Override
	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}

	public static void main(String args[]) {
		MyDataImpl1 obj = new MyDataImpl1();
		
		obj.print("");
		obj.isNull("abc");
	}
}


/*Output : 
Interface Null Check
Impl Null Check
 */

package staticmethod;

public class MyDataImpl2 implements MyData2{

	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}

	public static void main(String args[]) {
		
		MyDataImpl2 obj = new MyDataImpl2();
		
		obj.print("");
		obj.isNull("abc");
	}
}

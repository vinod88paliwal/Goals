package staticmethod;

public interface MyData3 {

	default void print(String str) {
		if (!isNull(str))
			System.out.println("MyData3 str param is empty or nul" );
	}

	static boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}

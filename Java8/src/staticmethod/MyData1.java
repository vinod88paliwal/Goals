package staticmethod;

public interface MyData1 {

	default void print(String str) {
		if (!isNull(str))
			System.out.println("MyData1 str param is empty or null::");
	}

	static boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}

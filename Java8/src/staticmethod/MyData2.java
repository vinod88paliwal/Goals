package staticmethod;

public interface MyData2 {

	default void print(String str) {
		if (!isNull(str))
			System.out.println("MyData2 str param is empty or null::" );
	}

	default boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}

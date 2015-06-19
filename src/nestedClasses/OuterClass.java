package nestedClasses;

public class OuterClass {
	public class InnerClass{
		private String name = "InnerClass";
		private String outer = "OuterClass";
		public void print() {
			System.out.printf("InnerClass\' name: %s outerclass: %s \n", name, outer);
		}
	}
	
	public static class NestedClass{
		public static String name = "NestedClass";
		public static String outer = "OuterClass";
	}
}

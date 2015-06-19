package nestedClasses;

public class NestedClassDemo {
	public static void main(String[] args) {
		// Non-static NestedClass no need to instantiate the OuterClass
		OuterClass.NestedClass nC = new OuterClass.NestedClass();
		// Create an instance of OuterClass firstly.
		OuterClass oC = new OuterClass();
		// Then use the OuterClass instance to instantiate a InnerClass.
		OuterClass.InnerClass iC = oC.new InnerClass();
		System.out.printf("NestedClass\' name: %s outerclass: %s \n", OuterClass.NestedClass.name, OuterClass.NestedClass.outer);
		iC.print();
	}
}

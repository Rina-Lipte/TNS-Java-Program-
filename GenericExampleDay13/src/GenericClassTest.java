
public class GenericClassTest {
	public static void main(String[] args) {

		GenericClass<String> stringObj=new GenericClass<String>();
		stringObj.set("Hello");
		System.out.println(stringObj.get());

		//GenericClass with Integer type of data member
		GenericClass<Integer> integerObj=new GenericClass<Integer>();
		integerObj.set(10);
		System.out.println(integerObj.get());
		
	}
}

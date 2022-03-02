package streams;

public class RunPerson {
	public static void main(String[] args) {
	Method method=new Method();
	System.out.println(method.readByName("Sulav"));
	method.getPeople().stream()
    .forEach(x -> System.out.println(x));
	}


		

}

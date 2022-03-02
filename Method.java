package streams;

import java.util.Arrays;
import java.util.List;




public class Method {
	private Person person1=new Person("Sulav",24,"Freelancer","cat");
	private Person person2=new Person("Sam",34,"Dancer","dog");
	private Person person3=new Person("Steven",44,"Singer","tarantula");
	private List<Person> people = Arrays.asList(person1, person2, person3);
	public Method() {};

	public Person readByName(String name) {
		for (Person a: people) {
			if (a.getName()==name) {return a;}
		}
		return null;
		
	}

	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		this.people = people;
	}
	
		
		

}

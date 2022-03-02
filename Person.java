package streams;

public class Person {
	//Attributes
		private int age;
		private String name;
		private String jobTitle;
		private String pet;
		public Person() {};
		//All arguments constructor
		public Person(String name,int age,String jobTitle,String pet) {
			this.age=age;
			this.name=name;
			this.jobTitle=jobTitle;
			this.pet=pet;
		}
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getJobTitle() {
			return jobTitle;
		}
		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}
		@Override
		public String toString() {
			return "Person [age=" + age + ", name=" + name + ", jobTitle=" + jobTitle + ", pet=" + pet + "]";
		}
		
	

}

package solution_02;

public class Program {
	public static void main(String[] args) {
		
		Person ronald = new Person("Ronald", 1999);
		int ronaldsAge = ronald.getAgeIn(2020);
		System.out.println("Age: " + ronaldsAge);
		
		
		// 'Uncomment' the following code,  i.e. remove the 
		// comment slashes ('//') in front of the lines.
		// Then, add the new method to the 'Person' class
		// to make the error go away.
		
		String ronaldsName = ronald.getName();
		System.out.println("Name: " + ronaldsName);
	}
}

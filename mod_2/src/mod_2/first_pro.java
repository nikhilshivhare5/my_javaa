package mod_2;

public class first_pro {

	
	    String name;
	    int age;

	    public first_pro(String name, int age) 
	    {
	        this.name = name;
	        this.age = age;
	    }
	    public void data() 
	    {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	

	public static void main(String[] args) {
		first_pro person1 = new first_pro("Nikhil1", 25);
		first_pro person2 = new first_pro("Nikhil2", 30);
	        System.out.println("Person 1:");
	        person1.data();
	        System.out.println();

	        System.out.println("Person 2:");
	        person2.data();

	}

}










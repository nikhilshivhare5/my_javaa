package mod_2;

public class sec_pro {
	 String name;
     String breed;

    public sec_pro(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

	public static void main(String[] args) 
	{
		sec_pro dog1 = new sec_pro("Max", "Labrador");
		sec_pro dog2 = new sec_pro("Buddy", "Retriever");

        System.out.println("Initial values:");
        System.out.println(" Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());

        dog1.setName("Charlie");
        dog2.setBreed("Beagle");

        System.out.println("\nUpdated values:");
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());

	}

}




























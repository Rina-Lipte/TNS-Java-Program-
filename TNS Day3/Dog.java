
public class Dog  {
		private String breed;
	    private int age;
	    private String color;
	  public Dog() {
		  
	  }
	    public Dog(String breed, int age, String color) {
	        this.breed = breed;
	        this.age = age;
	        this.color = color;
	    }
	    
	    public void bark() {
	        System.out.println("Woof!");
	    }

	    public void sleep() {
	        System.out.println("Zzzz...");
	    }

	    public String getBreed() {
	        return breed;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getColor() {
	        return color;
	    }
	    public void setBreed(String breed) {
	        this.breed = breed;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }
	}



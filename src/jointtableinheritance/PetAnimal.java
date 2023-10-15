package jointtableinheritance;

import javax.persistence.Entity;

@Entity
public class PetAnimal extends Animal {
	
	private byte age;
	private String color;
	 
	public PetAnimal( ) { }
	public PetAnimal(int id, String category, String feedCategory, String sound,byte age, String color) {
		super( id, category, feedCategory, sound);
		this.age = age;
		this.color = color;
	}
	@Override
	public String toString() {
		return "PetAnimal [age=" + age + ", color=" + color + "]";
	}
	
	
	
	

}

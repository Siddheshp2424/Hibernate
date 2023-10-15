package classpertableinheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "car1")
public class Car extends Vehicle {
	
	private String colour;
	private String features;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car( int vPrice, String vType,String colour,String features) {
		super( vPrice, vType);

        this.colour=colour;
        this.features=features;
        
        
		
	}
	@Override
	public String toString() {
		return "Car [colour=" + colour + ", features=" + features + "]";
	}
	
	
	
	
	

}

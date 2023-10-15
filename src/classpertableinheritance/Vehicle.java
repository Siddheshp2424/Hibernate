package classpertableinheritance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "vehile1")
public class Vehicle {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int vId;
	private int vPrice;
	private String vType;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle( int vPrice, String vType) {
		super();
		 
		this.vPrice = vPrice;
		this.vType = vType;
	}
	@Override
	public String toString() {
		return "Vehicle [vId=" + vId + ", vPrice=" + vPrice + ", vType=" + vType + "]";
	}
	
	

}

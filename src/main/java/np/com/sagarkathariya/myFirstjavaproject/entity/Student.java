package np.com.sagarkathariya.myFirstjavaproject.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Student {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int id;
	private String name;
	public Student() {
	}
	public void setId(int id) {
	this.id = id;
	}
	public int getId() {
	return id;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getName() {
	return name;
	}
}

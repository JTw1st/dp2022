package lab5.danimals;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="danimals")
public class danimals {
	@Id
	@GeneratedValue	
	int id;
	String title;
	int age;
	float height;
	float length;

	
	public danimals(int id, String title, int age, float height, float length) {
		super();
		this.id = id;
		this.title = title;
		this.age = age;
		this.height = height;
		this.length = length;
	}
	
	public danimals() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	@Override
	public String toString() {
		  return "{\"id\": "+id+", \"title\": \""+title+"\",\"age\": "+age+", \"height\": \""+height+"\",\"length\": "+length+"}";
	}
	
	
}

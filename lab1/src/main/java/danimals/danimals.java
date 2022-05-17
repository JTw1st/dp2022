package danimals;

public class danimals {
	private String title;
	private int age;
	private float height;
	private float length;
	public danimals(String title, int age, float height, float length) {
		super();
		this.title = title;
		this.age = age;
		this.height = height;
		this.length = length;
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
	public float getWidth() {
		return length;
	}
	public void setWidth(float length) {
		this.length = length;
	}
	@Override
	public String toString() {
		  return "{\"title\": \""+title+"\",\"age\": "+age+", \"height\": \""+height+"\",\"length\": "+length+"}";
	}
	
	
}

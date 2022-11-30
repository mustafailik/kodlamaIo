package homework.entities;

public class Course {
	private int id;
	private String name;
	private double price;
	public Course() {
		
	}
	public Course(String name, int id, double price) {
		super();
		this.name = name;
		this.id = id;
		this.price=price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}

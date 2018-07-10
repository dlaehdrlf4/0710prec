package dong;

public class Car {
	//저장하고자 하는 항목
	private String name;
	private String brand;
	private String contents;
	private int price;
	
	
	//접근자 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", brand=" + brand + ", contents=" + contents + ", price=" + price + "]";
	}
	/*
	//크기비교를 하는 메소드
	@Override
	public int compareTo(Object o) {
		Car other = (Car)o;
		if(this.price > other.price)
		{
			return 1; //오름 차순이 된다. 
		}
		else if(this.price == other.price) {
			return 0;
		} else {
			return -1;
		//return this.price - other.price;
		//return other.price - this.price; // 내림차순 정령
		//return (this.price - other.price) * -1; // 내림차순 정렬
		//return this.name.compareTo(other.name); // compare가 있는 것은 이렇게 하면 된다.
		return other.name.compareTo(this.name); //이름을 내림차순으로 정렬
	
	*/	
	




}
	
	
	


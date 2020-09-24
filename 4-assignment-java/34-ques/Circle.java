class Circle{
	private float radius;
	private float area;
	
	public void init(float radius){
		this.radius = radius;
	}
	
	public void CalArea(){
		area = (3.14f)*radius*radius;
		
	}
	
	public void show(){
		System.out.println(radius+ " is the radius of circle and "+area+ " is area");
	}
}

class CircleDemo{
	public static void main(String args[]){
		Circle c = new Circle();
		c.init(5);
		c.CalArea();
		c.show();
	}
}
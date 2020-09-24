class Onebhk{
		int roomarea;
		int hallarea;
		double price;
		
		Onebhk(){
		roomarea = 500;
		hallarea = 600;
		price = 50000;
		}
		
		Onebhk(int r,int h, double p){
			roomarea = r;
			hallarea = h;
			price = p;
		}
		
		void show(){
			System.out.println("onebhk-"+roomarea+" "+hallarea+" "+price);
		}
			
}

class Twobhk extends Onebhk{
		int room2area;
		public static int count;
		Twobhk(){
			super();
			room2area = 500;
			count++;
		}
		
		Twobhk(int r,int h, double p,int a){
			super(r,h,p);
			room2area = a;
			count++;
		}
		
		void show(){
			super.show();
			System.out.println("twobhk-"+room2area);
			System.out.println("total no of flats "+count);
		}
}


class flatDemo{
	public static void main(String args[]){
		Twobhk e = new Twobhk(400,1000,200000,500);
		 e.show();
	}
}
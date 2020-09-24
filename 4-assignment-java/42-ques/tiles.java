class Tiles{
	 int l;
	
	Tiles(int l){
		this.l = l;
	}
}

class Floor{
	private int length;
	private int width;
	
	Floor(int l,int w){
		this.length = l;
		this.width = w;
	}
	
	void totalTiles(Tiles t){
		int area = length*width;
		 area = area/t.l;
		 System.out.println("total no of tiles needed are "+area);
	}
}

class Tilesdemo{
	public static void main(String args[]){
		Tiles t = new Tiles(5);
		Floor f = new Floor(10,10);
		
		f.totalTiles(t);
	}
}
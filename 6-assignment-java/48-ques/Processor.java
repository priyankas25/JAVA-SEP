import java.util.*;

abstract class Processor{
	double data;
	abstract void process();
	void ShowData() {
		System.out.println(data);
	}
}
	class Factorial extends Processor{
		 void process() {
			  int i,fact=1;  
			  int number=4;   
			  for(i=1;i<=number;i++){    
			      data=fact*i;  
			 
		 } 
		
	}	
	}
	class Circle extends Processor{
		final double pi=3.14;
		double r=5;
		void process()
		{
			data=pi*r*r;
		}
		
		 
	}


class A48 {

	public static void main(String[] args) {
		   Processor p1=new Circle();
		   Processor p2=new Factorial();
                 Processor arr[]= {p1,p2};
                    for(Processor a:arr)
                    {
                    	a.process();
                    	a.ShowData();
                    }
                    
                 
	}

}
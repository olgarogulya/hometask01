package by.epam.training;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//01
		int a, a1, b, c, d, e;
		
		
		
		a1 = (int) (Math.random() * 200 - 100);
		//System.out.println("a1=" + a1);
	
		for(int i = 1; i <= 100; i++) {
		
			a = (int) (Math.random() * 200 - 100);
		
		//System.out.println("a=" + a);
		//System.out.println("a1=" + a1);
		
		b = Math.min(a, a1);
		c = Math.min(a, b);
		//System.out.println("min a a1=" + b);
		//System.out.println("min a b=" + c);
		
		d = Math.max(a, a1);
		e = Math.max(a, d);
		//System.out.println("max a a1=" + d);
		//System.out.println("max a d=" + e);
		
		if (i == 100) {
			System.out.println("min=" + c);
			System.out.println("max=" + e);
		}
		
		}
				
	}
		
	}



package by.epam.training;

import java.util.Scanner;

public class Task03 {

public static void main(String[] args) {
// TODO Auto-generated method stub
	
	System.out.println("Enter year to start");
	Scanner sa = new Scanner(System.in);
    int X = sa.nextInt();
    
    System.out.println("Enter number of month to start");
	Scanner sb = new Scanner(System.in);
    int x = sb.nextInt();
    
    System.out.println("Enter year to end");
	Scanner sc = new Scanner(System.in);
    int Y = sc.nextInt();
    
    System.out.println("Enter number of month to end");
	Scanner sd = new Scanner(System.in);
    int y = sd.nextInt();
    
    //int X = 1915; //enter start year
	//int x = 1; //enter number of start month
	int jan=31, feb=28, mar=31, apr=30, may=31, jun=30, jul=31, aug=31, sep=30, oct=31, nov=30, dec=31, feb1=29;
	
	//int Y = 1925; //enter end year
	//int y = 5; //enter number of end month
	
	int sum1 = 0;
	int b, c=0, d, e, f=0;
	
	int a = (Y-1) - (X+1); //number or full years
	//System.out.println("number of years " + a);
	
	for (int i = 1; i <= a; i++) {
		//System.out.println("X=" + X);
		b = 365;
		
		if (X%4 == 0 && X%100 != 0) {
			b = 366;
			}
		sum1 = sum1 + b;
		//System.out.println("sum1=" + sum1);
		//System.out.println("b=" + b);
		X = X + 1;
}
	//System.out.println("days in years=" + sum1);
	
	d = 12 - x + 1;
	//System.out.println("d " + d);
	switch (d) {
	case 12: //jan
		c= jan + feb + mar + apr + may + jun + jul + aug + sep + oct + nov + dec;
	//	System.out.println("c " + c);
		break;
	case 11: //feb
		c= feb + mar + apr + may + jun + jul + aug + sep + oct + nov + dec;
	//	System.out.println("c " + c);
		break;
	case 10: //mar
		c= mar + apr + may + jun + jul + aug + sep + oct + nov + dec;
	//	System.out.println("c " + c);
		break;
	case 9: //apr
		c= apr + may + jun + jul + aug + sep + oct + nov + dec;
	//	System.out.println("c " + c);
		break;
	case 8: //may
		c= may + jun + jul + aug + sep + oct + nov + dec;
	//	System.out.println("c " + c);
		break;
	case 7: //jun
		c= jun + jul + aug + sep + oct + nov + dec;
	//	System.out.println("c " + c);
		break;
	case 6: //jul
		c= jul + aug + sep + oct + nov + dec;
	//	System.out.println("c " + c);
		break;
	case 5: //aug
		c= aug + sep + oct + nov + dec;
	//	System.out.println("c " + c);
		break;
	case 4: //sep
		c= sep + oct + nov + dec;
	//	System.out.println("c " + c);
		break;
	case 3: //oct
		c= oct + nov + dec;
	//	System.out.println("c " + c);
		break;
	case 2: //nov
		c= nov + dec;
	//	System.out.println("c " + c);
		break;
	case 1: //dec
		c= dec;
	//	System.out.println("c " + c);
		break;
	}
	
	e = y;
//	System.out.println("e " + e);
	switch (e) {
	case 12: //dec
		f= jan + feb + mar + apr + may + jun + jul + aug + sep + oct + nov + dec;
	//	System.out.println("f " + f);
		break;
	case 11: //nov
		f= jan + feb + mar + apr + may + jun + jul + aug + sep + oct + nov;
	//	System.out.println("f " + f);
		break;
	case 10: //oct
		f= jan + feb + mar + apr + may + jun + jul + aug + sep + oct;
	//	System.out.println("f " + f);
		break;
	case 9: //sep
		f= jan + feb + mar + apr + may + jun + jul + aug + sep;
	//	System.out.println("f " + f);
		break;
	case 8: //aug
		f= jan + feb + mar + apr + may + jun + jul + aug;
	//	System.out.println("f " + f);
		break;
	case 7: //jul
		f= jan + feb + mar + apr + may + jun + jul;
	//	System.out.println("f " + f);
		break;
	case 6: //jun
		f= jan + feb + mar + apr + may + jun;
	//	System.out.println("f " + f);
		break;
	case 5: //may
		f= jan + feb + mar + apr + may;
	//	System.out.println("f " + f);
		break;
	case 4: //apr
		f= jan + feb + mar + apr;
	//	System.out.println("f " + f);
		break;
	case 3: //mar
		f= jan + feb + mar;
	//	System.out.println("f " + f);
		break;
	case 2: //feb
		f= jan + feb;
	//	System.out.println("f " + f);
		break;
	case 1: //jan
		f= jan;
	//	System.out.println("f " + f);
		break;
	}
	
//	System.out.println("c " + c);
//	System.out.println("f " + f);
	int sum = sum1 + c + f;
//	System.out.println("sum " + sum);
	
	if (X%4 == 0 && X%100 != 0 && d >= 11) {
		sum = sum + 1;
		}
	if (Y%4 == 0 && Y%100 != 0 && e >= 2) {
		sum = sum + 1;
		}
	System.out.println("sum " + sum);
	}

}



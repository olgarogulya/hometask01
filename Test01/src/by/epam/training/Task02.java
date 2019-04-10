package by.epam.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task02 {

public static void main(String[] args) throws FileNotFoundException {
// TODO Auto-generated method stub
int sum = 0;

String text;

File file = new File("src/text.txt");

Scanner sc = new Scanner(file);

while(sc.hasNextLine()) {
	
text = sc.nextLine();
//System.out.println("text " + text);

String[] line = text.split("\r\n|\r|\n");
//System.out.println("line.length " + line.length);

for(int a = 0; a < line.length; a++) {

	String[] str;
	String delimiter="\\s";
	str = line[a].split(delimiter);
	//System.out.print("line" + a + "=" + line[a]);
	
	for(int i = 0; i < str.length; i++) {
	//System.out.print("str" + i + "=" + str[i]);
	int b = Integer.parseInt(str[i]);
	sum = sum + b;
	//System.out.println();
	//System.out.println("sum " + sum);
}
	System.out.println("-------");
	System.out.println("|" + sum + "|");
	sum = 0;
}

}
System.out.println("-------");
}
}

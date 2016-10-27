import java.util.*;

class Apple{
int i;

public Apple(){

		i=2;

	}

}


public class HelloWorld
{
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Apple a=new Apple();
		
		System.out.println(a.i);
		
		int []array=new int [10];
		for (int i:array)System.out.println(i);
	}
}
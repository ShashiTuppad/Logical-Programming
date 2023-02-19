package runnTimePolymarphism.com;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		
		Scanner sc1=new Scanner(System.in);
		
		Cat c1= new Cat();
		Dog d1=new Dog();
		Snake s1= new Snake();
		
		AnimalSmulatore sim=new AnimalSmulatore();
		System.out.println("Enter 1 --> for Cat noice simulation");
		System.out.println("Enter 2 --> for Dog noice simulation");
		System.out.println("Enter 3 --> for Snake noice simulation");
		
		int ans=sc1.nextInt();
		switch(ans) {
		case 1: sim.makeNoice(c1);
				break;
		case 2: sim.makeNoice(d1);
				break;
		case 3: sim.makeNoice(s1);
				break;
		default: System.out.println("Invalid ");
				
		}
		
		System.out.println("Main method Ended");

	}

}

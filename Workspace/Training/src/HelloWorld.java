
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println(args.length);
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a+b;
		System.out.println(" The sum of numbers "+a +" And "+ b + " is = "+c);

	}

}

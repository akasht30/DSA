package UserBinaryT;

public class Main {

	public static void main(String[] args) {

		MyTree mt = new MyTree();
		
		System.out.println(mt.add(35));
		mt.add(28);
		mt.add(25);
		mt.add(42);
		mt.add(48);
		mt.add(38);
		mt.add(32);
		mt.add(28);
		System.out.println("-----");
		mt.display();
	
	}
}


public class FirstProgram {

	public static void main(String[] args) {
		int numA=5;
		int numB=10;
		int numC=0;
		int numD=--numC + numB--;
		System.out.println(numD); // -1+9=8
		System.out.println(numC); // -1
		System.out.println(numB); // 9
		int numE=++numB + numA++; 
		System.out.println(numE); //10+5=15
		

	}

}

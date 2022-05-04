package sample;
class Demo123{
	private Demo123(){
		System.out.println("I am Zero Paramterrized ");
	}
	static Demo123	d1=new Demo123();
	String name = "pune";
	static Demo123 getInstance() {
		return d1;
	}
}

	
public class SingletonClass {

	public static void main(String[] args) {
		
				
	}

}

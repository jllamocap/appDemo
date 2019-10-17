package demo;

public class Principal {

	public static void main(String[] args) {
		//Master demo
		System.out.println("Versión base en master");
		
		FeatureB fa = new FeatureB();
		System.out.println(fa.getInfo());
	}

}

package demo;

public class Principal {

	public static void main(String[] args) {
		//Master demo
		System.out.println("Versión base en master");
		

		FeatureA fa = new FeatureA();
		System.out.println(fa.getInfo());
		
		FeatureB fb = new FeatureB();
		System.out.println(fb.getInfo());
		
		FeatureB fc = new FeatureB();
		System.out.println(fc.getInfo());
		
		FeatureB fb2 = new FeatureB();
		System.out.println(fb2.getInfo());
		System.out.println(fb2.getInfo());
	}

}

package exercie.ens.lab4;

public class Test {

	public static void main(String[] args) {

		// System.out.println(Voiture.marque);
		System.out.println("\n---Constructeur par défaut---");
		Voiture V1 = new Voiture();

		System.out.println();

		System.out.println("\n---Constructeur paramétré---");
		Voiture V2 = new Voiture("Toyota", "Corolla", 0.0, 2023);

		

		System.out.println("\n---Constructeur de copie---");
		Voiture V3 = new Voiture(V2);

		

		System.out.println("\n--- GETTERS et SETTERS");
		System.out.println("Marque de V2 : " + V2.getMarque());
		V3.setMarque("Fiat");
		System.out.println("Nouvelle marque de V3 :" + V3.getMarque());

		System.out.println("\n---Défis---");
		// System.out.println(V2.marque);
		System.out.println(V2.getMarque());

		

		System.out.println("\n---Validation SETTERS---");

		V2.setAnnee(2030);
		System.out.println(V2.getAnnee());

		V1.setVitesse(111.23);
		System.out.println(V1.getVitesse());

		

		System.out.println("\n---METHODES---");
		V2.accelerer(100);
		V2.freiner(30);
		V2.afficherInformations();

	}

}

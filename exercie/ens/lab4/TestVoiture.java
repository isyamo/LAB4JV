package exercie.ens.lab4;

public class TestVoiture {

	public static void main(String[] args) {

		// Création d'un objet avec le constructeur par défaut

		Voiture voiture1 = new Voiture();
		voiture1.afficherInformations();

		// Création d'un objet avec le constructeur paramétré
		Voiture voiture2 = new Voiture("Toyota", "Corolla", 0.0, 2023);
		voiture2.afficherInformations();

		// Création d'un objet avec le constructeur de copie
		Voiture voiture3 = new Voiture(voiture2);
		voiture3.afficherInformations();

		// COMPARAISON DES OBJETS 
		System.out.println("\n--- Comparaison des objets ---");
		System.out.println("voiture1 == voiture2 ? " + (voiture1 == voiture2));
		System.out.println("voiture2 == voiture3 ? " + (voiture2 == voiture3));
		
		System.out.println("Est ce que les valeurs de la voiture2 sont  egale  aux valeurs de la voiture3 ? "
				+ voiture2.equals(voiture3));
		
		System.out.println("Est ce que les valeurs de la voiture2 sont  egale  aux valeurs de la voiture3 ? "
				+ voiture2.getMarque().equals(voiture3.getMarque()));
		
		//MODIFICATION ET AFFICHAGE
		System.out.println("\n===Modification de voiture2 ===");
        voiture2.accelerer(120);
        voiture2.freiner(30);
        voiture2.afficherInformations();

        System.out.println("\n===Modification de voiture3 ===");
        voiture3.accelerer(80);
        voiture3.afficherInformations();

        System.out.println("\n===Test des setters avec validation ===");
        voiture2.setVitesse(-50); 
        voiture2.setAnnee(1800); 
        voiture2.setMarque(""); 
        voiture2.afficherInformations();

        System.out.println("\n===Comparaison finale ===");
        voiture2.afficherInformations();
        voiture3.afficherInformations();
        
        
        System.out.println("\n===TESTS DES VALIDATIONS ===");

        Voiture voiture = new Voiture("Renault", "Clio", 0.0, 2022);

        // Test 1 : Vitesse négative
        System.out.println("\nTest 1 : Vitesse négative");
        voiture.setVitesse(-10);
        System.out.println("Vitesse actuelle : " + voiture.getVitesse());

        // Test 2 : Vitesse nulle
        System.out.println("\nTest 2 : Vitesse nulle");
        voiture.setVitesse(0);
        System.out.println("Vitesse actuelle : " + voiture.getVitesse());

        // Test 3 : Année invalide (trop ancienne)
        System.out.println("\nTest 3 : Année invalide (trop ancienne)");
        voiture.setAnnee(1800);
        System.out.println("Année actuelle : " + voiture.getAnnee());

        // Test 4 : Année invalide (future)
        System.out.println("\nTest 4 : Année invalide (future)");
        voiture.setAnnee(2050);
        System.out.println("Année actuelle : " + voiture.getAnnee());

        // Test 5 : Marque vide
        System.out.println("\nTest 5 : Marque vide");
        voiture.setMarque("");
        System.out.println("Marque actuelle : " + voiture.getMarque());

        // Test 6 : Marque null
        System.out.println("\nTest 6 : Marque null");
        voiture.setMarque(null);
        System.out.println("Marque actuelle : " + voiture.getMarque());

        // Test 7 : Accélération négative
        System.out.println("\nTest 7 : Accélération négative");
        voiture.accelerer(-50);
        System.out.println("Vitesse actuelle : " + voiture.getVitesse());

        // Test 8 : Freinage excessif
        System.out.println("\nTest 8 : Freinage excessif");
        voiture.setVitesse(20);
        voiture.freiner(50);
        System.out.println("Vitesse actuelle : " + voiture.getVitesse());

        voiture.afficherInformations();
    }
	

	
	
}

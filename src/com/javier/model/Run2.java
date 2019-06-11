package com.javier.model;

public class Run2 {

	public static void main(String[] args) {

		// Je suis un commentary

		String nom;

		String prenom;
		int age;

		String bjr, autre, truc;
		nom = "bonjour";
		boolean test3 = true;

		System.out.println(nom);

		if (test3) {
			System.out.println("le test est vrai");
		}

		bjr = "Hello world";
		autre = "autre chose";
		truc = "un truc";
		char uneLettre = 'A';
		int nb1 = 32;
		int nb2 = 2;
		long longNbr = 23L;
		short shortNbr = 10;
		byte shortNbr1 = (byte) 10;
		float floatNbr = 22.3F;
		boolean test = true;

		if (test) {
			System.out.println("resultat du test");
		}
		boolean test4 = false;
		if (!test4) {
			System.out.println("resultat du test");
		}

		char appostrophe = '\'';
		String citation = "la citation de Virenque : \"à l'insu de mon plein gré\"";
		String citation2 = "la citation de Virenque : \"à l'insu de \\ mon plein gré\"";

		try {
			System.out.println(nb1 / nb2);
		} catch (Exception e) {
			e.getMessage();

		}

		System.out.println(truc + " " + "a dire : " + bjr);

		System.out.println(autre);
		System.out.println(nb1 + nb2);
		System.out.println(citation);
		System.out.println(citation2);

		int nbr3 = 10;
		int nbr4 = 3;

		int nbr5 = 25;
		int nbr6 = 32;

		nbr3 += nbr4;
		// se puede poner de otras maneras lo anterior

		int resultat = nbr3 + nbr4;
		int resultatSoustraction = nbr4 - nbr3;
		System.out.println(resultat);
		System.out.println(resultatSoustraction * resultat);
		direBonjour();

	}

	public static void soustraction()

	public static void main2(String[] args) {
		direBonjour();
		// afficher("un autre message");

		int nbr7 = 50;

		addition(8, 10);
		addition(13, 50);
		addition(nbr, 24);

	}

	private static void addition(int i, int j) {
		// TODO Auto-generated method stub

	}

	public static void direBonjour() {

		afficher("message personalisé dans une fonction");

		System.out.println("hello world");

		public static void afficher (String message); {
			System.out.println(message);

		}
		public static void addition(int nbr3, int nbr4) {
			int resultat = nbr3 + nbr4;
			System.out.println(resultat);

			public static void addition(int nbr3; int nbr4) {
				int resultat = nbr3 + nbr4;
				afficher("loperation sest deroulé correctement resultat:" + resultat)
			}



		}
	}

	private static void afficher(String string) {
		// TODO Auto-generated method stub

	}
}

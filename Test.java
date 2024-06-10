package Class;

public class Test {
	public static void main(String[] args) {
		Etudiant etudiant1 = new Etudiant("Kujo", "Jotaro");
		Etudiant etudiant2 = new Etudiant("Joestar", "Joseph");
		
		
		etudiant1.saisirNotes();
		etudiant1.calculerMoyenne();
		etudiant1.determinerMention();
		
		etudiant2.saisirNotes();
		etudiant2.calculerMoyenne();
		etudiant2.determinerMention();
		
	}

}

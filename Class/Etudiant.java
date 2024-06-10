package Class;

import java.util.Scanner;

public class Etudiant {
	private String nom;
	private String prenom;
	private double moyenne;
	private String mention;
	private double[] notes;
	
	
	public Etudiant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.moyenne = calculerMoyenne();
		this.mention = determinerMention();
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public double getMoyenne() {
		return moyenne;
	}
	
	
	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
		this.mention = determinerMention();
	}
	
	public String getMention() {
		return mention;
	}
	
	public void setMention(String mention) {
		this.mention = mention;
	}
	
	public double[] getNotes() {
		return notes;
	}
	
	
	public void saisirNotes() {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Entrez le nombre de notes: ");
			int nombreNotes = sc.nextInt();
			notes = new double[nombreNotes];

			for (int i = 0; i < nombreNotes; i++) {
			    System.out.print("Entrez la note " + (i + 1) + ": ");
			    notes[i] = sc.nextDouble();
			}
		}
	}
	
	
	public double calculerMoyenne() {
		double somme = 0;
		for(double n : notes) {
			somme += n;
		}
		return somme / notes.length;
	}
	
	public String determinerMention() {
		if(moyenne >= 16) {
			return "Très bien";
		}
		else if (moyenne >= 14) {
			return "Bien";
		}
		else if (moyenne >= 12) {
			return "Assez bien";
		}
		else if (moyenne >= 10) {
			return "Passable";
		}
		else {
			return "Rattrapage";
		}
	}
	
	
	
   
        


	
}

package tp;

import java.time.LocalDate;
public class Etudiant {
	private String nom;
	private String prenom;
	private String email;
	private int postale;
	private LocalDate date;
	public Etudiant(String nom, String prenom, String email, int postale, LocalDate date) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.postale = postale;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", postale=" + postale + ", date="
				+ date + "]\n";
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
}


package tp;

import java.util.ArrayList;

public class Departement {
	private String specialite;
	private String adresse;
    private ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
    
	public Departement(String specialite, String adresse) {
		super();
		this.specialite = specialite;
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Departement [etudiants=\n" + etudiants + "]";
	}
    
    public void inscrire(Etudiant e) {
    	etudiants.add(e);
    }
    public void disinscrire(Etudiant e) {
    	etudiants.remove(e);
    }

}

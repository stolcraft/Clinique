package eu.ensup.clinique.domaine;

public class Patient extends Personne {

	private Medecin medecin;
	private String symptome;

	public Patient(int id, String nom, String prenom, String email, String adresse, String sexe) {
		super(id, nom, prenom, email, adresse, sexe);

	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	public String getSymptome() {
		return symptome;
	}

	public void setSymptome(String symptome) {
		this.symptome = symptome;
	}

	@Override
	public String toString() {
		return "Patient [medecin=" + medecin + ", symptome=" + symptome + "]";
	}

}

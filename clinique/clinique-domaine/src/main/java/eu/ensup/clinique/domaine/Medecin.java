package eu.ensup.clinique.domaine;

public class Medecin extends Personne {
	private Patient patient;
	private String specialite;

	public Medecin(int id, String nom, String prenom, String email, String adresse, String sexe, String specialite) {
		super(id, nom, prenom, email, adresse, sexe);
		// this.patient = patient;
		this.specialite = specialite;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return "Info du m�decin num�ro " + getId() + " : " + getNom() + " - " + getPrenom() + " - " + getSpecialite();
	}

}

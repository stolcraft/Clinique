package eu.ensup.clinique.service;

import eu.ensup.clinique.domaine.Medecin;
import eu.ensup.clinique.domaine.Patient;

public interface IMedecinService {

	public boolean engagerMedecin(Medecin pMed);

	public Medecin lireInfoMedecin(int idMedecin);
	public void consulter (Patient p);
}

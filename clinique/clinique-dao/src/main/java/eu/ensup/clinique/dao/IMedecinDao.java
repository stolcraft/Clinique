package eu.ensup.clinique.dao;

import eu.ensup.clinique.domaine.Medecin;

public interface IMedecinDao {
	public boolean create(Medecin pMedecin);
	public Medecin getById(int id);
}

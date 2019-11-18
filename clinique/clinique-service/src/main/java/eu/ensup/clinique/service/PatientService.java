package eu.ensup.clinique.service;

import java.util.Collection;

import eu.ensup.clinique.dao.PatientDao;
import eu.ensup.clinique.domaine.Patient;

public class PatientService {

	public PatientService() {

	}


	public Collection<Patient> listerPatient() {

		PatientDao dao = new PatientDao();
		Collection<Patient> listePatient = dao.getAllPatient();
		return listePatient;
	}

}

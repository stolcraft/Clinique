package eu.ensup.clinique.service;

import eu.ensup.clinique.dao.IMedecinDao;
import eu.ensup.clinique.domaine.Medecin;
import eu.ensup.clinique.domaine.Patient;

public class MedecinService implements IMedecinService{

	private Medecin pMed;
	private IMedecinDao iMedDao;

	public MedecinService() {

	}

	public MedecinService(Medecin pMed) {
		this.pMed = pMed;
	}

	public MedecinService(IMedecinDao iMed) {
		this.iMedDao = iMed;
	}


	@Override
	public boolean engagerMedecin(Medecin pMed) {
		return iMedDao.create(pMed);
	}

	@Override
	public Medecin lireInfoMedecin(int idMedecin) {
		return iMedDao.getById(idMedecin);
	}


	@Override
	public void consulter (Patient p){
		System.out.println("le m�decin "+pMed.getPrenom()+" dont la sp�cialit� est: "+pMed.getSpecialite()+" consulte le patient "+p.getPrenom()+" pour traiter le symptome: "+p.getSymptome());
	}
}

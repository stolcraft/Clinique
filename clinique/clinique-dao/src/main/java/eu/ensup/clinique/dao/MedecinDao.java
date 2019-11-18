package eu.ensup.clinique.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import eu.ensup.clinique.domaine.Medecin;

public class MedecinDao implements IMedecinDao {

	private String url = "jdbc:mysql://localhost/clinique";
	private String login = "root";
	private String passwd = "";
	private Connection cn;
	private Statement st;

	public MedecinDao() {
		// se co a la bdd
		System.out.println("Medecin Dao");
		System.out.println("connection..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
		} catch (ClassNotFoundException e) {
			System.out.println("erreur connection, classnotfound");
			// e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("erreur connection, sqlexception");
			// e.printStackTrace();
		}

	}

	// crud
	@Override
	public boolean create(Medecin pMedecin) {
		System.out.println("creation medecin");
		try {
			st = cn.createStatement();
			String sql = "INSERT INTO `medecin` VALUES (" + pMedecin.getId() + ",'" + pMedecin.getNom() + "','"
					+ pMedecin.getPrenom() + "','" + pMedecin.getEmail() + "','" + pMedecin.getAdresse() + "','"
					+ pMedecin.getSexe() + "','" + pMedecin.getSpecialite() + "'," + pMedecin.getPatient().getId()
					+ ")";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("erreur sqlexception");
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public Medecin getById(int id) {
		System.out.println("get medecin by ID");
		int idMed;
		String nom;
		String prenom;
		String email;
		String adresse;
		String sexe;
		String specialite;

		Medecin med = null;
		try {
			st = cn.createStatement();
			String sql = "Select * FROM medecin WHERE id=" + id + ";";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				idMed = rs.getInt("id");
				nom = rs.getString("nom");
				prenom = rs.getString("prenom");
				email = rs.getString("email");
				adresse = rs.getString("adresse");
				sexe = rs.getString("sexe");
				specialite = rs.getString("specialite");
				med = new Medecin(idMed, nom, prenom, email, adresse, sexe, specialite);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return med;
	}

}

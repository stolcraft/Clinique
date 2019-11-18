package eu.ensup.clinique.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import eu.ensup.clinique.domaine.Patient;

public class PatientDao {

	private String url = "jdbc:mysql://localhost/clinique";
	private String login = "root";
	private String passwd = "";
	private Connection cn;
	private Statement st;

	public PatientDao() {

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

	public Collection<Patient> getAllPatient() {

		Collection<Patient> listePatient = new ArrayList<Patient>();

		int id;
		String nom;
		String prenom;
		String email;
		String adresse;
		String sexe;

		Patient pat = null;
		try {
			st = cn.createStatement();
			String sql = "Select * FROM patient";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				id = rs.getInt("id");
				nom = rs.getString("nom");
				prenom = rs.getString("prenom");
				email = rs.getString("email");
				adresse = rs.getString("adresse");
				sexe = rs.getString("sexe");
				pat = new Patient(id, nom, prenom, email, adresse, sexe);
				listePatient.add(pat);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listePatient;
	}
}

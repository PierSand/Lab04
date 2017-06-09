package it.polito.tdp.lab04.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.lab04.model.Corso;
import it.polito.tdp.lab04.model.Studente;

public class StudenteDAO {

	public Studente getStudente(int matricola) {


		final String sql = "SELECT * FROM studente where matricola=?";



		try {

			Connection conn = ConnectDB.getConnection();

			PreparedStatement st = conn.prepareStatement(sql);

			st.setInt(1, matricola);
			

			ResultSet rs = st.executeQuery();
			Studente studente = null;



			if (rs.next()) {
				studente = new Studente(rs.getInt("matricola"), rs.getString("cognome"), rs.getString("nome"), rs.getString("cds"));

			}



			conn.close();

			return studente;



		} catch (SQLException e) {

			e.printStackTrace();

			throw new RuntimeException("Errore Db");

		}

	}
		
	
	
	


}

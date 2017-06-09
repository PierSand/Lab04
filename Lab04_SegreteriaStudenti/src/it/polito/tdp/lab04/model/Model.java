package it.polito.tdp.lab04.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import it.polito.tdp.lab04.DAO.CorsoDAO;
import it.polito.tdp.lab04.DAO.StudenteDAO;

public class Model {
	

	private CorsoDAO corsoDao;
	private StudenteDAO studenteDao;
	
	
	public Model() {
		super();
		corsoDao = new CorsoDAO();
		studenteDao = new StudenteDAO();
	}
	
	public List<Corso> getTuttiICorsi() {
		return corsoDao.getTuttiICorsi();

	}
	
	public Studente getStudente(int matricola){
		return studenteDao.getStudente(matricola);
	}
		
	
}

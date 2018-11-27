/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.delegate;

import java.util.List;
import modelo.dao.ProyectoDao;
import modelo.dto.Proyecto;

/**
 *
 * @author Nate
 */
public class ProyectoDelegate {
    	
	private ProyectoDao dao;
	
	public ProyectoDelegate(){
		dao=new ProyectoDao();
	}
	
	public void persist(Proyecto entity){
		dao.openCurrentSessionwithTransaction();
		dao.persist(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public void update(Proyecto entity) {
		dao.openCurrentSessionwithTransaction();
		dao.update(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public Proyecto findById(int id) {
		dao.openCurrentSession();
		Proyecto dto=dao.findById(id);
		dao.closeCurrentSession();
		
		return dto;
		
	}

	public void deleteById(int id) {
		dao.openCurrentSessionwithTransaction();
		Proyecto dto=dao.findById(id);
		dao.delete(dto);;
		dao.closeCurrentSessionwithTransaction();
	}

	public List<Proyecto> findAll() {
		dao.openCurrentSession();
		List<Proyecto> proyectos=dao.findAll();
		dao.closeCurrentSession();
		return proyectos;
		//return dao.findAll();
		
	}
}

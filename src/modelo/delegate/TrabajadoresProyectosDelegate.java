package modelo.delegate;

import java.util.List;
import modelo.dto.TrabajadorProyecto;
import modelo.dao.TrabajadorProyectoDao;


public class TrabajadoresProyectosDelegate {

	private TrabajadorProyectoDao dao;

	public TrabajadoresProyectosDelegate() {
		dao = new TrabajadorProyectoDao();
	}

	public void persist(TrabajadorProyecto entity) {
		dao.openCurrentSessionwithTransaction();
		dao.persist(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public void update(TrabajadorProyecto entity) {
		dao.openCurrentSessionwithTransaction();
		dao.update(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public void deleteById(int id) {
		dao.openCurrentSessionwithTransaction();
		TrabajadorProyecto dto = dao.findById(id);
		dao.delete(dto);
		dao.closeCurrentSessionwithTransaction();

	}

	public TrabajadorProyecto findById(int id) {
		dao.openCurrentSession();
		TrabajadorProyecto dto = dao.findById(id);
		dao.closeCurrentSession();
		return dto;

	}

	public List<TrabajadorProyecto> findAll() {
		dao.openCurrentSession();
		List<TrabajadorProyecto> dtos = dao.findAll();
		dao.closeCurrentSession();
		return dtos;
	}

}

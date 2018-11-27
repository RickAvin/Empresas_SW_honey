package modelo.delegate;

import java.util.List;
import modelo.dto.Trabajadores;
import modelo.dao.TrabajadoresDao;



public class TrabajadoresDelegate {

	TrabajadoresDao dao;

	public TrabajadoresDelegate() {
		dao = new TrabajadoresDao();
	}

	public void persist(Trabajadores entity) {
		dao.openCurrentSessionwithTransaction();
		dao.persist(entity);
		dao.closeCurrentSessionwithTransaction();

	}

	public void update(Trabajadores entity) {
		dao.openCurrentSessionwithTransaction();
		dao.update(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public void deleteById(int id) {
		dao.openCurrentSessionwithTransaction();
		Trabajadores dto = dao.findById(id);
		dao.delete(dto);
		dao.closeCurrentSessionwithTransaction();
	}

	public Trabajadores findById(int id) {
		dao.openCurrentSession();
		Trabajadores dto = dao.findById(id);
		dao.closeCurrentSession();
		return dto;
	}

	public List<Trabajadores> findAll() {
		dao.openCurrentSession();
		List<Trabajadores> trabajadores = dao.finall();
		dao.closeCurrentSession();
		return trabajadores;

	}

}

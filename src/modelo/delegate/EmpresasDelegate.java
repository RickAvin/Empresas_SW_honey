package modelo.delegate;

import java.util.List;
import modelo.dto.Empresas;
import modelo.dao.EmpresasDao;


public class EmpresasDelegate {

	private EmpresasDao dao;

	public EmpresasDelegate() {

		dao = new EmpresasDao();
	}

	public void persist(Empresas entity) {
		dao.openCurrentSessionwithTransaction();
		dao.persist(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public void update(Empresas entity) {
		dao.openCurrentSessionwithTransaction();
		dao.update(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public void deleteById(int id) {
		dao.openCurrentSessionwithTransaction();
		Empresas dto = dao.findById(id);
		dao.delete(dto);
		dao.closeCurrentSessionwithTransaction();
	}

	public Empresas findById(int id) {
		dao.openCurrentSession();
		Empresas dto = dao.findById(id);
		dao.closeCurrentSession();
		return dto;
	}

	public List<Empresas> findAll() {
		dao.openCurrentSession();
		List<Empresas> empresas = dao.findAll();
		dao.closeCurrentSession();
		return empresas;
	}

}

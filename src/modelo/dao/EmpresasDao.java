package modelo.dao;

import java.util.List;
import modelo.dto.Empresas;




public class EmpresasDao extends Dao {

	public void persist(Empresas entity) {
		getCurrentSession().save(entity);
	}

	public void update(Empresas entity) {
		getCurrentSession().update(entity);
	}

	public Empresas findById(int id) {
		Empresas empresa = (Empresas) getCurrentSession().get(Empresas.class, id);
		return empresa;
	}

	public void delete(Empresas entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<Empresas> findAll() {
		List<Empresas> empresas = (List<Empresas>) getCurrentSession().createQuery("from Empresas").list();
		return empresas;

	}
}

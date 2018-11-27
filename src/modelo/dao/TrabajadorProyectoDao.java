package modelo.dao;

import java.util.List;
import modelo.dto.TrabajadorProyecto;




public class TrabajadorProyectoDao extends Dao {

	public void persist(TrabajadorProyecto entity) {
		getCurrentSession().save(entity);
	}

	public void update(TrabajadorProyecto entity) {
		getCurrentSession().update(entity);
	}

	public TrabajadorProyecto findById(int id) {
		TrabajadorProyecto trabajador = (TrabajadorProyecto) getCurrentSession().get(TrabajadorProyecto.class,
				id);
		return trabajador;
	}

	public void delete(TrabajadorProyecto entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<TrabajadorProyecto> findAll() {
		List<TrabajadorProyecto> trabajadores = (List<TrabajadorProyecto>) getCurrentSession()
				.createQuery("from TrabajadorProyecto").list();
		return trabajadores;
	}

}

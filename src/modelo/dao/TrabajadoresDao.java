package modelo.dao;

import java.util.List;
import modelo.dto.Trabajadores;




public class TrabajadoresDao extends Dao{

	public void persist(Trabajadores entity){
		getCurrentSession().save(entity);
	}
	
	public void update(Trabajadores entity){ 
		getCurrentSession().update(entity);
	}
	
	public Trabajadores findById(int id){
		Trabajadores trabajadores=(Trabajadores) 
				getCurrentSession().
				get(Trabajadores.class,id);
		return trabajadores;
	}
	
	public void delete(Trabajadores entity){
		getCurrentSession().delete(entity);
	}
	
	@SuppressWarnings("unchecked")
	public List<Trabajadores> finall(){
		List<Trabajadores> trabajadores=(List<Trabajadores>)getCurrentSession().createQuery("from Trabajadores").list();
		return trabajadores;
	}
}

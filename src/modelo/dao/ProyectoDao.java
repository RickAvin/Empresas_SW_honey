package modelo.dao;

import java.util.List;
import modelo.dto.Proyecto;

public class ProyectoDao extends Dao {

    public void persist(Proyecto entity) {
        getCurrentSession().save(entity);
    }

    public void update(Proyecto entity) {
        getCurrentSession().update(entity);
    }

    public Proyecto findById(int id) {
        Proyecto dto = (Proyecto) getCurrentSession().get(Proyecto.class, id);
        return dto;
    }

    public void delete(Proyecto entity) {
        getCurrentSession().delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<Proyecto> findAll() {
        List<Proyecto> proyectos = getCurrentSession().createQuery("from Proyecto").list();
        return proyectos;
    }
}

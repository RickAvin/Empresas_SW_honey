package modelo.dto;
// Generated Nov 17, 2016 10:17:35 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TrabajadorProyecto generated by hbm2java
 */
@Entity
@Table(name="trabajador_proyecto"
    ,catalog="empresa_sw_honney"
)
public class TrabajadorProyecto  implements java.io.Serializable {


     private Integer id;
     private Proyecto proyecto;
     private Trabajadores trabajadores;
     private String profesion;
     private Date horasTrabajadas;
     private String descripcion;

    public TrabajadorProyecto() {
    }

	
    public TrabajadorProyecto(Proyecto proyecto, Trabajadores trabajadores, String profesion, Date horasTrabajadas) {
        this.proyecto = proyecto;
        this.trabajadores = trabajadores;
        this.profesion = profesion;
        this.horasTrabajadas = horasTrabajadas;
    }
    public TrabajadorProyecto(Proyecto proyecto, Trabajadores trabajadores, String profesion, Date horasTrabajadas, String descripcion) {
       this.proyecto = proyecto;
       this.trabajadores = trabajadores;
       this.profesion = profesion;
       this.horasTrabajadas = horasTrabajadas;
       this.descripcion = descripcion;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PROYECTO_ID", nullable=false)
    public Proyecto getProyecto() {
        return this.proyecto;
    }
    
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TRABAJADORES_ID", nullable=false)
    public Trabajadores getTrabajadores() {
        return this.trabajadores;
    }
    
    public void setTrabajadores(Trabajadores trabajadores) {
        this.trabajadores = trabajadores;
    }

    
    @Column(name="PROFESION", nullable=false, length=45)
    public String getProfesion() {
        return this.profesion;
    }
    
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Temporal(TemporalType.TIME)
    @Column(name="HORAS_TRABAJADAS", nullable=false, length=8)
    public Date getHorasTrabajadas() {
        return this.horasTrabajadas;
    }
    
    public void setHorasTrabajadas(Date horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    
    @Column(name="DESCRIPCION", length=100)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return profesion ;
    }




}



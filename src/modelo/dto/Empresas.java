package modelo.dto;
// Generated Nov 17, 2016 10:17:35 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Empresas generated by hbm2java
 */
@Entity
@Table(name="empresas"
    ,catalog="empresa_sw_honney"
)
public class Empresas  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String rfc;
     private String razonSocial;
     private String municipio;
     private String colonia;
     private String calle;
     private String telefono;
     private byte[] logotipo;
     private Set proyectos = new HashSet(0);

    public Empresas() {
    }

	
    public Empresas(String nombre, String rfc) {
        this.nombre = nombre;
        this.rfc = rfc;
    }
    public Empresas(String nombre, String rfc, String razonSocial, String municipio, String colonia, String calle, String telefono, byte[] logotipo, Set proyectos) {
       this.nombre = nombre;
       this.rfc = rfc;
       this.razonSocial = razonSocial;
       this.municipio = municipio;
       this.colonia = colonia;
       this.calle = calle;
       this.telefono = telefono;
       this.logotipo = logotipo;
       this.proyectos = proyectos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="NOMBRE", nullable=false, length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="RFC", nullable=false, length=45)
    public String getRfc() {
        return this.rfc;
    }
    
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    
    @Column(name="RAZON_SOCIAL", length=45)
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    
    @Column(name="MUNICIPIO", length=45)
    public String getMunicipio() {
        return this.municipio;
    }
    
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    
    @Column(name="COLONIA", length=45)
    public String getColonia() {
        return this.colonia;
    }
    
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    
    @Column(name="CALLE", length=45)
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }

    
    @Column(name="TELEFONO", length=10)
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    @Column(name="LOGOTIPO")
    public byte[] getLogotipo() {
        return this.logotipo;
    }
    
    public void setLogotipo(byte[] logotipo) {
        this.logotipo = logotipo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="empresas")
    public Set getProyectos() {
        return this.proyectos;
    }
    
    public void setProyectos(Set proyectos) {
        this.proyectos = proyectos;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    




}


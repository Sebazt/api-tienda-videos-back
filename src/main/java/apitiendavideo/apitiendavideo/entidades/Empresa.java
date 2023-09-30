package apitiendavideo.apitiendavideo.entidades;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table( name = "empresa" )
public class Empresa {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_empresa")
  @GenericGenerator(name = "secuencia_empresa", strategy = "increment")
  @Column(name = "id")
  private long id;


  @Column(name = "nombre", length = 100, unique = true)
  private String nombre;

  /* A través del join instancia un objeto y con el decorador busco el atributo en especifico */
  @JoinColumn(name = "idpais", referencedColumnName = "id")
  @ManyToOne /* Este decorador representa la cardinalidad */
  private Pais pais;

  public Empresa(){
  }

  public Empresa(long id, String nombre, Pais pais) {
    this.id = id;
    this.nombre = nombre;
    this.pais = pais;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Pais getPais() {
    return pais;
  }

  public void setPais(Pais pais) {
    this.pais = pais;
  }




}

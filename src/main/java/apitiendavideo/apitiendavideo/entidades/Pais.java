package apitiendavideo.apitiendavideo.entidades;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity /* Entity me permite que jpa interprete país como entidad */
@Table(name = "pais") /* table me permite denominarlo en bd */

public class Pais {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_pais")
  @GenericGenerator(name = "secuencia_pais", strategy = "increment")
  @Column(name = "id")
  private long id;

  @Column(name = "pais", length = 100, unique = true)
  private String nombre;
  /*
   * column me señala como se llama en bd y yo doy el nombre que quiera al momento
   * de definir la variable
   */

  @Column(name = "codigoalfa2", length = 5, unique = true)
  private String codigoAlfa2;

  @Column(name = "codigoalfa3", length = 100, nullable = true)
  private String codigoAlfa3;

  public Pais(){
  }

  public Pais(long id, String nombre, String codigoAlfa2, String codigoAlfa3) {
    this.id = id;
    this.nombre = nombre;
    this.codigoAlfa2 = codigoAlfa2;
    this.codigoAlfa3 = codigoAlfa3;
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

  public String getCodigoAlfa2() {
    return codigoAlfa2;
  }

  public void setCodigoAlfa2(String codigoAlfa2) {
    this.codigoAlfa2 = codigoAlfa2;
  }

  public String getCodigoAlfa3() {
    return codigoAlfa3;
  }

  public void setCodigoAlfa3(String codigoAlfa3) {
    this.codigoAlfa3 = codigoAlfa3;
  }

  



}

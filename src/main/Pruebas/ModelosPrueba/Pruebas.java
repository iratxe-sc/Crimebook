package ModelosPrueba;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Pruebas {
    public enum Dificultad{
        FACIL,
        NORMAL,
        DIFICIL

    }
    //Enum Tabla Pruebas columna tipo
    public enum Tipo{
        PRUEBANORMAL,
        PRUEBAFINAL
    }
    private Integer id;
    private String nombre;
    private String descExtendida;
    private String descBreve;
    private Tipo tipo;
    private Dificultad dificultad;
    private String url;
    private String ayudaFinal;
    private String username;


    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 50)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "descExtendida", nullable = true, length = 1000)
    public String getDescExtendida() {
        return descExtendida;
    }

    public void setDescExtendida(String descExtendida) {
        this.descExtendida = descExtendida;
    }

    @Basic
    @Column(name = "descBreve", nullable = true, length = 200)
    public String getDescBreve() {
        return descBreve;
    }

    public void setDescBreve(String descBreve) {
        this.descBreve = descBreve;
    }

    @Basic
    @Column(name = "tipo", nullable = false)
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo ) {
        this.tipo = tipo;
    }

    @Basic
    @Column(name = "dificultad", nullable = true)
    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    @Basic
    @Column(name = "url", nullable = true, length = 100)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "ayudaFinal", nullable = true, length = 200)
    public String getAyudaFinal() {
        return ayudaFinal;
    }

    public void setAyudaFinal(String ayudaFinal) {
        this.ayudaFinal = ayudaFinal;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 15)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pruebas pruebas = (Pruebas) o;
        return Objects.equals(id, pruebas.id) &&
                Objects.equals(nombre, pruebas.nombre) &&
                Objects.equals(descExtendida, pruebas.descExtendida) &&
                Objects.equals(descBreve, pruebas.descBreve) &&
                Objects.equals(tipo, pruebas.tipo) &&
                Objects.equals(dificultad, pruebas.dificultad) &&
                Objects.equals(url, pruebas.url) &&
                Objects.equals(ayudaFinal, pruebas.ayudaFinal) &&
                Objects.equals(username, pruebas.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, descExtendida, descBreve, tipo, dificultad, url, ayudaFinal, username);
    }
}

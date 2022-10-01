package DataBase;
/**
 *
 * @author Henry
 */
public class Alumno {

    String nombre;
    String codigo;
    String Nota;


    public Alumno(String codigo,String nombre, String Nota) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.Nota = Nota;
    }

    public String getNota() {
        return Nota;
    }

    public void setNota(String nota) {
        this.Nota = nota;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}

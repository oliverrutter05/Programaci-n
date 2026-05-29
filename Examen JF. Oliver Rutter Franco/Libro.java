public class Libro {

    private String titulo;
    private String autor;
    private int año_publicacion;

    public Libro(String titulo, String autor, int anio_publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.año_publicacion = año_publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio_publicacion() {
        return año_publicacion;
    }
}

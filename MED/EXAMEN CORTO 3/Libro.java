/**
 * @author UES
 * 
 */


public class Libro {
    private String titulo;
    private String autor;
    
    
    
    public Libro() {
    this.titulo = "";
    this.autor = "";
    }



    public Libro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
    }



    public String getTitulo() {
    return titulo;
    }



    public void setTitulo(String titulo) {
    this.titulo = titulo;
    }



    public String getAutor() {
    return autor;
    }




    public void setAutor(String autor) {
    this.autor = autor;
    }




//--------------------------------------------------------------------------------------------

    //Sobreescribí este metodo para poder trabajar con la impresion de los objetos en consola
    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor;
    }
//--------------------------------------------------------------------------------------------


    }//final de la clase libro



/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    private int vecesPrestado;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginasLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginasLibro;
        numeroReferencia = "";
        vecesPrestado = 0;
    }
    
    public String getNombreAutor(){
        return autor;
    }
    
    public String getNombreLibro(){
        return titulo;
    }
    
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    
    public int getVecesPrestado(){
        return vecesPrestado;
    }
    
    public void setNumeroReferencia(String numeroRef){
        this.numeroReferencia = numeroRef;
        if (numeroRef.length() >= 3){
            numeroReferencia = numeroRef;
        }
        else{
            System.out.println("No se ha podido modificar el número de referencia, se deben introducir al menos 3 caracteres");
            numeroReferencia = "";
        }
    }
    
    public void setVecesPrestado(){
        vecesPrestado += 1;
    }
    
    public void imprimeAutor(){
        System.out.println("El autor de este libro es " + autor);
    }
    
    public void imprimeTitulo(){
        System.out.println("El titulo del libro es " + titulo);
    }
    
    public void imprimirDetalles(){
        System.out.println(getDetalles());
    }
    
    public String getDetalles(){
        String detalles = "";
        if (numeroReferencia != ""){
            detalles ="Titulo del libro: " + titulo + ", Autor del libro: " + autor + ", Número de páginas: " + numeroPaginas + ", Número de Referencia: " + numeroReferencia + ", Número de veces prestado: " + vecesPrestado;
        } 
        else {
           detalles ="Titulo del libro: " + titulo + ", Autor del libro: " + autor + ", Número de páginas: " + numeroPaginas + ", Número de Referencia: ZZZ" + ", Número de veces prestado: " + vecesPrestado;
        }
        return detalles;
    }
}

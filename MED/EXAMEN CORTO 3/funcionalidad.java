import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.FormatterClosedException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author ALEXANDER RIGOBERTO LOPEZ ALFARO CARNET LA17014
 * @version 0.01
 * @since 09/06/2024
 */



public class funcionalidad {

//instanciamos la clase Scanner
Scanner lecturas = new Scanner(System.in);




/**
 * 
 * @throws InputMismatchException Excepcion controlada en caso se introduzca una letra
 * @return retorna la lectura de un numero entero desde el teclado
 */
public int lecturaEntero(){
    
    int LecturaDeNumero = 0;
    
    try {
        System.out.println("Inserte el dato.");
        LecturaDeNumero = lecturas.nextInt();//Capturamos la cantidad de libros
        lecturas.nextLine();//Limpiamos el prompt
    } catch (Exception InputMismatchException) {
        // TODO: handle exception
        System.out.println("Debe ingresar solo numeros. Ejecute nuevamente");
    }




    return LecturaDeNumero;
}//final del metodo lectura entero





/**
 * 
 * @return retorna la lectura desde el teclado
 */
public String lecturaTexto(){
    String LecturaDeTexto = "";
    LecturaDeTexto = lecturas.nextLine();//Capturamos el texto de los libros de libros
    //System.out.println("Dato Almacenado");
    return LecturaDeTexto;
    }//final del metodo de lectura de texto



/**
 * @return no retorna nada
 * @throws EmptyStackException cuando la pila se encuentre vacia lanzará esta excepcion
 * 
 */



    public void TrabajoEnLaBiblioteca(){
        //Creamos la pila de objetos libros
       Stack<Libro> MiBibliotecaPersonal = new Stack<>();
        String titulo="";//almacena el titulo del libro 
        String autor="";//almacena el autor del libro
        int cantidadLibrosAIngresar;//Almacena el dato de ingreso

        try {

        //Llamamos al metodo para leer enteros
        System.out.println("Ingrese la cantidad de libros a almacenar\n");
        cantidadLibrosAIngresar = lecturaEntero();




        //Creamos un bucle for para que llene los datos uno a uno
        for (int VariableDeControl =0; VariableDeControl<cantidadLibrosAIngresar;VariableDeControl++){
        System.out.println("Registro #" +(VariableDeControl+1)+" Ingrese el Titulo del libro  ");
        titulo = lecturaTexto();
        System.out.println("Registro #" +(VariableDeControl+1)+" Ingrese el Autor del libro ");
        autor = lecturaTexto();  
        //Insertamos los datos en la pila
        MiBibliotecaPersonal.push(new Libro(titulo,autor));
        System.out.println("Datos almacenado con exito");
        System.out.println("\n\n");
            

        }//final del bucle










            
        //IMPRIMIENDO LOS RESULTADOS}
        System.out.println("\n\n");
        System.out.println("----------------------------RESULTADOS-------------------------------------------------------");
        System.out.println("En la librera tenemos : "+MiBibliotecaPersonal.size()+" libros almacenados");
        System.out.println("Los cuales son :  "+MiBibliotecaPersonal);//mostramos la pila
        System.out.println("El ultimo libro almacenado es : "+MiBibliotecaPersonal.peek());
        System.out.println("Sacaremos el libro del estante: "+MiBibliotecaPersonal.pop());
        System.out.println("Ahora en la librera tenemos : "+MiBibliotecaPersonal.size()+" libros almacenados");
        System.out.println("El nuestra librera ahora nos quedan los siguientes libros: "+MiBibliotecaPersonal);//mostramos la pila
        System.out.println("----------------------------RESULTADOS-------------------------------------------------------");
            
        }//final del bloque try 




        catch (Exception EmptyStackException) {
          
            System.out.println("No se puede mostrar datos. Porfavor reinicie la aplicacion");
            System.exit(1);
        }//final del bloque catch





    }//Final del metodo trabajo en mi biblioteca
    
}//final de la clase funcionalidad

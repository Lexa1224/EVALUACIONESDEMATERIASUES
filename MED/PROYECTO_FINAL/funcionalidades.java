import java.util.Scanner;

public class funcionalidades {

//creamos la instancia de la clase ListaEnlazada
ListaEnlazada ListasOperacionales = new ListaEnlazada();


public int lecturasUsuario(){
    Scanner lecturas = new Scanner(System.in);
    int ingreso = 0;
    System.out.println("Ingrese el dato");
    ingreso = lecturas.nextInt();
    lecturas.nextLine();//limpiamos el prompt
    

    return ingreso;
}







public int MenuP(){

int opcion = 0;
System.out.println("Bienvenido porfavor seleccione una opcion");
System.out.println("1)Agregar nodos a la lista");
System.out.println("2)Suprimir un nodo de la lista");
System.out.println("3)Ordenar los elementos de la lista)");
System.out.println("4)Agregar un nodo al final de la lista");
System.out.println("5)Mostrar todos los elementos de la lista");
System.out.println("0)Salir de la aplicacion");
//Leemos la opcion seleccionada
System.out.println("Inserte la opcion seleccionada");
opcion = lecturasUsuario();
while(opcion<0 || opcion >6){
System.out.println("La opcion no es valida. Porfavor ingrese una opcion del menu");
    opcion = lecturasUsuario();
}//final del ciclo de validacion
System.out.println("Opcion seleccionada");
return opcion;
}//final del metodo menu



public void operacionesSobreLista(){
int seleccion = MenuP();//recibe la opcion seleccionada del menu ya validada


    switch (seleccion) {
        
        case 0:
        System.out.println("Saliendo de la aplicacion");
        System.out.println("Aplicacion cerrada");
        System.exit(0);//sale del programa
        break;


        case 1:
        System.out.println("------------------------------------------------------------------------------------");
       
        System.out.println("1)Agregar nodos a la lista");
        //Obtenemos la cantidad de elementos que desea insertar
        int tamanioDeLaLista=0;
        int cantidadDatosEnLista = 0;
        int DatoAInsertar = 0;
        //leemos la cantidad
        System.out.println("Ingrese la cantidad de datos a agregar en la lista");
        cantidadDatosEnLista = lecturasUsuario();//Cantidad de datos a ingresar

        while(tamanioDeLaLista<cantidadDatosEnLista){
            System.out.println("Inserte el numero a registrar en la lista");
            DatoAInsertar = lecturasUsuario();
            ListasOperacionales.insertar(DatoAInsertar);//insertamos el dato en la lista
            tamanioDeLaLista++;
            
        }


        System.out.println("Datos insertados correctamente\nVolviendo al menu de inicio");
        operacionesSobreLista();//recursividad

        System.out.println("------------------------------------------------------------------------------------");
        

        //llamamos a la fncion agregar a la lista

            break;
            
            case 2:
            
            System.out.println("------------------------------------------------------------------------------------");
            int nodoAeliminar = 0;
            System.out.println("2)Suprimir un nodo de la lista");
            System.out.println("Mostrando la lista completa de datos");
            ListasOperacionales.mostrarLaLista();
            System.out.println("Ingrese el dato que desea eliminar");
            nodoAeliminar = lecturasUsuario();//leemos el dato
            //llamamos  a la funcion que elimina los datos
            ListasOperacionales.suprimir(nodoAeliminar);
            System.out.println("Nodo eliminado");
            System.out.println("Mostrando la lista");
            ListasOperacionales.mostrarLaLista();


            System.out.println("------------------------------------------------------------------------------------");
 operacionesSobreLista();//recursividad
            
            
            break;
            case 3:
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("3)Ordenar los elementos de la lista)");
            System.out.println("Mostrando la lista orignal");
            ListasOperacionales.mostrarLaLista();
            System.out.println("Ordenando la lista");
            ListasOperacionales.ordenar();
            System.out.println("Mostrando la lista ya ordenada");
            ListasOperacionales.mostrarLaLista();
            
            System.out.println("------------------------------------------------------------------------------------");
            operacionesSobreLista();//recursividad
            break;

            case 4:
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("4)Agregar un nodo al final de la lista");
            System.out.println("Inserte el numero a registrar en la lista");
            DatoAInsertar = lecturasUsuario();
            ListasOperacionales.insertar(DatoAInsertar);//insertamos el dato en la lista
            System.out.println("------------------------------------------------------------------------------------");
            operacionesSobreLista();//recursividad
            break;
            case 5:
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("5)Mostrar todos los elementos de la lista");
            ListasOperacionales.mostrarLaLista();
            System.out.println("------------------------------------------------------------------------------------");
            operacionesSobreLista();//recursividad
            break;

        default:
        System.out.println("Operacion no completada");
            break;
    }//final del switch
   


}//final del metodo operarciones sobre la lista





}//final de la clase funcionalidades


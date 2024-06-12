class Nodo {
    int dato;          // Este es el valor almacenado en el nodo
    Nodo siguiente;    // Este es el enlace al siguiente nodo

    // Constructor del nodo
    Nodo(int d) 
    {
        dato = d;      // Inicializa el dato con el valor pasado
        siguiente = null;  // Inicializa el enlace al siguiente nodo como null
    }
}

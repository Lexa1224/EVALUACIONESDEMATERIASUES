public class ListaEnlazada {
    Nodo cabeza;  // Este es el primer nodo de la lista

    // Constructor de la lista enlazada
    public ListaEnlazada() {
        cabeza = null;  // Inicializa la cabeza como null (lista vacía)
    }

    // Método para insertar un nuevo nodo al final de la lista
    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);  // Crear un nuevo nodo con el dato dado
        if (cabeza == null) {  // Si la lista está vacía
            cabeza = nuevoNodo;  // El nuevo nodo se convierte en la cabeza
        } else {
            Nodo actual = cabeza;  // Empezar desde la cabeza
            while (actual.siguiente != null) {  // Moverse al final de la lista
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;  // Conectar el último nodo con el nuevo nodo
        }
    }

    // Método para suprimir un nodo de la lista
    public void suprimir(int dato) {
        if (cabeza == null) return;  // Si la lista está vacía, no hacer nada

        if (cabeza.dato == dato) {  // Si el nodo a suprimir es la cabeza
            cabeza = cabeza.siguiente;  // La cabeza se convierte en el siguiente nodo
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.dato != dato) {
            actual = actual.siguiente;  // Buscar el nodo anterior al nodo a suprimir
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;  // Suprimir el nodo
        }
    }

    // Método para ordenar los elementos de la lista
    public void ordenar() {
        if (cabeza == null || cabeza.siguiente == null) return;  // Si la lista está vacía o tiene un solo nodo, no hacer nada

        Nodo actual = cabeza;
        while (actual != null) {
            Nodo indice = actual.siguiente;
            while (indice != null) {
                if (actual.dato > indice.dato) {
                    // Intercambiar los datos
                    int temp = actual.dato;
                    actual.dato = indice.dato;
                    indice.dato = temp;
                }
                indice = indice.siguiente;
            }
            actual = actual.siguiente;
        }
    }

    // Método para imprimir la lista
    public void mostrarLaLista() {
        Nodo actual = cabeza;  // Empezar desde la cabeza
        while (actual != null) {  // Mientras no lleguemos al final de la lista
            System.out.print(actual.dato + " ");  // Imprimir el dato del nodo actual
            actual = actual.siguiente;  // Moverse al siguiente nodo
        }
        System.out.println();  // Imprimir una nueva línea al final
    }


}

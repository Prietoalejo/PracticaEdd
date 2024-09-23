import EDD.Lista;
import EDD.Node;
import Funciones.*;

public class Main {
    public static void main(String[] args) {
        Lista list = new Lista();
        list.appendFirst("primero");
        list.appendFirst("segundo");
        list.appendFirst("tercero");  // Inserta al principio
        list.appendLast("cuarto");
        list.appendLast("quinto");    // Inserta al final
        list.print();
        System.out.println();
        list.appendInIndex("AquiMero",3);
        list.print();
        list.vaciarList();
        System.out.println();
        list.appendFirst("Nuevo Comienzo:");
        list.appendLast("Nuevo Final:");
        list.appendInIndex("fuera de rango", -1); // Índice negativo
        list.appendInIndex("fuera de rango", 10);

        list.print();
        list.appendLast(42);           // Inserta un número
        list.appendLast(new Node('c')); // Inserta un objeto de una clase personalizada
        list.print();
        System.out.print("el tamaño de la lista " + list.getSize());











    }
}
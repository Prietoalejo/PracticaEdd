package EDD;

import Funciones.InputsHelper.*;

import javax.swing.*;

public class Lista {
    private Node head;
    private Node tail;
    private int size;

    public Lista() {
    }

    public Lista(Node element) {
        this.head = this.tail = element;
        this.size = 0;

    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Node getHead() {
        return head;
    }

    public void setHead() {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // Is empty es el virificador de si la lista esta vacia o no.
    public boolean isEmpty() {
        if (this.head == null && this.size == 0) {
            return true;
        } else {
            return false;
        }
    }

    /*
    Metodo de printear en lista, recorrer el tamaño de la lista nodo a nodo y va mostrando en consola
     */
    public void print() {
        Node nodo = getHead();
        while (nodo != null) {
            System.out.print("[" +nodo.getData()+ "]");
            nodo = nodo.getNext();
        }
    }

    //Metodo appendear de una lista, va a agregando dato a dato al final de la lista,
    public Node appendLast(Object nodo) {
        Node aux = new Node(nodo);
        if (isEmpty()) {
            this.head = this.tail = aux;
            size++;
        } else {
            tail.setNext(aux);
            setTail(aux);
            size++;
        }
        return aux;
    }

    public void vaciarList() {
        if (isEmpty()) {
            System.out.println("This list is alredy eempty!");
        } else {
            this.head = null;
            size = 0;
            System.out.println("List clean!");
        }
    }

    public Node appendFirst(Object nodo) {
        Node aux = new Node(nodo);
        if(isEmpty()){
            this.head = this.tail = aux;
            size++;
        }else{
            aux.setNext(head);
            this.head = aux;
            size++;
        }
        return aux;
    }
    public Node appendInIndex(Object nodo, int index) {
        Node nodoAux = new Node(nodo);
        if (isEmpty()) {
            System.out.println("The list is empty, new nodo append at begin");
            appendFirst(nodoAux);
            size++;
        } else if (index < 0) {
            System.out.println("Invalid index");
        } else if (index > size) {
            System.out.println("Index out ofo range");
        } else if (index == 0) {
            System.out.println("Index is cero, append new nodo at begin");
            appendFirst(nodoAux);
            size++;
        } else if (index == this.size) {
            appendLast(nodoAux.getData());
            size++;
        } else {
            Node currentNodo = getHead(); //Nodo auxuliar del metodo para el recorrido
            int currenIndex = 0; // Indice auxiliar para el recorrido
            while (currentNodo.getNext() != null && currenIndex < index - 1) {
                currentNodo = currentNodo.getNext();
                currenIndex++;
            }
            nodoAux.setNext(currentNodo.getNext());
            currentNodo.setNext(nodoAux);
            size++;
        }
    return nodoAux;
    }
}









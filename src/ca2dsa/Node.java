/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2dsa;

/**
 * @author Felipe Paneque
 * student number 23156635
 * 14/03/2025
 */
public class Node {
    private Object patient;
    private Node next;

    public Node(Object patient, Node next) {
        this.patient = patient;
        this.next = next;
    }

    public Object getElement() {
        return patient;
    }

    public void setPatient(Object patient) {
        this.patient = patient;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

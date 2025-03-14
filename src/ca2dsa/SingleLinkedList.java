/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2dsa;

/**
 *
 * @author paneq
 */
    public class SingleLinkedList implements SingleLinkedListInterface{
    private Node head;
    private Node current;
    private Node prev;
    private int size;
    
    public SingleLinkedList(){
        head = null;
        size = 0;
        current = head;
        prev = null;
    }
    
    @Override
    public boolean isEmpty(){
        if(size == 0){
            return true;
        } else {
            return false;
        }
    }
    
    public int size(){
        return size;
    }
    
    
    public void addPatient(int index, Object patient){
        //if adding at the beggining of the list(first index)
        if(index == 1){
            Node newNode = new Node(patient, head);
            //update the head to the new node
            head = newNode; 
        } else {
            //if not adding in the first index, will add the item at the set index;
            setCurrent(index);
            //create new node which and set the next node as the current
            Node newNode = new Node(patient, current);
            //connects the previous node to the new node
            prev.setNext(newNode);
        }
        size++; // increments size
    }
    
    // A helper method to set the 'current' and 'prev' pointers to the nodes around the specified index.
    // It positions 'current' at the node currently at the given index and 'prev' at the node before it.
    private void setCurrent(int index) {
        int i;
        prev = null;
        current = head;
        // Iterate from the first node up to the desired index.
        // Note: This loop assumes that index is at least 1.
        for(i = 1; i<index; i++){
            prev = current; //move prev to the current node
            current = current.getNext(); //move current to the next node
        }
    }
    
    public void removePatient(int index){
        // Removes the node at the specified index (starting at 1).
        if(index == 1){
             // If removing the head, simply update head to be the next node.
            head = head.getNext();
        }else {
            // For other positions, find the node to remove.
            setCurrent(index);
            // update the current node by linking the previous node to the node after current.
            prev.setNext(current.getNext());
        }
        size--; // decrease size
    }
    
    public String printPatients() {
        Node aNode = head;
        StringBuilder patientsList = new StringBuilder();  // StringBuilder to accumulate patient details

        while (aNode != null) {
            patientsList.append(aNode.getElement().toString()).append("\n");  // Add the patient's details and a newline
            aNode = aNode.getNext();  // Move to the next node
        }

        return patientsList.toString();  // Return the accumulated string
    }
}

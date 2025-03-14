/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ca2dsa;

/**
 * @author Felipe Paneque
 * student number 23156635
 * 14/03/2025
 */
public interface SingleLinkedListInterface {
    public boolean isEmpty();
    public int size();
    public void removePatient(int index);
    public void addPatient(int index, Object patient);
    public String printPatients();
}

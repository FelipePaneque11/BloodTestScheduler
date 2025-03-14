package ca2dsa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 * @author Felipe Paneque
 * student number 23156635
 * 14/03/2025
 */
public interface PQInterface {
    public void addPatient(int priority, String name,int age, String gpDetails, String ward, boolean haveAttended);
    public int size();
    public boolean isEmpty();
    public Object removePatient();
    public Object nextPatient();
    public String printPatients();

}

package ca2dsa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author paneq
 */
public interface PQInterface {
    public void enqueue(int priority, String name,int age, String gpDetails, String ward, boolean haveAttended);
    public int size();
    public boolean isEmpty();
    public Object dequeue();
    public String printPQueue();

}

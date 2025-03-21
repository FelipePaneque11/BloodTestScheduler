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
public interface QueueInterface {
    public boolean isEmpty();
    public int size();
    public Object peek();
    public void enqueue(Object patient);
    public Object dequeue();
}

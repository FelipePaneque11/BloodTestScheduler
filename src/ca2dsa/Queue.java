/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2dsa;

import java.util.ArrayList;

/**
 * @author Felipe Paneque
 * student number 23156635
 * 14/03/2025
 */
public class Queue implements QueueInterface{
     private ArrayList<Object> queue;
    
    public Queue(){
        queue = new ArrayList<>();
    }
    
    @Override
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    @Override
    public int size(){
        return queue.size();
    }
    
    @Override
    public Object peek(){
        if(queue.size() > 0){
            return queue.get(0);
        }else {
            return null;
        }
    }
    
    @Override
    public void enqueue(Object patient){
        if(queue.size() > 4){
            dequeue();
        } 
        queue.add((Object)patient);
    }
    
    @Override
    public Object dequeue(){
        if(!queue.isEmpty()){
            return queue.remove(0);
        }else{
            return null;
        }
    }

    @Override
    public String toString() {
        return queue + "\n";
    }
}

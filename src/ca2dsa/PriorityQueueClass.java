/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2dsa;

import java.util.ArrayList;

/**
 *
 * @author paneq
 */
public class PriorityQueueClass implements PQInterface{
    private ArrayList<PQElement> thePQueue; //declare our priority Q arraylist
    
    public PriorityQueueClass() {
        thePQueue = new ArrayList<>();    //create our priority Q arraylist
    } 
    
    @Override
    public boolean isEmpty() { 
        return thePQueue.isEmpty(); 
    }
    
    @Override
    public int size(){
        return thePQueue.size();
    }
    
    private int findInsertPosition(int newkey){  
        PQElement temp; //create a temp elem to hold the item we find so we can see its key
        
        int currPosition = 0; //declare here as this is what we will send back
        for (currPosition = 0; currPosition < thePQueue.size(); currPosition++) {
            temp = thePQueue.get(currPosition); //store the elem at the current position into temp 
            if(temp.getPriorityInt()< newkey){  //compare the priority's
                break; //if less then quit as you have it, gets returned below
            }
        }
         return currPosition;
    }
    
    @Override
    public void addPatient(int priorityKey, String name, int age, String gpDetails, String ward, boolean haveAttended){
        //create an instance of PQElement to be added to q from incoming data 
        PQElement temp = new PQElement(priorityKey, name, age, gpDetails, ward, haveAttended);
        //use method to get the index the elem is to be added
        int index = findInsertPosition(priorityKey);
        if (index > size())
            thePQueue.add(temp);
        else
            thePQueue.add(index, temp);
    }

    @Override
    public Object removePatient(){
       return thePQueue.remove(0);
    }
    
    @Override
    public String printPatients(){
        PQElement temp;
        String txt = new String();
        for (int i = 0; i<thePQueue.size(); i++){
            temp = thePQueue.get(i);
            txt = txt.concat("Priority = "+temp.getPriority()+" | Name= "+temp.getName()+ " | GP details: " + temp.getGpDetails() + " | Comming from other ward ?: " + temp.getWard() + "\n");            
        }
         return txt;
    }
    
        public String haveAttended(){
        PQElement temp;
        String txt = new String();
            for (int i = 0; i<thePQueue.size(); i++){
                temp = thePQueue.get(i);
                if(temp.isHaveAttended() == false){
                txt = txt.concat("Priority = "+temp.getPriority()+" | Name= "+temp.getName()+ " | " + "\n");            
            }
        }
         return txt;
    }
        
        public PQElement nextPatient(){
            return thePQueue.get(0);
        }

}

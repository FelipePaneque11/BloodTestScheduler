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
public class PriorityQueueClass implements PQInterface{
    private ArrayList<Patient> thePQueue; //declare our PriorityQueue arraylist
    
    public PriorityQueueClass() {
        thePQueue = new ArrayList<>();    //create our PriorityQueue arraylist
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
        Patient temp; //create a temp patient to hold the item we find so we can see its key
        
        int currPosition = 0; //declare here as this is what we will send back
        for (currPosition = 0; currPosition < thePQueue.size(); currPosition++) {
            temp = thePQueue.get(currPosition); //store the patient at the current position into temp 
            if(temp.getPriorityInt()< newkey){  //compare the priority's
                break; //if less then quit as you have it, gets returned below
            }
        }
         return currPosition;
    }
    
    @Override
    public void addPatient(int priorityKey, String name, int age, String gpDetails, String ward, boolean haveAttended){
        //create an instance of Patient to be added to q from incoming data 
        Patient temp = new Patient(priorityKey, name, age, gpDetails, ward, haveAttended);
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
    public String printPatients() {
        return printPatientsRecursively(0);
    }

    public String printPatientsRecursively(int index) {
        if (index >= thePQueue.size()) {
            return "";  // Base case: if we've reached the end of the list, return an empty string
        }

        // Get the current patient and create the output for this patient
        Patient temp = thePQueue.get(index);
        String currentDetails = "Priority = " + temp.getPriority() + " | Name= " + temp.getName()
                + " | GP details: " + temp.getGpDetails()
                + " | Coming from other ward ?: " + temp.getWard() + "\n";

        // Recursive call for the next patient
        return currentDetails + printPatientsRecursively(index + 1);
    }
    
    public String haveAttended(){
        Patient temp;
        String txt = new String();
            for (int i = 0; i<thePQueue.size(); i++){
                temp = thePQueue.get(i);
                if(temp.isHaveAttended() == false){
                txt = txt.concat("Priority = "+temp.getPriority()+" | Name= "+temp.getName()+ " | " + "\n");            
            }
        }
         return txt;
    }
        
        public Patient nextPatient(){
            return thePQueue.get(0);
        }

}

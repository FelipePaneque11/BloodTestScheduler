/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2dsa;

/**
 *
 * @author paneq
 */
public class Patient {
    private int priority, age;
    private String name, gpDetails, ward;
    private boolean haveAttended;

    public Patient() {
    }

    
    public Patient(int priority, String name,int age, String gpDetails, String ward, boolean haveAttended) {
        this.priority = priority;
        this.name = name;
        this.age = age;
        this.gpDetails = gpDetails;
        this.ward = ward;
        this.haveAttended = haveAttended;
    }

    public String getPriority() {
        if (priority >= 0 && priority <= 4) {
            return "Low";
        } else if (priority >= 5 && priority <= 8) {
            return "Medium";
        } else if (priority >= 9 && priority <= 10) {
            return "Urgent";
        } else if (priority < 0) {
            return "Invalid";
        }
        return "Invalid"; // Default case
    }
    

    public int getPriorityInt(){
        return priority;
    }
    
    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGpDetails() {
        return gpDetails;
    }

    public void setGpDetails(String gpDetails) {
        this.gpDetails = gpDetails;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String didPatientAttended() {
        if(haveAttended){
            return "YES";
        } else {
            return "NO";
        }
    }

    public void setHaveAttended(boolean haveAttended) {
        this.haveAttended = haveAttended;
    }
    
    @Override
    public String toString() {
        return "Priority=" + priority + ", age=" + age + ", name=" + name + ", gpDetails=" + gpDetails + ", Comming from other ward ?: " + ward + "\n";
    }
    
    public String getBriefDetails() {
    return "Name: " + name + ", Age: " + age + ",Comming from another ward: " + ward;
}

    public boolean isHaveAttended() {
        return haveAttended;
    }
    
}

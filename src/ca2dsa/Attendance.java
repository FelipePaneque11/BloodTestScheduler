/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2dsa;

/**
 *
 * @author paneq
 */
public class Attendance {
    private boolean haveAttended;

    public Attendance(boolean haveAttended) {
        this.haveAttended = haveAttended;
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
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminlogin.car;

/**
 *
 * @author micro
 */
public class Adminbeam {
    private String emailid;
    private String password;

    public Adminbeam() {
    }

    public Adminbeam(String emailid, String password) {
        this.emailid = emailid;
        this.password = password;
    }

    /**
     * @return the emailid
     */
    public String getEmailid() {
        return emailid;
    }

    /**
     * @param emailid the emailid to set
     */
    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}

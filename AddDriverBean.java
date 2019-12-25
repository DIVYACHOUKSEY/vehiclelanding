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
public class AddDriverBean {
    
    private String drivername;
    private long contactno;
    private String emailid;
    private String address;
    private String licence;
    private String workingexperience;

    /**
     * @return the drivername
     */
    public String getDrivername() {
        return drivername;
    }

    /**
     * @param drivername the drivername to set
     */
    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    /**
     * @return the contactno
     */
    public long getContactno() {
        return contactno;
    }

    /**
     * @param contactno the contactno to set
     */
    public void setContactno(long contactno) {
        this.contactno = contactno;
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the licence
     */
    public String getLicence() {
        return licence;
    }

    /**
     * @param licence the licence to set
     */
    public void setLicence(String licence) {
        this.licence = licence;
    }

    /**
     * @return the workingexperience
     */
    public String getWorkingexperience() {
        return workingexperience;
    }

    /**
     * @param workingexperience the workingexperience to set
     */
    public void setWorkingexperience(String workingexperience) {
        this.workingexperience = workingexperience;
    }

    public AddDriverBean() {
    }

    public AddDriverBean(String drivername, long contactno, String emailid, String address, String licence, String workingexperience) {
        this.drivername = drivername;
        this.contactno = contactno;
        this.emailid = emailid;
        this.address = address;
        this.licence = licence;
        this.workingexperience = workingexperience;
    }
    
    
    
    
    
}

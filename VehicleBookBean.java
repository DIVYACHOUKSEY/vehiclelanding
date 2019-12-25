/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminlogin.car;

import carlanding.car.*;

/**
 *
 * @author micro
 */
public class VehicleBookBean {
    private  String vehiclecategory;
    private  Long dateto;
    private  Long datefrom;
    private String username;
    private Long mobileno;
    private String emailid;
    private String locationpickup;
    private String  locationdrop;
    private String bookingdate;
    private String bookamount;

    public VehicleBookBean() {
    }

    public VehicleBookBean(String vehiclecategory, Long dateto, Long datefrom, String username, Long mobileno, String emailid, String locationpickup, String locationdrop, String bookingdate, String bookamount) {
        this.vehiclecategory = vehiclecategory;
        this.dateto = dateto;
        this.datefrom = datefrom;
        this.username = username;
        this.mobileno = mobileno;
        this.emailid = emailid;
        this.locationpickup = locationpickup;
        this.locationdrop = locationdrop;
        this.bookingdate = bookingdate;
        this.bookamount = bookamount;
    }

    /**
     * @return the vehiclecategory
     */
    public String getVehiclecategory() {
        return vehiclecategory;
    }

    /**
     * @param vehiclecategory the vehiclecategory to set
     */
    public void setVehiclecategory(String vehiclecategory) {
        this.vehiclecategory = vehiclecategory;
    }

    /**
     * @return the dateto
     */
    public Long getDateto() {
        return dateto;
    }

    /**
     * @param dateto the dateto to set
     */
    public void setDateto(Long dateto) {
        this.dateto = dateto;
    }

    /**
     * @return the datefrom
     */
    public Long getDatefrom() {
        return datefrom;
    }

    /**
     * @param datefrom the datefrom to set
     */
    public void setDatefrom(Long datefrom) {
        this.datefrom = datefrom;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the mobileno
     */
    public Long getMobileno() {
        return mobileno;
    }

    /**
     * @param mobileno the mobileno to set
     */
    public void setMobileno(Long mobileno) {
        this.mobileno = mobileno;
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
     * @return the locationpickup
     */
    public String getLocationpickup() {
        return locationpickup;
    }

    /**
     * @param locationpickup the locationpickup to set
     */
    public void setLocationpickup(String locationpickup) {
        this.locationpickup = locationpickup;
    }

    /**
     * @return the locationdrop
     */
    public String getLocationdrop() {
        return locationdrop;
    }

    /**
     * @param locationdrop the locationdrop to set
     */
    public void setLocationdrop(String locationdrop) {
        this.locationdrop = locationdrop;
    }

    /**
     * @return the bookingdate
     */
    public String getBookingdate() {
        return bookingdate;
    }

    /**
     * @param bookingdate the bookingdate to set
     */
    public void setBookingdate(String bookingdate) {
        this.bookingdate = bookingdate;
    }

    /**
     * @return the bookamount
     */
    public String getBookamount() {
        return bookamount;
    }

    /**
     * @param bookamount the bookamount to set
     */
    public void setBookamount(String bookamount) {
        this.bookamount = bookamount;
    }

    

}

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
public class AddCarBean {
     private  Long carno;
     private  String carmodel;
    private  String carvalidity;
    private String caraverage;
    private String carcolor;

    public AddCarBean() {
    }

    public AddCarBean(Long carno, String carmodel, String carvalidity, String caraverage, String carcolor) {
        this.carno = carno;
        this.carmodel = carmodel;
        this.carvalidity = carvalidity;
        this.caraverage = caraverage;
        this.carcolor = carcolor;
    }

    /**
     * @return the carno
     */
    public Long getCarno() {
        return carno;
    }

    /**
     * @param carno the carno to set
     */
    public void setCarno(Long carno) {
        this.carno = carno;
    }

    /**
     * @return the carmodel
     */
    public String getCarmodel() {
        return carmodel;
    }

    /**
     * @param carmodel the carmodel to set
     */
    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    /**
     * @return the carvalidity
     */
    public String getCarvalidity() {
        return carvalidity;
    }

    /**
     * @param carvalidity the carvalidity to set
     */
    public void setCarvalidity(String carvalidity) {
        this.carvalidity = carvalidity;
    }

    /**
     * @return the caraverage
     */
    public String getCaraverage() {
        return caraverage;
    }

    /**
     * @param caraverage the caraverage to set
     */
    public void setCaraverage(String caraverage) {
        this.caraverage = caraverage;
    }

    /**
     * @return the carcolor
     */
    public String getCarcolor() {
        return carcolor;
    }

    /**
     * @param carcolor the carcolor to set
     */
    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

  
    
}

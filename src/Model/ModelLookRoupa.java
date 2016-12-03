/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author internet
 */
public class ModelLookRoupa {
    
    private int id;
    private int fk_look;
    private int fk_roupa;   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFk_look() {
        return fk_look;
    }

    public void setFk_look(int fk_look) {
        this.fk_look = fk_look;
    }

    public int getFk_roupa() {
        return fk_roupa;
    }

    public void setFk_roupa(int fk_roupa) {
        this.fk_roupa = fk_roupa;
    }   
}

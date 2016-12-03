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
public class ModelLook {
    
    private int id;
    private int fk_clima;
    private int fk_evento;
    private int fk_local;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFk_clima() {
        return fk_clima;
    }

    public void setFk_clima(int fk_clima) {
        this.fk_clima = fk_clima;
    }

    public int getFk_evento() {
        return fk_evento;
    }

    public void setFk_evento(int fk_evento) {
        this.fk_evento = fk_evento;
    }

    public int getFk_local() {
        return fk_local;
    }

    public void setFk_local(int fk_local) {
        this.fk_local = fk_local;
    }
}

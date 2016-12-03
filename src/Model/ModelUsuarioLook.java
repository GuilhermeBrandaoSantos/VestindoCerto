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
public class ModelUsuarioLook {
    
    private int id;
    private int fk_usuario;
    private int fk_look;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFk_usuario() {
        return fk_usuario;
    }

    public void setFk_usuario(int fk_usuario) {
        this.fk_usuario = fk_usuario;
    }

    public int getFk_look() {
        return fk_look;
    }

    public void setFk_look(int fk_look) {
        this.fk_look = fk_look;
    }   
}

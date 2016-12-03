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
public class ModelUsuarioRoupa {
    
    private int id;
    private int fk_roupa;
    private int fk_usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFk_roupa() {
        return fk_roupa;
    }

    public void setFk_roupa(int fk_roupa) {
        this.fk_roupa = fk_roupa;
    }

    public int getFk_usuario() {
        return fk_usuario;
    }

    public void setFk_usuario(int fk_usuario) {
        this.fk_usuario = fk_usuario;
    }
    
    
}

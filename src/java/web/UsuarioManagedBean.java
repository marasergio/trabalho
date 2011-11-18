/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import persistencia.entidades.Usuario;


/**
 *
 * @author Mara-Netbook
 */
@ManagedBean(name="usuarioBean")
@SessionScoped
public class UsuarioManagedBean {
    private Usuario usuario;
    private List<Usuario> usuarios = new ArrayList<Usuario>();
    
    public UsuarioManagedBean(){
        usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public String salvar (){
        usuarios.add(usuario);
        usuario = new Usuario();
        return "usuario_salvo";
    }

}

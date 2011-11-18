/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.entidades;

import javax.persistence.*;

/**
 *
 * @author Mara-Netbook
 */
@Entity
@Table(name="tb_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="usu_id")
    private Long id;
    @Column(name="usu_nome")
    private String nome;
    @Column(name="usu_email")
    private String email;
    private String senha;
    
    public Usuario(){}

    
}

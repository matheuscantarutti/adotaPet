/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.vianna.aula.jsf.dao;

import br.vianna.aula.jsf.model.Usuario;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Matheus
 */
@Component
public class UsuarioDao {
    
    @Autowired
    private EntityManager con;
    
    public Usuario save(Usuario u){
        con.persist(u);
        
        return u;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.vianna.aula.jsf.mb;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author Matheus
 */
@Component
@SessionScoped

public class LoginMB implements Serializable {
    private String nome;
    private String senha;
    private String erro;
    private Boolean logged;

    public LoginMB() {
        logged = false;
        erro = "";
    }
    
    public String verificaSenha(){
        if(nome.equals("admin") && senha.equals("123")){
            logged = true;
            return "index";
        } else{
            erro = "Credenciais inválidas!";
            nome="";
            senha="";
            return "";
        }
    }
    
    public String logout (){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "index";
    }

    public Boolean getLogged() {
        return logged;
    }

    public void setLogged(Boolean logged) {
        this.logged = logged;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }
    
    
    
    
}

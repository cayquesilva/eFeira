/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eFeira;

/**
 *
 * @author Lab-NTM-01
 */
public class Administrador implements Autenticavel{
    private int senha;
    
    
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    @Override
    public boolean autentica(int senha) {
       if(this.senha == senha){
            System.out.println("Acesso Permitido!");
            return true;
        }else{
            System.out.println("Acesso Negado!");
            return false;
        }
    }
    
    
}

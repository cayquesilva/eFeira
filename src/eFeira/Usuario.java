/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eFeira;

import java.util.InputMismatchException;

/**
 *
 * @author Lab-NTM-01
 */
public class Usuario {
    private String nome,cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
            
    
    public boolean validaCpf(String cpf){
       try{ if(cpf==null){
            return false;
        }else{
            String cpfNovo="";
            this.cpf=cpf;
            if(verTamanho(this.cpf)){
                return false;
            }
            if(verIguais(this.cpf)){
                return false;
            }
            cpfNovo = this.cpf.substring(0, 9);
            cpfNovo = cpfNovo.concat(calculoDigito(cpfNovo));
            cpfNovo = cpfNovo.concat(calculoDigito(cpfNovo));
            if(!cpfNovo.equals(this.cpf)){
                return false;
            }return true;
        }
       }
       catch(InputMismatchException erro){
           return false;
       }
    }
    
    private boolean verIguais(String cpf){
        char[] charCpf = cpf.toCharArray();
        char primDigito=cpf.charAt(0);
        for(char c:charCpf){
            if(c!=primDigito){
                return false;
            }
        }
        return true;  
    }
    
    private String calculoDigito(String cpf){
        int dGerado = 0;
        int mult = cpf.length()+1;
        char[] charCpf = cpf.toCharArray();
        for(int i=0;i<cpf.length();i++){
            dGerado+=(charCpf[i]-48)*mult--;
        }
        if(dGerado % 11 < 2){
            dGerado = 0;
        }else{
            dGerado = 11 - dGerado % 11;
        }
        return String.valueOf(dGerado);
    }
    
    private boolean verTamanho(String cpf){
        if(cpf.length()!=11){
            return true;
        }return false;
    }

            
            
}

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
public class ClasseTeste {
    public static void main(String[] args){
        int opcao;
        Menu m = new Menu();
        switch(opcao=m.chamaMenu()){
            case 1:
                m.menuVendas();
                break;
                
            case 2:
                m.menuGerente();
                break;
        }
        
        
        
    }
}

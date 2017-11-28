/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import eFeira.Produto;

/**
 *
 * @author Cayque
 */
public class ConProduto {
    private static Produto[] produto = new Produto[10];
    private static int i=0;
    
    public static Produto[] getProduto() {
        return produto;
    }

    public static void setProduto(Produto produto) {
        ConProduto.produto[i]=produto;
        i++;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import eFeira.Produto;
import java.util.ArrayList;

/**
 *
 * @author Cayque
 */
public class ConProduto {
    private static ArrayList<Produto> produto = new ArrayList<Produto>();


    public static ArrayList<Produto> getProduto() {
        return produto;
    }

    public static void setProduto(Produto produto) {
        ConProduto.produto.add(produto);
    }
    
    
    
}

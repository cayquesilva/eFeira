/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eFeira;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lab-NTM-01
 */
public class Estoque {
    static ArrayList<Produto> produto = new ArrayList();
    private static int i=0;
    private static Scanner s = new Scanner(System.in);

    public static ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        Estoque.produto = produto;
    }

    public static void cadastraProduto(Produto produto){
        Estoque.produto.add(i, produto);
        System.out.println("Digite o nome do produto: ");
        Estoque.produto.get(i).setNome(s.nextLine());
        System.out.println("Digite o codigo do produto: ");
        Estoque.produto.get(i).setCogigo(s.nextInt());
        System.out.println("Digite o preço do produto: ");
        Estoque.produto.get(i).setPreçoEntrada(s.nextDouble());
        System.out.println("Digite a quantidade de produtos desse tipo: ");
        Estoque.produto.get(i).setQuantidade(s.nextInt());
        s.nextLine();
        i++;
    }
        
    public static int getProdutoSelecao() { // lista os estadios para posterior seleção
        if(Estoque.i>0){
            for (int j = 0;j<Estoque.i;j++){
                System.out.println("Digite "+j+" para editar a quantidade de: "+Estoque.produto.get(j).getNome());
                }
                return 1;
        }else{
            System.out.println("Não existem produtos cadastrados!");
            return 0;
        }
    }
    
    public static void delProduto(int i){
        for(int j =i;j<Estoque.produto.size();j++){
            Estoque.produto.set(j, Estoque.produto.get(j+1));
        }
        s.nextLine();
    }
    
    public static int getProdutoSelecao2() { // lista os estadios para posterior seleção
        if(Estoque.i>0){
            for (int j = 0;j<Estoque.i;j++){
                System.out.println("Digite "+j+" para remover o item: "+Estoque.produto.get(j).getNome());
                }
                return 1;
        }else{
            System.out.println("Não existem produtos cadastrados!");
            return 0;
        }
    }
    
    
    
}


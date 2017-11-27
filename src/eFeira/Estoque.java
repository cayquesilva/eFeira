/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eFeira;

import java.util.Scanner;

/**
 *
 * @author Lab-NTM-01
 */
public class Estoque {
    private static Produto[] produto;
    private static int i=0;
    Scanner s = new Scanner(System.in);

    public Produto[] getProduto() {
        return produto;
    }

    public void setProduto(Produto[] produto) {
        Estoque.produto = produto;
    }

    public void CadastraProduto(Produto produto){
        if(i==0){
            Estoque.produto[i] = produto;
            System.out.println("Digite o nome do produto: ");
            Estoque.produto[i].setNome(s.nextLine());
            System.out.println("Digite o codigo do produto: ");
            Estoque.produto[i].setCogigo(s.nextInt());
            System.out.println("Digite o preço do produto: ");
            Estoque.produto[i].setPreço(s.nextDouble());
            System.out.println("Digite a quantidade de produtos desse tipo: ");
            Estoque.produto[i].setQuantidade(s.nextInt());
            s.nextLine();
            i++;
        }else{
            for(int j=0;j<this.getProduto().length;j++){
                if(Estoque.produto[j].getCodigo()== produto.getCodigo()){
                    Estoque.produto[j].setQuantidade(+s.nextInt());
                }else{
                    Estoque.produto[i] = produto;
                    System.out.println("Digite o nome do produto: ");
                    Estoque.produto[i].setNome(s.nextLine());
                    System.out.println("Digite o codigo do produto: ");
                    Estoque.produto[i].setCogigo(s.nextInt());
                    System.out.println("Digite o preço do produto: ");
                    Estoque.produto[i].setPreço(s.nextDouble());
                    System.out.println("Digite a quantidade de produtos desse tipo: ");
                    Estoque.produto[i].setQuantidade(s.nextInt());
                    s.nextLine();
                    i++;
                }
            }
        }
        
    }

 
    
    
}

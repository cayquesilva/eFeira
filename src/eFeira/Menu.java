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
public class Menu {
    private int op=0,aux=0;
    private Scanner s = new Scanner(System.in);
    
    public void chamaMenu(){
        do{
//            menuLimpaTela();
            System.out.println("|-------------------------------------|");
            System.out.println("|                                     |");
            System.out.println("|------   Bem vindo ao eFeira    -----|");
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            System.out.println("|                                     |");
            System.out.println("|       Digite a opção desejada!      |");
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            System.out.println("|                                     |");
            System.out.println("|       [1] Ver menu de vendas        |");
            System.out.println("|       [2] Administrar estoque       |");
            System.out.println("|       [0] Sair                      |");
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            op=s.nextInt();
            s.nextLine();
            switch(op){
            case 1:
                menuVendas();
                break;
                
            case 2:
                menuGerente();
                break;
                
            case 0:
                break;
                
        }
            //menuLimpaTela();
        }while(op!=0);
    }
    
    public void menuVendas(){
            System.out.println("|-------------------------------------|");
            System.out.println("|                                     |");
            System.out.println("|------   Bem vindo ao eFeira    -----|");
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            System.out.println("|                                     |");
            System.out.println("|            Menu de vendas           |");
            System.out.println("|       Digite a opção desejada!      |");
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            System.out.println("|                                     |");
            System.out.println("|       [1] Comprar produtos          |");
            System.out.println("|       [2] Finalizar compra          |");
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            aux=s.nextInt();
            s.nextLine();
        switch(aux){
            case 1:
                System.out.println(Estoque.getProduto());
                System.out.println("|--- Deseja continuar no menu de vendas ? |");
                System.out.println("|             [1] Sim                     |");
                System.out.println("|             [2] Não                     |");
                System.out.println("|-----------------------------------------|");
                op=s.nextInt();
                s.nextLine();
                menuLimpaTela();
                if(op==1){
                    menuVendas();
                }
                break;
            
            case 2:
                
                break;
                
        }

    }
    
    public void menuGerente(){
            System.out.println("|-------------------------------------|");
            System.out.println("|                                     |");
            System.out.println("|------   Bem vindo ao eFeira    -----|");
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            System.out.println("|                                     |");
            System.out.println("|          Adminstrar estoque         |");
            System.out.println("|       Digite a opção desejada!      |");
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            System.out.println("|                                     |");
            System.out.println("|       [1] Organizar estoque         |");
            System.out.println("|       [2] Ver rendimento atual      |");
            System.out.println("|       [3] Voltar a tela inicial     |");
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            aux=s.nextInt();
            s.nextLine();
        switch(aux){
            case 1:
                menuEstoque();
                break;
            
            case 2:
                
                break;
            
            case 3:
                chamaMenu();
                break;
        }

    }
    
    public void menuEstoque(){
            System.out.println("|-------------------------------------|");
            System.out.println("|                                     |");
            System.out.println("|------   Bem vindo ao eFeira    -----|");
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            System.out.println("|                                     |");
            System.out.println("|          Organizar estoque          |");
            System.out.println("|       Digite a opção desejada!      |");
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            System.out.println("|                                     |");
            System.out.println("|       [1] Adicionar produtos        |");
            System.out.println("|       [2] Remover produtos          |");
            System.out.println("|       [3] Editar produtos           |");
            System.out.println("|       [4] Voltar para o início      |");
            System.out.println("|-------------------------------------|");
            aux=s.nextInt();
            s.nextLine();
        switch(aux){
            case 1:
                Estoque.cadastraProduto(new Produto());
                System.out.println("|--- Deseja continuar no menu de estoque? |");
                System.out.println("|             [1] Sim                     |");
                System.out.println("|             [2] Não                     |");
                System.out.println("|-----------------------------------------|");
                op=s.nextInt();
                s.nextLine();
                menuLimpaTela();
                if(op==1){
                    menuEstoque();
                }
                break;
            
            case 2:
                if(Estoque.getProdutoSelecao2()==1){
                    Estoque.delProduto(s.nextInt());
                    System.out.println("|--- Deseja continuar no menu de estoque? |");
                    System.out.println("|             [1] Sim                     |");
                    System.out.println("|             [2] Não                     |");
                    System.out.println("|-----------------------------------------|");
                    op=s.nextInt();
                    s.nextLine();
                    menuLimpaTela();
                    if(op==1){
                        menuEstoque();
                    }
                }else{
                    System.out.println("|--- Deseja continuar no menu de estoque? |");
                    System.out.println("|             [1] Sim                     |");
                    System.out.println("|             [2] Não                     |");
                    System.out.println("|-----------------------------------------|");
                    op=s.nextInt();
                    s.nextLine();
                    menuLimpaTela();
                    if(op==1){
                        menuEstoque();
                    }
                    break;
                }
                break;
            
            case 3:
                if(Estoque.getProdutoSelecao()==1){
                    atualizaQuant(s.nextInt());
                    System.out.println("|--- Deseja continuar no menu de estoque? |");
                    System.out.println("|             [1] Sim                     |");
                    System.out.println("|             [2] Não                     |");
                    System.out.println("|-----------------------------------------|");
                    op=s.nextInt();
                    s.nextLine();
                    menuLimpaTela();
                    if(op==1){
                        menuEstoque();
                    }
                }else{
                    System.out.println("|--- Deseja continuar no menu de estoque? |");
                    System.out.println("|             [1] Sim                     |");
                    System.out.println("|             [2] Não                     |");
                    System.out.println("|-----------------------------------------|");
                    op=s.nextInt();
                    s.nextLine();
                    menuLimpaTela();
                    if(op==1){
                        menuEstoque();
                    }
                    break;
                }
            case 4:
                chamaMenu();
                break;
        }
    }
    
    public void atualizaQuant(int i){
        s.nextLine();
        System.out.println("|--- Deseja realizar que ação para o item selecionado? |");
        System.out.println("|             [1] Adicionar                            |");
        System.out.println("|             [2] Remover                              |");
        System.out.println("|------------------------------------------------------|");
        op=s.nextInt();
        s.nextLine();
        if(op==1){
            System.out.println("Digite a quantidade de "+Estoque.produto.get(i).getNome()+" que você deseja adicionar: ");
            Estoque.produto.get(i).setQuantidade(Estoque.produto.get(i).getQuantidade()+s.nextInt());
            s.nextLine();
        }else{
            System.out.println("Digite a quantidade de "+Estoque.produto.get(i).getNome()+" que você deseja remover: ");
            Estoque.produto.get(i).setQuantidade(Estoque.produto.get(i).getQuantidade()-s.nextInt());
            s.nextLine();
        }
    }
    
    
    public void menuLimpaTela(){
        for(int i=0;i<5;i++){
            System.out.println("\n");
        }
    }
    
    
    
}

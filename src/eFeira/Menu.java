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
    
    public int chamaMenu(){
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
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            op=s.nextInt();
            s.nextLine();
            //menuLimpaTela();
            return op;
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
            System.out.println("|       [1] Ver produtos a venda      |");
            System.out.println("|       [2] Administrar estoque       |");
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            aux=s.nextInt();
            s.nextLine();
        switch(aux){
            case 1:
                
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
            System.out.println("|                                     |");
            System.out.println("|-------------------------------------|");
            aux=s.nextInt();
            s.nextLine();
        switch(aux){
            case 1:
                System.out.println("Digite a referência do produto");
                s.nextLine();
                break;
            
            case 2:
                
                break;
            
            case 3:
                chamaMenu();
                break;
                
        }

    }
    
    public void menuLimpaTela(){
        for(int i=0;i<5;i++){
            System.out.println("\n");
        }
    }
    
    
    
}

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
public class Produto {
    private String nome;
    private double preçoEntrada=0,preçoSaida=0;
    private int quantidade,tipo,codigo; //1 unidade / 2 Quilos

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreçoEntrada() {
        return preçoEntrada;
    }

    public void setPreçoEntrada(double preço) {
        this.preçoEntrada = preço;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCogigo(int codigo){
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreçoSaida() {
        return preçoSaida;
    }

    public void setPreçoSaida(double preçoSaida) {
        this.preçoSaida = preçoSaida;
    }
    
     @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preço de compra=" + preçoEntrada + ", quantidade=" + quantidade + ", tipo=" + tipo + ", codigo=" + codigo + '}';
    }
}

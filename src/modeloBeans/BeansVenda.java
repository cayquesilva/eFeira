/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

/**
 *
 * @author Cayque
 */
public class BeansVenda {
    private double subTotal;
    private int id_produto;
    private int id_cliente;
    private int quant_produto;
    private int Auxiliar;
    private int id_venda;
    private double valorTotal;
    
    
    

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }


    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getAuxiliar() {
        return Auxiliar;
    }

    public void setAuxiliar(int Auxiliar) {
        this.Auxiliar = Auxiliar;
    }

    public int getQuant_produto() {
        return quant_produto;
    }

    public void setQuant_produto(int quant_produto) {
        this.quant_produto = quant_produto;
    }

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}

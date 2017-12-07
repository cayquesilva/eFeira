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
    private int Auxiliar;

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
    
}

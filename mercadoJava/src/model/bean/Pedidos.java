/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Senai
 */
public class Pedidos {
    private int idPedido;
    private String produto;
    private int quantidade;
    private float preco;
    private float total;

    public Pedidos() {
    }

    public Pedidos(int idPedido, String produto, int quantidade, float preco, float total) {
        this.idPedido = idPedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.total = total;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public float getTotal() {
        return total;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
}

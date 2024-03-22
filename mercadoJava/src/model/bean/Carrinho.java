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
public class Carrinho {
   private int idCompra;
   private String produto;
   private int quantidade;
   private float preco;
   private int idCliente;
   private float total;

    public Carrinho() {
    }

    public Carrinho(int idCompra, String produto, int quantidade, float preco, int idCliente, float total) {
        this.idCompra = idCompra;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.idCliente = idCliente;
        this.total = total;
    }

    public int getIdCompra() {
        return idCompra;
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

    public int getIdCliente() {
        return idCliente;
    }

    public float getTotal() {
        return total;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
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

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setTotal(float total) {
        this.total = total;
    }
   
   
}

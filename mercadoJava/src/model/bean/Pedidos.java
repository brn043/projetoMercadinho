/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.sql.Date;

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
    private Date data;
    private int idCliente;

    public Pedidos() {
    }

    public Pedidos(int idPedido, String produto, int quantidade, float preco, float total, Date data, int idCliente) {
        this.idPedido = idPedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.total = total;
        this.data = data;
        this.idCliente = idCliente;
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

    public Date getData() {
        return data;
    }

    public int getIdCliente() {
        return idCliente;
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

    public void setData(Date data) {
        this.data = data;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
}

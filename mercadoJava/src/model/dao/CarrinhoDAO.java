/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.bean.Carrinho;

/**
 *
 * @author Senai
 */
public class CarrinhoDAO {

    public void adicionarAoCarrinho(Carrinho carrinho) {

        try {
            Connection conexao = (Connection) Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("INSERT INTO compras (produto, quantidade, preço, total, data) VALUES (?,?,?,?,?)");
            stmt.setString(1, carrinho.getProduto());
            stmt.setFloat(2, carrinho.getQuantidade());
            stmt.setFloat(3, carrinho.getPreco());
            stmt.setFloat(4, carrinho.getTotal());
            stmt.setInt(6, carrinho.getIdCliente());
            stmt.executeUpdate();

            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("novo pedido criado");
        }
    }

}

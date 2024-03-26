/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import model.bean.Carrinho;
import model.bean.Usuarios;

/**
 *
 * @author Senai
 */
public class CarrinhoDAO {

    public void adicionarAoCarrinho(Carrinho carrinho) {

        try {
            Connection conexao = (Connection) Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("INSERT INTO carrinho (produto, quantidade, preço, total, idCliente) VALUES (?,?,?,?,?)");
            stmt.setString(1, carrinho.getProduto());
            stmt.setFloat(2, carrinho.getQuantidade());
            stmt.setFloat(3, carrinho.getPreco());
            stmt.setFloat(4, carrinho.getTotal());
            stmt.setInt(5, carrinho.getIdCliente());
            stmt.executeUpdate();

            System.out.println("produto adicionado ao carrinho");

            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void limparCarrinho(Carrinho carrinho) {
        try {
            Connection conexao = (Connection) Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("DELETE FROM carrinho WHERE idCliente = ?");
            stmt.setInt(1, Usuarios.getIdUsuario());
            stmt.executeUpdate();

            System.out.println("carrinho limpo!");

            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.bean.Carrinho;

/**
 *
 * @author Senai
 */
public class CarrinhoDAO {
    
    public List<Carrinho> listarCarrinho() {
        List<Carrinho> cart = new ArrayList();
        try {
            Connection conexao = (Connection) Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM carrinho");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Carrinho car = new Carrinho();
                car.setIdCompra(rs.getInt("idcompra"));
                car.setProduto(rs.getString("produto"));
                car.setQuantidade(rs.getInt("quantidade"));
                car.setPreco(rs.getFloat("preço"));
                car.setTotal(rs.getFloat("total"));
                cart.add(car);
            }
            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cart;
    }

    public void adicionarAoCarrinho(Carrinho carrinho) {

        try {
            Connection conexao = (Connection) Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("INSERT INTO carrinho (produto, quantidade, preço, total) VALUES (?,?,?,?)");
            stmt.setString(1, carrinho.getProduto());
            stmt.setFloat(2, carrinho.getQuantidade());
            stmt.setFloat(3, carrinho.getPreco());
            stmt.setFloat(4, carrinho.getTotal());
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

            stmt = conexao.prepareStatement("DELETE FROM carrinho");
            stmt.executeUpdate();

            System.out.println("carrinho limpo!");

            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

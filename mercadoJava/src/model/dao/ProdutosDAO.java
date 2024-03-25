/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Produtos;

/**
 *
 * @author Senai
 */
public class ProdutosDAO {

    public List<Produtos> listarProdutos() {
        List<Produtos> produtos = new ArrayList<>();

        try (Connection conexao = Conexao.conectar();
                PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM produtos");
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Produtos produto = new Produtos();
                produto.setIdProduto(rs.getInt("idprodutos"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoria(rs.getString("categoria"));
                produtos.add(produto);

            }
            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return produtos;
    }

    public void adicionarProduto(Produtos produto) {

        try {
            Connection conexao = (Connection) Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("INSERT INTO produtos (nome, categoria, preço) VALUES (?,?,?)");
            stmt.setString(1, produto.getNome());
            stmt.setString(1, produto.getCategoria());
            stmt.setDouble(1, produto.getPreco());
            stmt.executeUpdate();

            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Produto adicionado ao estoque!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removerProduto (Produtos produto){
        
            try {
            Connection conexao = (Connection) Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("DELETE FROM produtos WHERE idprodutos = ?");
            stmt.setInt(1, produto.getIdProduto());
            stmt.executeUpdate();

            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Produto removido do estoque!");
        }
        catch (SQLException e

        
            ) {
            e.printStackTrace();
        }
    }
}

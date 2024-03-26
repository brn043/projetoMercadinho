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
import model.bean.Pedidos;
import model.bean.Usuarios;

/**
 *
 * @author Senai
 */
public class PedidosDAO {

    public List<Pedidos> listarPedidos() {
        List<Pedidos> pedidos = new ArrayList<>();
        
        try {
            try (Connection conexao = Conexao.conectar()) {
                PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM pedidos WHERE idcliente = ?");
                stmt.setInt(1, Usuarios.getIdUsuario());
                ResultSet rs = stmt.executeQuery();
                
                while (rs.next()) {
                    Pedidos pedido = new Pedidos();
                    pedido.setProduto(rs.getString("produto"));
                    pedido.setQuantidade(rs.getInt("quantidade"));
                    pedido.setPreco(rs.getFloat("preço"));
                    pedido.setTotal(rs.getFloat("total"));
                    pedido.setData(rs.getDate("data"));
                    pedidos.add(pedido);
                }
                rs.close();
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pedidos;
    }

    public void adicionarPedido(Pedidos pedido) {

        try {
            Connection conexao = (Connection) Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("INSERT INTO pedidos (produto, quantidade, preço, total, data, idcliente) VALUES (?,?,?,?,?,?)");
            stmt.setString(1, pedido.getProduto());
            stmt.setFloat(2, pedido.getQuantidade());
            stmt.setFloat(3, pedido.getPreco());
            stmt.setFloat(4, pedido.getTotal());
            stmt.setDate(5, pedido.getData());
            stmt.setInt(6, Usuarios.getIdUsuario());
            stmt.executeUpdate();

            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("novo pedido criado");
        }
    }

}

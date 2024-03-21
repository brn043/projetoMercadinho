package model.dao;


import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Usuarios;

public class LoginDAO {
 
    public List<Usuarios> read() {
        List<Usuarios> user = new ArrayList();
        try {
            Connection conexao = (Connection) Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM usuarios");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuarios usuario = new Usuarios();
                usuario.setIdUsuario(rs.getInt("idusuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                user.add(usuario);
            }
            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public void create(Usuarios createLogin) {

        try {
            Connection conexao = (Connection) Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("INSERT INTO usuarios (nome, cpf, login, senha) VALUES (?,?,?,?)");
            stmt.setString(1, createLogin.getNome());
            stmt.setString(2, createLogin.getCpf());
            stmt.setString(3, Usuarios.getLogin());
            stmt.setString(4, createLogin.getSenha());
            stmt.executeUpdate();

            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "Usuário criado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Boolean login(String login, String senha) {
        Boolean validar = false;
        try {
            Connection conexao = (Connection) Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM usuarios WHERE login = ? AND senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            if (rs.next()) {
                validar = true;
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return validar;
    }
}

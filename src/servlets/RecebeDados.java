package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Usuario;
import database.OperacaoOcorrencia;

/**
 * Servlet implementation class RecebeDados
 */
@WebServlet("/RecebeDados")
public class RecebeDados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecebeDados() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter imprime = response.getWriter();
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		
		imprime.write(nome);
		imprime.write(email);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter imprime = response.getWriter();
		
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		String email = request.getParameter("email");
		String confirmaSenha = request.getParameter("confirmaSenha");
		
		if (senha.equals(confirmaSenha)) {
			Usuario usuario = new Usuario();
			usuario.setNome(nome);
			usuario.setEmail(email);
			usuario.setSenha(senha);			
			OperacaoOcorrencia op = new OperacaoOcorrencia();
			try {
				op.listaOcorrencias();				
				imprime.write("ok");
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				imprime.write("Erro"+e);
			}
		}else{
			imprime.write("Erro");
			imprime.write(senha);
			imprime.write(confirmaSenha);
		}
		
		
	}

}

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@SuppressWarnings("deprecation")
@ManagedBean
public class UsuarioBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String nomeUsuario;
	private String senhaUsuario;
	private String resultado;
	
	public String logar() {
			this.resultado = "Não Logado";
		if (nomeUsuario.equals("pv") && senhaUsuario.equals("123")) {
			this.resultado = "Logado";
		}
		return resultado;
	}
	
	public void testar() {
		this.senhaUsuario = "oi";
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
}
import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;


@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class ListaBean{
	private String item;
	private ArrayList<String> itens = new ArrayList<String>();
	private String pagina;
	
	
	public String navegar() {
		if ("l".equals(this.pagina)) {
			return "lista?faces-redirect=true";
		}else{
			return "bem-vindo";
		}
	}
	
	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}

	
	public void inserir() {
		this.itens.add(this.item);
	}
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public ArrayList<String> getItens() {
		return itens;
	}
	public void setItens(ArrayList<String> itens) {
		this.itens = itens;
	}
}
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean (name="cliente")
public class Cliente {
	
	String nome;
	int rg;
	int cpf;
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String salvar() {
		return "output.xhtml";
	}
	

}

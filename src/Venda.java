import java.text.DecimalFormat;
import java.util.List;

public class Venda {
	private Integer codigo;
	private List<Produto> itens;
	private Double valor;
	private Double comissaoSistema;
	private Empresa empresa;
	private Cliente cliente;
	private Double comissaoVenda; // Novo atributo para a comissão específica da venda

	public Venda(Integer código, List<Produto> itens, Double valor, Double comissaoSistema, Double comissaoVenda,
			Empresa empresa,
			Cliente cliente) {
		super();
		this.codigo = código;
		this.itens = itens;
		this.valor = valor;
		this.comissaoSistema = comissaoSistema;
		this.empresa = empresa;
		this.cliente = cliente;
		this.comissaoVenda = comissaoVenda;
	}

	public Venda() {
		super();
	}

	public Integer getCodigo() {
		return codigo;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setCódigo(Integer código) {
		this.codigo = código;
	}

	public List<Produto> getItens() {
		return itens;
	}

	public void setItens(List<Produto> itens) {
		this.itens = itens;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getComissaoSistema() {
		return comissaoSistema;
	}

	public void setComissaoSistema(Double comissaoSistema) {
		this.comissaoSistema = comissaoSistema;
	}

	public Double getComissaoVenda() {
		return comissaoVenda;
	}

	public void setComissaoVenda(Double comissaoVenda) {
		this.comissaoVenda = comissaoVenda;
	}

}

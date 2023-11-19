package sistemadevendas;

public class Produto {
	
	private int id;
	private String nome;
	private int qtd;
	private float preco;
	
	public Produto(int id, String nome, int qtd, float preco) {
		this.id = id;
		this.nome = nome;
		this.qtd = qtd;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + "\n" + "NOME: " + nome + "\n" + "QUANTIDADE: " + qtd + "\n" + "PRECO: " + preco;
	}
}

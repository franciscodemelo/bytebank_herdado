package bytebank_herdado;

public  abstract class funcionario {
	
	private String nome;
	private String cpf;
	private double salario;// 1)  usando protected ele protege e ele fica publico so para os filhos 	
	
	public double getBonificacao() {
		return this.salario * 0.05; // 2)foi mudado na class mae para auterar na class filho
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}

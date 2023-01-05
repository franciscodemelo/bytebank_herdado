package bytebank_herdado;

//Gerente é um funcionario, entao ele vai herda a class funcionario
public class Gerente extends funcionario {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

//	public double getBonificacao() {
//		return super.getBonificacao() + salario;  2)aqui foi alterado para nao focar mexendo no codigo
//                                                  3)esse mode que usamos e do protected usando esse metado
//	}
	public double getBonificacao() {
	return super.getBonificacao() + super.getSalario();
	}

}

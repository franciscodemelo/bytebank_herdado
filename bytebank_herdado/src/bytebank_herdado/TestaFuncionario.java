package bytebank_herdado;

public class TestaFuncionario {

	public static void main(String[] args) {
		funcionario francisco = new Gerente();
		francisco.setNome("francsico junior");
		francisco.setCpf("2222222-2");
		francisco.setSalario(2600.00);
		
		System.out.println(francisco.getNome());
		System.out.println(francisco.getCpf());
		System.out.println(francisco.getBonificacao());
	}

}

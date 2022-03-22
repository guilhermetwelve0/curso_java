package guilhermetwelve0.com.github;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			Conta_Principal contaEmp = new ContaBancariaPJ("Bosch", 0.0, "175156", "Pj");
			Conta_Principal contaPessoal = new ContaBancariaPF("Luiz", 100.0, "175656", "Pf");
			Conta_Principal contaRural = new ContaBancariaPR("Rural", 100.0, "168656", "Pr", "Pequeno Porte");
			
			contaRural.Saque(30.0);
			contaRural.detalhes();
	}

}

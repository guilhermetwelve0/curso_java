package guilhermetwelve0.com.github;

	public class ContaBancariaPF extends Conta_Principal {
		public ContaBancariaPF(String nome, Double saldo, String numConta, String tipoConta) {
		super(tipoConta, saldo, tipoConta, tipoConta);
		// TODO Auto-generated constructor stub
	}

	private int qtdeSaque = 0;

	@Override
	public void Saque(Double saque) {
		if(saque > this.getSaldo()) {
			System.out.println("Você não pode sacar mais do que possui!");
			return;
		}if (this.qtdeSaque >= 3){
			double porcentagem = saque * 0.01;
			saque += porcentagem;
			super.Saque(saque);
			return;
		}
		super.Saque(saque);
		this.qtdeSaque++;
	}

	public Double getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double Deposito(double deposito) {
		double porcentagem = deposito * 0.01;
		deposito -= porcentagem;
		return super.Deposito(deposito);
	}
}


public class ContaTerminal {

	public static void main(String[] args) {
		
		
		// Conta Poupança - contém rendimentos ao depositar, simulando 30 dias para receber os rendimentos
		
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.toWithdraw(500);
		savingsAccount.deposit(1000);
		
		
		
		// Conta Corrente - contém limite de crédito para executar saques acima do saldo
		
		//saque - cliente sem limite de crédito
		//CurrentAccount currentAccount = new CurrentAccount(0);
		//currentAccount.toWithdraw(500);
		
		// saque - cliente com limite de 1000
		//CurrentAccount currentAccount = new CurrentAccount(1000);
		//currentAccount.toWithdraw(500);
		

	}

}


import javax.swing.JOptionPane;

public class SavingsAccount extends BankAccount {

	private final double rate = 0.5;
	
	public SavingsAccount()
	{
		super();
		
	}
	
	
	@Override
	void deposit(double depositAmount)
	{	
		double monthlyIncome = (depositAmount / 100) * rate;	// simulação de juros sobre depósito equivalente a 30 dias
		balance = balance + depositAmount + monthlyIncome; 		// saldo atualizado com juros
		double totalDeposit = depositAmount + monthlyIncome;
		
		message = String.format(
				"Depósito com rendimentos %.2f efetuado com sucesso!%n%s%.2f",
				totalDeposit,
				"Saldo atualizado com rendimentos: ", balance);
		JOptionPane.showMessageDialog(null, message);
	}

	@Override
	void toWithdraw(double withdrawAmount)
	{
		if (withdrawAmount <= balance)
		{
			balance = balance - withdrawAmount;
			
			message = String.format("Saque de: %.2f%nSaldo atualizado: %.2f%n",
					withdrawAmount, balance);
			JOptionPane.showMessageDialog(null, message);
		}
		else
		{
			message = String.format("Saldo atualizado de %.2f é insuficiente para concluir o saque de %.2f!%n",
					balance, withdrawAmount);
			JOptionPane.showMessageDialog(null, message);
		}
		
	}
	
	
	
}


import javax.swing.JOptionPane;

public class CurrentAccount extends BankAccount {

	private double limit;

	public CurrentAccount(double limit) {
		super();
		this.limit = limit;
	}

	@Override
	void deposit(double depositAmount) {

		balance += depositAmount;

	}

	@Override
	void toWithdraw(double withdrawAmount) {

		if (withdrawAmount <= balance) {
			message = String.format("Saque de %.2f efetuado com sucesso!%n", withdrawAmount);
			balance = balance - withdrawAmount;
		} else {

			if (withdrawAmount <= balance + limit) {
				balance = withdrawAmount - (balance + limit);

				message = String.format("Saque de %.2f efetuado com limite de %.2f da conta%n", withdrawAmount, limit);

			} else {
				message = String.format("Retirada de %.2f negada. Saldo insuficiente!%n", withdrawAmount);
			}

		}
		message += String.format("Saldo atualizado de: %.2f", balance);
		JOptionPane.showMessageDialog(null, message);

	}

}

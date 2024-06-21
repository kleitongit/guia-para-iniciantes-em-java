
import javax.swing.JOptionPane;

public abstract class BankAccount {
	
	protected int number;
	protected String agency;
	protected String name;
	protected double balance;
	protected String message;
	
	public BankAccount()
	{
		
		//	Account Number
		int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter number account"));
		
		if (accountNumber >= 1 && accountNumber <= 9999)
		{
			number = accountNumber;
		}
		
		
		// Agency Number
		boolean checkPatternAgency = true;

		while (checkPatternAgency)
		{
			String agencyNumber = JOptionPane.showInputDialog("Insert number agency");
			if (agencyNumber.startsWith("0") && agencyNumber.contains("-"))
			{
			agency = agencyNumber;
			checkPatternAgency = false;
			}
		else
		{
			JOptionPane.showMessageDialog(null, "Agência inválida. Use o formato XXX-X para o campo agência!");
			String continueOrAbort = JOptionPane.showInputDialog("Digite c para corrigir ou a para abortar abertura da conta");
			
			switch(continueOrAbort.charAt(0))
			{
				case 'c':
					JOptionPane.showMessageDialog(null, "Atenção! Formato aceito é iniciando com 0 e que contenha ao menos um - \"traço\" ");
				break;
				case 'a':
					checkPatternAgency = false;
					JOptionPane.showMessageDialog(null, "Operação abortada. Sistema finalizado!");
				break;				
			}
		}
		}
		
		
		// Name Client
		String nameClient = JOptionPane.showInputDialog("Enter name client");
		
		if (nameClient.length() >= 2) {
			name = nameClient;
		} else {
			JOptionPane.showMessageDialog(null, "nome não validado");
		}
		
			
		//	Initial Balance
		double initialBalance = Double.parseDouble(JOptionPane.showInputDialog("Insert initial balance: "));
		
		if (initialBalance >= 0)
		{
			this.balance = initialBalance;
		}
		
		String welcome = 
				String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
				name, agency, number, balance);
		JOptionPane.showMessageDialog(null, welcome);
		
	}

	abstract void deposit(double depositAmount);
	abstract void toWithdraw(double amount);
	
	
	

}

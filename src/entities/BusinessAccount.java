package entities;

//extend para passar todos dados da classe Account para BusinessAccount
public class BusinessAccount extends Account{

	private Double loanLimit;
	
	public BusinessAccount() {
		//pode chamar o super() sem argumentos no caso de no futuro ocorrer alguma mudança na construtor Account() padrão
		super();
	}
	public Double getLoanLimit() {
		return loanLimit;
	}
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	public void loan(double amount) {
		if(amount <= loanLimit) {
		balance += amount -10.0;
		}
	}
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance += 2;
	}
}

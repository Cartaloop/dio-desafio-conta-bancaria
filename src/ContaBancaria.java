public class ContaBancaria {
    public int accountNumber;
    public String agency;
    public String userName;
    public double balance;

    public ContaBancaria(int accountNumber, String agency, String userName, double balance) {
        this.accountNumber = accountNumber;
        this.agency = agency;
        this.userName = userName;
        this.balance = balance;
    }



    public void returnAccount(){
        System.out.println("Olá, " + this.userName + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agency + ", conta " + this.accountNumber + " e seu saldo " +
                this.balance + " já está disponível para saque");
    }



}

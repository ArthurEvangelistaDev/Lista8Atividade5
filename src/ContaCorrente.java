class ContaCorrente {

    private String nomeCorentista;
    private double saldo;
    private int numConta;

    public ContaCorrente(String nomeCorentista, int numConta, double saldo) {
        this.nomeCorentista = nomeCorentista;
        this.saldo = saldo;
        this.numConta = numConta;
    }

    public ContaCorrente(String nomeCorentista, int numConta) {
        this(nomeCorentista, numConta, 0.0);
    }

    public void setNome(String nomeCorentista) {
        this.nomeCorentista = nomeCorentista;
    }

    public String getNome() {
        return this.nomeCorentista;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getNumConta() {
        return this.numConta;
    }

    public void alterarNome(String novoNome) {
        setNome(novoNome);
    }

    public void deposito(double saldo) {
        this.saldo = this.saldo + saldo;
    }

    public void saque(double saldo) {
        this.saldo = this.saldo - saldo;
    }

}
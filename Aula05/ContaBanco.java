package Aula05;

public class ContaBanco {

    public int numConta;

    protected String tipo;

    private String dono;

    private double saldo;

    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public ContaBanco(int numConta, String dono) {
        this();
        this.numConta = numConta;
        this.dono = dono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void exibirStatus() {
        System.out.println("Número da conta: " + this.getNumConta() + ".");
        System.out.println("Tipo da conta (cc ou cp): " + this.getTipo() + ".");
        System.out.println("Dono da conta: " + this.getDono() + ".");
        System.out.println("Saldo da conta: " + this.getSaldo() + ".");

        if(this.getStatus()) {
            System.out.println("Status da conta: Ativa.");
        } else {
            System.out.println("Status da conta: Inativa.");
        }
    }

    public void abrirConta(String tipo) {
        if(tipo.equalsIgnoreCase("cc")) {
            this.setSaldo(50);
            this.setTipo("cc");
            System.out.println("Você abriu uma conta corrente e ganhou R$50,00!");
        } else if(tipo.equalsIgnoreCase("cp")) {
            this.setSaldo(150);
            this.setTipo("cp");
            System.out.println("Você abriu uma conta poupança e ganhou R$150,00!");
        } else {
            System.out.println("Tipo de conta INVÁLIDO!");
            return;
        }

        this.setStatus(true);
        this.setNumConta(numConta);
    }

    public void fecharConta() {
        if(this.getSaldo() == 0) {
            this.setStatus(false);
            System.out.println("Você fechou sua conta com SUCESSO!");
        } else if(this.getSaldo() < 0) {
            System.out.println("Você não pode fechar sua conta porque possui R$" + this.saldo * -1 + " para pagar.");
        } else {
            System.out.println("Você tem: R$" + this.getSaldo() + ". Saque antes de fechar sua conta!");
        }
    }

    public void depositar(double valor) {
        if(this.getStatus()) {
            this.setSaldo(valor + this.getSaldo());
            System.out.println("Você fez um deposito de R$" + valor + " com sucesso!");
        } else {
            System.out.println("Abra sua conta para fazer um depósito!");
        }
    }

    public void sacar(double valor) {
        if(valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Você sacou R$" + valor + ". Agora tem R$" + this.getSaldo() + " na sua conta.");
        } else {
            System.out.println("ERRO! Você tem apenas R$" + this.getSaldo() + " na sua conta bancaria.");
        }
    }

    public void pagarMensal() {
        if(this.getTipo().equalsIgnoreCase("cc")) {
            this.setSaldo(this.getSaldo() - 12);
            System.out.println("Você pagou R$12 para o banco");
        } else if(this.getTipo().equalsIgnoreCase("cp")) {
            this.setSaldo(this.getSaldo() - 20);
            System.out.println("Você pagou R$20 para o banco");
        } else {
            System.out.println("Você não possui uma conta aberta.");
        }
    }
}

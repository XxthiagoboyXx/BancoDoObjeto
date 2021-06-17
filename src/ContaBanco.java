public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta(int numConta, String tipo, String dono) {

        if (tipo.equals("cc"))
            this.saldo = 50;
        else if (tipo.equals("cp"))
            this.saldo = 150;
        else {
            System.out.println("Não foi possível criar a conta (Error: Tipo inválido)");
            return;
        }

        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.status = true;

    }

    public void abrirConta(String tipo) {

        if (tipo.equals("cc"))
            this.saldo = 50;
        else if (tipo.equals("cp"))
            this.saldo = 150;
        else {
            System.out.println("Não foi possível criar a conta (Error: Tipo inválido)");
            return;
        }

        this.tipo = tipo;
        this.status = true;

    }

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void fecharconta() {
        if (status == true) {
            if (saldo == 0) {
                this.tipo = "";
                this.dono = "";
                this.saldo = -1;
                this.status = false;
            } else if (saldo > 0) {
                System.out.println("Nãp foi possível fechar a conta (Error: O cliente ainda possui saldo na conta)");
            } else {
                System.out.println("Nãp foi possível fechar a conta (Error: O cliente possui possui dívidas à pagar)");
            }
        } else {
            System.out.println("Não foi possível fechar a conta novamente (Essa conta não está mais ativa)");
        }
    }

    public void depositar(float valor) {
        if (status == true) {
            this.saldo += valor;
        } else {
            System.out.println("Não foi possível efetuar o depósito (Essa conta não está mais ativa)");
        }
    }

    public float sacar(float valor) {
        if (status == true) {
            if (saldo >= valor) {
                this.saldo -= valor;
                return valor;
            } else {
                System.out.println("Não foi possível efetuar o saque (Saldo insuficiente)");
            }
        } else {
            System.out.println("Não foi possível efetuar o depósito (Essa conta não está mais ativa)");
        }
        valor = 0;
        return valor;
    }

    public void pagarMensal() {
        if (status == true) {
            if (tipo.equals("cc")) {
                saldo -= 12;
            } else if (tipo.equals("cp")) {
                saldo -= 20;
            }
        } else {
            System.out.println("Não foi possível efetuar o pagamento (Essa conta não está mais ativa)");
        }
    }

    public void estadoAtual() {
        System.out.println("\n\n------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());

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

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
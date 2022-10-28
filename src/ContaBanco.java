public class ContaBanco {

    public String numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void telaDoCaixa(){
        System.out.println("Conta: " + this.numConta);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: R$ " + this.saldo);
        System.out.println("Tipo de conta: " + this.tipo);
        System.out.println("Status da conta: " + this.status);
    }

    public void abriConta(){
        if(this.tipo == "CC"){
            this.status = true;
            this.saldo = this.saldo + 50;
        } else if (this.tipo == "CP") {
            this.status = true;
            this.saldo = this.saldo + 150;
        }else {
            System.out.println("Erro - Tipo de conta inexistente");
        }
    }
    public void fecharConta(){
        if (this.status == true){
            if (saldo != 0){
                System.out.println("Erro - Deixe seu saldo em 0");
            }else {
                this.status = false;
            }
        }else {
            System.out.println("Erro - Crie uma conta para poder fazer essa ação");
        }
    }
    public void depositar(int v){
        if (status == true) {
            this.saldo = this.saldo + v;
        }else {
            System.out.println("Erro - por favor abra uma conta para continuar");
        }
    }
    public void sacar(int v){
        if (status == true) {
            if (v <= this.saldo) {
                this.saldo = this.saldo - v;
            }else {
                System.out.println("Saldo inexistente para esse saque.");
            }
        }else {
            System.out.println("Erro - por favor abra uma conta para continuar");
        }
    }
    public void pagarMensal(){

        if (this.status == true) {
            if (this.tipo == "CC") {
                this.saldo = this.saldo - 12;
            } else if (this.tipo == "CP") {
                this.saldo = this.saldo - 20;
            } else {
                System.out.println("ERRO - tipo de conta inexistente, regularize sua situação");
            }
        }else{
            System.out.println("Erro - por favor abra uma conta para continuar");
        }
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ContaBanco(String numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }
}

package BankEdu;

//Classes
//classe inicial do status da conta do usuário
class Status {
    String nome;
    int idade;
    float saldo;
    float sacar;

    // construtor da clasee Status
    public Status(String nome, int idade, float saldo, float sacar) {
        this.nome = nome;
        this.idade = idade;
        this.saldo = saldo;
        this.sacar = sacar;
    }

    // Métodos para mostrar o status atual da onta do usuário.
    void conta_usuario() {
        // this é para acessar a variável dentro da classe (referência a variável).
        this.nome = "Eduardo";
        this.idade = 33;
        this.saldo = 300f;
        // escrevendo na tela o status atual do usuário.
        // yhis referencia uma variável. toda ves que usar uma variável é this para
        // acessar ela.
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Saldo: " + this.saldo);
    }

    void deposito() {
        System.out.println("Dinheiro depositado na conta");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        // Incremnenta 22 no saldo
        this.saldo += 22;
        System.out.print("Saldo em conta: " + this.saldo);
    }
}

public class BankMain {
    public static void main(String args[]) {
        System.out.println("Status atual da sua conta");
        // Criando o objeto para acessar a classe status da conta do usuário.
        Status status_conta = new Status(null, 0, 0, 0);
        // Chamando o método da classe Status
        status_conta.conta_usuario();
        System.out.println("----------------------");
        status_conta.deposito();
    }
}

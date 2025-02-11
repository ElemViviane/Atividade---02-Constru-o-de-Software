package br.com.funcionario;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void exibeDetalhes(){
        System.out.println("Nome: " + nome + "\nSalário R$ " + salario
                + "\nBonificação R$ " + bonificacao());
    }
    public double bonificacao(){
        return 0.1 * salario;
    }
}


package br.com.funcionario;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double bonificacao() {
        return 0.2 * getSalario();
    }

    @Override
    public void exibeDetalhes() {
        System.out.println("Nome: " + getNome() + "\nSalário R$ " + getSalario()
                + "\nBonificação R$ " + bonificacao());
    }
}


package br.com.funcionario;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double bonificacao() {
        return 0.15 * getSalario();
    }

    @Override
    public void exibeDetalhes() {
        System.out.println("Nome: " + getNome() + "\nSalário R$ " + getSalario()
                + "\nBonificação R$ " + bonificacao());

    }
}


package br.com.funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nome do Gerente", 4500);
        gerente.bonificacao();
        gerente.exibeDetalhes();

        System.out.println();

        Desenvolvedor dev = new Desenvolvedor("Nome do Desenvolvedor", 8500);
        dev.bonificacao();
        dev.exibeDetalhes();

        System.out.println();

        Funcionario funcionario = new Funcionario("Nome do Fucionário", 2100);
        funcionario.bonificacao();
        funcionario.exibeDetalhes();

    }
}

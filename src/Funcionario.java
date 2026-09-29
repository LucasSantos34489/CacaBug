public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double percentual) {
        salario += salario * percentual / 100;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
    }
}

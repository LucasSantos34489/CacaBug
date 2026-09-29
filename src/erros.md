1° Falta o this na frente dos atributos do construtor. Coloca o this para indicar. this é um construtor que serve para chamar outro da mesma classe;
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

2° Falta o seter dos atributos nome é salario. Coloca o setter para definir o valor do atributo;
    public String setNome() {
        this.nome = nome;
    }
    public String setSalario() {
        this.salario = salario;
    }
3° O código não estava dentado.

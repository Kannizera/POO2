package PetShop;

public abstract class Funcionario {

    private String nome;
    private String funcao;
    private String cpf;

    public Funcionario(String nome, String funcao, String cpf ) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}



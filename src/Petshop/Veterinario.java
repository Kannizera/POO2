package PetShop;

public class Veterinario extends Funcionario{

    private String crmv;

    public Veterinario(String nome, String funcao, String cpf, String crmv) {
        super( nome, funcao, cpf);
        this.crmv = crmv;
    }}

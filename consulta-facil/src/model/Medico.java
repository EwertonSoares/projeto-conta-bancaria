package model;

public class Medico extends Pessoa {
    private int crm;
    private String especialidade;

    public Medico(String nome, int telefone, String endereco, int cpf, int crm, String especialidade) {
        super(nome, telefone, endereco, cpf);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}

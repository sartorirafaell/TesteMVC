
package projetomvcteste.controller;

import projetomvcteste.model.Pessoa;

public class PessoaController {
    private String nome;
    private String email;
    private String cpf;

    
    public PessoaController(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public PessoaController() {
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean cadastraPessoa(String nome, String email, String cpf) {
        Pessoa pes = new Pessoa();
        
        
        return pes.cadastraPessoa(nome, email, cpf);
    }

}

package dev.java10x.CadastroDeNinjas;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

// Entity ela tranforma uma classe em uma entidade
@Entity
@Table(name = "tb_Cadastro")
public class NinjaModel {

    // para o meu ID ser preenchido com algo
    @Id
    // gerado automaticamento com numeros sequenciais 1,2,3,4,5,6
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String idade;
    private String email;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

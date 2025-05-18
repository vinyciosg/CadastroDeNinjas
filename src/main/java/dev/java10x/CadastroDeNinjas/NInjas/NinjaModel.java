package dev.java10x.CadastroDeNinjas.NInjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

// Entity ela tranforma uma classe em uma entidade
@Entity
@Table(name = "tb_Cadastro")
public class NinjaModel {

    // para o meu ID ser preenchido com algo
    // gerado automaticamento com numeros sequenciais 1,2,3,4,5,6
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String idade;

    private String email;

    // @ManyToOne - varios Ninjas tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing kay ou chave estrangeira
    private MissoesModel missoes;


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

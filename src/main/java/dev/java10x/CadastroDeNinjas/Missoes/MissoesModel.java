package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.NInjas.NinjaModel;
import jakarta.persistence.*;
import org.springframework.core.SpringVersion;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String nome;
    private String dificuldade;

    // @OneToMany - Uma missao para uma lista de Ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;


}

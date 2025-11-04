package med.voll.api.medico;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;
import med.voll.api.controller.DadosAtualizacaoMedico;
import med.voll.api.endereco.Endereco;

@Getter
@Setter
@Table(name = "medicos")
@Entity(name = "Medico")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    //Classe separada, mas campos fazem parte da mesma tabela que a de medicos no SQL
    @Embedded
    private Endereco endereco;

    public Medico (DadosCadastroMedico dados){

        this.nome = dados.nome();
        this.email = dados.email();
        this.crm = dados.crm();
        this.telefone=dados.telefone();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());

    }

    public void atualizarInformacoes(@Valid DadosAtualizacaoMedico dados) {
        if(dados.nome() != null){
            this.nome = dados.nome();
        }

        if(dados.nome() != null){
            this.nome = dados.nome();
        }

        if(dados.nome() != null){
            this.nome = dados.nome();
        }

        if(dados.endereco() != null){
            this.endereco.atualizarInformacoes(dados.endereco());
        }
    }
}

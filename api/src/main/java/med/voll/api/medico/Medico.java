package med.voll.api.medico;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.endereco.Endereco;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="medicos")
@Entity(name="Medicos")
@EqualsAndHashCode(of="id")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    //Classe separada, mas campos fazem parte da mesma tabela que a de medicos no SQL
    @Embedded
    private Endereco endereco;

}

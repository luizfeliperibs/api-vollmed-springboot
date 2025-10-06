package med.voll.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;

//Se passa : o nome da entidade "," tipo do atribto da chave primária da entidade
public interface MedicoRepository extends JpaRepository<Medico, Long> {

}

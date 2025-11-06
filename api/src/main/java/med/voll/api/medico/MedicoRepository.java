package med.voll.api.medico;

import aj.org.objectweb.asm.commons.Remapper;
import med.voll.api.controller.DadosListagemMedico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

//Se passa : o nome da entidade "," tipo do atribto da chave primária da entidade
public interface MedicoRepository extends JpaRepository<Medico, Long> {

    Page<Medico> findAllByAtivoTrue(Pageable paginacao);

}

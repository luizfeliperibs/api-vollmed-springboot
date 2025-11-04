package med.voll.api.controller;

import med.voll.api.pacientes.Paciente;
import org.springframework.data.web.PageableDefault;

public record DadosListagemPaciente(String nome, String email, String cpf) {

    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }

}

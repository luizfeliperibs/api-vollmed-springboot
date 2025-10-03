# 🏥 VollMed API - Spring Boot

Bem-vindo à **api-vollmed-springboot**, um sistema desenvolvido em **Spring Boot** para gerenciar informações de clínicas médicas.  
Este projeto fornece a **API backend** do aplicativo **VollMed**, permitindo o gerenciamento de **médicos, pacientes e consultas**.

---

## 📌 Funcionalidades

A API possibilita:

### 👩‍⚕️ Médicos
- Cadastro de médicos com informações profissionais:
  - Nome completo
  - Especialidade
  - CRM
  - Contatos (e-mail, telefone, celular)
  - Endereço profissional (logradouro, número, cidade, estado, CEP)

- Listagem e pesquisa de médicos por nome e especialidade.
- Edição e exclusão de perfis de médicos.

### 🧑 Pacientes
- Cadastro de pacientes com dados pessoais e de contato.
- Consulta e atualização de informações.
- Exclusão de pacientes.

### 📅 Consultas
- Agendamento de consultas entre médicos e pacientes.
- Definição de data, horário e local.
- Listagem de consultas agendadas.
- Cancelamento de consultas.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL / PostgreSQL** (configurável)
- **Lombok**
- **Swagger/OpenAPI** para documentação da API

---

## 📂 Estrutura do Projeto

```
api-vollmed-springboot
├── src
│   ├── main
│   │   ├── java/com/vollmed/api
│   │   │   ├── controller   # Controladores REST
│   │   │   ├── model        # Entidades JPA
│   │   │   ├── repository   # Interfaces de persistência
│   │   │   ├── service      # Regras de negócio
│   │   │   └── dto          # Objetos de transferência de dados
│   │   └── resources
│   │       ├── application.properties  # Configurações da aplicação
│   │       └── data.sql                # Dados iniciais (opcional)
└── pom.xml
```

---

## ▶️ Como Executar o Projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/api-vollmed-springboot.git
   ```

2. Acesse a pasta do projeto:
   ```bash
   cd api-vollmed-springboot
   ```

3. Configure o banco de dados no arquivo:
   ```
   src/main/resources/application.properties
   ```

4. Compile e execute:
   ```bash
   ./mvnw spring-boot:run
   ```

5. A API estará disponível em:
   ```
   http://localhost:8080
   ```

---

## 📖 Documentação da API

Após rodar o projeto, acesse a documentação interativa (Swagger):

```
http://localhost:8080/swagger-ui.html
```

---

## 📌 Próximos Passos / Melhorias

- Implementar autenticação com **Spring Security + JWT**.
- Adicionar validações avançadas nos cadastros.
- Criar relatórios de consultas.
- Notificações automáticas de lembrete de consulta.

---

## 📜 Licença

Este projeto é distribuído sob a licença **MIT**.  
Sinta-se livre para usar, modificar e contribuir!

---

💡 **VollMed API - Simplificando a gestão de clínicas médicas.**

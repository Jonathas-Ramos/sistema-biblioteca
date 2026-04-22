📚 Sistema de Gestão de Biblioteca - Java Spring Boot
Este projeto é uma aplicação Full-Stack desenvolvida para gerenciar o fluxo operacional de uma biblioteca. Ele foi construído para demonstrar a aplicação prática de conceitos de arquitetura MVC, persistência em bancos de dados NoSQL e o desenvolvimento de interfaces dinâmicas com Thymeleaf.

🚀 Funcionalidades Implementadas
Dashboard de Controle: Tela inicial centralizada para navegação intuitiva entre os módulos do sistema.

Gestão de Inventário: Cadastro dinâmico de livros com persistência imediata no MongoDB.

Controle de Usuários: Cadastro de leitores diferenciando perfis entre Alunos e Professores.

Motor de Empréstimos: Validação automática de disponibilidade de estoque e limites de retirada por perfil.

Módulo de Devolução: Processamento de retorno de obras com atualização automática de saldo de estoque e histórico de movimentação.

Persistência Reativa: Configuração de banco de dados NoSQL que mantém a integridade dos dados mesmo após o reinício da aplicação.

🛠️ Stack Tecnológica
Backend: Java 25 (LTS) com Spring Boot 4.0.5.

Banco de Dados: MongoDB Community Server (NoSQL).

Frontend: HTML5, CSS3 e Thymeleaf (Template Engine).

Integração de Dados: Spring Data MongoDB.

Ferramenta de Build: Maven.

Ambiente de Desenvolvimento: Apache NetBeans.

📋 Arquitetura e Padrões de Projeto
A aplicação foi estruturada seguindo as melhores práticas de desenvolvimento Java para garantir escalabilidade e fácil manutenção:

Camada de Modelagem (Model): Define as entidades Livro, Usuario e Emprestimo com mapeamento para documentos MongoDB através da anotação @Document.

Camada de Persistência (Repository): Utiliza o MongoRepository para abstrair operações complexas de CRUD, permitindo o foco na lógica de negócio.

Camada de Serviço (Service): Centraliza as regras de negócio, como a verificação de estoque e limites de usuário, utilizando injeção de dependência via @Autowired.

Camada de Controle (Controller): Gerencia as rotas HTTP, processa as requisições de formulários e faz a ponte entre o serviço e a interface visual.

🔧 Configuração e Instalação
Requisitos do Sistema
JDK 25 instalado.

MongoDB instalado e rodando localmente na porta 27017.

Executando a Aplicação:

Baixe o sistema-biblioteca.zip.

Abra o projeto no Apache NetBeans.

Execute um Clean and Build para baixar as dependências do Maven.

Rode a classe principal SistemaBibliotecaApplication.java.

Acesse http://localhost:8080 no navegador.

Nota Técnica: O sistema conta com uma classe de configuração InicializaDados que popula o banco automaticamente na primeira execução caso ele esteja vazio, facilitando o ambiente de testes.

👤 Desenvolvedor
Jonathas Eduardo Santos Ramos

Estudante de Sistemas de Informação - 7º Semestre

Universidade de Mogi das Cruzes (UMC)

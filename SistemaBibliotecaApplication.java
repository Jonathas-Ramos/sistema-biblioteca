package br.com.biblioteca.config;

import br.com.biblioteca.model.*;
import br.com.biblioteca.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InicializaDados implements CommandLineRunner {

    private final UsuarioRepository usuarioRepo;
    private final LivroRepository livroRepo;
    private final EmprestimoRepository emprestimoRepo;

    public InicializaDados(UsuarioRepository usuarioRepo, LivroRepository livroRepo, EmprestimoRepository emprestimoRepo) {
        this.usuarioRepo = usuarioRepo;
        this.livroRepo = livroRepo;
        this.emprestimoRepo = emprestimoRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        
        // SÓ ENTRA AQUI SE O BANCO ESTIVER TOTALMENTE VAZIO
        if (usuarioRepo.findAll().isEmpty()) {
            System.out.println("Banco vazio! Criando usuários iniciais...");
            
            Usuario user1 = new Usuario();
            user1.setNome("Jonathas Ramos");
            user1.setTipoPerfil(TipoUsuario.ALUNO);
            user1.setQuantidadeEmprestimosAtivos(0);
            usuarioRepo.save(user1);

            Usuario user2 = new Usuario();
            user2.setNome("Prof. Ricardo - Orientador");
            user2.setTipoPerfil(TipoUsuario.PROFESSOR);
            user2.setQuantidadeEmprestimosAtivos(0);
            usuarioRepo.save(user2);
        }

        // SÓ ENTRA AQUI SE O BANCO ESTIVER TOTALMENTE VAZIO
        if (livroRepo.findAll().isEmpty()) {
            System.out.println("Banco vazio! Criando livros iniciais...");
            
            Livro livro1 = new Livro();
            livro1.setTitulo("Data Science e Machine Learning com Python");
            livro1.setQuantidadeDisponivel(8);
            livroRepo.save(livro1);

            Livro livro2 = new Livro();
            livro2.setTitulo("SQL para Análise de Dados: Guia Prático");
            livro2.setQuantidadeDisponivel(5);
            livroRepo.save(livro2);

            Livro livro3 = new Livro();
            livro3.setTitulo("Arquitetura de Sistemas com Spring Boot");
            livro3.setQuantidadeDisponivel(3);
            livroRepo.save(livro3);
        }
    }
}
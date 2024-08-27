package br.com.marcossk20.medicalconsult.Usuario.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.security.Permission;
import java.util.Date;

@Data
@Entity
@Table (name = "USUARIOS")
public class Usuario {

    @Column(name = "ID_USUARIOS")
    private long idUsuario;
    @Column(name = "NOME_USUARIOS")
    private String nomeUsuario;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "DATA_NASCIMENTO")
    private Date dataNascimento;

    //private permissao permissao;

    public Usuario() {
    }

    public Usuario(long idUsuario, String nomeUsuario, String email, String cpf, String telefone, Date dataNascimento, Permission permissao) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;

    }
}

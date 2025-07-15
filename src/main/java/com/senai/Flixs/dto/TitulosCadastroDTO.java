package com.senai.Flixs.dto;

import com.senai.Flixs.model.TipoTitulo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class TitulosCadastroDTO {
    @NotBlank(message = "Nome não pode ser vazio")
    @Size(max = 50, message = "Nome pode ter no maximo 50 caracteres")
    private String nome;
    @NotBlank(message = "Genero não pode ser vazio")
    private String genero;
    @NotNull(message = "Tipo não pode ser vazio")
    private TipoTitulo tipo;
    private int anoLancamento;
    @NotNull (message = "Ja assistiu nao pode ser vazio")
    private boolean jaAssistiu;
    private double avaliacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public TipoTitulo getTipo() {
        return tipo;
    }

    public void setTipo(TipoTitulo tipo) {
        this.tipo = tipo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isJaAssistiu() {
        return jaAssistiu;
    }

    public void setJaAssistiu(boolean jaAssistiu) {
        this.jaAssistiu = jaAssistiu;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
}

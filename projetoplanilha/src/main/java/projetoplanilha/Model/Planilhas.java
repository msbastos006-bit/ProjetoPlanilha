package projetoplanilha.Model;

import java.util.ArrayList;

public class Planilhas {

    private String nome;
    private ArrayList<String> colunas;
    private  ArrayList<ArrayList<String>> linhas;

    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<String> getColunas() {
        return colunas;
    }
    public void setColunas(ArrayList<String> colunas) {
        this.colunas = colunas;
    }
    public ArrayList<ArrayList<String>> getLinhas() {
        return linhas;
    }
    public void setLinhas(ArrayList<ArrayList<String>> linhas) {
        this.linhas = linhas;
    }
}

package mapper.imp;

import java.time.LocalDate;

public class UsuarioDTOView {
    private Long id;
    private String nome;
    private String cpfCensurado;
    private String rg;
    private String dataNascimentoFormatada;

    @Override
    public String toString() {
        return "UsuarioDTOView{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpfCensurado='" + cpfCensurado + '\'' +
                ", rg='" + rg + '\'' +
                ", dataNascimentoFormatada='" + dataNascimentoFormatada + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCensurado() {
        return cpfCensurado;
    }

    public void setCpfCensurado(String cpfCensurado) {
        this.cpfCensurado = cpfCensurado;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimentoFormatada() {
        return dataNascimentoFormatada;
    }

    public void setDataNascimentoFormatada(String dataNascimentoFormatada) {
        this.dataNascimentoFormatada = dataNascimentoFormatada;
    }
}

package Pacote;

public class Academia {
    private double mensalidade;
    private int faixaEtaria;

    public Academia() {
    }

    public Academia(double mensalidade, int faixaEtaria) {
        this.mensalidade = mensalidade;
        this.faixaEtaria = faixaEtaria;
    }

    public void calcularMensalidade(Pessoa pessoa) {
        if (pessoa.isMulher()) {
            calcularMensalidadeMulher(pessoa);
        } else {
            calcularMensalidadeHomem(pessoa);
        }
    }

    private void calcularMensalidadeHomem(Pessoa pessoa) {
        if (pessoa.getIdade() <= 15) {
            mensalidade = 60.0;
        } else if (pessoa.getIdade() <= 18) {
            mensalidade = 75.0;
        } else if (pessoa.getIdade() <= 30) {
            mensalidade = 90.0;
        } else if (pessoa.getIdade() <= 40) {
            mensalidade = 85.0;
        } else if (pessoa.getIdade() <= 50) {
            mensalidade = 80.0;
        } else {
            mensalidade = 60.0;
        }
    }

    private void calcularMensalidadeMulher(Pessoa pessoa) {
        if (pessoa.getIdade() <= 18) {
            mensalidade = 60.0;
        } else if (pessoa.getIdade() <= 25) {
            mensalidade = 90.0;
        } else if (pessoa.getIdade() <= 40) {
            mensalidade = 85.0;
        } else if (pessoa.getIdade() <= 50) {
            mensalidade = 65.0;
        } else {
            mensalidade = 50.0;
        }
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
}
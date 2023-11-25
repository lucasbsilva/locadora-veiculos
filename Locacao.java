class Locacao {
    Cliente cliente;
    Veiculo veiculo;
    String areaLocacao;
    String dataRetirada;
    String dataDevolucao;
    String horaRetirada;
    String horaDevolucao;
    String statusConservacao;
    double caucao;
    int periodoLocacao;
    int qtdeDias;

    public Locacao(Cliente cliente, Veiculo veiculo, int qtdeDias) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.qtdeDias = qtdeDias;
    }

    public double calcularValorLocacao() {
        return veiculo instanceof ICalculaLocacao ?
                ((ICalculaLocacao) veiculo).calcularLocacao() * dias :
                veiculo.diaria * dias;
    }
}
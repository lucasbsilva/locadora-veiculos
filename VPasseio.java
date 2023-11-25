class VPasseio extends Veiculo implements ICalculaLocacao {
    public VPasseio(double diaria) {
        super(diaria);
    }

    @Override
    public double calcularLocacao() {
        // Lógica de cálculo para veículo de passeio
        return diaria;
    }
}
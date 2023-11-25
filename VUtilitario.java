class VUtilitario extends Veiculo implements ICalculaLocacao {
    public VUtilitario(double diaria) {
        super(diaria);
    }

    @Override
    public double calcularLocacao() {
        // Lógica de cálculo para veículo utilitário
        return diaria;
    }
}
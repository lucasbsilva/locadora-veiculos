class VSUV extends Veiculo implements ICalculaLocacao {
    public VSUV(double diaria) {
        super(diaria);
    }

    @Override
    public double calcularLocacao() {
        // Lógica de cálculo para SUV
        return diaria;
    }
}
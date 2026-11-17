// A classe Euro herda de Moeda, assim como Real e Dolar
public class Euro extends Moeda {

    public Euro(double valor) {
        super(valor);
    }

    // Implementação obrigatória do método info para o Euro
    @Override
    public void info() {
        System.out.println("Moeda: Euro | Valor: " + valor);
    }

    // Implementação obrigatória da conversão
    @Override
    public double converter() {
        return valor * 6.00;
    }
}

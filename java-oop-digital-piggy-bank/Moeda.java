// Classe abstrata: não pode ser instanciada diretamente
public abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    // Métodos que as filhas serão obrigadas a implementar
    public abstract void info();
    public abstract double converter();

    // Equals: essencial para que o método remover do ArrayList funcione
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Moeda outra = (Moeda) obj;
        return Double.compare(outra.valor, valor) == 0;
    }
}
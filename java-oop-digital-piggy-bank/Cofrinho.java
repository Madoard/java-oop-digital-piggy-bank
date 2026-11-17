import java.util.ArrayList; // Importa a classe ArrayList para gerenciar a coleção de moedas

public class Cofrinho {

    // Atributo: Uma lista dinâmica que armazena objetos do tipo Moeda.
    private ArrayList<Moeda> listaMoedas;

    // Construtor: Inicializa a lista de moedas quando um objeto Cofrinho é criado
    public Cofrinho() {
        this.listaMoedas = new ArrayList<>();
    }

    // Método para adicionar uma moeda à coleção
    public void adicionar(Moeda moeda) {
        this.listaMoedas.add(moeda);
    }

    // Método para remover uma moeda específica da coleção
    public void remover(Moeda moeda) {
        this.listaMoedas.remove(moeda);
    }

    // Método que percorre a lista e exibe as informações de cada moeda
    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio!");
            return;
        }

        // Loop: para cada Moeda 'm' dentro da listaMoedas...
        for (Moeda m : listaMoedas) {
            // Chamada polimórfica:  Decide em tempo de execução
            m.info();
        }
    }

    // Método que calcula o valor total do cofrinho convertido para Real
    public double totalConvertido() {
        double acumulado = 0;

        for (Moeda m : listaMoedas) {
            // Soma ao acumulador o resultado do método converter() de cada moeda
            acumulado += m.converter();
        }

        return acumulado;
    }
}
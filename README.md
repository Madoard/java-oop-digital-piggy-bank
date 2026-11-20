<div align="center">

  <p>─────────────────────── ✦ ───────────────────────</p>

  <h1>˚₊‧꒰ა Cofrinho Digital Multimoedas ໒꒱‧₊˚</h1>

  <p>
    <i>Aplicação de console desenvolvida em Java com Programação Orientada a Objetos para gerenciar depósitos, saques e conversões de moedas para Real (BRL).</i>
  </p>

  <p>
    <img src="https://img.shields.io/badge/Java-POO-FFB7C5?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java POO" />
    <img src="https://img.shields.io/badge/Moedas-BRL%20%7C%20USD%20%7C%20EUR-E6E6FA?style=for-the-badge&logoColor=555555" alt="Moedas" />
    <img src="https://img.shields.io/badge/Console-App%20CLI-FFD1DC?style=for-the-badge&logoColor=white" alt="App CLI" />
  </p>

</div>

<br/>

### ✦ Resumo

Simula um cofrinho digital via linha de comando em Java para adicionar, remover e listar moedas (`BRL`, `USD` e `EUR`) e calcular o saldo total convertido para Real (`BRL`).

### ✦ Tecnologias

- **Java (POO):** Linguagem utilizada para modelar abstração, herança, polimorfismo, encapsulamento e controle do menu interativo no console.
- **Collections (`ArrayList`):** Estrutura usada na classe `Cofrinho` para armazenar e manipular dinamicamente os objetos de moeda.

### ✦ Regras

O funcionamento do cofrinho segue os princípios e comportamentos definidos nas classes do projeto:

- **Moedas suportadas:** `Real` (`BRL`), `Dolar` (`USD`) e `Euro` (`EUR`) estendem a classe base abstrata `Moeda`.
- **Conversão para Real:** Cada moeda implementa sua própria lógica de conversão (`converter()`) e exibição (`info()`) de forma polimórfica.
- **Gestão do saldo:** A classe `Cofrinho` centraliza depósitos, saques, listagem de itens e soma total convertida em `BRL` a partir de um `ArrayList<Moeda>`.
- **Interação via terminal:** A classe `Main` conduz o menu no console e processa as escolhas do usuário.

<p align="center">─────────────────────── · ───────────────────────</p>

### ✦ Como Executar

1. **Pré-requisitos:** Tenha o **JDK (Java Development Kit)** instalado na máquina para compilar e executar classes Java (`javac` e `java`).
2. **Clone o repositório e acesse a pasta dos arquivos fonte:**
   ```bash
   git clone [https://github.com/Madoard/java-oop-digital-piggy-bank.git](https://github.com/Madoard/java-oop-digital-piggy-bank.git)
   cd java-oop-digital-piggy-bank/java-oop-digital-piggy-bank
   ```[cite: 7]
3. **Compile e execute o projeto:**
   ```bash
   javac *.java
   java Main
   ```[cite: 8, 9, 10, 11]

### ✦ Exemplo de Uso

```text
---- MENU COFRINHO ----
1 - Adicionar Moeda
2 - Remover Moeda
3 - Listar Moedas
4 - Calcular total convertido para Real
0 - Encerrar
1
Escolha a Moeda:
1 - Real
2 - Dólar
3 - Euro
2
Digite o valor:
10
Moeda adicionada!

Escolha outra opção (1-Add, 2-Rem, 3-List, 4-Total, 0-Sair):
3
Lista de Moedas no Cofrinho:
Dólar: 10.0

Escolha outra opção (1-Add, 2-Rem, 3-List, 4-Total, 0-Sair):
4
Total acumulado no cofrinho (em Real): R$ 52,00

Escolha outra opção (1-Add, 2-Rem, 3-List, 4-Total, 0-Sair):
0
Sistema encerrado. Até logo!
```[cite: 10]

<p align="center">─────────────────────── · ───────────────────────</p>

### ✦ Como Foi Construído

O projeto está dividido nas classes [Moeda.java](java-oop-digital-piggy-bank/Moeda.java)[cite: 7, 9], [Real.java](java-oop-digital-piggy-bank/Real.java)[cite: 7, 8], [Dolar.java](java-oop-digital-piggy-bank/Dolar.java)[cite: 7], [Euro.java](java-oop-digital-piggy-bank/Euro.java)[cite: 7, 11], [Cofrinho.java](java-oop-digital-piggy-bank/Cofrinho.java)[cite: 7] e [Main.java](java-oop-digital-piggy-bank/Main.java)[cite: 7, 10]. Abaixo estão os pontos centrais da implementação:

```java
public abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract void info();
    public abstract double converter();
}
```[cite: 9]

- **Abstração e igualdade em `Moeda.java`:** Define o atributo `protected double valor`, os métodos abstratos `info()` e `converter()`, e sobrescreve `equals(Object obj)` comparando tipo (`getClass()`) e valor (`Double.compare`) para permitir a remoção na lista[cite: 9].
- **Taxas e formatação nas subclasses:** `Real.java` retorna o próprio `valor` na conversão[cite: 8], `Dolar.java` multiplica por `5.20` e `Euro.java` multiplica por `6.00`[cite: 11], cada uma implementando `info()` e `converter()`[cite: 8, 11].
- **Coleção e soma total em `Cofrinho.java`:** Encapsula um `ArrayList<Moeda>` com métodos para `adicionar`, `remover`, `listagemMoedas()` (chamando `m.info()` em cada item) e `totalConvertido()` (somando `m.converter()`).
- **Fluxo interativo em `Main.java`:** Usa `Scanner` e um loop `while (opcao != 0)` com `switch` para adicionar, remover, listar moedas e exibir o total convertido em `BRL` com `System.out.printf("Total acumulado no cofrinho (em Real): R$ %.2f\n", total)`[cite: 10].

<br/>

<div align="center">
  <p>°•. ✦ .•° ────── ꒰ ✦ ꒱ ────── °•. ✦ .•°</p>
  <p><i>Feito por <b>Eduarda Gonçalves</b></i></p>
</div>
### ✦ Como Foi Construído

- **Abstração e herança:** Superclasse abstrata `Moeda` definindo o atributo compartilhado de valor e os métodos esperados pelas subclasses `Real`, `Dolar` e `Euro`.
- **Polimorfismo:** Sobrescrita de `info()` e `converter()` em cada subclasse para aplicar as taxas de câmbio e formatações específicas de cada moeda.
- **Encapsulamento e coleções:** Classe `Cofrinho` encapsulando um `ArrayList<Moeda>` para adicionar, remover, listar e somar os valores convertidos em `BRL`.
- **CLI interativa (`Main`):** Loop de menu no console para receber comandos do usuário e executar as operações do cofrinho.

### ✦ Arquitetura do Projeto (`java-oop-digital-piggy-bank/`)

| Arquivo | Descrição |
| :--- | :--- |
| `Main.java` | Menu interativo de console e controlador do fluxo do usuário |
| `Cofrinho.java` | Gerencia o `ArrayList<Moeda>` e a conversão total para `BRL` |
| `Moeda.java` | Classe base abstrata que define o contrato das moedas |
| `Real.java` | Implementação do Real Brasileiro (`BRL`) |
| `Dolar.java` | Implementação do Dólar Americano (`USD`) com conversão cambial |
| `Euro.java` | Implementação do Euro (`EUR`) com conversão cambial |

<br/>

<div align="center">
  <p>°•. ✦ .•° ────── ꒰ ✦ ꒱ ────── °•. ✦ .•°</p>
  <p><i>Feito por <b>Eduarda Gonçalves</b></i></p>
</div>

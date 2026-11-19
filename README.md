<div align="center">

  <p>｡ﾟ☁︎｡⋆｡ ﾟ☾ ﾟ｡⋆ ──────────── ꒰ 🗝️ ꒱ ──────────── ⋆｡ﾟ☾ ﾟ｡⋆｡☁︎｡ﾟ</p>

  <h1>˚₊‧꒰ა 🍓 Cofrinho Digital Multimoedas 🍓 ໒꒱‧₊˚</h1>

  <p>
    <i>✧･ﾟ: *✧･ﾟ:* Aplicação de console desenvolvida em Java utilizando Programação Orientada a Objetos para gerenciar depósitos, saques e conversões de moedas para Real (BRL) *:･ﾟ✧*:･ﾟ✧</i>
  </p>

  <p>
    <img src="https://img.shields.io/badge/Java-POO-FFB7C5?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java POO" />
    <img src="https://img.shields.io/badge/Moedas-BRL%20%7C%20USD%20%7C%20EUR-E6E6FA?style=for-the-badge&logoColor=555555" alt="Moedas" />
    <img src="https://img.shields.io/badge/Console-App%20CLI-FFD1DC?style=for-the-badge&logoColor=white" alt="App CLI" />
  </p>

</div>

<br/>

<p align="center">‧₊˚ ☁️⋅♡𓂃 ࣪ ִֶָ☾. ─────────────────────── ‧₊˚ ☁️⋅♡𓂃 ࣪ ִֶָ☾.</p>

### ╰┈➤ ꒰ 🍒 ꒱ Como Foi Construído

- **₊˚💫 Abstração e Herança:** Criação da superclasse abstrata `Moeda` definindo o atributo compartilhado de valor e os contratos herdados por `Real`, `Dolar` e `Euro`.
- **₊˚🌷 Polimorfismo:** Sobrescrita dos métodos `info()` e `converter()` em cada subclasse de moeda para que as taxas de câmbio e a formatação sejam resolvidas dinamicamente.
- **₊˚💫 Encapsulamento e Coleções:** Implementação da classe `Cofrinho` encapsulando um `ArrayList<Moeda>` para adicionar, remover, listar e somar o valor total convertido em Real (`BRL`).
- **₊˚🌷 CLI Interativa (`Main`):** Estruturação de um loop de menu no console em `Main` para lidar com as entradas do usuário e transações de moedas.

<p align="center">‧₊˚ ☁️⋅♡𓂃 ࣪ ִֶָ☾. ─────────────────────── ‧₊˚ ☁️⋅♡𓂃 ࣪ ִֶָ☾.</p>

### ╰┈➤ ꒰ 🍰 ꒱ Arquitetura do Projeto (`java-oop-digital-piggy-bank/`)

| Arquivo | Vibe | Descrição |
| :--- | :---: | :--- |
| `Main.java` | 🍓 | Menu interativo de console e controlador do fluxo do usuário |
| `Cofrinho.java` | 🗝️ | Gerencia o `ArrayList<Moeda>` e a conversão total para `BRL` |
| `Moeda.java` | ☁️ | Classe base abstrata que define o contrato das moedas |
| `Real.java` | 🌸 | Implementação do Real Brasileiro (`BRL`) |
| `Dolar.java` | 🌙 | Implementação do Dólar Americano (`USD`) com conversão cambial |
| `Euro.java` | ✨ | Implementação do Euro (`EUR`) com conversão cambial |

<br/>

<div align="center">
  <p>°•. 🍒 .•° ────── ꒰ 💗 ꒱ ────── °•. 🍒 .•°</p>
  <p><i>feito com 💗 por <b>Maria Eduarda Gonçalves</b></i></p>
</div>

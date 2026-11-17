<div align="center">

  <p>｡ﾟ☁︎｡⋆｡ ﾟ☾ ﾟ｡⋆ ──────────── ꒰ 🗝️ ꒱ ──────────── ⋆｡ﾟ☾ ﾟ｡⋆｡☁︎｡ﾟ</p>

  <h1>˚₊‧꒰ა 🍓 Multi-Currency Digital Piggy Bank 🍓 ໒꒱‧₊˚</h1>

  <p>
    <i>✧･ﾟ: *✧･ﾟ:* Console application developed in Java using Object-Oriented Programming to manage deposits, withdrawals, and currency conversions into BRL *:･ﾟ✧*:･ﾟ✧</i>
  </p>

  <p>
    <img src="https://img.shields.io/badge/Java-OOP-FFB7C5?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java OOP" />
    <img src="https://img.shields.io/badge/Currencies-BRL%20%7C%20USD%20%7C%20EUR-E6E6FA?style=for-the-badge&logoColor=555555" alt="Currencies" />
    <img src="https://img.shields.io/badge/Console-CLI%20App-FFD1DC?style=for-the-badge&logoColor=white" alt="CLI App" />
  </p>

</div>

<br/>

<p align="center">‧₊˚ ☁️⋅♡𓂃 ࣪ ִֶָ☾. ─────────────────────── ‧₊˚ ☁️⋅♡𓂃 ࣪ ִֶָ☾.</p>

### ╰┈➤ ꒰ 🍒 ꒱ How It Was Built

* **₊˚💫 Abstraction & Inheritance:** Created an abstract `Moeda` superclass defining the shared value attribute and contracts inherited by `Real`, `Dolar`, and `Euro`.
* **₊˚🌷 Polymorphism:** Overrode `info()` and `converter()` in each currency subclass so exchange rates and formatting are resolved dynamically.
* **₊˚💫 Encapsulation & Collections:** Implemented `Cofrinho` encapsulating an `ArrayList<Moeda>` to add, remove, list, and sum total converted values in Brazilian Real (`BRL`).
* **₊˚🌷 Interactive CLI (`Main`):** Structured a console menu loop in `Main` to handle user inputs and currency transactions.

<p align="center">‧₊˚ ☁️⋅♡𓂃 ࣪ ִֶָ☾. ─────────────────────── ‧₊˚ ☁️⋅♡𓂃 ࣪ ִֶָ☾.</p>

### ╰┈➤ ꒰ 🍰 ꒱ Project Architecture (`src/`)

| File | Vibe | Description |
| :--- | :---: | :--- |
| `Main.java` | 🍓 | Interactive console menu and user flow controller |
| `Cofrinho.java` | 🗝️ | Manages the `ArrayList<Moeda>` and total `BRL` conversion |
| `Moeda.java` | ☁️ | Abstract base class defining the currency contract |
| `Real.java` | 🌸 | Brazilian Real (`BRL`) implementation |
| `Dolar.java` | 🌙 | US Dollar (`USD`) implementation with exchange conversion |
| `Euro.java` | ✨ | Euro (`EUR`) implementation with exchange conversion |

<br/>

<div align="center">
  <p>°•. 🍒 .•° ────── ꒰ 💗 ꒱ ────── °•. 🍒 .•°</p>
  <p><i>made with 💗 by <b>Maria Eduarda Gonçalves</b></i></p>
</div>

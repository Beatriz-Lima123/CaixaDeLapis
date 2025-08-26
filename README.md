## 📦 CaixaDeLapis - Exemplo de Singleton em Java

### 📝 Descrição

Este projeto é um exemplo didático do padrão Singleton em Java.
O objetivo é mostrar como garantir que uma classe tenha apenas uma única instância durante todo o programa.

No exemplo, a classe CaixaDeLapis representa uma caixa de lápis na sala de aula, e todos os alunos devem compartilhar a mesma caixa.

## 🔑 Conceitos do Singleton

➡️ Construtor privado:
 
```bash
private CaixaDeLapis() { ... }
```
•	Impede que outros objetos criem instâncias diretamente.


➡️ Atributo estático:
 ```bash
private static CaixaDeLapis unicaCaixa;
```
•	Armazena a única instância da classe.


➡️ Método estático para acessar a instância:
```bash
public static CaixaDeLapis getCaixa() { ... }
```
•	Cria a instância apenas na primeira chamada e retorna a mesma instância nas próximas.


## 🧑‍🏫 Exemplo no código
```bash
CaixaDeLapis caixa1 = CaixaDeLapis.getCaixa();
caixa1.usarLapis("Maria");

CaixaDeLapis caixa2 = CaixaDeLapis.getCaixa();
caixa2.usarLapis("João");

if(caixa1 == caixa2){
    System.out.println("É a mesma caixa de lápis! ✅");
}
```

## Saída esperada:
```bash
Caixa de lápis criada!
Maria está usando a caixa de lápis.
João está usando a caixa de lápis.
É a mesma caixa de lápis! ✅
```

## 🖍️ Representação visual
```bash
[ unicaCaixa ]
     |
     +---> Maria usa lápis
     +---> João usa lápis
```
•	Regra do Singleton: só existe uma única caixa, compartilhada entre todos.


## 🚀 Como rodar o projeto
➡️ Clone o repositório:
```bash
git clone <link-do-repositório>
```
➡️ Abra o projeto no IntelliJ. Certifique-se que a estrutura está assim:
```bash
src/
 ├─ CaixaDeLapis.java
 └─ SalaDeAula.java
```
➡️ Clique com o botão direito em SalaDeAula.java → Run ‘SalaDeAula.main()’



## 💡 Observações
➡️ O Singleton é útil quando precisamos de uma instância compartilhada, como: <br>
➡️ Conexões com banco de dados <br>
➡️ Gerenciamento de configuração global <br>
➡️ Objetos de log ou cache <br>
➡️ Neste exemplo, a CaixaDeLapis é uma analogia simples para entender o conceito.

<h3>👩‍💻 Autora</h3>

Projeto desenvolvido por Beatriz Santos 🌸<br>
📌 LinkedIn: https://www.linkedin.com/in/beatriz-lima-dos-santos-?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=ios_app <br>
📌 GitHub: https://github.com/Beatriz-Lima123

<div align="center">Feito com 💙 por <a href="https://github.com/Beatriz-Lima123">BIA</a>.</div>

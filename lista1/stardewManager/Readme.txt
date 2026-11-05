# Stardew Manager

Projeto desenvolvido em Java como exercício de Programação Orientada a Objetos (POO), utilizando interfaces, herança, sobrescrita de métodos e polimorfismo.

## Sobre o projeto

O **Stardew Manager** simula o gerenciamento de animais de uma fazenda. O sistema permite visualizar os animais do curral e coletar os produtos produzidos por eles.

O projeto foi desenvolvido com base nos princípios de Programação Orientada a Objetos, utilizando uma interface comum para representar os animais e classes específicas para mães e filhotes.

## Estrutura do projeto

* `Animal` — interface que define os comportamentos dos animais.
* `VacaMae` — classe que representa a vaca adulta.
* `Bezerro` — filhote que herda de `VacaMae`.
* `GalinhaMae` — classe que representa a galinha adulta.
* `Pintinho` — filhote que herda de `GalinhaMae`.
* `stardewManager` — classe principal responsável pela execução do programa.

## Conceitos de POO utilizados

### Interface

A interface `Animal` define os comportamentos que os animais devem possuir:

```java
public interface Animal {

    void EmitirSom();

    void ExibirDados();

    void ColetarProduto();

}
```

### Herança

Os filhotes utilizam herança das respectivas classes-base:

```java
public class Bezerro extends VacaMae
```

```java
public class Pintinho extends GalinhaMae
```

Dessa forma, os filhotes aproveitam características e comportamentos das classes-pai e podem sobrescrever métodos quando necessário.

### Polimorfismo

A classe principal utiliza um array do tipo `Animal` para armazenar diferentes tipos de animais:

```java
Animal[] animais = {
    new VacaMae(...),
    new GalinhaMae(...),
    new Pintinho(...),
    new Bezerro(...)
};
```

Isso permite tratar diferentes objetos através da mesma referência `Animal`.

### Sobrescrita de métodos

As classes especializadas sobrescrevem comportamentos utilizando `@Override`.

Por exemplo, o `Pintinho` possui um som diferente da `GalinhaMae`:

```java
@Override
public void EmitirSom() {
    System.out.println("- Som: Piu-piu!");
}
```

Da mesma forma, o `Bezerro` não produz leite:

```java
@Override
public void ColetarProduto() {
    System.out.println("Bezerro não produz leite.");
}
```

## Funcionalidades

O programa possui um menu principal com as seguintes opções:

1. **Ver animais do curral**

   * Exibe os dados dos animais armazenados.
2. **Comércio**

   * Executa a coleta dos produtos de cada animal.
3. **Sair**

   * Encerra o programa.

## Exemplo de animais cadastrados

|  ID | Nome      | Tipo     | Raça      | Idade | Status       |
| --: | --------- | -------- | --------- | ----: | ------------ |
| 101 | Mimosa    | Vaca     | Holandesa |     7 | Sem filhotes |
| 102 | Giselda   | Galinha  | Caipira   |     1 | Botando ovos |
| 103 | Chiquinha | Pintinho | Caipira   |     1 | Saudável     |
| 104 | Bento     | Bezerro  | Holandesa |     1 | Dormindo     |

## Tecnologias

* Java
* Programação Orientada a Objetos
* Interface
* Herança
* Polimorfismo
* Sobrescrita de métodos
* Array de objetos

## Como executar

Compile os arquivos `.java` e execute a classe principal:

```bash
javac -d bin src/*.java
java -cp bin stardewManager
```

## Objetivo

O objetivo do projeto é praticar os principais conceitos de Programação Orientada a Objetos em Java, especialmente interfaces, herança, polimorfismo e sobrescrita de métodos.

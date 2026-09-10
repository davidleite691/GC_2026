# ⛏️ Velho Steve — Fábrica de Picaretas

Projeto desenvolvido em **Java** para praticar conceitos básicos de **Programação Orientada a Objetos (POO)**, utilizando **classes, objetos e interfaces**.

O projeto simula o sistema de fabricação, utilização e reparação de picaretas do Velho Steve.

## 📖 Sobre o projeto

O Velho Steve está cansado de precisar fabricar várias picaretas iguais sempre que vai minerar.

A proposta do projeto é utilizar POO para criar objetos que representem as picaretas, permitindo que cada uma mantenha suas próprias características e possa ser reutilizada durante a mineração.

Cada picareta possui:

* 🪵 Material
* ❤️ Durabilidade
* 💪 Força

Além disso, uma picareta pode:

* Ser fabricada;
* Minerar blocos;
* Perder durabilidade durante a mineração;
* Quebrar quando sua durabilidade chega a zero;
* Ser reparada.

## 🎯 Objetivo

O principal objetivo é demonstrar, de forma prática, a utilização de:

* **Classes**
* **Objetos**
* **Interfaces**

O projeto também demonstra como um objeto pode manter seu próprio estado durante a execução do programa.

## 🧱 Estrutura do projeto

### Interface

A interface define os comportamentos que uma picareta deve possuir:

```java
public interface PicaretaInterface {

    String fabricar();

    int minerar(int blocos);

    void reparar(int quantidade);
}
```

### Classe

A classe `Picareta` representa uma picareta e contém seus atributos e comportamentos.

```java
public class Picareta implements PicaretaInterface
```

Os principais atributos são:

```java
String material;
int durabilidade;
int forca;
```

### Objetos

Cada picareta criada no programa é um objeto independente.

Exemplo:

```java
Picareta p1 = new Picareta("madeira", 50, 5);

Picareta p2 = new Picareta("pedra", 70, 8);

Picareta p3 = new Picareta("ferro", 100, 12);
```

Cada objeto possui seus próprios valores de material, durabilidade e força.

## ⛏️ Mineração

A mineração é realizada através do método:

```java
p3.minerar(30);
```

Cada bloco minerado reduz a durabilidade da picareta em 1 ponto.

Por exemplo, uma picareta de ferro com 100 de durabilidade:

```text
Durabilidade inicial: 100

Minerando 30 blocos...

Durabilidade restante: 70
```

O mesmo objeto pode continuar sendo utilizado:

```java
p3.minerar(20);
```

Nesse caso:

```text
Durabilidade anterior: 70
Blocos minerados: 20
Durabilidade restante: 50
```

Isso permite reutilizar a mesma picareta em vez de criar uma nova a cada operação.

## 🔧 Reparação

Uma picareta também pode ser reparada:

```java
p3.reparar(50);
```

O limite máximo de durabilidade depende do material.

| Material | Durabilidade máxima |
| -------- | ------------------: |
| Madeira  |                  50 |
| Pedra    |                  70 |
| Ferro    |                 100 |
| Ouro     |                  30 |

Caso o reparo ultrapasse o limite do material, a durabilidade é ajustada para o valor máximo.

## 🛠️ Tecnologias utilizadas

* **Java**
* Programação Orientada a Objetos (POO)
* Classes
* Objetos
* Interfaces
* Estruturas condicionais
* `switch`
* Laços de repetição `for`

## ▶️ Como executar

1. Clone este repositório:

```bash
git clone URL_DO_REPOSITORIO
```

2. Abra o projeto em uma IDE compatível com Java, como **NetBeans**, **IntelliJ IDEA** ou **Eclipse**.

3. Execute a classe:

oldStevePOO.java

4. Acompanhe no terminal a fabricação, mineração e reparação das picaretas.

## 📋 Exemplo de funcionamento

```text
=== FABRICANDO PICARETA ===
Material: ferro
Durabilidade: 100
Força: 12

Picareta de ferro fabricada com sucesso!

=== MINERANDO COM PICARETA DE FERRO ===
Durabilidade atual: 100
Força: 12
Blocos a minerar: 30

Minerados 30 blocos
Durabilidade restante: 70

=== REPARANDO PICARETA DE FERRO ===
Durabilidade atual: 50
Quantidade a reparar: 50

Durabilidade nova: 100
```

## 📚 Conceitos de POO aplicados

### Classe

A classe funciona como um modelo para criar as picaretas.

### Objeto

Cada picareta criada através de `new` é um objeto com seu próprio estado.

### Interface

A interface determina os comportamentos que a classe deve implementar.

Dessa forma, o projeto representa uma situação simples do mundo real através de objetos e seus comportamentos.

## 👨‍💻 Autor

Projeto desenvolvido como atividade de estudos em **Java e Programação Orientada a Objetos**.

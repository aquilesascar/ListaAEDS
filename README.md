# Exercícios com Árvores Binárias de Busca (BST) em Java

![Java](https://img.shields.io/badge/Language-Java-blue.svg)
![License](https://img.shields.io/badge/License-MIT-green.svg)

Este repositório contém a implementação em Java de vários algoritmos e operações clássicas relacionadas a **Árvores Binárias de Busca (Binary Search Trees - BST)**. O projeto foi desenvolvido como uma forma de praticar e demonstrar conceitos fundamentais de estruturas de dados.

## 📖 Sobre o Projeto

O objetivo principal é fornecer soluções claras e bem documentadas para uma lista de exercícios propostos, cobrindo desde a criação e manipulação básica de uma BST até algoritmos mais específicos para análise de suas propriedades.

---

## 🚀 Exercícios Resolvidos

Abaixo estão os problemas implementados neste projeto:

1.  **Encontrar o Menor Valor (Iterativo)**
    - Uma função não recursiva que retorna o menor valor contido na árvore, navegando até o nó mais à esquerda.

2.  **Percursos na Árvore (Traversals)**
    - Apresentação da ordem de visita dos nós para os três percursos principais em uma árvore de exemplo:
      - `In-order` (Esquerda, Raiz, Direita)
      - `Pre-order` (Raiz, Esquerda, Direita)
      - `Post-order` (Esquerda, Direita, Raiz)

3.  **Ciclo de Vida de uma Árvore**
    - Simulação completa das operações:
      a. Inserção sequencial de uma lista de chaves (`7, 8, 4, 3, 2, 1, 6, 5`).
      b. Exibição dos percursos `in-order`, `pre-order` e `post-order` da árvore resultante.
      c. Remoção de dois nós (`7` e `6`) para demonstrar o algoritmo de deleção.

4.  **Calcular a Altura (Iterativo)**
    - Um algoritmo que utiliza travessia em largura (BFS) com uma fila para calcular a altura da árvore de forma iterativa.

5.  **Encontrar Caminhos até as Folhas**
    - Um algoritmo que retorna uma lista com todos os caminhos possíveis da raiz até cada um dos nós folha.

6.  **Contar Nós em Níveis Ímpares**
    - Um algoritmo que conta a quantidade total de nós localizados nos níveis ímpares da árvore (considerando a raiz como nível 1).

7.  **Contar Nós com Chaves Pares**
    - Uma função que percorre a árvore e retorna o número total de nós cujas chaves são valores pares.

8.  **Contar Nós com Exatamente 1 Filho**
    - Uma função que percorre a árvore e conta quantos nós possuem exatamente um filho (seja ele esquerdo ou direito).

---

## 🛠️ Estrutura das Classes

O projeto está estruturado em duas classes principais para facilitar a compreensão e a reutilização do código:

-   `Node.java`: Representa um nó individual na árvore. Contém a chave (`key`) e referências para os filhos esquerdo (`left`) e direito (`right`).

    ```java
    class Node {
        int key;
        Node left, right;
        // ...
    }
    ```

-   `BST.java`: Encapsula toda a lógica da Árvore Binária de Busca. Contém a referência para a raiz (`root`) e implementa todos os métodos de operação e os algoritmos dos exercícios.
    ```java
    class BST {
        Node root;
        // ... Métodos de inserção, remoção, percursos, etc.
    }
    ```

---

## ⚙️ Como Executar

Para compilar e executar o projeto localmente, siga os passos abaixo.

### Pré-requisitos

-   [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) versão 11 ou superior.

### Passos

1.  **Clone o repositório:**
    ```sh
    git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)
    cd seu-repositorio
    ```

2.  **Compile os arquivos Java:**
    (Assumindo que você tem as classes `Node.java`, `BST.java` e `Main.java` no mesmo diretório)
    ```sh
    javac *.java
    ```

3.  **Execute a classe principal para ver os resultados:**
    A classe `Main.java` contém exemplos de uso para demonstrar as funcionalidades.
    ```sh
    java Main
    ```

---

## 📜 Licença

Este projeto está sob a licença MIT.

---

[![GitHub](https://img.shields.io/badge/GitHub-Profile-black?style=flat-square&logo=github)](https://github.com/seu-usuario)

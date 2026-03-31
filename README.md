Resolução de Problemas com Grafos: Cavalo em Tabuleiro 3x3

Este projeto modela os movimentos possíveis de uma peça de Cavalo (do xadrez) em um tabuleiro reduzido de 3x3 utilizando a *Teoria dos Grafos*. O objetivo é analisar a conectividade e os caminhos gerados pelos movimentos da peça utilizando algoritmos clássicos de busca em grafos.

##  Sobre o Projeto

Cada casa do tabuleiro 3x3 é representada por um vértice (de 0 a 8), e cada movimento válido do cavalo (em "L") é representado por uma aresta conectando esses vértices.

O sistema responde a quatro questões fundamentais sobre o tabuleiro:
1. Como as casas (vértices) estão conectadas?
2. Quantos subconjuntos isolados de casas existem?
3. Qual é a quantidade mínima de movimentos para ir da casa inicial (0,0) até a casa final (2,2)?
4. É possível que o cavalo faça um ciclo (sair de uma casa e voltar para ela sem repetir o caminho)?

##  Funcionalidades e Algoritmos Utilizados

* *Lista de Adjacência:* Exibe a estrutura interna do grafo, mostrando quais casas estão diretamente acessíveis a partir de uma casa específica.
* *Componentes Conexas (CC):* Mapeia os conjuntos de vértices alcançáveis entre si, identificando se há casas isoladas no tabuleiro 3x3.
* *Busca em Largura / Breadth-First Search (BFS):* Utilizada para encontrar a *distância mínima* (caminho mais curto) do vértice 0 (posição 0,0) ao vértice 8 (posição 2,2).
* *Busca em Profundidade / Depth-First Search (DFS):* Utilizada pela classe Cycle para detectar a existência de *ciclos* no grafo e imprimir o caminho desse ciclo, caso exista.

Link do video explicativo https://youtu.be/My5B-TiFMME?si=7Vf4PfVeJYSYnRj8

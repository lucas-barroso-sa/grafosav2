public class Main {
    public static void main(String[] args) {
        String caminhoEntrada = "dados/entrada.txt";
        In in = new In(caminhoEntrada);
        Graph G = new Graph(in);

        System.out.println("1- Lista de Adjacencias: \n");
        System.out.println(G);


        System.out.println("2 - Componentes Conexas: \n");
        CC cc = new CC(G);
        int m = cc.count();
        System.out.println("Número de componentes conexas: " + m);
        for (int i = 0; i < m; i++) {
            System.out.print("Vértices da componente " + i + ": ");
            for (int v = 0; v < G.V(); v++) {
                if (cc.id(v) == i) System.out.print(v + " ");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("3 - Distancia entre vértices: (0,0) e (2,2)\n");
        BreadthFirstPaths bfs = new BreadthFirstPaths(G, 0);
        if (bfs.hasPathTo(8)) {
            System.out.println(bfs.distTo(8));
        } else {
            System.out.println("Inalcançável (Distância infinita)");
        }
        System.out.println();


        Cycle cycleFinder = new Cycle(G);
        System.out.print("4. O grafo possui ciclo? ");
        if (cycleFinder.hasCycle()) {
            System.out.println("Sim");
            System.out.print("5. Um ciclo encontrado: ");

            java.util.ArrayList<Integer> listaDoCiclo = new java.util.ArrayList<>();

            for (int v : cycleFinder.cycle()) {
                listaDoCiclo.add(v);
            }

            listaDoCiclo.remove(listaDoCiclo.size() - 1);

            while (listaDoCiclo.get(0) != 0) {
                int primeiro = listaDoCiclo.remove(0);
                listaDoCiclo.add(primeiro);
            }

            listaDoCiclo.add(0);

            for (int i = 0; i < listaDoCiclo.size(); i++) {
                int verticeAtual = listaDoCiclo.get(i);
                System.out.print(verticeAtual + " ");
            }
            System.out.println();

        } else {
            System.out.println("Não");
        }

        System.out.println("\n--- Análise de Complexidade (Algoritmo de Ciclo/DFS) ---");
        System.out.println("Tempo: O(V + E), pois o DFS visita cada vértice e aresta no máximo uma vez.");
        System.out.println("Espaço: O(V), para armazenar os arrays de marcação (visited) e a pilha de recursão.");

    }
}
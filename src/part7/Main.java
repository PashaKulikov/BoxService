package part7;

import java.util.Arrays;
import java.util.BitSet;

public class Main {
    public Integer[][] getGraphMatrix(int size) {
        Integer[][] matrix = new Integer[size][size];
        matrix[0][1] = 6;
        matrix[0][2] = 2;
        matrix[2][1] = 3;
        matrix[1][3] = 1;
        matrix[2][3] = 5;
        return matrix;

    }
    public void dijkstra() {
        Integer[][] graph = getGraphMatrix(5); //данные графа
        Integer[] costs = new Integer[graph.length]; //стоимость перехода
        Integer[] parents = new Integer[graph.length]; //родительский узел
        BitSet visited = new BitSet(graph.length); // "Ферма" маркеров посещенности

        Integer w = 0;
        do {
            System.out.println("Рассматриваем вершину:" + w);
            Integer min = null;
            for (int i = 0; i < graph.length; i++) { //обрабатываем каждую дугу
                if (graph[w][i] == null) continue;
                if (min == null || (!visited.get(i) && graph[w][min] > graph[w][i])) {
                    min = i;
                }
                if (costs[i] == null || costs[i] > costs[w] + graph[w][i]) {
                    System.out.println("Меняем вес с" + costs[i]);
                    costs[i] = (costs[w] != null ? costs[w] : 0) + graph[w][i];
                    System.out.println("на" + costs[i] + "для вершины" + i);
                    parents[i] = w;
                }
            }
            System.out.println("Вершина с минимальным весом:" + min);
            visited.set(w);
            w = min;
        } while (w != null);

        System.out.println(Arrays.toString(costs));
        printPath(parents, 3);
    }
    public void printPath(Integer [] parents, int target){
        Integer parent = target;
        do{
            System.out.println(parent + "<- ");
            parent = parents[parent];
        }while (parent != null);


     }

    public static void main(String[] args) {
        Main m = new Main();
        m.dijkstra();
    }

}

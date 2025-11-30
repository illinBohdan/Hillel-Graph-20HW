package app;

import java.util.Scanner;
import java.util.stream.IntStream;


public class GraphBuilder {
    Graph graph = new Graph();


    Graph createGraph(Scanner scanner) {
        createGraphVertex(scanner);
        createGraphEdge(scanner);
    //    scanner.close();
        return graph;

    }


    void createGraphVertex(Scanner scanner){
        System.out.print("Введіть кількість вершин Вашого бажаного графа -> ");
        int vertexQuantity = scanner.nextInt();
        IntStream.rangeClosed(1, vertexQuantity)
                .forEach(graph::addVertex);
    }

    void createGraphEdge(Scanner scanner){
        System.out.println("Створіть ребра між вашими вершинами");

        System.out.print("Скільки ребер ви хочете додати? ");
        int edgeCount = scanner.nextInt();

        for (int i = 0; i < edgeCount; i++) {
            System.out.println("Введіть дві вершини які ви б хотіли зєднати ребром");
            System.out.print("Перша вершина -> ");
            int source = scanner.nextInt();
            System.out.print("Друга вершина -> ");
            int destination = scanner.nextInt();
            graph.addEdge(source, destination);
        }
    }

}

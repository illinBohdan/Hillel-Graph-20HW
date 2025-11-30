package app;

import java.util.Scanner;

public class ActionGraph {

    void actionWithGraph(Graph graph, PrintGraph printGraph, Scanner scanner) {
        boolean running = true;

        while (running) {

            System.out.println("\nОберіть дію:");
            System.out.println("1 - Видалити вершину");
            System.out.println("2 - Видалити ребро");
            System.out.println("3 - Перевірити вершину");
            System.out.println("4 - Перевірити ребро");
            System.out.println("0 - Вийти");


            switch (scanner.nextInt()) {
                case 1 -> {
                    System.out.print("Введіть вершину , яку б ви хотіли видалити ->");
                    graph.removeVertex(scanner.nextInt());
                    System.out.println("Граф після видалення вершини");
                    printGraph.printGraph(graph.graphMap);
                }
                case 2 -> {
                    System.out.println("Введіть початкове і кінцеве значення ребра");
                    System.out.print("Перша вершина -> ");
                    int source = scanner.nextInt();
                    System.out.print("Друга вершина -> ");
                    int destination = scanner.nextInt();
                    graph.removeEdge(source, destination);

                    System.out.println("Граф після видалення ребра");
                    printGraph.printGraph(graph.graphMap);
                }
                case 3 -> {
                    System.out.println("Введіть значення вершини, щоб перевірити її наявність");
                    graph.hasVertex(scanner.nextInt());
                }
                case 4 -> {
                    System.out.println("Введіть початкове і кінцеве значення ребра, щоб перевірити його наявність");
                    System.out.print("Перша вершина -> ");
                    int source = scanner.nextInt();
                    System.out.print("Друга вершина -> ");
                    int destination = scanner.nextInt();
                    graph.hasEdge(source, destination);
                }

                case 0 -> {
                    System.out.println("Вихід з програми...");
                    running = false;
                }

                default -> System.out.println("Невідома команда");

            }
        }
    }


}

package app;

import java.util.Scanner;

public class GraphController {
    Scanner scanner = new Scanner(System.in);

    Graph graph = new GraphBuilder().createGraph(scanner);
    PrintGraph printGraph = new PrintGraph();

    void startGraphApp() {

        System.out.println("Граф після створення");

        printGraph.printGraph(graph.graphMap);

        new ActionGraph().actionWithGraph(graph, printGraph, scanner);
    }
}

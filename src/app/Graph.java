package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Graph {

    Map<Integer, List<Integer>> graphMap = new HashMap<>();


    void addVertex(int vertex) {
        graphMap.putIfAbsent(vertex, new ArrayList<>());
    }

    void addEdge(int source, int destination) {
        graphMap.computeIfPresent(source, (key, list) -> {
            list.add(destination);
            return list;
        });
        graphMap.computeIfPresent(destination, (key, list) -> {
            list.add(source);
            return list;
        });
    }

    void removeVertex(int vertex) {
        graphMap.remove(vertex);
        graphMap.forEach((key, list) -> list.remove(Integer.valueOf(vertex)));
    }

    void removeEdge(int source, int destination) {
        graphMap.computeIfPresent(source, (key, list) -> {
            list.remove(Integer.valueOf(destination));
            return list;
        });

        graphMap.computeIfPresent(destination, (key, list) -> {
            list.remove(Integer.valueOf(source));
            return list;
        });

    }

    void hasVertex(int vertex) {
        System.out.println( graphMap.containsKey(vertex)?
                "Вершина " + vertex + " присутня в даному графі":
                "Вершина " + vertex + " відсутня в даному графі");


    }

    void hasEdge(int source, int destination) {
        boolean b = graphMap.containsKey(source) &&
                graphMap.get(source).stream().anyMatch(x -> x == destination);
        System.out.printf("Ребро %d -> %d та %d -> %d %s в даному графі%n",
                source, destination, destination, source,
                b ? "присутнє" : "відсутнє");
    }
}

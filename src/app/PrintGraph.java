package app;

import java.util.List;
import java.util.Map;

public class PrintGraph {

    void printGraph(Map<Integer, List<Integer>> graph){
graph.forEach((key, list) ->
        System.out.println(key + " -> " + list));
    }
}

package com.yuehua.algorithm.breadthFirstSearch;

import java.util.*;

public class BreadthFirstSearchDemo {
    private static final Map<String, List<String>> graph = new HashMap<>();
    public static void main(String[] args) {
        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", List.of("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));
        graph.put("anuj", Collections.emptyList());
        graph.put("peggy", Collections.emptyList());
        graph.put("thom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());

        boolean res = breadthSearch("you");
        System.out.println(res);
    }

    private static boolean breadthSearch(String name) {
        Queue<String> searchQueue = new ArrayDeque<>(graph.get(name));
        List<String> searched = new ArrayList<>();
        while (!searchQueue.isEmpty()) {
            String cur = searchQueue.poll();
            if (!searched.contains(cur)){
                if (cur.startsWith("t")){
                    return true;
                }else {
                    searchQueue.addAll(graph.get(cur));
                    searched.add(cur);
                }
            }
        }
        return false;
    }
}

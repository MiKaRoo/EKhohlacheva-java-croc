package ru.croc.task14;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String films = "/Users/ekaterinahohlaceva/IdeaProjects/EKhohlacheva-java-croc/week5/src/ru/croc/task14/films.txt";
        String history = "/Users/ekaterinahohlaceva/IdeaProjects/EKhohlacheva-java-croc/week5/src/ru/croc/task14/history.txt";
        Graph graph = new Graph();

        try {
            graph.initialize(films, history);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Integer> request= Arrays.asList(2,1);
        System.out.println(graph.getRecommended(request));
    }
}
package ru.croc.task13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ImplBlackListFilter filter = new ImplBlackListFilter();

        List<String> comments = new ArrayList<>();
        comments.add("ураа");
        comments.add("добрый день");
        comments.add("нельзя");
        comments.add("привет,как дела?");
        comments.add("темная ночь  ");

        Set<String> blackList = new HashSet<>();
        blackList.add("ночь");
        blackList.add("дела");

        filter.filterComments(comments, blackList);
        for (String c : comments) {
            System.out.println(c);
        }


    }
}
package ru.croc.task13;

import java.util.List;
import java.util.Set;

public interface BlackListFilter {
    void filterComments(List<String> comments, Set<String> blackList);
}

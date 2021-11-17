package ru.croc.task13;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ImplBlackListFilter implements BlackListFilter {
    @Override
    public void filterComments(List<String> comments, Set<String> blackList) {
        Iterator<String> it = comments.iterator();
        while (it.hasNext()) {
            String comment = it.next();
            if (comment == null)
                continue;
            for (String stopWord : blackList) {
                if (comment.contains(stopWord)) {
                    it.remove();
                }
            }
        }

    }
}
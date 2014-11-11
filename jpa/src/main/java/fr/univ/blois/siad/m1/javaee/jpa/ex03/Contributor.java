package fr.univ.blois.siad.m1.javaee.jpa.ex03;

import java.util.Date;
import java.util.Set;

public class Contributor extends User {

    private Date lastAccess;

    private Set<Article> articleSet;

    public Contributor() {
    }

    public Set<Article> getArticleSet() {
        return articleSet;
    }

    public void setArticleSet(Set<Article> articleSet) {
        this.articleSet = articleSet;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }
}

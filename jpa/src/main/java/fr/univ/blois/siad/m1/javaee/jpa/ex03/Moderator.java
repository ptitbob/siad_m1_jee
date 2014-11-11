package fr.univ.blois.siad.m1.javaee.jpa.ex03;


public class Moderator extends User {

    private ModeratorRules moderatorRules;

    public Moderator() {
    }

    public ModeratorRules getModeratorRules() {
        return moderatorRules;
    }

    public void setModeratorRules(ModeratorRules moderatorRules) {
        this.moderatorRules = moderatorRules;
    }
}

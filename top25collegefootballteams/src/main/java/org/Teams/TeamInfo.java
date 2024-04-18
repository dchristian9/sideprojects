package org.Teams;

public interface TeamInfo {
    boolean matchesHeadCoach(String searchStr);
    boolean matchesRecord(int searchStr);
    boolean matchesRanking(int searchRank);
    boolean matchesConference(String searchStr);
    boolean matchesTeam(String searchStr);
    void addTeams();
}

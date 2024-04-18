package org.Teams;

public class FigureOutTop25 implements TeamInfo{
    private String headCoach;
    private int record;
    private String teamName;
    private String conference;
    private int ranking;

    public FigureOutTop25(String headCoach, int record, String teamName, String conference, int ranking) {
        this.headCoach = headCoach;
        this.record = record;
        this.teamName = teamName;
        this.conference = conference;
        this.ranking = ranking;
    }

    public String toString(){
        return "'" + getTeamName() + System.lineSeparator() + "'Coached by: " + getHeadCoach() + System.lineSeparator() +
                "'Team Record: " + getRecord() + System.lineSeparator() + "'Team Conference: " + getConference() + System.lineSeparator() +
                "'Team Rank: " + getRanking();
    }
    @Override
    public boolean matchesHeadCoach(String searchStr) {
        boolean matchHC = false;
        if(headCoach.toLowerCase().contains(searchStr.toLowerCase())){
            if(headCoach.equalsIgnoreCase(searchStr)){
                matchHC = true;
            }
        }
        return matchHC;
    }

    @Override
    public boolean matchesRecord(int searchStr) {
        boolean matchRec = false;
        if(record == searchStr){
            matchRec = true;
        }
        return matchRec;
    }

    @Override
    public boolean matchesRanking(int searchRank) {
        boolean matchRank = false;
        if(ranking == searchRank){
            matchRank = true;
        }
        return matchRank;
    }

    @Override
    public boolean matchesConference(String searchStr) {
        boolean matchConf = false;
        if(conference.toLowerCase().contains(searchStr.toLowerCase())){
            if(conference.equalsIgnoreCase(searchStr)){
                matchConf = true;
            }
        }
        return matchConf;
    }

    @Override
    public boolean matchesTeam(String searchStr) {
        boolean matchT = false;
        if(teamName.toLowerCase().contains(searchStr.toLowerCase())){
            if(teamName.equalsIgnoreCase(searchStr)){
                matchT = true;
            }
        }
        return matchT;
    }

    @Override
    public void addTeams() {
        //write file to new file
        WriteAndReadFile.writeFile(toString(), "src/main/resources/teams/", true);
    }


    //getters and setters

    public String getHeadCoach() {
        return headCoach;
    }

    public void setHeadCoach(String headCoach) {
        this.headCoach = headCoach;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}

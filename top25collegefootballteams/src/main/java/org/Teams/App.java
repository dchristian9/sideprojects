package org.Teams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {

    private static final String DELIMINATOR = "\\|";
    private static final String FILE_PATH = "";
    private final Scanner keyboard = new Scanner(System.in);

    Map<String, List<TeamInfo>> teams = new HashMap<>();
    private void run(){
        if(teams.isEmpty()){
            System.out.println("Teams must not be empty for application to run");
            return;
        }
        while(true) {
            printMainMenu();

        }
    }

    private void printMainMenu(){
        System.out.println("1: Display all teams");
        System.out.println("2: Display specific team information");
        System.out.println("0: Exit");
        System.out.println();
    }

    private void searchMenu(){
        System.out.println("1: Team");
        System.out.println("2: Record");
        System.out.println("3: Ranking");
        System.out.println("4: Conference");
        System.out.println("5: Head Coach");
        System.out.println("0: Return to main menu");
        System.out.println();
    }

    private void displayAllTeams(Map<String, List<TeamInfo>> teams){
        System.out.println("All Teams");
        System.out.println("------");
        for(Map.Entry<String, List<TeamInfo>> entry : teams.entrySet()){
            System.out.println(entry.getKey() + ": ");
            for(TeamInfo team : entry.getValue()){
                System.out.println(team.toString());
            }
            System.out.println();
        }
        System.out.println();
        // prompt for return
    }

    private void displayTeams(Map<String, List <TeamInfo>> teams){
        System.out.println("Teams");
        System.out.println("------");
        for(Map.Entry<String, List<TeamInfo>> entry : teams.entrySet()){
            System.out.println(entry.getKey());
        }
        System.out.println();
    }

    private void displayRecord(Map<String, List<TeamInfo>> teams, int record){
        System.out.println("Matches record: " + record);
        System.out.println("------");
        for(Map.Entry<String, List<TeamInfo>> team : teams.entrySet()){
            boolean hasMatch = false;
            System.out.println(team.getKey() + ": ");
            for(TeamInfo entry : team.getValue()){
                if(entry.matchesRecord(record)){
                    System.out.println(entry);
                    hasMatch = true;
                }
            }
            if(!hasMatch){
                System.out.println("No matching record.");
            }
            System.out.println();
        }
        System.out.println();
        // return
    }

//    private int promptForMainMenuSelection(String prompt){
//        System.out.println(prompt);
//        int menuSelection;
//
//    }
}
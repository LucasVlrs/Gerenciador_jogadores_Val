package br.edu.ifba.lucasV.avaliacao1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.ifba.lucasV.avaliacao1.impl.OperationsImpl;
import br.edu.ifba.lucasV.avaliacao1.impl.Player;
import br.edu.ifba.lucasV.avaliacao1.match.Match;

public class App {

    public static final int NO_OF_PLAYERS = 10;
    public static final int NO_OF_MATCHES_PLAYED_AT_ONCE = 50;

    public static void main(String[] args) throws Exception {
        OperationsImpl op = new OperationsImpl();
        List<Player> players = new ArrayList<>();
        List<Match> matches = new ArrayList<>();

        for (int i = 0; i < NO_OF_PLAYERS; i++) {
            Player p = new Player();
            p.setNickname(p.generateNickname());
            players.add(p);
        }

        Scanner sc = new Scanner(System.in);

        int matchId = 1;
        boolean exit = false;

        while (!exit) {
            System.out.println("+-----------------------+");
            System.out.println("|         MENU          |");
            System.out.println("| 1- Play               |");
            System.out.println("| 2- Players List       |");
            System.out.println("| 3- Matches List       |");
            System.out.println("| 4- Update Leaderboard |");
            System.out.println("| 5- Custom Match       |");
            System.out.println("| 6- Exit               |");
            System.out.println("+-----------------------+");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    op.playMatch(players, matches, NO_OF_MATCHES_PLAYED_AT_ONCE, matchId);
                    break;
                case 2:
                    op.printPlayers(players);
                    break;
                case 3:
                    op.printMatches(matches);
                    break;
                case 4:
                    op.order(players);
                    System.out.println("Player list updated according to the Leadderboard!");
                    break;
                case 5:
                    op.printTeams(op.createCustomMatch(players));
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Unvalid option! Options are 1-6.");
                    break;
            }
        }

        sc.close();
    }
}

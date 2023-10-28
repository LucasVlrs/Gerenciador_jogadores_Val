package br.edu.ifba.lucasV.avaliacao2_caso1;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.lucasV.avaliacao2_caso1.cloud.operations.impl.OperationsImpl;
import br.edu.ifba.lucasV.avaliacao2_caso1.edge.match.Match;
import br.edu.ifba.lucasV.avaliacao2_caso1.model.Player;

public class App {

    public static final int NO_OF_PLAYERS = 10;
    public static final int NO_OF_MATCHES_PLAYED_AT_ONCE = 1;

    public static void main(String[] args) throws Exception {
        OperationsImpl op = new OperationsImpl();
        List<Player> players = new ArrayList<>();
        List<Match> matches = new ArrayList<>();

        for (int i = 0; i < NO_OF_PLAYERS; i++) {
            Player p = new Player();
            p.setNickname(p.generateNickname());
            players.add(p);
        }

        int matchId = 1;
        // play, update leaderboard, players list, custom match
        
        op.playMatch(players, matches, NO_OF_MATCHES_PLAYED_AT_ONCE, matchId);

        op.order(players);
        System.out.println("Player list updated according to the Leadderboard!");
        op.printPlayers(players);
        op.printTeams(op.createCustomMatch(players));
    }
}
package br.edu.ifba.lucasV.avaliacao1.impl;

import java.util.ArrayList;
import java.util.List;
import br.edu.ifba.lucasV.avaliacao1.match.Match;
import br.edu.ifba.lucasV.avaliacao1.operations.Operations;

public class OperationsImpl implements Operations {

    // COMPLEXIDADE: O(n^3), apesar de serem apenas 2 loops for, o método chamado
    // pirntStatistics() possui um loop for.
    @Override
    public void playMatch(List<Player> players, List<Match> matches, int NO_OF_MATCHES_PLAYED_AT_ONCE, int matchId) {
        for (Player player : players) {
            for (int i = 0; i < NO_OF_MATCHES_PLAYED_AT_ONCE; i++) {
                Match m = new MatchImpl(matchId);
                matchId++;
                m.addStatistics(m.generateStatistics(player));
                matches.add(m);
                m.printStatistics();
            }
        }
    }

    // COMPLEXIDADE: O(n); Sendo n o número de players, faz operações simples, é
    // linera em relação ao numero de players na lista de players.
    @Override
    public void printPlayers(List<Player> players) {
        System.out.println("Players List:");
        for (Player player : players) {
            System.out.println("Player Nickname: " + player.getNicknamee());
            System.out.println("Elo: " + player.getElo());
            System.out.println("----------------");
        }
    }

    // COMPLEXIDADE: O(n); Sendo n o número de players, faz operações simples, é
    // linera em relação ao numero de partidas na lista de partidas.
    @Override
    public void printMatches(List<Match> matches) {
        for (Match match : matches) {
            System.out.println("Match: " + match.getId());
            match.whoPlayed();
            System.out.println("----------------");
        }
    }

    // COMPLEXIDADE: O(n^2); Usando um Bubble sort, que não é eficiente em listas
    // muito grandes, há 2 loop for aninhados.
    @Override
    public List<Player> order(List<Player> players) {

        int n = players.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (players.get(j).compareByScore(players.get(j + 1)) < 0) {
                    Player temp = players.get(j);
                    players.set(j, players.get(j + 1));
                    players.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        return players;
    }

    // COMPLEXIDADE: O(n * log(n)); Apesar da criação de times ser O(n), a linha 87
    // "players.sort((p1, p2) -> Integer.compare(p2.getScore(), p1.getScore()));"
    // tem complexidade geral O(n * log(n)) dando esta complexidade geral ao método
    // por inteiro
    @Override
    public List<List<Player>> createCustomMatch(List<Player> players) {
        players.sort((p1, p2) -> Integer.compare(p2.getScore(), p1.getScore()));

        List<List<Player>> teams = new ArrayList<>();
        teams.add(new ArrayList<>()); // Time 1
        teams.add(new ArrayList<>()); // Time 2

        int teamIndex = 0;

        for (Player player : players) {
            teams.get(teamIndex).add(player);

            teamIndex = (teamIndex + 1) % 2;
        }
        return teams;
    }

    // COMPLEXIDADE: O(n^2); pois depende da quantidade de times em times e da
    // quantidade de jogadores por time.
    public void printTeams(List<List<Player>> teams) {
        int i = 1;
        for (List<Player> team : teams) {
            System.out.println("Team" + i + ":");
            i++;
            for (Player player : team) {
                System.out.println("Nickname: " + player.getNicknamee() + " Elo: " + player.getElo());
            }
        }
    }

}

package br.edu.ifba.lucasV.avaliacao2_caso1.edge.match.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.edu.ifba.lucasV.avaliacao2_caso1.edge.match.Match;
import br.edu.ifba.lucasV.avaliacao2_caso1.edge.match.Statistics;
import br.edu.ifba.lucasV.avaliacao2_caso1.model.Agent;
import br.edu.ifba.lucasV.avaliacao2_caso1.model.Map;
import br.edu.ifba.lucasV.avaliacao2_caso1.model.Player;

public class MatchImpl implements Match {

    private int id;
    private List<Statistics> statistics;

    // Complexidade: O(1)
    public MatchImpl(int id) {
        this.id = id;
        this.statistics = new ArrayList<>();
    }

    // Complexidade: O(1)
    @Override
    public int getId() {
        return id;
    }

    // Complexidade: O(1)
    @Override
    public Statistics generateStatistics(Player player) {
        Random rdm = new Random();

        int kills = rdm.nextInt(40);
        int deaths = rdm.nextInt(40);
        boolean victory = rdm.nextBoolean();
        int points = rdm.nextInt(35);

        int valuesM = Map.values().length;
        int rdmIndexM = rdm.nextInt(valuesM);
        Map map = Map.values()[rdmIndexM];

        int valuesA = Agent.values().length;
        int rdmIndexA = rdm.nextInt(valuesA);
        Agent agent = Agent.values()[rdmIndexA];

        if (!victory) {
            points = points * (-1);
        }

        int score = player.getScore() + points;
        player.setScore(score);

        Statistics s = new Statistics(player, kills, deaths, victory, points, map, agent);
        return s;
    }

    // Complexidade: O(1)
    @Override
    public void addStatistics(Statistics statistics) {
        this.statistics.add(statistics);
    }

    // Complexidade: O(n)
    @Override
    public void printStatistics() {
        System.out.println("Match " + id + " stats:");
        for (Statistics stat : statistics) {
            System.out.println("Player: " + stat.getPlayer().getNicknamee());
            System.out.println("Kills: " + stat.getKills());
            System.out.println("Deaths: " + stat.getDeaths());
            System.out.println("W/L: " + stat.isVictory());
            System.out.println("Pts: " + stat.getPoints());
            System.out.println("Map: " + stat.getMap());
            System.out.println("Agent: " + stat.getAgent());
            System.out.println("K/D: " + stat.getKD(stat.getKills(), stat.getDeaths()));
            System.out.println();
        }
    }

    // Complexidade: O(n)
    @Override
    public void whoPlayed() {
        for (Statistics stat : statistics) {
            System.out.println("Player: " + stat.getPlayer().getNicknamee());
        }
    }
}

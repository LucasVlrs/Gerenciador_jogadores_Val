package br.edu.ifba.lucasV.avaliacao1.impl;

import br.edu.ifba.lucasV.avaliacao1.match.*;

public class Statistics {
    private Player player;
    private int kills;
    private int deaths;
    private boolean victory;
    private int points;
    private Map map;
    private Agent agent;

    // Todos os métodos desta classe possuem complexidade O(1). Há apenas gtters,
    // setters e certas atribuições de valores à variáveis.

    public Statistics(Player player, int kills, int deaths, boolean victory, int points, Map map, Agent agent) {
        this.player = player;
        this.kills = kills;
        this.deaths = deaths;
        this.victory = victory;
        this.points = points;
        this.map = map;
        this.agent = agent;
    }

    public Double getKD(int kills, int deaths) {
        double kdA = (double) kills / deaths;
        double kd = Math.round(kdA * 100.0) / 100.0;
        return kd;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public String isVictory() {
        String res = "";
        if (victory) {
            res = "Victory";
        } else {
            res = "Defeat";
        }
        return res;
    }

    public void setVictory(boolean victory) {
        this.victory = victory;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

}
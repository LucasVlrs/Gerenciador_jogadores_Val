package br.edu.ifba.lucasV.avaliacao2_caso1.model;

import java.util.Random;

public class Player {
    private String nickname;
    private int score;

    public Player(String nickname) {
        this.nickname = nickname;
    }

    public Player() {

    }

    // COMPLEXIDADE: O(1); Os getters e setters apenas retornam ou atribuem valor a
    // variáveis.
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    // COMPLEXIDADE: O(1); Os getters e setters apenas retornam ou atribuem valor a
    // variáveis.
    public String getNicknamee() {
        return nickname;
    }

    // COMPLEXIDADE: O(1); Os getters e setters apenas retornam ou atribuem valor a
    // variáveis.
    public int getScore() {
        return score;
    }

    // COMPLEXIDADE: O(1); Os getters e setters apenas retornam ou atribuem valor a
    // variáveis.
    public void setScore(int score) {
        this.score = score;
    }

    // COMPLEXIDADE: O(1); Há apenas if's dentro do método.
    public String getElo() {
        String elo = "";
        if (getScore() < -150) {
            elo = "Iron";
        } else if (getScore() >= -150 && getScore() < -50) {
            elo = "Bronze";
        } else if (getScore() >= -50 && getScore() < 50) {
            elo = "Silver";
        } else if (getScore() >= 50 && getScore() < 150) {
            elo = "Gold";
        } else if (getScore() >= 150 && getScore() < 250) {
            elo = "Platinum";
        } else if (getScore() >= 250 && getScore() < 350) {
            elo = "Diamond";
        } else if (getScore() >= 350 && getScore() < 450) {
            elo = "Ascendant";
        } else if (getScore() >= 450 && getScore() < 550) {
            elo = "Immortal";
        } else if (getScore() >= 550) {
            elo = "Radiant";
        }

        return elo;
    }

    // COMPLEXIDADE: O(1); Há apenas um loop que faz 3 iterações (o string builder
    // não afeta a operação).
    public String generateNickname() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder nickname = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int indiceAleatorio = random.nextInt(caracteres.length());
            char caractereAleatorio = caracteres.charAt(indiceAleatorio);
            nickname.append(caractereAleatorio);
        }
        setNickname(nickname.toString());
        return nickname.toString();
    }

    // COMPLEXIDADE: o(1); O compare do Integer é O(1), logo a complexidade geral é
    // O(1).
    public int compareByScore(Player otherPlayer) {
        return Integer.compare(this.score, otherPlayer.score);
    }
}

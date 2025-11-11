package com.example.wrapper;

import java.util.List;

public class GameScoreboardTask {
    private List<Integer> scores;

    public GameScoreboardTask(List<Integer> scores) {
        this.scores = scores;
    }

    public int countPlayersNotPlayed() {
        int count = 0;
        for (Integer score : scores) {
            if (score == null) {
                count++;
            }
        }
        return count;
    }

    public int calculateTotalValidScores() {
        int total = 0;
        for (Integer score : scores) {
            if (score != null) {
                total += score;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> playerScores = List.of(10, null, 20, 30, null, 40);
        GameScoreboardTask scoreboard = new GameScoreboardTask(playerScores);

        int notPlayedCount = scoreboard.countPlayersNotPlayed();
        int totalValidScores = scoreboard.calculateTotalValidScores();

        System.out.println("Players who have not played: " + notPlayedCount);
        System.out.println("Total of valid scores: " + totalValidScores);
    }
}
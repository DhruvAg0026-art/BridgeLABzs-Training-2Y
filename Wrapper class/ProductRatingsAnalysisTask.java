package com.example.wrapper;

import java.util.ArrayList;

public class ProductRatingsAnalysisTask {
    
    private int[] ratingsArray;
    private ArrayList<Integer> ratingsList;

    public ProductRatingsAnalysisTask(int[] ratingsArray, ArrayList<Integer> ratingsList) {
        this.ratingsArray = ratingsArray;
        this.ratingsList = ratingsList;
    }

    public double calculateAverageRatings() {
        int totalRatings = 0;
        int count = 0;

        // Calculate average from ratingsArray
        if (ratingsArray != null) {
            for (int rating : ratingsArray) {
                totalRatings += rating;
                count++;
            }
        }

        // Calculate average from ratingsList
        if (ratingsList != null) {
            for (Integer rating : ratingsList) {
                if (rating != null) {
                    totalRatings += rating;
                    count++;
                }
            }
        }

        return count > 0 ? (double) totalRatings / count : 0.0;
    }

    public static void main(String[] args) {
        int[] ratingsArray = {5, 4, 3, 5, 2};
        ArrayList<Integer> ratingsList = new ArrayList<>();
        ratingsList.add(4);
        ratingsList.add(5);
        ratingsList.add(null); // Example of a null rating

        ProductRatingsAnalysisTask analysisTask = new ProductRatingsAnalysisTask(ratingsArray, ratingsList);
        double average = analysisTask.calculateAverageRatings();
        System.out.println("Average Ratings: " + average);
    }
}
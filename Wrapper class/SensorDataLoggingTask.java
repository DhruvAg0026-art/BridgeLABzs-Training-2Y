package com.example.wrapper;

import java.util.ArrayList;
import java.util.List;

public class SensorDataLoggingTask {
    private List<Double> sensorData;

    public SensorDataLoggingTask() {
        sensorData = new ArrayList<>();
    }

    public void logSensorData(double data) {
        sensorData.add(data); // Auto-boxing from primitive to Double
    }

    public void displaySensorData() {
        for (Double data : sensorData) { // Auto-unboxing from Double to double
            System.out.println("Sensor Data: " + data);
        }
    }

    public double calculateAverage() {
        if (sensorData.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (Double data : sensorData) {
            sum += data; // Auto-unboxing
        }
        return sum / sensorData.size();
    }

    public static void main(String[] args) {
        SensorDataLoggingTask task = new SensorDataLoggingTask();
        task.logSensorData(23.5);
        task.logSensorData(19.8);
        task.logSensorData(22.1);
        
        task.displaySensorData();
        System.out.println("Average Sensor Data: " + task.calculateAverage());
    }
}
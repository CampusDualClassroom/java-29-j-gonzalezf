package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Excepción controlada: " + e.getMessage());
        }
    }
}

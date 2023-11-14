//package org;
//
//public class ModernSwitchExample {
//    public static void main(String[] args) {
//        String day = "MONDAY";
//
//        // Using modern switch as an expression
//        String typeOfDay = switch (day) {
//            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
//            case "SATURDAY", "SUNDAY" -> "Weekend";
//            default -> "Unknown";
//        };
//
//        System.out.println("Day Type: " + typeOfDay);
//
//        // Using modern switch as a statement
//        switch (day) {
//            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> System.out.println(day + " is a Weekday");
//            case "SATURDAY", "SUNDAY" -> System.out.println(day + " is a Weekend");
//            default -> System.out.println("Unknown Day");
//        }
//    }
//}

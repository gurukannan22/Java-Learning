//package com.myspringapplication.leo.service;
//
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//public class JsonParser {
//    public static void parseJsonString(String jsonString ) {
//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            JsonNode jsonNode = objectMapper.readTree(jsonString);
//            String name = jsonNode.get("name").asText();
//            int age = jsonNode.get("age").asInt();
//            String city = jsonNode.get("city").asText();
//
//            System.out.println("Name :" + name);
//            System.out.println("Age :" + age);
//            System.out.println("City :" + city);
//
//        } catch (Exception e) {
//            System.out.println("Invalid JSON: " + e.getMessage());
//        }
//
//    }
//
//    public static void main(String[] args) {
//        String jsonString = "{ \"name\": \"Guru\", \"age\": 25, \"city\": \"Chennai\" }";
//        parseJsonString(jsonString);
//    }
//}

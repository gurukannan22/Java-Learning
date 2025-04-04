package com.myspringapplication.leo.service;

public class Polymorphism {
    class add{
        int x,y;
        public void add(int x, int n){

        }
    }

    class add2 extends add{

        @Override
        public void add(int y, int k) {
            super.add(y, k);
        }
    }
}

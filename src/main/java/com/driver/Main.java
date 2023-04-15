package com.driver;

public class Main {

    public static void main(String[] args) {
      Product product=new Product();
      int ans=product.product(10,20);
      int ans1= product.product(10,20,30);
      double ans2= product.product(10.25,20.15);
      System.out.println(ans+" "+ans1+" "+ans2);

    }
    public static class Product{
        public int product(int x,int y){
         return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public double product(double x,double y){
            return x*y;
        }
    }
}
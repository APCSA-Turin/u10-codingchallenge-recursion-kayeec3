    package com.example.project;

    public class RecursionChallenge {

            public static int bunnyEars(int n){
                if (n == 0) {
                    return n;
                }
                else {
                    return 2 + bunnyEars(n-1);
                }
            }
        
            public static int factorial(int n){
                if (n == 1 || n == 0){
                    return 1; 
                } else {
                    return n * factorial(n - 1); 
                }
            }

            public static int sumNumbers(int n){
                if (n == 1){
                    return 1; 
                } else {
                    return n + sumNumbers(n - 1); 
                }
            }

            public static String countDown(int n){
                if (n == 0){
                    return "Blast Off!"; 
                } else {
                    return n + countDown(n - 1) + " Blast Off!"; 
                }
            }

            public static int power(int x, int n){
                if (n == 1){
                    return x; 
                } else {
                    return x * power(x, n - 1); 
                }
            }

            public static int fib(int n){
                if (n == 0){
                    return 0; 
                }
                if (n == 1){
                    return 1; 
                }
                return fib(n - 1) + fib(n - 2); 
            }

            public static int countX(String s){
                if (s.length()<=1) {
                    if (s.equals("x")) {
                        return 1;
                    }
                    else {
                        return 0;
                    }
                }
                else {
                    return countX(s.substring(0,s.length()/2)) + countX(s.substring(s.length()/2));
                }
            }

            public static String changePi(String s){
                if (s.length() == 0){
                    return ""; 
                } else {
                    if (s.startsWith("pi")){
                        return "3.14" + changePi(s.substring(2));
                    } else {
                        return s.substring(0, 1) + changePi(s.substring(1));
                    }
                }
            }


            public static String reverse(String s){
                if (s.length() < 1){
                    return s; 
                } else {
                    return reverse(s.substring(1)) + s.charAt(0);
                }
            }

            public static Boolean isPalindrome(String s){
                String j = s;
                if (j.length() == 1 || j == "") {
                    return true;
                }
                else if (j.substring(0,1).equals(j.substring(j.length()-1,j.length()))) {
                    j = j.substring(0,j.length()-2);
                    isPalindrome(j);
                    return true;
                }
                else {
                    return false;
                }
            }

    }
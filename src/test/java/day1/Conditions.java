package day1;

public class Conditions {
    public static void main(String[] args) {


        String a = "Akshay";
        String b = "akshay";

//case sensitive
        if (a == b) {

            System.out.println("a is equal to b");

        } else {
            System.out.println("a is not equal to b");

        }

        if (a.equals(b)) {

            System.out.println("a is equal to b");


        } else {
            System.out.println("a is not equal to b"

            );
            if (a.equalsIgnoreCase(b)) {

                System.out.println("a is equal to b");


            } else {
                System.out.println("a is not equal to b"

                );


            }

        }

    }}

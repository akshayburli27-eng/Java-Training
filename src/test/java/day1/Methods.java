package day1;

public class Methods {


    public void add (int a, int b){

        int result = a+b;

      System.out.println(result);

    }

    public void name (String city){

        System.out.println("City name: " + city);
    }

    public int salary (int x, int y){

        return  x+y;


    }




    public static void main(String[] args) {

        Methods m = new Methods();
        m.add(34,78);
        m.name("banglore");
        int z= m.salary(5,5);
        System.out.println(z+9);// return value we can modify



    }

}

public class Main {

    public static void main(String[] args) {
        String[][] cities = new String[3][3];

        cities[0][0] = "* ";
        cities[0][1] = "* ";
        cities[0][2] = "* ";
        cities[1][0] = "- ";
        cities[1][1] = "- ";
        cities[1][2] = "- ";
        cities[2][0] = "+ ";
        cities[2][1] = "+ ";
        cities[2][2] = "+ ";

        for (String[] cityArray : cities) {
            for (String city : cityArray) {
                System.out.println(city);
            }
        }

        System.out.println("--------------");

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(cities[i][j]);
            }
        }
    }
}


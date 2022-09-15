public class DatabaseHelper {
    //inner class
    public static class Crud { //Create read update delete
        public static void create() {
            System.out.println("Create");
        }

        public static void read() {
            System.out.println("Read");
        }

        public static void update() {
            System.out.println("Update");
        }

        public static void delete() {
            System.out.println("Delete");
        }
    }

    //inner class
    public static class Connection {
        public static void createConnection() {
            System.out.println("Create Connection");
        }

        public static void deleteConnection() {
            System.out.println("Delete Connection");
        }
    }
}

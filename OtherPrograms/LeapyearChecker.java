
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (year < 0) {
            System.out.println("Given Year is Invalid Input.");
        } else {
            if (year % 4 == 0) {
                System.out.println("Leap Year.");
            } else {
                System.out.println("Not a Leap Year.");
            }
        }
    }
}

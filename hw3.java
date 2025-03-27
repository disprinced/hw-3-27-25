private static String printDay(int dayNum){
    switch (dayNum){
        case 1:
            return "Monday";
        case 2:
            return "Tuesday";
        case 3:
            return "Wednesday";
        case 4:
            return "Thursday";
        case 5:
            return "Friday";
        case 6:
            return "Saturday";
        case 7:
            return "Sunday";
        default:
            return "Not found.";
    }
}
public static void main(String[] args) {
System.out.println(printDay(100));
}

 class SwitchCode {
    public static void main(String[] args) {
        int month = 4;
        String name;

        switch (month) {
            case 1:
                name = "January";
                break;
            case 2:
                name = "February";
                break;
            case 3:
                name = "March";
                break;
            case 4:
                name = "April";
                break;
            case 5:
                name = "May";
                break;
            default:
                name = "Invalid Month";
                break;
        }
        System.out.println(name);
    }
}

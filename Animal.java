class Animal {

    public static String getDefaultGreeting() {
        return "hello!";
    }

    public static String getCatGreeting() {
        return "meoww!";
    }

    public static void main(String[] args) {
        String output = " ";
        if (args[0].equalsIgnoreCase("cat")) {
            output = getCatGreeting();
        } else {
            output = getDefaultGreeting();
        }
        System.out.println(output);

    }

}
public class ServerNameGenerator {
    public static String [] adjectiveList = {
            ("funky"),
            ("fat"),
            ("funny"),
            ("lovely"),
            ("smelly"),
            ("estute"),
            ("distant"),
            ("delightful"),
            ("brawny"),
            ("chicken-like")

    };
    public static String[] nounList = {
            ("jar"),
            ("jabroni"),
            ("Steve Austin"),
            ("building"),
            ("jelly"),
            ("nighthawk"),
            ("love"),
            ("puppy"),
            ("buffalo"),
            ("parachute")
    };

    public static void main(String[] args) {
        for (int i = 0; i<10; i++){
            randomServerName(adjectiveList,nounList);
        }
    }

    public static String randomElement (String[] arry1){
        int i = arry1.length;
        int randoNum = (int) Math.floor(Math.random()* i);
        return arry1[randoNum];
    }

    public static String randomServerName (String[] arry1, String[] arry2){
        String serverName = ("Your Random Server name is: \n" + randomElement(arry1).toUpperCase() + " " + randomElement(arry2).toUpperCase());
        System.out.println(serverName);
        return serverName;
    }
}

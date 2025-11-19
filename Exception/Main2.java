public class Main2 {
    public static void main(String[] args) {
        String[] grades = {"90","A+","85"};
        for(String g : grades){
            try {
                int x = Integer.parseInt(g);
                System.out.println(x);
            } catch(NumberFormatException e){
                System.out.println("Invalid grade input: " + g);
            }
        }
    }
}

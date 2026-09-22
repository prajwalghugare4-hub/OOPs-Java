package enumExample;

public class Main {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
        // These are constants
        // Cannot Create Child class
    }

    public static void main(String[] args) {
        Week week;
        week=Week.Monday;

        for(Week day:Week.values()){
            if(day==Week.Saturday){
                System.out.println(day);
            }
            System.out.print(day+"->");
        }
    }

}

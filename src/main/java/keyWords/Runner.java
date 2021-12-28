package keyWords;

interface Actor{
    void canAct();
    static void canSing(){
        System.out.println("I can fkn sing");
    }
    default void canDance(){
        System.out.println("i can dance");
    }

}

public class Runner {
    public static void main(String[] args) {

        Actor imem = new Artist();

        Actor.canSing();
        imem.canAct();
        imem.canDance();
        ActionArtist.isSniper();
    }

    static class Artist implements Actor{

        @Override
        public void canAct() {
            System.out.println("i can act");
        }
    }

    static abstract class ActionArtist{
       static void isSniper(){
           System.out.println("youhy");
       }
    }
}

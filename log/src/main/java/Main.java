import org.apache.log4j.Logger;

public class Main {
    private static final Logger l = Logger.getLogger(Main.class) ;
    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            l.debug("hehe");
            l.info("kaka");
            l.error("3");

        }

    }
}

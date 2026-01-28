package temp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Tempoop {

    static Logger logger = Logger.getLogger(Tempoop.class.getName());

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            logger.log(Level.INFO, "Iteration: {0}", i);
        }
    }
}

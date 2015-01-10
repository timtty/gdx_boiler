package lifecycle;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 * Created by Tim on 12/25/2014.
 */
public class GlAppRunner {
    public static void Run() {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "TEMPLATE//BOILERPLATE -- BITCHES!!";
        cfg.width = 800;
        cfg.height = 600;

        new LwjglApplication(new Scene());
    }
}

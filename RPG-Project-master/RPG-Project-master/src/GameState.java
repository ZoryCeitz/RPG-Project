import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameState extends State {

    private Player player;
    private World world;

    public GameState(Handler handler) {
        super(handler);
        world = new World(handler, "C:\\Users\\IGMAdmin\\Downloads\\RPG-Project-master\\RPG-Project-master\\res\\Worlds\\world1.txt");
        handler.setWorld(world);
        player = new Player(handler, 100, 100);
    }
    @Override
    public void tick() {
        world.tick();
        player.tick();

    }

    @Override
    public void render(Graphics g) {
        world.render(g);
        player.render(g);
    }

}


import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Assets {

    private static final int width = 32, height = 32;

    public static BufferedImage player, dirt, grass, stone;

    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("C:\\Users\\IGMAdmin\\Downloads\\RPG-Project-master\\RPG-Project-master\\res\\textures\\sheet.png"));

        player = sheet.crop(0, 0, width, height);
        dirt = sheet.crop(width, 0, width, height);
        grass = sheet.crop(width * 2, 0, width, height);
        stone = sheet.crop(width * 3, 0, width, height);
    }
}


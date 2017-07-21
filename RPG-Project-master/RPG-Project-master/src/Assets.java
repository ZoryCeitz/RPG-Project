import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Assets {

    private static final int width = 64, height = 64;

    public static BufferedImage dirt, grass, stone, tree;
    public static BufferedImage[] player_down;
    public static BufferedImage[] player_up;
    public static BufferedImage[] player_right;
    public static BufferedImage[] player_left;
    public static BufferedImage[] btn_start;

    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("C:\\Users\\Prime\\Downloads\\RPG-Project-master\\RPG-Project-master\\res\\textures\\sheet.png"));

        player_down = new BufferedImage[6];
        player_up = new BufferedImage[6];
        player_right = new BufferedImage[6];
        player_left = new BufferedImage[6];
        btn_start = new BufferedImage[2];

        btn_start[0] = sheet.crop(width * 6, 128, width * 2, height);
        btn_start[1] = sheet.crop(width * 6, 128, width * 2, height);

        player_down[0] = sheet.crop(0, 0, width, height);
        player_down[1] = sheet.crop(64, 0, width, height);
        player_down[2] = sheet.crop(128, 0, width, height);
        player_down[3] = sheet.crop(192, 0, width, height);
        player_down[4] = sheet.crop(256, 0, width, height);
        player_down[5] = sheet.crop(320, 0, width, height);
        player_up[0] = sheet.crop(384,0, width, height);
        player_up[1] = sheet.crop(448,0, width, height);
        player_up[2] = sheet.crop(512,0, width, height);
        player_up[3] = sheet.crop(576,0, width, height);
        player_up[4] = sheet.crop(640,0, width, height);
        player_up[5] = sheet.crop(704,0, width, height);
        player_right[0] = sheet.crop(0, 0, width, height);
        player_right[1] = sheet.crop(64, height, width, height);
        player_right[2] = sheet.crop(128, height, width, height);
        player_right[3] = sheet.crop(192, height, width, height);
        player_right[4] = sheet.crop(256, height, width, height);
        player_right[5] = sheet.crop(320, height, width, height);
        player_left[0] = sheet.crop(384, height, width, height);
        player_left[1] = sheet.crop(448, height, width, height);
        player_left[2] = sheet.crop(512, height, width, height);
        player_left[3] = sheet.crop(576, height, width, height);
        player_left[4] = sheet.crop(640, height, width, height);
        player_left[5] = sheet.crop(704, height, width, height);

        dirt = sheet.crop(0, 128, width, height);
        grass = sheet.crop(width, 128, width, height);
        stone = sheet.crop(width * 2, 128, width, height);
        tree = sheet.crop(width * 3, height * 2, width, height * 2);
    }
}


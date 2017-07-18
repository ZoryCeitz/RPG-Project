/**
 * Created by IGMAdmin on 7/18/2017.
 */
public class GameCamera {

    private Game game;
    private float xOffset, yOffset;

    public GameCamera(Game game, float xOffset, float yOffset){
        this.game = game;
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }

    public void centerOnEntity(Entity e){
        float lerp = 0.1f;
        xOffset += lerp * (e.getX() - game.getWidth() / 2 + e.getWidth() / 2 - xOffset);
        yOffset += lerp * (e.getY() - game.getHeight() / 2 + e.getHeight() / 2 - yOffset);
    }

    public void move(float xAmt, float yAmt){
        xOffset += xAmt;
        yOffset += yAmt;
    }

    public float getxOffset() {
        return xOffset;
    }

    public void setxOffset(float xOffset) {
        this.xOffset = xOffset;
    }

    public float getyOffset() {
        return yOffset;
    }

    public void setyOffset(float yOffset) {
        this.yOffset = yOffset;
    }
}

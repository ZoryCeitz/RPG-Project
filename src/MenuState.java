import java.awt.Graphics;

public class MenuState extends State {

    public MenuState(Handler handler){
        super(handler);
    }

    public void tick(){
        System.out.println(handler.getMouseManager().getMouseX() + "  " + handler.getMouseManager().getMouseY());

    }

    public void render(Graphics g){

    }

}

import java.awt.Graphics;

import static java.awt.Color.red;

public class MenuState extends State {

    public MenuState(Handler handler){
        super(handler);
    }

    public void tick(){
        if(handler.getMouseManager().isLeftPressed() && handler.getMouseManager().isRightPressed())
            State.setState(handler.getGame().gameState);

    }

    public void render(Graphics g){


    }

}

import org.newdawn.slick.*;

public class OctopusMain extends BasicGame {

	public OctopusMain(String title) {
		super(title);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) 
			throws SlickException
    {
         AppGameContainer app = 
			new AppGameContainer(new OctopusMain("OrangeOctopus"));
 
         app.setDisplayMode(800, 600, false);
         app.start();
    }

}

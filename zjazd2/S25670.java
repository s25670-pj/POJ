package gamers;
import main.Pair;
import main.Unit;
import java.util.concurrent.ThreadLocalRandom;

public class S25670 extends Unit
{
	public S25670(final String id, final Pair position, final double rotate, final CollisionModel model)
	{
		super(id, position, rotate, model);
	}
	@Override
	public void run() 
	{
		this.enableStopOnWall();
		this.enableMovement();
		this.forward();
				
		while (true) 
		{
			if (whatIsInRange() == 3) 
			{
				this.attackInNextMove();
			}
		}
	}
}

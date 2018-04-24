package Physics;

import java.util.List;

public class PhysicObjectTemplate 
{
	boolean isAffectedByGravity;
	float xPos, yPos;		//	meters
	float xSpeed, ySpeed;	//	meters/tick
	float angle; 
	float speed;
	static float maxSpeed;
	float mass;				// the bigger, the harder it is for forces to change object speed
	List<Force> forces;
	
	void update()
	{
		for(Force force: forces)
			applyForce(force);
		
		if(speed>maxSpeed) speed=maxSpeed;
			
		xSpeed = (float) (speed * Math.sin(angle));
		ySpeed = (float) (speed * Math.sin(angle));
		xPos+=xSpeed;
		yPos+=ySpeed;
	}
	
	void addForce(Force force)
	{
		forces.add(force);
	}
	
	void deleleForce(Force force)
	{
		forces.remove(force);
	}
	
	void applyForce(Force force)
	{
		
	}
}

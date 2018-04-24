package Physics;

import java.util.LinkedList;
import java.util.List;

public class PhysicsManager 
{
	void update(List<PhysicObjectTemplate> ObjectsList)
	{
		for(PhysicObjectTemplate object: ObjectsList)
			object.update();
	}
}

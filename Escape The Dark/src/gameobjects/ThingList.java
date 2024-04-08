package gameobjects;

import java.util.ArrayList;
//import gameobjects.Thing;
//ThingList
public class ThingList extends ArrayList<Thing>
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String describeThings() 
	{
        String s = "";
        
        if (this.size() == 0) 
        {
            s = "";
        }
        else 
        {
            for (Thing t : this) 
            {
                s = s + t.getName() + ": " + t.getDescription() + "\n";
            }
        }
        return s;
    }

    public Thing thisObject(String aName) {
        Thing aThing = null;
        String thingName = "";
        String aNameLowCase = aName.trim().toLowerCase();
        for (Thing t : this) {
            thingName = t.getName().trim().toLowerCase();
            if (thingName.equals(aNameLowCase)) {
                aThing = t;
            }
        }
        return aThing;
    }
}

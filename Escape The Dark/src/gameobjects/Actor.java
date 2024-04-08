package gameobjects;

public class Actor extends ThingHolder
{
	
	private Room location; //current location
	private boolean isAlive;
	
	public Actor(String playerName, String playerDescription, ThingList thinglist, Room playerRoom)
	{
		super(playerName, playerDescription, thinglist);
		this.location = playerRoom;
		this.isAlive = true;
	}
	
	public void setLocation(Room playerRoom)
	{
		this.location = playerRoom;
	}
	public void setIsAlive(boolean alive)
	{
		this.isAlive = alive;
	}
	
	public Room getLocation()
	{
		return this.location;
	}
	public boolean getAliveStatus()
	{
		return this.isAlive;
	}
	

	public String describe()
	{
        return getName() + " is in " + getLocation().describe();
    }
}

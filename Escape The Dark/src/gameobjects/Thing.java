package gameobjects;

public class Thing 
{
	private String name;
	private String description;
	private boolean takable;
    private boolean movable;
	
	/*
	 * Constructors
	 * Creates an object called "Thing" to define all objects in game.
	 * "Things must have names and descriptions that are Strings.
	 */
	public Thing (String thingName, String thingDescription, boolean canTake, boolean canMove)
	{
		this.name = thingName;
		this.description = thingDescription;
		this.takable = canTake;
		this.movable = canMove;
	}
	
	public Thing(String aName, String aDescription) 
	{
        // constructor
        this.name = aName;
        this.description = aDescription;
        this.takable = true;
        this.movable = true;
    }
	
	/* Getters 
	 * Return name and description of item.
	 * String value is returned.
	 */
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public boolean isTakable()
	{
	        return takable;
	}
	
	public boolean isMovable() 
	{
        return movable;
    }
	
	public String describe()
	{
        return name + " " + description;
    }
	
	/*	
	 * Setters
	 * Set values of name and description.
	 * No value returned so we use void.
	*/ 
	public void setName(String thingName)
	{
		this.name = thingName;
	}
	
	public void setDescription(String thingDescription)
	{
		this.description = thingDescription;
	}
	
	public void setTakable(boolean takable) 
	{
        this.takable = takable;
    }
	
	public void setMovable(boolean movable) 
	{
        this.movable = movable;
    }
}

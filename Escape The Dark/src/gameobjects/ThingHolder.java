package gameobjects;
//ThingHolder
public class ThingHolder extends Thing
{
	private ThingList things = new ThingList( );
    
    public ThingHolder(String thingHolderName, String thingHolderDescription, ThingList thinglist) 
    {
        super(thingHolderName, thingHolderDescription);
        things = thinglist;
    }
    
    public ThingHolder(String thingHolderName, String thingHolderDescription, boolean canTake,boolean canMove, ThingList thinglist)
    {
        super(thingHolderName, thingHolderDescription, canTake, canMove);
        things = thinglist;
    }
   
    public ThingList getThings() 
    {
        return things;
    }
   
    public void setThings(ThingList things) 
    {
        this.things = things;
    }
}

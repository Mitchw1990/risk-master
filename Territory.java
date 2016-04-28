
/**
 *  class Territory.
 * 
 * @author (George Young) 
 * @version (04/27/2016)
 */

public class Territory
{
    public int units;
    private String name;
    
    //contructor declaration and variable initialization
    public Territory()
    {
        name = "";
        units = 0;
    }
    
    //get territory name
    public String getTerritoryName()
    {
        return name;
    }
    
    //sets number of units in territory
    public void setTerritoryUnits(int numUnits)
    {
        units = numUnits;
    }
    
    //gets number of units in territory
    public int getTerritoryUnits()
    {
        return units;
    }
}//end class Territory

import java.util.HashMap;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class Room 
{
    private String description;
    private HashMap<String,Room> exits;
    

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        this.exits = new HashMap<>();
    }
    
    public Room getExit(String direction){
        Room nextRoom = exits.get(direction);
        return null;
    }
    
    private String getLongDescription(){
        return "You are " + description + ".\n" + getExitString();
    }

    /** * Return a description of the room’s exits,
    * for example, "Exits: north west".
    * @return A description of the available exits.
    */ 
    public String getExitString(){
    String exitString = "Exits: ";
    
    for( String direction : exits.keySet() ){
        exitString += (direction + " "); 
        
    }
    
        return exitString;
    }
    
    /**
     * Set the exit to a particul direction a neighbour
     * @param direction to move 
     * @param neighbor is the location name
     */
    public void setExit(String direction, Room neighbor) {
      exits.put(direction, neighbor);
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

}

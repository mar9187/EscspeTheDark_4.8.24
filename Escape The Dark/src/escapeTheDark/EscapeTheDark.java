package escapeTheDark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import gameobjects.Actor;
import escapeTheDark.GameBuild;
 

public class EscapeTheDark 
{
	
    static GameBuild game;
    
	public static void main(String[] args) throws IOException
    {
    	
    	BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
    	String playerInput="";
    	//String gameOutput = "";
    	game = new GameBuild();
    	boolean newGame = true;
    	
    	//Game loop
    	while(!"q".equals(playerInput))
    	{
    		boolean playerAlive = game.getPlayer().getAliveStatus();
    		
    		//New Game intro
    		if(newGame)
    		{
    			game.showIntro();
    			newGame = false;
    		}
    		else
    		{
    			game.look();
    		}
    		
    		//direction prompt
    		if(!playerAlive)
    		{
    			System.exit(0);
    		}
    		
    		System.out.println("What do you do?...");
    		System.out.println(game.getPlayer().getLocation().getPrompt());
    		
    		//item prompts
    		if(!game.getPlayer().getLocation().getThings().isEmpty())
    		{
    			gameobjects.ThingList itemList = game.getPlayer().getLocation().getThings();
    			int items = itemList.size();
    			for (int i = 0; i < items; i++)
    			{
    				System.out.println(i + ": [interact] " + itemList.get(i).getName() + " " + itemList.get(i).getDescription());
    			}
    		}
    		//get player input
    		playerInput = in.readLine();
    		
    		game.runCommand();
    		
    		
    		
    	}
    	
    	/*
    	do
    	{
   
    		System.out.println(room.desscription);
    		playerInput = in.readLine();
    		gameOutput = game.runCommand(playerInput);
    		
    		if (!gameOutput.trim().isEmpty())
    		{
    			game.showStr(gameOutput);
    		}
    	} while (!"q".equals(playerInput));
    	*/
    }
    
}

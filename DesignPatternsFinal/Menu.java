package DesignPatternsFinal;
//Singleton Menu

public class Menu
{
    private static Menu _menu;
    
    private Menu() {}
    
    public static Menu getInstance()
    {
        if(_menu != null)
            return _menu;
        else
        {
            _menu = new Menu();
            return _menu;
        }
    }//end getInstance

    public static String handleCommand(String userInput) {
		
		int direction;
		userInput = checkAbrev(userInput);
		switch(userInput.toLowerCase())
		{
			case "north":
				System.out.println("\nGoing north...");
				return userInput;
			
			case "west":
				System.out.println("\nGoing west...");
				return userInput;
			
			case "south":
				System.out.println("\nGoing south...");
				return userInput;
			
			case "east":
				System.out.println("\nGoing east...");
				return userInput;
			
			case "take":
			    userInput = "get";
			    return userInput;
			
			case "get":
			    return userInput;
			
			case "exit":
				System.out.println("\nExiting...");
				return userInput;
			
			case "help":
				System.out.println("\nPossible Commands:");
				System.out.println("north\nwest\nsouth\neast\nget/pick up/take\nexit\nhelp");
				return null;
			
			default:
				System.out.println("\nInvalid Command");
				return null;
		}
	}
	
	private static String checkAbrev(String userInput)
    {
        if(userInput.equals("n"))
            return "north";
        if(userInput.equals("w"))
            return "west";
        if(userInput.equals("s"))
            return "south";
        if(userInput.equals("e"))
            return "east";
        
        if(userInput.contains("key"))
            return "get";
            
        return userInput;
    }

}//end Menu class
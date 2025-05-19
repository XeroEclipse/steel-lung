package steel_lung_game_package;

import java.util.Scanner;

public class Main {
	public static String player = " P ";
	// Class Reference object: Rooms(roomId, gateNorth, gateSouth, gateEast,
	// gateWest)
	public static Rooms[] rooms = { 
			
			//Testing zone:
			new Rooms(0, 0, 1, 0, 3, "Room 1"), 
			new Rooms(1, 0, 1, 1, 2, "Room 2"), 
			new Rooms(2, 3, 2, 1, 2, "Hallway 1"), 
			new Rooms(3, 3, 2, 0, 3, "Room 3"), 
			
			
//			//Rooms with hallways (North leads to Control Center and etc, South leads to Cafe, Shop and Dock)
//			new Rooms(0, 0, 1, 0, 1, "Room 1"), 
//			new Rooms(1, 2, 0, 0, 0, "Room 2"), 
//			new Rooms(2, 0, 1, 0, 1, "Hallway 1"), 
//			new Rooms(3, 0, 1, 0, 1, "Room 3"), 
//			new Rooms(4, 2, 0, 0, 0, "Room 4"), 
//			new Rooms(5, 0, 1, 0, 1, "Hallway 2"), 
//			new Rooms(6, 0, 1, 0, 1, "Room 5"), 
//			new Rooms(7, 2, 0, 0, 0, "Room 6"), 
//			new Rooms(8, 0, 1, 0, 1, "Hallway 3"), 
//			new Rooms(9, 0, 1, 0, 1, "Room 7"), 
//			new Rooms(10, 2, 0, 0, 0, "Room 8"),
//			new Rooms(11, 0, 1, 0, 1, "Hallway 4"), 
//			
//			//North Side of the Ship:
//			
//				//East Wing
//			new Rooms(0, 0, 1, 0, 1, "Room 1"), 
//			new Rooms(2, 2, 0, 0, 0, "Room 2"), 
//			new Rooms(1, 0, 1, 0, 1, "Hallway 1"), 
//			new Rooms(2, 0, 1, 0, 1, "Room 3"), 
//			new Rooms(3, 2, 0, 0, 0, "Room 4"), 
//			new Rooms(0, 0, 1, 0, 1, "Hallway 2"), 
//			
//				//West Wing
//			new Rooms(4, 0, 1, 0, 1, "Room 5"), 
//			new Rooms(1, 2, 0, 0, 0, "Room 6"), 
//			new Rooms(0, 0, 1, 0, 1, "Hallway 3"), 
//			new Rooms(0, 0, 1, 0, 1, "Room 7"), 
//			new Rooms(1, 2, 0, 0, 0, "Room 8"),
//			new Rooms(0, 0, 1, 0, 1, "Hallway 4"), 
//			
//			//South Side of the Ship
//			
//				//East Wing
//			new Rooms(0, 0, 1, 0, 1, "Room 1"), 
//			new Rooms(2, 2, 0, 0, 0, "Room 2"), 
//			new Rooms(1, 0, 1, 0, 1, "Hallway 1"), 
//			new Rooms(2, 0, 1, 0, 1, "Room 3"), 
//			new Rooms(3, 2, 0, 0, 0, "Room 4"), 
//			new Rooms(0, 0, 1, 0, 1, "Hallway 2"),
//				
//				//West Wing
//			new Rooms(4, 0, 1, 0, 1, "Room 5"), 
//			new Rooms(1, 2, 0, 0, 0, "Room 6"), 
//			new Rooms(0, 0, 1, 0, 1, "Hallway 3"), 
//			new Rooms(0, 0, 1, 0, 1, "Room 7"), 
//			new Rooms(1, 2, 0, 0, 0, "Room 8"),
//			new Rooms(0, 0, 1, 0, 1, "Hallway 4"), 


	};
	
	
	 public static int currentRoom = 0;

    public static void main(String[] args) {

        while(true) {
        	
        	//Display the current room situated
            rooms[currentRoom].drawRoom(player);
        	
        	//Set Room Title
        	String title = rooms[currentRoom].getRoomtitle();
            speaker("Current Room: " + title );
            
            //Ask the user which room to go to.
            Scanner playerInput = new Scanner(System.in);
            
             int destinationRoom = rooms[currentRoom].takeInput(playerInput);

            if(destinationRoom == currentRoom) {

               speaker("you cant go there");

            }

        currentRoom = destinationRoom;


        }

    }
	public static void speaker(String text) {
		System.out.println(text);
	}

}



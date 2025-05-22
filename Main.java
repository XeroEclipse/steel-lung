package steel_lung_game_package;

import java.util.Scanner;

public class Main {
	public static String player = " P ";
	// Class Reference object: Rooms(roomId, gateNorth, gateSouth, gateEast,
	// gateWest)
	public static Rooms[] rooms = { 
			
			//Testing zone:
			//new Rooms(0, 0, 1, 0, 3, "Room 1"), 
			//new Rooms(1, 0, 1, 1, 2, "Room 2"), 
			//new Rooms(2, 3, 2, 1, 2, "Hallway 1"), 
			//new Rooms(3, 3, 2, 0, 3, "Room 3"), 
			
			
		//Rooms with hallways (North leads to Control Center and etc, South leads to Cafe, Shop and Dock)
			new Rooms(0, 0, 1, 0, 1, "Room 1"), 
			new Rooms(1, 2, 0, 0, 0, "Room 2"), 
			new Rooms(2, 0, 1, 0, 1, "Hallway 1"), 
			new Rooms(3, 0, 1, 0, 1, "Room 3"), 
			new Rooms(4, 2, 0, 0, 0, "Room 4"), 
			new Rooms(5, 0, 1, 0, 1, "Hallway 2"), 
			new Rooms(6, 0, 1, 0, 1, "Room 5"), 
			new Rooms(7, 2, 0, 0, 0, "Room 6"), 
			new Rooms(8, 0, 1, 0, 1, "Hallway 3"), 
			new Rooms(9, 0, 1, 0, 1, "Room 7"), 
			new Rooms(10, 2, 0, 0, 0, "Room 8"),
			new Rooms(11, 0, 1, 0, 1, "Hallway 4"), 
			
			//North Side of the Ship:
			
				//East Wing
			new Rooms(12, 0, 1, 0, 1, "Room 1"), 
			new Rooms(13, 2, 0, 0, 0, "Room 2"), 
			new Rooms(14, 0, 1, 0, 1, "Hallway 1"), 
			new Rooms(15, 0, 1, 0, 1, "Room 3"), 
			new Rooms(16, 2, 0, 0, 0, "Room 4"), 
			new Rooms(17, 0, 1, 0, 1, "Hallway 2"), 
			
				//West Wing
			new Rooms(18, 0, 1, 0, 1, "Room 5"), 
			new Rooms(19, 2, 0, 0, 0, "Room 6"), 
			new Rooms(20, 0, 1, 0, 1, "Hallway 3"), 
			new Rooms(21, 0, 1, 0, 1, "Room 7"), 
			new Rooms(22, 2, 0, 0, 0, "Room 8"),
			new Rooms(23, 0, 1, 0, 1, "Hallway 4"), 
			
			//South Side of the Ship
			
				//East Wing
			new Rooms(24, 0, 1, 0, 1, "Room 1"), 
			new Rooms(25, 2, 0, 0, 0, "Room 2"), 
			new Rooms(26, 0, 1, 0, 1, "Hallway 1"), 
			new Rooms(27, 0, 1, 0, 1, "Room 3"), 
			new Rooms(29, 2, 0, 0, 0, "Room 4"), 
			new Rooms(30, 0, 1, 0, 1, "Hallway 2"),
				
				//West Wing
			new Rooms(31, 0, 1, 0, 1, "Room 5"), 
			new Rooms(32, 2, 0, 0, 0, "Room 6"), 
			new Rooms(33, 0, 1, 0, 1, "Hallway 3"), 
			new Rooms(34, 0, 1, 0, 1, "Room 7"), 
			new Rooms(35, 2, 0, 0, 0, "Room 8"),
			new Rooms(36, 0, 1, 0, 1, "Hallway 4"), 

			//Second Floor
			
			//Rooms with hallways (North leads to Control Center and etc, South leads to Cafe, Shop and Dock)
			new Rooms(37, 0, 1, 0, 1, "Room 1"), 
			new Rooms(38, 2, 0, 0, 0, "Room 2"), 
			new Rooms(38, 0, 1, 0, 1, "Hallway 1"), 
			new Rooms(39, 0, 1, 0, 1, "Room 3"), 
			new Rooms(40, 2, 0, 0, 0, "Room 4"), 
			new Rooms(41, 0, 1, 0, 1, "Hallway 2"), 
			new Rooms(42, 0, 1, 0, 1, "Room 5"), 
			new Rooms(43, 2, 0, 0, 0, "Room 6"), 
			new Rooms(44, 0, 1, 0, 1, "Hallway 3"), 
			new Rooms(45, 0, 1, 0, 1, "Room 7"), 
			new Rooms(46, 2, 0, 0, 0, "Room 8"),
			new Rooms(47, 0, 1, 0, 1, "Hallway 4"), 
			
			//North Side of the Ship:
			
				//East Wing
			new Rooms(48, 0, 1, 0, 1, "Room 1"), 
			new Rooms(49, 2, 0, 0, 0, "Room 2"), 
			new Rooms(50, 0, 1, 0, 1, "Hallway 1"), 
			new Rooms(51, 0, 1, 0, 1, "Room 3"), 
			new Rooms(52, 2, 0, 0, 0, "Room 4"), 
			new Rooms(53, 0, 1, 0, 1, "Hallway 2"), 
			
				//West Wing
			new Rooms(54, 0, 1, 0, 1, "Room 5"), 
			new Rooms(55, 2, 0, 0, 0, "Room 6"), 
			new Rooms(56, 0, 1, 0, 1, "Hallway 3"), 
			new Rooms(57, 0, 1, 0, 1, "Room 7"), 
			new Rooms(58, 2, 0, 0, 0, "Room 8"),
			new Rooms(59, 0, 1, 0, 1, "Hallway 4"), 
			
			//South Side of the Ship
			
				//East Wing
			new Rooms(60, 0, 1, 0, 1, "Room 1"), 
			new Rooms(61, 2, 0, 0, 0, "Room 2"), 
			new Rooms(62, 0, 1, 0, 1, "Hallway 1"), 
			new Rooms(63, 0, 1, 0, 1, "Room 3"), 
			new Rooms(64, 2, 0, 0, 0, "Room 4"), 
			new Rooms(65, 0, 1, 0, 1, "Hallway 2"),
				
				//West Wing
			new Rooms(66, 0, 1, 0, 1, "Room 5"), 
			new Rooms(67, 2, 0, 0, 0, "Room 6"), 
			new Rooms(68, 0, 1, 0, 1, "Hallway 3"), 
			new Rooms(69, 0, 1, 0, 1, "Room 7"), 
			new Rooms(70, 2, 0, 0, 0, "Room 8"),
			new Rooms(71, 0, 1, 0, 1, "Hallway 4"), 

			//Third Floor
			//Rooms with hallways (North leads to Control Center and etc, South leads to Cafe, Shop and Dock)
			new Rooms(72, 0, 1, 0, 1, "Room 1"), 
			new Rooms(73, 2, 0, 0, 0, "Room 2"), 
			new Rooms(74, 0, 1, 0, 1, "Hallway 1"), 
			new Rooms(75, 0, 1, 0, 1, "Room 3"), 
			new Rooms(76, 2, 0, 0, 0, "Room 4"), 
			new Rooms(77, 0, 1, 0, 1, "Hallway 2"), 
			new Rooms(78, 0, 1, 0, 1, "Room 5"), 
			new Rooms(79, 2, 0, 0, 0, "Room 6"), 
			new Rooms(80, 0, 1, 0, 1, "Hallway 3"), 
			new Rooms(81, 0, 1, 0, 1, "Room 7"), 
			new Rooms(82, 2, 0, 0, 0, "Room 8"),
			new Rooms(83, 0, 1, 0, 1, "Hallway 4"), 
			
			//North Side of the Ship:
			
				//East Wing
			new Rooms(84, 0, 1, 0, 1, "Room 1"), 
			new Rooms(85, 2, 0, 0, 0, "Room 2"), 
			new Rooms(86, 0, 1, 0, 1, "Hallway 1"), 
			new Rooms(87, 0, 1, 0, 1, "Room 3"), 
			new Rooms(88, 2, 0, 0, 0, "Room 4"), 
			new Rooms(89, 0, 1, 0, 1, "Hallway 2"), 
			
				//West Wing
			new Rooms(90, 0, 1, 0, 1, "Room 5"), 
			new Rooms(91, 2, 0, 0, 0, "Room 6"), 
			new Rooms(92, 0, 1, 0, 1, "Hallway 3"), 
			new Rooms(93, 0, 1, 0, 1, "Room 7"), 
			new Rooms(94, 2, 0, 0, 0, "Room 8"),
			new Rooms(95, 0, 1, 0, 1, "Hallway 4"), 
			
			//South Side of the Ship
			
				//East Wing
			new Rooms(96, 0, 1, 0, 1, "Room 1"), 
			new Rooms(97, 2, 0, 0, 0, "Room 2"), 
			new Rooms(98, 0, 1, 0, 1, "Hallway 1"), 
			new Rooms(99, 0, 1, 0, 1, "Room 3"), 
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



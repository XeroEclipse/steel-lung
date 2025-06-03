package steel_lung_game_package;

import java.util.Scanner;

public class Main {
	public static String player = " P ";
	// Class Reference object: Rooms(roomId, gateNorth, gateSouth, gateEast,
	// gateWest)
	public static Rooms[] rooms = {

			// Rooms(roomId, gateNorth, gateSouth, gateEast, gateWest)
			// Main ship area leading to control room.
			new Rooms(0, 0, 0, 0, 0), // Ignore this room, empty room

			new Rooms(1, 1, 1, 2, 1), new Rooms(2, 14, 26, 3, 1), new Rooms(3, 15, 27, 4, 2),
			new Rooms(4, 16, 28, 5, 3), new Rooms(5, 17, 29, 6, 4), new Rooms(6, 18, 30, 7, 5),
			new Rooms(7, 19, 31, 8, 6), new Rooms(8, 20, 32, 9, 7), new Rooms(9, 21, 33, 10, 8),
			new Rooms(10, 22, 34, 11, 9), new Rooms(11, 23, 35, 12, 10), new Rooms(12, 24, 36, 13, 11),
			new Rooms(13, 25, 37, 103, 12),

			new Rooms(14, 14, 2, 15, 14), new Rooms(15, 48, 3, 16, 14), new Rooms(16, 16, 4, 17, 15),
			new Rooms(17, 50, 5, 18, 16), new Rooms(18, 18, 6, 19, 17), new Rooms(19, 19, 7, 20, 18),
			new Rooms(20, 20, 8, 21, 19), new Rooms(21, 53, 9, 22, 20), new Rooms(22, 22, 10, 23, 21),
			new Rooms(23, 23, 11, 24, 22), new Rooms(24, 24, 12, 25, 23), new Rooms(25, 25, 13, 25, 24),

			new Rooms(26, 2, 26, 27, 26), new Rooms(27, 3, 62, 28, 26), new Rooms(28, 4, 28, 29, 27),
			new Rooms(29, 5, 64, 30, 28), new Rooms(30, 6, 30, 31, 29), new Rooms(31, 7, 31, 32, 30),
			new Rooms(32, 8, 32, 33, 31), new Rooms(33, 9, 67, 34, 32), new Rooms(34, 10, 34, 35, 33),
			new Rooms(35, 11, 35, 36, 34), new Rooms(36, 12, 36, 37, 35), new Rooms(37, 13, 37, 37, 36),

			new Rooms(38, 38, 38, 39, 38), new Rooms(39, 54, 47, 40, 38), new Rooms(40, 55, 48, 41, 39),
			new Rooms(41, 56, 49, 42, 40), new Rooms(42, 57, 50, 43, 41), new Rooms(43, 58, 51, 44, 42),
			new Rooms(44, 59, 52, 45, 43), new Rooms(45, 60, 53, 46, 44), new Rooms(46, 46, 46, 46, 45),

			new Rooms(47, 39, 47, 48, 47), new Rooms(48, 40, 15, 49, 47), new Rooms(49, 41, 49, 50, 48),
			new Rooms(50, 42, 17, 51, 49), new Rooms(51, 43, 51, 52, 50), new Rooms(52, 44, 52, 53, 51),
			new Rooms(53, 45, 21, 53, 52),

			new Rooms(54, 54, 39, 55, 54), new Rooms(55, 55, 40, 56, 54), new Rooms(56, 56, 41, 57, 55),
			new Rooms(57, 57, 42, 58, 56), new Rooms(58, 58, 43, 59, 57), new Rooms(59, 59, 44, 60, 58),
			new Rooms(60, 60, 45, 60, 59),

			new Rooms(61, 61, 68, 62, 61), new Rooms(62, 27, 69, 63, 61), new Rooms(63, 63, 70, 64, 62),
			new Rooms(64, 29, 71, 65, 63), new Rooms(65, 65, 72, 66, 64), new Rooms(66, 66, 73, 67, 65),
			new Rooms(67, 33, 74, 67, 66),

			new Rooms(68, 61, 77, 69, 76), new Rooms(69, 62, 78, 70, 68), new Rooms(70, 63, 79, 71, 69),
			new Rooms(71, 64, 80, 72, 70), new Rooms(72, 65, 81, 73, 71), new Rooms(73, 66, 82, 74, 72),
			new Rooms(74, 67, 83, 75, 73),

			new Rooms(75, 75, 75, 75, 74), new Rooms(76, 76, 76, 68, 76),

			new Rooms(77, 68, 77, 78, 77), new Rooms(78, 69, 84, 79, 77), new Rooms(79, 70, 85, 80, 78),
			new Rooms(80, 71, 86, 81, 79), new Rooms(81, 72, 87, 82, 80), new Rooms(82, 73, 88, 83, 81),
			new Rooms(83, 74, 83, 83, 82),

			new Rooms(84, 78, 90, 84, 84), new Rooms(85, 79, 91, 85, 85), new Rooms(86, 80, 92, 86, 86),
			new Rooms(87, 81, 93, 87, 87), new Rooms(88, 82, 94, 88, 88),

			new Rooms(89, 89, 96, 90, 89), new Rooms(90, 84, 97, 91, 89), new Rooms(91, 85, 98, 92, 90),
			new Rooms(92, 86, 99, 93, 91), new Rooms(93, 87, 100, 94, 92), new Rooms(94, 88, 101, 95, 93),
			new Rooms(95, 95, 102, 95, 94),

			new Rooms(96, 89, 96, 97, 96), new Rooms(97, 90, 97, 98, 96), new Rooms(98, 91, 98, 99, 97),
			new Rooms(99, 92, 99, 100, 98), new Rooms(100, 93, 100, 101, 99), new Rooms(101, 94, 101, 102, 100),
			new Rooms(102, 95, 102, 102, 101),

			new boss_room(103, 103, 103, 103, 13),

	};

	public static int currentRoom = 1;

	public static void main(String[] args) {
		Main_game();
	}

	public static void Main_game() {
		while (true) {

			if (!(rooms[currentRoom] instanceof boss_room)) {
				// Display the current room situated
				rooms[currentRoom].drawRoom(player);
			}

			else {
				rooms[rooms.length - 1].drawRoom(player);
				boss_room.cutscene();
				boss_room.battle();
				speaker("YOU HAVE DEFEATED THE ENEMY, PLEASE HEAD TO THE DOCKING BAY FOR ARRIVAL AT PLANET X");
				// boss_room.postCreditScene();
				// boss_room.draw();
			}

			speaker("Arrived at Room: " + currentRoom);

			// Ask the user which room to go to.
			Scanner playerInput = new Scanner(System.in);

			int destinationRoom = rooms[currentRoom].takeInput(playerInput);

			if (destinationRoom == currentRoom) {

				speaker("ERROR.SYSTEM.OUT.PRINT: ''you cant go there'' ");

			}

			currentRoom = destinationRoom;

		}
	}

	public static void speaker(String text) {
		System.out.println(text);
	}

}

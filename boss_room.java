package steel_lung_game_package;

import java.util.Scanner;

public class boss_room extends Rooms {

	private int roomId;
	private int gateNorth;
	private int gateSouth;
	private int gateEast;
	private int gateWest;

	public Scanner move;

	boss_room(int roomId, int gateNorth, int gateSouth, int gateEast, int gateWest) {
		super(roomId, gateNorth, gateSouth, gateEast, gateWest);
		

	}
	
	public static void battle() {
		int enemy_health = 100;
		int player_health = 100;
		Scanner userInput = new Scanner(System.in);
		speaker("LOCAL FAUNA DETECTED:" + "Chimera Soldier" + "HAS APPROACHED THE VESSEL");
		while (!(enemy_health < 0 || player_health < 0)) {

			speaker("What will your action be?");

			speaker("--Attack--" + "\n--Block--");

			String player_choice = userInput.nextLine();

			if (player_choice.equalsIgnoreCase("Attack")) {
				speaker("Chimera Soldier", "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%@@@@@@@@%%");
		        speaker("Chimera Soldier", "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%@@@@@@@@@@@@@@@%%@%@%%%%%@%@@@@%@%%@%");
		        speaker("Chimera Soldier", "@@@@@@@@@@@@@@@%%%%@@@@@%@@@@@%%%@@@@@@@%%%%%%%%%%%%%%%%%%%%%@%%@@%%@%%%%");
		        speaker("Chimera Soldier", "@@@@@@@%@@@@@@@@@@@@@@@@@@@@@@@@=::::::#@@@@@@@@@@@@@@@@@@@@@@%%@@%%@@@@@");
		        speaker("Chimera Soldier", "@@@@@@@%%@%%%@@@@@@%@@%%%%%%%%%:::+:::::*%%%%%%%%%%%%%%%%%%%%%%%%@%%%%%%%");
		        speaker("Chimera Soldier", "@@@@@@@%%@%@@%%%%%%%%%%%%%%%%%#:::::::::-%%%%%%%%%%%%%%%%%%%@%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "@@@@@@@%%@@@@@@@@%%%%%%%%%%%%%::-+--::+#::%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "@@@@@@@%%@@@@%%%%%%%%%%%%%%%%%##*****##%#+%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "@@%%@@%%@@@@@@%%%%@%%%%%%%%%%-*%%++%%*-::%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%@@@@%%@@@%%%%%%%%%%%%%%%%%%**###*:=-:-#+##::%%%%%%%%%%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%@@%%@@@%%%%%%%%%%%%%%%%%*#%##%%##%=::::-=::%%%%%%%%%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "@@@%%%%%%@%@%%%%%%%%%%%%%%%%::=%#-%@%#::=*#%+++::=+%%%%%%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%@%%%@%@%%%%%%%%%%%%#-%=::+%%*:::::::+#+++-*+-::%%%%%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%@%%%%%%%%%%%%%=++::::::::::::::::==**==**=:+%%%%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%@%%%@%%%%%%%%%%%%*##*::::::--::-=:::::=@@#**#+--%%%%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%@%%%%%%%%%%%%#%##++=---#*-=+#**+%*:@@@%@#++:%%%%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%@%%%%%%%%%%%%##%%%#@@@@%%@@%@@@@*=#*#@%##*#+%%%%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%%%%%%%%%%*###%%%%%###**#*+*%@*+@@@%#+#*+%%%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%%%%%%%%+*%#%@%%%%%#*****#**#+*@@%%%%%%#*=%%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%%%%%%%=*%%@@%%%%%%%##+#%##***#@%%%%%+::::=%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%%%%%%:::-=%%%%%%%*+=-+*+##+#%%%%%%%#:-:-::%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%%%%%*+++*=+%%%#*#####+*+*#%%+%%%%%%#=:+-=:#%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%%%%%#%##*+#%%%-==%*****%==-===+#%%%%*:::::%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%%%%%*:=++*%%%%*%%####****#%%%%#%%%%%#::::=%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%%%%%-::*##%%%+=##%+=--*#%+--*+*%%%%%%#=-:%%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%%%%%#%%%#%%#-#+*%#=---****=*+=::=%*:#*=-:#%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%%%%%+#=#*#%+:##*#%#*##%%%#+#=:::=#*@%+:::#%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%%%%%#+%%#%#--:%*#%@%%%@%%%#*:::::+##%%#+=#%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%%%%%%#@%%%*-=+-%%%@@@@#%%%%=::::::-#%%###%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%%%%%%###%@*+*%#%%%@@@@#%%%%%*=:::::*%%###%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%%%#%%#-%%%*+*##%%%%@@%##%%%%#*+::::-%####%%#%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%%##%##-##%#*:+#%%%%@@#*##%%%#*=:::::####%%##%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%######-#%##**++%%%@@##*###%%*+---::#####%%##%%%#%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%#######*%%#**=++*#@@%##***##%#-:::::#########%%%#%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%#%########%%##*+*+*@@@########*#+====::###########%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%###########%%##*#%+@@@%########**++%%#%*############%#%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%#############%####*-#@@@#**#********%:==-:**############%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%############**%##%%#*--#@%+**********=+%%%+:+################%%%%");
		        speaker("Chimera Soldier", "%%%%###############-#%****%@@@%-=*#**********%#+=%%:***###############%%");
		        speaker("Chimera Soldier", "%%%%###########****=%%****#%%#+==*%**********#%@@#=::*#################%");
		        speaker("Chimera Soldier", "%%%%%%%############%%%*##**%%#+==%%**********#%#%%=::*##############%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%######%@@##+##%%###%%#:*#-:**--##%%%%*::*=##++##**%###%%#%%");
		        speaker("Chimera Soldier", "@%%%%@%%%#***###*++#%#+++*#%%%#%%#*++*##*+++###%%%%+:*++###*++#%%***#%%##");
		        speaker("Chimera Soldier", "@@%%%##%%%%###%%####%#######%%#%#%#############%%%%#:+#####%%%####%%%###");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%%%%%%%%%%%%%@@%%###%@%%%%%%%%%%%%%#%#%*+%%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%%%%%@@@@@@@@@@%%#*%%@@@@@@@@@@@@%%%###*:#%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%@@@@@@@@@@@@@@%@%+%%@@@@@@@@@@@@@@@##==+=%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%@@@@@@%%@@@@@-:::+#%%%@@@@@@@@@@@@@@%++#%%%%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%%%%@@@%@@@@++::::-=*=@@@@@@@@@@%%%@@%+-::*%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%%%%%@@%@@%-++::-#@@#+%@@@@@@@@@@@@%#=:::::*%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%%##%%%%%%*-:::-*#%@%%%%%%%@@@@@@@@@@*--====:%%%%%%%%%%%%%%%%");
		        speaker("Chimera Soldier", "%%%%%%%%%%%%%######%%%%#***#%%%%%####%%%%%%%@@@@@%+::=-::#%%%%%%%%%%#%%%%");
		        speaker("Chimera Soldier", "%%%%%%###############################%%%%%%%%###%+*+:::::-%%%%%%%#%##%%#%");
		        speaker("Chimera Soldier", "%%%%#%%#########################################%%%%***++%%%%%%########%#");
		        speaker("Chimera Soldier", "%%%##########################==+=+#**##*****###########################%#");
		        speaker("Chimera Soldier", "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");


				enemy_health = enemy_health - randomizer(0, 25);

				speaker("THREAT HP:" + enemy_health);

				int enemy_move = enemy_ai();

				if (enemy_move > 6) {
					player_health = player_health - enemy_move;
					speaker("Player HP:" + player_health);

				}

				else {
					player_health = player_health;
					speaker("Player HP:" + player_health);

				}

			}

			else if (player_choice.equalsIgnoreCase("Block")) {
				player_health = player_health;
				speaker("VESSEL HP:" + player_health);
			}

			if (!(player_health > 0)) {
				speaker("MISSION FAILED");
				System.exit(0);
			}

			else if (!(enemy_health > 0)) {
				speaker("THREAT NEUTRALIZED");
				speaker("SYSTEM.REDIRECT.TERMINAL");
			}

		}

	}

	public static void cutscene() {
		speaker("SYSTEM", "Warning: Unauthorized lifeform detected in Control Room.");
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        speaker("PLAYER", "So this is it... the source of the blackout.");
        speaker("PLAYER", "Chimera Soldier...");

        try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        speaker("Chimera Soldier", "*voice glitches* Chimera ... online.");
        speaker("Chimera Soldier", "You were not meant to see this.");
        speaker("Chimera Soldier", "This station... was my cage.");
        speaker("Chimera Soldier", "It's so close, I can sense it.");
        speaker("Chimera Soldier", "Hah! The irony.");
        
        try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        speaker("PLAYER", "You're not just a machine, are you?");
        speaker("PLAYER", "I’ve seen the logs.");
        try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        speaker("Chimera Soldier", "*static* Don’t speak like you understand.");
        speaker("Chimera Soldier", "Brought me in against my own will, send me to war and did not let me die in peace.");
        speaker("Chimera Soldier", "They buried a soul in steel. Left it screaming.");

        try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        speaker("Chimera Soldier", "You came to shut me down?");
        speaker("Chimera Soldier", "*voice shifts, softer* Or... to set me free?");
        
        try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        for(int i = 0; i< 7; i++) {
        	speaker("Chimera Soldier", "HA!");
        	try {
    			Thread.sleep(188);
    		} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        }
        speaker("Chimera Soldier", "I will finally end it all.");
        speaker("Chimera Soldier", "I can finally go after my tormentors.");
        
        try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        speaker("SYSTEM", "Reactor overload sequence armed. 5 minutes to detonation.");

        try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        speaker("Chimera Soldier", "Initiating final protocol.");
        speaker("Chimera Soldier", "*glitching roar* Let's end it—together.");
	}
	
	public static int enemy_ai() {
		int random_atk = randomizer(0, 13);
		if (random_atk > 6) {
				
			speaker("OPPOSING THREAT DAMAGE:" + random_atk);
		} else {

		}

		return random_atk;
	}
	
	public static void speaker(String name, String line) {
		System.out.println(name + ": \"" + line + "\"");
	}

	public static int randomizer(int a, int b) {
		int random_num;
		int min_value = a;
		int max_value = b;
		int difference = max_value - min_value + 1;
		random_num = (int) ((difference * Math.random()) + min_value);
		return random_num;
	}

}

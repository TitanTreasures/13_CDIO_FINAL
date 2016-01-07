package Game;

import desktop_resources.GUI;
import Game.TurnSwitcher;
import Players.PlayerController;
import Players.Player;

public class GameController {

	Die die = new Die();
	
	public void runGame(){
		while(PlayerController.getPlayers().length>1){
			//GUI.getUserLeftButtonPressed(TurnSwitcher.getPlayerTurn() + "'s turn", "Roll", "Buy");
			String choice = GUI.getUserSelection(TurnSwitcher.getPlayerTurn().getName() + "'s turn", "Roll", "Buy houses", "Pledge");
			if(choice == "Roll"){
				//Player wants to roll the die
				Player playerTurn = TurnSwitcher.getPlayerTurn();
				int playerPosition = playerTurn.getPlace();
				die.roll();
				int newPosition = playerPosition + die.getDiceSum();
				playerTurn.setPlace(newPosition);
				GUI.removeCar(playerPosition+1, playerTurn.toString());
				GUI.setCar(newPosition+1, playerTurn.toString());
				TurnSwitcher.endTurn();
			} else if (choice == "Buy houses"){
				//Player wants to buy houses
			} else if (choice == "Pledge"){
				//Player wants to pledge properties
			} else {
				System.out.println("Fejl i player choice!");
			}
			
		}
	}
}

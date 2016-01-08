package Game;

import desktop_resources.GUI;
import Game.TurnSwitcher;
import Players.PlayerController;
import Players.Player;
import Game.Language;

public class GameController {

	private int chances;
	private boolean gotLoose;
	private boolean choiceJail;
	private String choice;
	private int playerPosition;
	private int newPosition;
	private Player currentPlayer;
	Die die = new Die();
	private GUISetupManager guiManager;
	private PlayerController playerController;
	
	
	public void runGame(){
		//TODO add comments
		guiManager = new GUISetupManager();
		playerController = new PlayerController();
		while(playerController.getPlayers().length>1){
			//TODO Fix static access
			currentPlayer = playerController.getNextPlayer();
			//JailTurn
			if (currentPlayer.getJailed()){
				jailTurn();
			} else if (!(currentPlayer.getJailed())){
				standardTurn();
			} else{
				System.out.println("Fejl i jailcheck!");
			}
			
		}
	}

	private void standardTurn() {
		choice = GUI.getUserSelection(currentPlayer.getName() + Language.getLang("STURN"), Language.getLang("ROLL"), Language.getLang("BUYHOUSE"), Language.getLang("PLEDGE"));
		if(choice == "Roll"){
			//Player wants to roll the die
			playerPosition = currentPlayer.getPlace();
			die.roll();
			//Setting position
			newPosition = playerPosition + die.getDiceSum();
			if(newPosition > 40) newPosition = newPosition-40;
			currentPlayer.setPlace(newPosition);
			//Communicating with GUI
			GUI.removeCar(playerPosition+1, currentPlayer.getName());
			GUI.setCar(newPosition+1, currentPlayer.getName());
			GUI.showMessage(Language.getLang("ROLLED") + " " + die.getDiceSum());
			//Ending turn FIXME Static access
			TurnSwitcher.endTurn();
		} else if (choice == "Buy houses"){
			//Player wants to buy houses
			GUI.getUserSelection(Language.getLang("HOUSECHOICE"), "y0uR muM!?!");
			
		} else if (choice == "Pledge"){
			//Player wants to pledge properties
		} else {
			System.out.println("Fejl i player choice!");
		}
	}

	private void jailTurn() {
		//TODO fix static
		choiceJail = GUI.getUserLeftButtonPressed(Language.getLang("ROLLPAY"), Language.getLang("ROLL"), Language.getLang("PAY"));
		if(choiceJail){
			chances = 3;
			gotLoose = false;
			while(chances > 0){
				die.roll();
				if(die.getDice1() == die.getDice2()){
					gotLoose = true;
					chances = 0;
				}else if(die.getDice1() != die.getDice2()){
					chances--;
					GUI.showMessage(Language.getLang("ROLLED")+ " " + die.getDiceSum());
				}
			}
			if(gotLoose){
				currentPlayer.setJail(false);
				playerPosition = currentPlayer.getPlace();
				newPosition = playerPosition + die.getDiceSum();
				currentPlayer.setPlace(newPosition);
				GUI.removeCar(playerPosition+1, currentPlayer.getName());
				GUI.setCar(newPosition+1, currentPlayer.getName());
				GUI.showMessage(Language.getLang("ROLLED") + " " + die.getDiceSum());
				TurnSwitcher.endTurn();
			}
		}else if(!(choiceJail)){
			currentPlayer.getAccount().updateBalance(-1000);
			GUI.setBalance(currentPlayer.getName(), currentPlayer.getAccount().getBalance());
			currentPlayer.setJail(false);
			TurnSwitcher.endTurn();
		}
	}
}

package Fields;

import Players.Player;
import Players.PlayerController;

public class Prison extends Jail_Prison_Start{
	private PlayerController playerController;
		
	public Prison(int FieldNumberC, String fieldName, String SubTextC){
		FieldName = fieldName;
		FieldNumber = FieldNumberC;
		SubText = SubTextC;
		
	}
	
	@Override
	public void landOnField(){
		playerController = new PlayerController();
		Player jailedPlayer = playerController.getNextPlayer();
		jailedPlayer.setJail(true);
	}
	@Override
	public String getName(){
		return FieldName;
	}
	@Override
	public int getFieldNumber(){
		return FieldNumber;
	}
	@Override
	public String getSubText(){
		return SubText;
	}
	
}
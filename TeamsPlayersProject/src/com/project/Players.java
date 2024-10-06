package com.project;

public class Players {

	private String playerId;
	private String playerName;
	private String playerSpeciality;
	
	
	

	public Players() {
		super();
	}

	public Players(String playerId, String playerName, String playerSpeciality) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerSpeciality = playerSpeciality;
	}

	public String getPlayerId() {
		return playerId;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerSpeciality() {
		return playerSpeciality;
	}
	public void setPlayerSpeciality(String playerSpeciality) {
		this.playerSpeciality = playerSpeciality;
	}

	@Override
	public String toString() {
		return "Player ID :-> " + playerId + ",\nPlayer Name :-> " + playerName + ",\nPlayer Speciality :-> " + playerSpeciality+"\n";
	}
}

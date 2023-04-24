package com.example.connection.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class IPLModel {

	@Id
	
	private int playerId;
	private String playerName;
	private String playerCountry;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerCountry() {
		return playerCountry;
	}
	public void setPlayerCountry(String playerCountry) {
		this.playerCountry = playerCountry;
	}
	
	
}

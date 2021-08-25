package main;

import lombok.Data;
import java.util.ArrayList;
import ability.SuperPower;

@Data
public class Hero {
	private String name;
	private int stat;
	private String feature;
	private String hitterDisplay = "타석에 들어섭니다.";
	private String pitcherDisplay = "마운드에 들어섭니다.";
	private ArrayList<SuperPower> superPowers;
	
	public Hero(String name, int stat, String feature, ArrayList<SuperPower> superPowers) {
		this.name = name;
		this.stat = stat;
		this.feature = feature;
		this.superPowers = superPowers;
	}
	
	public void mySuperPowers() {
		for(SuperPower i: superPowers) {
			i.ability();
		}
	}
}

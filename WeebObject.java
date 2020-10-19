package weebs;
//Version 5
public class WeebObject { // SuperClass 
	double eAttackD, eDefenseD, eHealthD, eSpeedD, eManaD; // Default Enemy Statistics
	double eAttackC, eDefenseC, eHealthC, eSpeedC, eManaC; // Current Enemy Statistics
	String name, element; // Enemy Details
	double eBasicAttackDamage; // Damage Variable
	double  []selfAbility = new double  [0]; //doubleeger that is used if it's an ability that does not doubleeract with the enemy. It is empty.
	double  strongAgainstOpposingElement = 0; //When it is 0, element is the same, When it is 1, this creature is strong against the opponent. When it is 2, it is weak against the opponent.
	int weebType;
	//doubleeger that is used if it's an ability that does affect the enemy. The first slot shows the stat affected.
	double  []offenseAbility = new double [2]; //0 is damage health, 1 is reduce attack, 2 is reduce defense, 3 is reduce mana.
	public void changeTypeOfWeebObject (int typeOfWeeb)
	{
		switch (typeOfWeeb)
		{
		case 0: //Makes it Jesus
			eAttackD = 80;
			eDefenseD = 90;
			eHealthD = 100;
			eManaD = 60;
			eSpeedD = 80;
			element = "Vocaloid";
			break;
		case 1: //Makes it Rex
			eAttackD = 100;
			eDefenseD = 95;
			eHealthD = 110;
			eManaD = 120;
			eSpeedD = 105;
			element = "Anime";
			break;
		case 2: //Makes it Jasan
			eAttackD = 110;
			eDefenseD = 110;
			eHealthD = 120;
			eManaD = 200;
			eSpeedD = 110;
			element = "Manga";
			break;
		case 3: //Makes it DrBlob
			eAttackD = 65;
			eDefenseD = 80;
			eHealthD = 70;
			eManaD = 40;
			eSpeedD = 30;
			element = "Manga";
			break;
		case 4: //Makes it Josh
			eAttackD = 85;
			eDefenseD = 60;
			eHealthD = 80;
			eManaD = 50;
			eSpeedD = 70;
			element = "Anime";
			break;
		case 5: //Makes it Trump
			eAttackD = 90;
			eDefenseD = 90;
			eHealthD = 90;
			eManaD = 70;
			eSpeedD = 60;
			element = "Vocaloid";
			break;
		}
		weebType = typeOfWeeb;
		eAttackC = eAttackD;
		eDefenseC = eDefenseD;
		eHealthC = eHealthD;
		eManaC = eManaD;
		eSpeedC = eSpeedD;
		offenseAbility = new double [3]; //doubleeger that is used if it's an ability that does affect the enemy. The first slot shows the stat affected(e.g health, attack).
		strongAgainstOpposingElement = 0; //When it is 0, element is the same, When it is 1, this creature is strong against the opponent. When it is 2, it is weak against the opponent.
	}
	public WeebObject (int typeOfWeeb)
	{
		switch (typeOfWeeb)
		{
		case 0: //Makes it Jesus
			eAttackD = 80;
			eDefenseD = 90;
			eHealthD = 100;
			eManaD = 60;
			eSpeedD = 80;
			element = "Vocaloid";
			break;
		case 1: //Makes it Rex
			eAttackD = 100;
			eDefenseD = 95;
			eHealthD = 110;
			eManaD = 120;
			eSpeedD = 105;
			element = "Anime";
			break;
		case 2: //Makes it Jasan
			eAttackD = 110;
			eDefenseD = 110;
			eHealthD = 120;
			eManaD = 200;
			eSpeedD = 110;
			element = "Manga";
			break;
		case 3: //Makes it DrBlob
			eAttackD = 65;
			eDefenseD = 80;
			eHealthD = 70;
			eManaD = 40;
			eSpeedD = 30;
			element = "Manga";
			break;
		case 4: //Makes it Josh
			eAttackD = 85;
			eDefenseD = 60;
			eHealthD = 80;
			eManaD = 50;
			eSpeedD = 70;
			element = "Anime";
			break;
		case 5: //Makes it Trump
			eAttackD = 90;
			eDefenseD = 90;
			eHealthD = 90;
			eManaD = 70;
			eSpeedD = 60;
			element = "Vocaloid";
			break;
		}
		weebType = typeOfWeeb;
		eAttackC = eAttackD;
		eDefenseC = eDefenseD;
		eHealthC = eHealthD;
		eManaC = eManaD;
		eSpeedC = eSpeedD;
		offenseAbility = new double [2]; //doubleeger that is used if it's an ability that does affect the enemy. The first slot shows the stat affected(e.g health, attack).
		strongAgainstOpposingElement = 0; //When it is 0, element is the same, When it is 1, this creature is strong against the opponent. When it is 2, it is weak against the opponent.
	}
	//Method to account for elemental affinity.
	double elementalCoefficient (double offenseAbiliter)
	{
		if (strongAgainstOpposingElement  == 1)
		{
			offenseAbiliter = offenseAbiliter*2;
		}else if (strongAgainstOpposingElement  == 2)
		{
			offenseAbiliter= offenseAbiliter/2;
		}
		return offenseAbiliter;
	}
	//Combat return methods.
	public double getAttackC()
	{
		return eAttackC;
	}
	public double getDefenseC()
	{
		return eDefenseC;
	}
	public double getHealthC()
	{
		return eHealthC;
	}
	public double getSpeedC()
	{
		return eSpeedC;
	}
	public double getManaC()
	{
		return eManaC;
	}
	//Default return methods.
	public double getAttackD()
	{
		return eAttackD;
	}
	public double getDefenseD()
	{
		return eDefenseD;
	}
	public double getHealthD()
	{
		return eHealthD;
	}
	public double getSpeedD()
	{
		return eSpeedD;
	}
	public double getManaD()
	{
		return eManaD;
	}
	//Combat set methods
	public void setAttackC (double newAttack)
	{
		eAttackC = newAttack;
	}
	public void setDefenseC (double newDefense)
	{
		eDefenseC = newDefense;
	}
	public void setHealthC (double newHealth)
	{
		eHealthC = newHealth;
	}
	public void setSpeedC (double newSpeed)
	{
		eSpeedC = newSpeed;
	}
	public void setManaC (double newMana)
	{
		eManaC = newMana;
	}
	//Default set methods
	public void setAttackD (double newAttack)
	{
		eAttackD = newAttack;
	}
	public void setDefenseD (double newDefense)
	{
		eDefenseD = newDefense;
	}
	public void setHealthD (double newHealth)
	{
		eHealthD = newHealth;
	}
	public void setSpeedD (double newSpeed)
	{
		eSpeedD = newSpeed;
	}
	public void setManaD (double newMana)
	{
		eManaD = newMana;
	}
	public void resetDefaults()
	{
		eManaC = eManaD;
		eHealthC = eHealthD;
		eAttackC = eAttackD;
		eDefenseC = eDefenseD;
	}
	public  double [] basicAttack (double pDefenseC) { // Basic Attack Method
		double damage = (double) ((eAttackC/pDefenseC)*20 + 1);
		offenseAbility[0] = 0; //Targets health
		offenseAbility[1] = damage; //Damage done
		offenseAbility[1] = elementalCoefficient (offenseAbility[1]); //Adjusts the offensive magnitude for whether you are supereffective or weak.
		
		return offenseAbility; // Damage done is Returned
	}
	public double [] skill1(double pDefenseC){ //Contains all the primary attack powers
		double damage;
		switch (weebType)
		{
		case 0: //If Jesus
			damage = (double) ((eAttackC/pDefenseC)*30 + 1)	; //This is slightly better than basic attack, it is *30 instead of *20.
			//Array the returns the stat affected and 
			offenseAbility[0] = 0; //Targets health
			offenseAbility[1] = damage; //Damage done
			offenseAbility[1] = elementalCoefficient (offenseAbility[1]); //Adjusts the offensive magnitude for whether you are supereffective or weak.
			return offenseAbility;
		case 1: //If Rex
			damage = (double) ((eAttackC/pDefenseC)*40 + 1); //This is better than basic attack, it is *40 instead of *20.
			//Array the returns the stat affected and 
			offenseAbility[0] = 0; //Targets health
			offenseAbility[1] = damage; //Damage done
			offenseAbility[1] = elementalCoefficient (offenseAbility[1]); //Adjusts the offensive magnitude for whether you are supereffective or weak.
			return offenseAbility;
		case 2: //If Jasan
			damage = (double) ((eAttackC/pDefenseC)*60 + 1); //This is much better than basic attack, it is *50 instead of *20.
			//Array the returns the stat affected and the magnitude it's affected by.
			System.out.println("Raw damage" + damage);
			offenseAbility[0] = 0; //Targets health
			offenseAbility[1] = damage; //Damage done
			offenseAbility[1] = elementalCoefficient (offenseAbility[1]); //Adjusts the offensive magnitude for whether you are supereffective or weak.
			return offenseAbility;
		case 3: //If DrBlob, throwChunksOfBod
			double baseAttack = ((eAttackC/pDefenseC))*20;
			damage = (double) ((eAttackC/pDefenseC)*20 + 5); //This is better than basic attack, it is *20 + 5. 
			//Array the returns the stat affected and 
			offenseAbility[0] = 0; //Targets health
			offenseAbility[1] = damage; //Damage done
			offenseAbility[1] = elementalCoefficient (offenseAbility[1]); //Adjusts the offensive magnitude for whether you are supereffective or weak.
			return offenseAbility;
		case 4: // If Josh
			damage = (double) ((eAttackC/pDefenseC)*20 + 10); //This is better than basic attack, it is *20 + 10. 
			//Array the returns the stat affected and damage done
			offenseAbility[0] = 0; //Targets health
			offenseAbility[1] = damage; //Damage done
			offenseAbility[1] = elementalCoefficient (offenseAbility[1]); //Adjusts the offensive magnitude for whether you are supereffective or weak.
			return offenseAbility;
		case 5: //If Trump
			damage = (double) ((eAttackC/pDefenseC)*20 + 15); //This is better than basic attack, it is *20 + 15. 
			//Array the returns the stat affected and 
			offenseAbility[0] = 0; //Targets health
			offenseAbility[1] = damage; //Damage done
			offenseAbility[1] = elementalCoefficient (offenseAbility[1]); //Adjusts the offensive magnitude for whether you are supereffective or weak.
			return offenseAbility;
		}
		return offenseAbility;
	}
	public double [] skill2()
	{
		switch (weebType)
		{
		case 0: //If Jesus
			eAttackC= (double)(eAttackC*1.25);
			return selfAbility;
		case 1: //If Rex
			eManaC +=40;
			if (eManaC > eManaD) //If combat mana goes above default mana, it just equals default mana. 
			{
				eManaC = eManaD;
			}
			return selfAbility; //If Jasan
		case 2:
			eDefenseC = (double) (eDefenseC*1.35);
			return selfAbility;
		case 3: //If DrBlob
			eDefenseC += 20;
			return selfAbility;
		case 4: //If Josh
			eDefenseC += 10;
			eAttackC += 10;
			eHealthC += 10;
			return selfAbility;
		case 5: //If Trump
			eDefenseC += 15;
			offenseAbility[0] = 2; //Targets defense
			offenseAbility[1] = 15; //Damage done
			offenseAbility[1] = elementalCoefficient (offenseAbility[1]); //Adjusts the offensive magnitude for whether you are supereffective or weak.
			return offenseAbility;
		}
		return offenseAbility;
	}
	public double [] skill3(double pDefenseC)
	{
		switch (weebType)
		{
		case 0: //If Jesus
			eAttackC += 40;
			eDefenseC += 40;
			double heal = 50;
			offenseAbility[0] = 0; //Targets health
			offenseAbility[1] = heal; //Damage done
			offenseAbility[1] = elementalCoefficient (offenseAbility[1]); //Adjusts the offensive magnitude for whether you are supereffective or weak.
			return offenseAbility;
		case 1: //If Rex
			eHealthC += eHealthD;
			eAttackC = (double) (0.8*eAttackC);
			eDefenseC = (double) (0.8*eDefenseC);
			return selfAbility;
		case 2:  //If Jasan
			eHealthC += 40;
			return selfAbility;
		case 3: //If DrBlob
			eHealthC += 35;
			eAttackC += 35;
			eDefenseC -= 35;
			if (eHealthC > eHealthD) //Makes sure health does not exceed maximum health.
			{
				eHealthC = eHealthD;
			}
			if(eDefenseC < 1) //Makes sure defense does not equal 0.
			{
				eDefenseC = 1;
			}
			return selfAbility;
		case 4: //If Josh
			double damage = (double) ((eAttackC/pDefenseC)*30 + 10); //This is better than basic attack, it is *30 + 10. 
			//Array the returns the stat affected and damage done
			offenseAbility[0] = 0; //Targets health
			offenseAbility[1] = damage; //Damage done
			offenseAbility[1] = elementalCoefficient (offenseAbility[1]); //Adjusts the offensive magnitude for whether you are supereffective or weak.
			return offenseAbility;
		case 5:
			eHealthC += 40;
			return selfAbility;
		}
		return offenseAbility;
	}
	//Methods for Jesus
	public  double[] crucifixion (double pDefenseC) //Skill 1
	{
		double damage = (double) ((eAttackC/pDefenseC)*30 + 1)	; //This is slightly better than basic attack, it is *30 instead of *20.
		//Array the returns the stat affected and 
		offenseAbility[0] = 0; //Targets health
		offenseAbility[1] = damage; //Damage done
		offenseAbility[1] = elementalCoefficient (offenseAbility[1]); //Adjusts the offensive magnitude for whether you are supereffective or weak.
		return offenseAbility;
	}
	public  double[] walkOnWater () //Boosts attack.
	{
		eAttackC= (double)(eAttackC*1.25);
		return selfAbility;
	}
	public  double[] bless () //Heals the opponent, but gives massive stat boost. It can heal opponent above max health.
	{
		eAttackC += 40;
		eDefenseC += 40;
		double heal = 50;
		offenseAbility[0] = 0; //Targets health
		offenseAbility[1] = heal; //Damage done
		offenseAbility[1] = elementalCoefficient (offenseAbility[1]); //Adjusts the offensive magnitude for whether you are supereffective or weak.
		return offenseAbility;
	}
	//Methods for Rex 
	public  double[] headButt (double pDefenseC) //Skill 1. An offensive skill that will do damage.
	{
		double damage = (double) ((eAttackC/pDefenseC)*40 + 1); //This is better than basic attack, it is *40 instead of *20.
		//Array the returns the stat affected and 
		offenseAbility[0] = 0; //Targets health
		offenseAbility[1] = damage; //Damage done
		offenseAbility[1] = elementalCoefficient (offenseAbility[1]); //Adjusts the offensive magnitude for whether you are supereffective or weak.
		return offenseAbility;
	}
	public  double[] roar () //Mana restore 
	{
		eManaC +=40;
		if (eManaC > eManaD) //If combat mana goes above default mana, it just equals default mana. 
		{
			eManaC = eManaD;
		}
		return selfAbility;
	}
	public  double[] lickWounds () //Full heal to health, but lowers stats a lot.
	{
		eHealthC += eHealthD;
		eAttackC = (double) (0.8*eAttackC);
		eDefenseC = (double) (0.8*eDefenseC);
		return selfAbility;
	}
	//Methods for Jasan 
	public  double[] flex (double pDefenseC) //Skill 1
	{
		double damage = (double) ((eAttackC/pDefenseC)*60 + 1); //This is much better than basic attack, it is *50 instead of *20.
		//Array the returns the stat affected and the magnitude it's affected by.
		System.out.println("Raw damage" + damage);
		offenseAbility[0] = 0; //Targets health
		offenseAbility[1] = damage; //Damage done
		offenseAbility[1] = elementalCoefficient (offenseAbility[1]); //Adjusts the offensive magnitude for whether you are supereffective or weak.
		return offenseAbility;
	}
	public  double[] ripOffShirt () //Boosts defense.
	{
		eDefenseC = (double) (eDefenseC*1.35);
		return selfAbility;
	}
	public  double[] gloat () //Heal ability
	{
		eHealthC += 40;
		return selfAbility;
	}
	//Methods for DrBlob
	public  double [] throwChunksOfBod (double pDefenseC) //Skill 1. An offensive skill that will do damage.
	{
		double baseAttack = ((eAttackC/pDefenseC))*20;
		double damage = (double) ((eAttackC/pDefenseC)*20 + 5); //This is better than basic attack, it is *20 + 5. 
		//Array the returns the stat affected and 
		offenseAbility[0] = 0; //Targets health
		offenseAbility[1] = damage; //Damage done
		offenseAbility[1] = elementalCoefficient (offenseAbility[1]); //Adjusts the offensive magnitude for whether you are supereffective or weak.
		return offenseAbility;
	}
	public  double[] split () //Boosts defense
	{
		eDefenseC += 20;
		return selfAbility;
	}
	public  double[] rapidCellReproduction () //Moderate boost to health and attack, lowers defense.
	{
		eHealthC += 35;
		eAttackC += 35;
		eDefenseC -= 35;
		if (eHealthC > eHealthD) //Makes sure health does not exceed maximum health.
		{
			eHealthC = eHealthD;
		}
		if(eDefenseC < 1) //Makes sure defense does not equal 0.
		{
			eDefenseC = 1;
		}
		return selfAbility;
	}
	//Methods for Josh
	public  double[] playAltoSax (double pDefenseC) //Skill 1. An offensive skill that will do damage.
	{
		double damage = (double) ((eAttackC/pDefenseC)*20 + 10); //This is better than basic attack, it is *20 + 10. 
		//Array the returns the stat affected and damage done
		offenseAbility[0] = 0; //Targets health
		offenseAbility[1] = damage; //Damage done
		offenseAbility[1] = elementalCoefficient (offenseAbility[1]); //Adjusts the offensive magnitude for whether you are supereffective or weak.
		return offenseAbility;
	}
	public  double[] flirtWithLadies () //Increase attack, defense, and health slightly.
	{
		eDefenseC += 10;
		eAttackC += 10;
		eHealthC += 10;
		return selfAbility;
	}
	public  double[] eatPizza (double pDefenseC) //Does massive damage but lowers attack.
	{
		double damage = (double) ((eAttackC/pDefenseC)*30 + 10); //This is better than basic attack, it is *30 + 10. 
		//Array the returns the stat affected and damage done
		offenseAbility[0] = 0; //Targets health
		offenseAbility[1] = damage; //Damage done
		offenseAbility[1] = elementalCoefficient (offenseAbility[1]); //Adjusts the offensive magnitude for whether you are supereffective or weak.
		return offenseAbility;
	}
	//Methods for Trump
	public  double[] golf (double pDefenseC) //Skill 1. An offensive skill that will do damage.
	{
		double damage = (double) ((eAttackC/pDefenseC)*20 + 15); //This is better than basic attack, it is *20 + 15. 
		//Array the returns the stat affected and 
		offenseAbility[0] = 0; //Targets health
		offenseAbility[1] = damage; //Damage done
		offenseAbility[1] = elementalCoefficient (offenseAbility[1]); //Adjusts the offensive magnitude for whether you are supereffective or weak.
		return offenseAbility;
	}
	public  double[] lie () //Increases own defense and lower opponents defense.
	{
		eDefenseC += 15;
		offenseAbility[0] = 2; //Targets defense
		offenseAbility[1] = 15; //Damage done
		offenseAbility[1] = elementalCoefficient (offenseAbility[1]); //Adjusts the offensive magnitude for whether you are supereffective or weak.
		return offenseAbility;
	}
	public  double[] invest () //Heal power. 
	{
		eHealthC += 40;
		return selfAbility;
	}
	public  double[] attackChooser (double pDefenseC, double pAttackC, double pHealthC)
	{
		double basicAttackOdds;
		double skill1Odds;
		double skill2Odds;
		double skill3Odds;
		double totalOdds;
		double attackChosen;
		double [] returner;
		switch (weebType)
		{
		case 0: //If Weeb is Jesus
			basicAttackOdds = eHealthC-pHealthC+eAttackC-pAttackC+eDefenseC-pDefenseC; //High self stats and low enemy stats make more likely.
			if (basicAttackOdds < 0) //Sets basicAttackOdds to 0 if there is a negative chance of doing it. 
			{
				basicAttackOdds = 0;
			}
			//All main methods have +80 to make them more likely than basicAttack. They have the previously skill size added to them because the numbers from 0-previousSkill will already be used up, so they need their own size plus the previousSKill.
			//Crucifixion is like basic attack but better.
			skill1Odds =  (pHealthC-eHealthC-eAttackC+pAttackC-eDefenseC+pDefenseC)+80 + basicAttackOdds; //High self stats and low enemy stats make more likely. 
			if (skill1Odds < 0) //Sets skill1Odds to 0 if there is a negative chance of doing it. 
			{
				skill1Odds = 1;
			}
			//walkOnWater boosts attack.
			skill2Odds = (double)(pHealthC + eHealthC + eDefenseC/2 + pDefenseC/2 - eAttackC*1.5 -pAttackC*1.5)+80 + skill1Odds; 
			//More likely to boost defense if both creatures health and defense are high so the battle is more likely to go longer. Attack is weighted slightly higher and defense slightly lower because already high attack makes crucifixion more powerful.
			if (skill2Odds < 0) //Sets skill2Odds to 0 if there is a negative chance of doing it. 
			{
				skill2Odds = 0;
			}
			//Bless heals opponent and boosts self sets.
			skill3Odds = (2*pHealthC + 2*eHealthC - pAttackC - eAttackC - pDefenseC - eDefenseC)+80 + skill2Odds; //Low self stats, high opponent health, high self health, and low opponent stats make it more likely.
			if (skill3Odds < 0 || eHealthC < (eHealthD - 40)) //Sets skill3Odds to 0 if there is a negative chance of doing it or health is more than max health - 40.
			{
				skill3Odds = 0;
			}
			totalOdds = skill3Odds;
			attackChosen = (double)(Math.random() * totalOdds); //Generates a random number between 0 and skill3Odds. skill3Odds should be the same as totalOdds. 
			if (attackChosen <= basicAttackOdds) //If it falls in the range of basicAttackOdds.
			{
				returner = basicAttack(pDefenseC);
			}else if (attackChosen <= skill1Odds) //If it falls in the range of skill1Odds
			{
				returner = crucifixion(pDefenseC);
			}else if (attackChosen <= skill2Odds) //If it falls in the range of skill2Odds
			{
				returner = walkOnWater();
			}
			else
			{
				returner = bless();
			}
			if ( pHealthC  <= (eAttackC/pDefenseC)*30 + 1)
			{
				returner = crucifixion(pDefenseC);
			}
			if (eManaC == 0){
				returner = basicAttack(pDefenseC);
			}
			return returner;
		case 1: //If weeb is Rex.
			basicAttackOdds = eHealthC-pHealthC+eAttackC-pAttackC+eDefenseC-pDefenseC; //High self stats and low enemy stats make more likely.
			if (basicAttackOdds < 0) //Sets basicAttackOdds to 0 if there is a negative chance of doing it. 
			{
				basicAttackOdds = 0;
			}
			//All main methods have +90 to make them more likely than basicAttack. They have the previously skill size added to them because the numbers from 0-previousSkill will already be used up, so they need their own size plus the previousSKill.
			//Headbutt is like basic attack but better.
			skill1Odds =  (pHealthC-eHealthC-eAttackC+pAttackC-eDefenseC+pDefenseC)+90 + basicAttackOdds; //High self stats and low enemy stats make more likely. 
			if (skill1Odds < 0) //Sets skill1Odds to 0 if there is a negative chance of doing it. 
			{
				skill1Odds = 1;
			}
			//lickWounds heals self and lowers self stats
			skill3Odds = ( 500-pHealthC - eHealthC - pAttackC - eAttackC - pDefenseC - eDefenseC)+90 + skill1Odds; //Low self stats, high opponent health, high self health, and low opponent stats make it more likely.
			if (skill3Odds < 0) //Sets skill3Odds to 0 if there is a negative chance of doing it or health is more than max health - 40.
			{
				skill3Odds = 0;
			}
			totalOdds = skill3Odds;
			attackChosen = (double)(Math.random() * totalOdds); //Generates a random number between 0 and skill3Odds. skill3Odds should be the same as totalOdds. 
			if (attackChosen <= basicAttackOdds) //If it falls in the range of basicAttackOdds.
			{
				returner = basicAttack(pDefenseC);
			}else if (attackChosen <= skill1Odds) //If it falls in the range of skill1Odds
			{
				returner = headButt(pDefenseC);
			}
			else
			{
				returner = lickWounds();
			}
			//Checks if mana is at minimum for the roar and if the enemy is one attack away from death for the headbutt. If there is no mana then basicAttack is done.
			if (eManaC == 10 && pHealthC > ((eAttackC/pDefenseC)*40 + 1))
			{
				returner = roar();
			}
			else if ( pHealthC  <= (eAttackC/pDefenseC)*40 + 1)
			{
				returner = headButt(pDefenseC);
			}
			if (eManaC == 0){
				returner = basicAttack(pDefenseC);
			}
			return returner;
		case 2://If weeb is Jasan.
			basicAttackOdds = eHealthC-pHealthC+eAttackC-pAttackC+eDefenseC-pDefenseC; //High self stats and low enemy stats make more likely.
			if (basicAttackOdds < 0) //Sets basicAttackOdds to 0 if there is a negative chance of doing it. 
			{
				basicAttackOdds = 0;
			}
			//All main methods have +100 to make them more likely than basicAttack. They have the previously skill size added to them because the numbers from 0-previousSkill will already be used up, so they need their own size plus the previousSKill.
			//Flex is like basic attack but much better.
			skill1Odds =  (pHealthC-eHealthC-eAttackC+pAttackC-eDefenseC+pDefenseC)+100 + basicAttackOdds; //High self stats and low enemy stats make more likely. 
			if (skill1Odds < 0) //Sets skill1Odds to 0 if there is a negative chance of doing it. 
			{
				skill1Odds = 1;
			}
			//ripOffShirt boosts defense.
			skill2Odds = (pHealthC + eHealthC + eDefenseC + pDefenseC - eAttackC*2 -pAttackC*2)+100 + skill1Odds; //More likely to boost defense if both creatures health and defense are high so the battle is more likely to go longer.
			if (skill2Odds < 0) //Sets skill2Odds to 0 if there is a negative chance of doing it. 
			{
				skill2Odds = 0;
			}
			//Gloat heals self.
			skill3Odds = (pHealthC - eHealthC + pAttackC - eAttackC + pDefenseC - eDefenseC)+100 + skill2Odds; //High self stats make it more likely. 
			if (skill3Odds < 0 || eHealthC  >  (eHealthD - 40)) //Sets skill3Odds to 0 if there is a negative chance of doing it or health is more than max health - 40.
			{
				skill3Odds = 0;
			}
			totalOdds = skill3Odds;
			attackChosen = (double)(Math.random() * totalOdds); //Generates a random number between 0 and skill3Odds. skill3Odds should be the same as totalOdds. 
			if (attackChosen <= basicAttackOdds) //If it falls in the range of basicAttackOdds.
			{
				returner =  basicAttack(pDefenseC);
			}else if (attackChosen <= skill1Odds) //If it falls in the range of skill1Odds
			{
				returner =  flex(pDefenseC);
			}else if (attackChosen <= skill2Odds) //If it falls in the range of skill2Odds
			{
				returner =  ripOffShirt();
			}
			else
			{
				returner =  gloat();
			}
			if ( pHealthC  <= (eAttackC/pDefenseC)*30 + 1)
			{
				returner =  flex(pDefenseC);
			}
			if (eManaC == 0){
				returner =  basicAttack(pDefenseC);
			}
			return returner;
		case 3://If weeb is DrBlob.
			basicAttackOdds = eHealthC-pHealthC+eAttackC-pAttackC+eDefenseC-pDefenseC; //High self stats and low enemy stats make more likely.
			if (basicAttackOdds < 0) //Sets basicAttackOdds to 0 if there is a negative chance of doing it. 
			{
				basicAttackOdds = 0;
			}
			//All main methods have +30 to make them more likely than basicAttack. They have the previously skill size added to them because the numbers from 0-previousSkill will already be used up, so they need their own size plus the previousSKill.
			//throwChunksOfBod is like basic attack but better.
			skill1Odds =  (pHealthC-eHealthC-eAttackC+pAttackC-eDefenseC+pDefenseC)+30 + basicAttackOdds; //High self stats and low enemy stats make more likely. 
			if (skill1Odds < 0) //Sets skill1Odds to 0 if there is a negative chance of doing it. 
			{
				skill1Odds = 1;
			}
			//Split boosts defense.
			skill2Odds = (pHealthC + eHealthC + eDefenseC + pDefenseC - eAttackC*2 -pAttackC*2)+30 + skill1Odds; //More likely to boost defense if both creatures health and defense are high so the battle is more likely to go longer.
			if (skill2Odds < 0) //Sets skill2Odds to 0 if there is a negative chance of doing it. 
			{
				skill2Odds = 0;
			}
			//rapidCellReproduction boosts health and attack, but lowers defense.
			skill3Odds = (-pHealthC - eHealthC +pAttackC*2 - eAttackC  - pDefenseC + eDefenseC*2)+30 + skill2Odds; //Low self health, low enemy health, low self attack, high enemy attack, low enemy defense, and high self defense make more likely.
			if (skill3Odds < 0 || eHealthC  > (eHealthD - 35)) //Sets skill3Odds to 0 if there is a negative chance of doing it or health is more than max health -35.
			{
				skill3Odds = 0;
			}
			totalOdds = skill3Odds;
			attackChosen = (double)(Math.random() * totalOdds); //Generates a random number between 0 and skill3Odds. skill3Odds should be the same as totalOdds. 
			if (attackChosen <= basicAttackOdds) //If it falls in the range of basicAttackOdds.
			{
				returner =   basicAttack(pDefenseC);
			}else if (attackChosen <= skill1Odds) //If it falls in the range of skill1Odds
			{
				returner =  throwChunksOfBod(pDefenseC);
			}else if (attackChosen <= skill2Odds) //If it falls in the range of skill2Odds
			{
				returner =  split();
			}
			else
			{
				returner =  rapidCellReproduction();
			}
			if ( pHealthC  <= (eAttackC/pDefenseC)*20 + 5) //If the enemy is one hit away from death.
			{
				returner =  throwChunksOfBod(pDefenseC);
			}
			if (eManaC == 0){
				returner =  basicAttack(pDefenseC);
			}
		case 4://If weeb is Josh
			basicAttackOdds = eHealthC-pHealthC+eAttackC-pAttackC+eDefenseC-pDefenseC; //High self stats and low enemy stats make more likely.
			if (basicAttackOdds < 0) //Sets basicAttackOdds to 0 if there is a negative chance of doing it. 
			{
				basicAttackOdds = 0;
			}
			//All main methods have +40 to make them more likely than basicAttack. They have the previously skill size added to them because the numbers from 0-previousSkill will already be used up, so they need their own size plus the previousSKill.
			//playAltoSax is like basic attack but better.
			skill1Odds =  (pHealthC-eHealthC-eAttackC+pAttackC-eDefenseC+pDefenseC)+40 + basicAttackOdds; //High self stats and low enemy stats make more likely. 
			if (skill1Odds < 0) //Sets skill1Odds to 0 if there is a negative chance of doing it. 
			{
				skill1Odds = 1;
			}
			//flirtWithLadies boosts defense, attack, and health slightly.
			skill2Odds = (420 - pHealthC - eHealthC - eDefenseC - pDefenseC - eAttackC*2 -pAttackC*2)+30 + skill1Odds; //Low self stats and low enemy stats make more likely.
			if (skill2Odds < 0 || eHealthC > (eHealthD - 10)) //Sets skill2Odds to 0 if there is a negative chance of doing it or if less than ten health has been lost.
			{
				skill2Odds = 0;
			}
			//eatPizza does massive damage but lowers attack.
			skill3Odds = (-pHealthC - eHealthC +pAttackC*5 - eAttackC  - pDefenseC - eDefenseC)+30 + skill2Odds; //Low enemy health, high self attack, low enemy and self defense, low self health makes more likely.
			if (skill3Odds < 0) //Sets skill3Odds to 0 if there is a negative chance of doing it or health is more than max health -35.
			{
				skill3Odds = 0;
			}
			totalOdds = skill3Odds;
			attackChosen = (double)(Math.random() * totalOdds); //Generates a random number between 0 and skill3Odds. skill3Odds should be the same as totalOdds. 
			if (attackChosen <= basicAttackOdds) //If it falls in the range of basicAttackOdds.
			{
				returner = basicAttack(pDefenseC);
			}else if (attackChosen <= skill1Odds) //If it falls in the range of skill1Odds
			{
				returner = playAltoSax(pDefenseC);
			}else if (attackChosen <= skill2Odds) //If it falls in the range of skill2Odds
			{
				returner = flirtWithLadies();
			}
			else
			{
				returner = eatPizza(pDefenseC);
			}
			if ( pHealthC  <= (eAttackC/pDefenseC)*20 + 5) //If the enemy is one hit away from death.
			{
				returner = throwChunksOfBod(pDefenseC);
			}
			if (eManaC == 0){
				returner = basicAttack(pDefenseC);
			}
		case 5: //If weeb is Trump
			basicAttackOdds = eHealthC-pHealthC+eAttackC-pAttackC+eDefenseC-pDefenseC; //High self stats and low enemy stats make more likely.
			if (basicAttackOdds < 0) //Sets basicAttackOdds to 0 if there is a negative chance of doing it. 
			{
				basicAttackOdds = 0;
			}
			//All main methods have +50 to make them more likely than basicAttack. They have the previously skill size added to them because the numbers from 0-previousSkill will already be used up, so they need their own size plus the previousSKill.
			//Golf is like basic attack but better.
			skill1Odds =  (pHealthC-eHealthC-eAttackC+pAttackC-eDefenseC+pDefenseC)+50 + basicAttackOdds; //High self stats and low enemy stats make more likely. 
			if (skill1Odds < 0) //Sets skill1Odds to 0 if there is a negative chance of doing it. 
			{
				skill1Odds = 0;
			}
			//Lie boosts self defense and lowers enemy defense.
			skill2Odds = (pHealthC*2 + eHealthC *2- eDefenseC - pDefenseC - eAttackC -pAttackC)+50 + skill1Odds; //High health on both sides, low enemy defense, low self defense, and low attack makes it more likely.
			if (skill2Odds < 0) //Sets skill2Odds to 1 if there is a negative chance of doing it or if less than ten health has been lost.
			{
				skill2Odds = 1;
			}
			//Invest heals self.
			skill3Odds = (pHealthC - eHealthC -pAttackC - eAttackC  + pDefenseC + eDefenseC)+50 + skill2Odds; //Low self health, high enemy health, low enemy attack, low self attack, high enemy defense, and high self defense makes more likely.
			if (skill3Odds < 0) //Sets skill3Odds to 0 if there is a negative chance of doing it or health is more than max health -35.
			{
				skill3Odds = 0;
			}
			totalOdds = skill3Odds;
			attackChosen = (double)(Math.random() * totalOdds); //Generates a random number between 0 and skill3Odds. skill3Odds should be the same as totalOdds. 
			if (attackChosen <= basicAttackOdds) //If it falls in the range of basicAttackOdds.
			{
				returner = basicAttack(pDefenseC);
			}else if (attackChosen <= skill1Odds) //If it falls in the range of skill1Odds
			{
				returner = golf(pDefenseC);
			}else if (attackChosen <= skill2Odds) //If it falls in the range of skill2Odds
			{
				returner = lie();
			}
			else
			{
				returner = invest();
			}
			if ( pHealthC  <= (eAttackC/pDefenseC)*20 + 5) //If the enemy is one hit away from death.
			{
				returner = throwChunksOfBod(pDefenseC);
			}
			if (eManaC == 0){
				returner = basicAttack(pDefenseC);
			}
		}
		return basicAttack(pDefenseC);
	}
}
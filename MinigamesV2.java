package weebs;
//This is the good copy I think
//This is currently V2 and I believe it to be finished.
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class MinigamesV2 {


	//Game 0 is the Prisoner's Dilemma

	static JPanel panel = new JPanel();
	static JButton goButton =  new JButton("Go!");
	static String textAreaTextPD = "You are in a competition with an AI. You have two options: A or B. \n If you choose A and the AI chooses A, you each get 3 points. \n If you choose A and the AI chooses B, the AI gets 5 points and you get 1. \n If you choose B and the AI chooses A, the you get 5 points and the AI gets 2. \n If you both choose B, you each get 2 point. \n The label below tells you the total amount of rounds, the current round, and both player's scoresLabel.";
	static JTextArea textarea = new JTextArea ();
	static String textAreaTextRPS = "You are playing Rock Paper Scissors against an AI. \n You know the rules, you're not dumb. Type R to use rock, P to use paper, or S to use scissors. \n The only players are you and the AI.";
	static String textAreaTextNim = "You are playing a game called Nim. \n There are a random number of piles of rocks each a random amount of rocks in them. \n You can pick as many rocks as you want from any one pile. \n You want to draw the last rock to win. Type in the letter of the pile of rocks you want to remove rocks from, then beside it the number of rocks.";
	static JTextField textfield = new JTextField(20);
	static JFrame frame1 = new JFrame ();
	static JLabel scoresLabel = new JLabel("Player score : 0 AI Score: 0");
	static JLabel roundLabels= new JLabel();
	static int [] scores; //The variabel that will hold all the scores.
	static int 	numOfPlayers; //Sets the number of players in the game.
	// int numOfRounds = math.random()*10;
	static int currentRound = 1;
	static 	int totalRounds;
	static boolean playerVictory = false;
	static boolean gameOver;
	


	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MinigamesV2 window = new MinigamesV2();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MinigamesV2() {

		
		//initializeNim();
	}

	static void initializeRockPaperScissors()
	{

		textarea.setText(textAreaTextRPS);
		scoresLabel.setText("Player score : 0 AI Score: 0");
		scores = new int [2]; //Creates 4 scores, one for the player and AI, and two for the AIs playing each other.
		scores[0] = 0;
		scores[1] = 0;
		numOfPlayers = 2; //Sets the number of players in the game.
		// int numOfRounds = math.random()*10;
		currentRound = 1;
		//Sets the values of each score to 0.
		for (int counter = 0; counter < numOfPlayers; counter ++)
		{
			scores [counter] = 0;
		}
		AIDecisionMaking AI = new AIDecisionMaking(1);

		totalRounds =	(int) (Math.random()*5) +7; //Sets the total number of rounds.

		frame1 = new JFrame();
		frame1.setBounds(100, 100, 450, 300);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		textarea.setEditable(false);
		panel.add(textarea);
		panel.add(textfield);
		panel.add(goButton);
		panel.add(scoresLabel);
		panel.add(roundLabels);

		frame1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame1.setSize (900, 300);
		frame1.getContentPane ().add (panel); //add the panel with components to the frame

		frame1.setVisible(true);
		
		roundLabels.setText("Total Rounds: " + totalRounds + "  Current Round: 1"); //Shows the player the number of rounds.

		goButton.addActionListener (new ActionListener ()  //adding action listener to the button component and creating a specific action performed method (override) for the button
				{
			public void actionPerformed (ActionEvent e)
			{
				int choice = AIDecisionMaking.AI_RPS_Choice();
				if (textfield.getText().toUpperCase().equals("R") ) //Runs the method to determine scoring with the player choosing R.
				{
					AIDecisionMaking.playerNumOfRocks++;
					if (choice == 1)
					{
						System.out.println("It's a tie");
					}else if (choice == 2){
						System.out.println("Computer wins");
						scores[1]++;
					}
					else {
						System.out.println("Player wins");
						scores[0]++;
					}

				}
				else if (textfield.getText().toUpperCase().equals("P") ) //Runs the method to determine scoring with the player choosing R.
				{

					if (choice == 1)
					{
						System.out.println("Player wins");
						scores[0]++;
					}else if (choice == 2){
						System.out.println("It's a tie");
					}
					else {
						System.out.println("Computer wins");
						scores[1]++;
					}

				}
				else if (textfield.getText().toUpperCase().equals("S") ) //Runs the method to determine scoring with the player choosing R.
				{
					AIDecisionMaking.playerNumOfScissors++;
					if (choice == 1)
					{
						System.out.println("Computer wins");
						scores[1]++;
					}else if (choice == 2){
						System.out.println("Player wins");
						scores[0]++;
					}
					else {
						System.out.println("It's a tie");
					}

				}
				else 
				{
					currentRound--; //Lowers the current round counter so unacceptable text does not count as a round. 
				}

				currentRound++; //Updates the number of the current round. 
				scoresLabel.setText("AI score: " + scores[1] + " Player score : " + scores[0]); 




				if (currentRound > totalRounds) //When the current round exceeds the total rounds, the game is exited.
				{
					AIDecisionMaking.playerNumOfScissors = 0;
					AIDecisionMaking.playerNumOfRocks = 0;

					AIDecisionMaking.priorProbalityOfRocks = 0.3333;
					AIDecisionMaking.priorProbabilityOfScissors = 0.3333;
					currentRound--; //So after the game it doesn't show currentRound as higher than total rounds.
					int highestScore = scores [0]; //Bubble sort to find highest value.
					for (int counter1 = 0; counter1 <numOfPlayers; counter1++)
					{
						for (int counter = 0; counter < numOfPlayers; counter++)
						{
							if (highestScore < scores[counter])
							{
								highestScore = scores[counter];
							}

						}
					}


					goButton.setVisible(false);
					textarea.setText("Your score is : " + scores[0] + " The highest score achieved is: " + highestScore + " Your weebs now get an health bonus!");
					gameOver = true;
					
					if (scores[0] > highestScore)
					{
						playerVictory = true;
					}
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				 scoresLabel.setText("Player score : 0 AI Score: 0");
					
				 goButton.setVisible(true);
				currentRound = 1;
				playerVictory = false;
					
					frame1.setVisible(false);
				}

			
				roundLabels.setText("Total Rounds: " + totalRounds + " Current Round: " + currentRound);


				//	System.out.println(Math.random());
			}
				});

	}

	private void initializeNim() //Initializes the prisoner's dilemma
	{
		textarea.setText(textAreaTextNim);

		int numOfPiles = (int) Math.round(Math.random()*3 + 1);		//Determines a random amount of piles

		final int [] numOfRocksPerPile = new int[numOfPiles]; //Creates an array to store the number of rocks in each pile.

		for (int counter = 0; counter < numOfPiles; counter++) //Assigns a random number of rocks to each pile.
		{
			numOfRocksPerPile[counter] = (int) Math.round(Math.random()*3 + 1);
		}

		switch (numOfPiles) //Makes a different label depending on how many piles there are.
		{
		case 2: 
			scoresLabel.setText("Pile a: " + numOfRocksPerPile[0] + " Pile b: " + numOfRocksPerPile[1]);
			break;
		case 3: 
			scoresLabel.setText("Pile a: " + numOfRocksPerPile[0] + " Pile b: " + numOfRocksPerPile[1] + " Pile c: " + numOfRocksPerPile[2]);
			break;
		case 4: 
			scoresLabel.setText("Pile a: " + numOfRocksPerPile[0] + " Pile b: " + numOfRocksPerPile[1] + " Pile c " + numOfRocksPerPile[2] + " Pile d " + numOfRocksPerPile[3] );
			break;
		}

		frame1 = new JFrame();
		frame1.setBounds(100, 100, 450, 300);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		textarea.setEditable(false);
		panel.add(textarea);
		panel.add(textfield);
		panel.add(goButton);
		panel.add(scoresLabel);
		panel.add(roundLabels);

		frame1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame1.setSize (900, 300);
		frame1.getContentPane ().add (panel); //add the panel with components to the frame

		frame1.setVisible(true);


		goButton.addActionListener (new ActionListener ()  //adding action listener to the button component and creating a specific action performed method (override) for the button
				{
			public void actionPerformed (ActionEvent e)
			{

				if (textfield.getText().charAt(0) == ('a') ) //Runs the method to determine scoring with player cooperating and whatever the AI decided.
				{
					numOfRocksPerPile[0] -= Integer.parseInt(textfield.getText().substring(1));
				}
			}
				});
	}

	static void initializePD() //Initializes the prisoner's dilemma
	{

		//Warning: The initialization of different AIs might be broken, but this may not matter.

		textarea.setText(textAreaTextPD); 
		scoresLabel.setText("Player score : 0 AI Score: 0");
		scores = new int [4]; //Creates 4 scores, one for the player and AI, and two for the AIs playing each other.
		numOfPlayers = 4; //Sets the number of players in the game.
		// int numOfRounds = math.random()*10;
		currentRound = 1;
		//Sets the values of each score to 0.
		for (int counter = 0; counter < numOfPlayers; counter ++)
		{
			scores [counter] = 0;
		}

		AIDecisionMaking[] otherAIs = new AIDecisionMaking[2]; //Creates the AI players.
		otherAIs[0] = new AIDecisionMaking(0);
		otherAIs[1] = new AIDecisionMaking(0);
		totalRounds =	(int) (Math.random()*5) +2; //Sets the total number of rounds.
		for (int counter = 0; counter < totalRounds; counter++) //The two other AI's play against each other here.
		{
			scores[2] += pointScoring ( otherAIs[0].AICooperatedPD(), otherAIs[1].AICooperatedPD())[0]; //The points added to the first AI.
			scores[3] += pointScoring ( otherAIs[0].AICooperatedPD(), otherAIs[1].AICooperatedPD())[1]; //The points added to the second AI.
		}
		System.out.println("AI score: " + scores[2] + " Player score : " + scores[3]);

		AIDecisionMaking opposingPlayer = new AIDecisionMaking(0); //Creates the AI player.
		frame1 = new JFrame();
		frame1.setBounds(100, 100, 450, 300);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AIDecisionMaking.playerCooperated = true;

		textarea.setEditable(false);
		panel.add(textarea);
		panel.add(textfield);
		panel.add(goButton);
		panel.add(scoresLabel);
		panel.add(roundLabels);

		frame1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame1.setSize (900, 300);
		frame1.getContentPane ().add (panel); //add the panel with components to the frame

		frame1.setVisible(true);


		boolean roundsUnknown; //A boolean that determines whether the final round is unknown or not.

		if( Math.random() > 0.5)//Sets whether the number of rounds is unknown or not.
		{
			roundsUnknown = true;
		}else
		{
			roundsUnknown = false;
		}
		opposingPlayer.roundsUnknown = roundsUnknown; //Tells the AI player whether the number of rounds is unknown or not. 


		if (roundsUnknown)
		{
			roundLabels.setText("Total Rounds: Unknown  Current Round: 0");

		}else{
			roundLabels.setText("Total Rounds: " + totalRounds + "  Current Round: 0");
			opposingPlayer.totalRounds = totalRounds; //Tells the AI the number of rounds if the number of rounds is known. 
		}


		goButton.addActionListener (new ActionListener ()  //adding action listener to the button component and creating a specific action performed method (override) for the button
				{
			public void actionPerformed (ActionEvent e)
			{

				if (textfield.getText().toUpperCase().equals("A") ) //Runs the method to determine scoring with player cooperating and whatever the AI decided.
				{
					scores[0] += pointScoring (true, AIDecisionMaking.AICooperatedPD())[0]; 
					scores[1] += pointScoring (true, AIDecisionMaking.AICooperatedPD())[1];
					AIDecisionMaking.playerCooperated = true; //If the player defected this is set to false.
				}
				else if (textfield.getText().toUpperCase().equals("B") )//Runs the method to determine scoring with player defecting and whatever the AI decided.
				{

					scores[0] += pointScoring (false, AIDecisionMaking.AICooperatedPD())[0];
					scores[1] += pointScoring (false, AIDecisionMaking.AICooperatedPD())[1];
					AIDecisionMaking.playerCooperated = false; //If the player defected this is set to false.

				}
				else 
				{
					currentRound--; //Lowers the current round counter so unacceptable text does not count as a round. 
				}

				currentRound++; //Updates the number of the current round. 
				scoresLabel.setText("AI score: " + scores[1] + " Player score : " + scores[0]); 




				if (currentRound > totalRounds) //When the current round exceeds the total rounds, the game is exited.
				{
					int highestScore = scores [0]; //Bubble sort to find highest value.
					for (int counter1 = 0; counter1 <numOfPlayers; counter1++)
					{
						for (int counter = 0; counter < numOfPlayers; counter++)
						{
							if (highestScore < scores[counter])
							{
								highestScore = scores[counter];
							}

						}
					}


					goButton.setVisible(false);
					textarea.setText("Your score is : " + scores[0] + " The highest score achieved is: " + highestScore + "If you won, your weebs get a health bonus!");
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					currentRound = 1;
					playerVictory = false;
					goButton.setVisible(true);
					frame1.setVisible(false);
				
				}

				roundLabels.setText("Total Rounds: " + totalRounds + " Current Round: " + currentRound);


			}
				});


	}

	public static int [] pointScoring (boolean player1Choice, boolean player2Choice)
	{
		int[] pointsScored = new int [2]; //pointsScored[0] is the first player's points, [1] is the second player's.
		if (player1Choice ) //If the player cooperates
		{
			if (player2Choice)//If the player and AI cooperate.
			{
				pointsScored [0]= 3;
				pointsScored [1] = 3;
			}else{//If the player cooperates and the AI does not.
				pointsScored [0] = 1;
				pointsScored [1]= 5;
			}
		}
		else 
		{

			if (player2Choice)//If the player defects and the AI cooperates.
			{
				pointsScored [0] = 5;
				pointsScored [1]= 1;
			}else{//If the player cooperates and the AI does not.
				pointsScored [0]= 2;
				pointsScored [1]= 2;
			}

		}
		return pointsScored;
	}

}
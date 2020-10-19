package weebs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.CardLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.RenderingHints;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUI {

	private JFrame frame;

	Maps m = new Maps(); //instantiating Maps.java

	JLabel label15 = new JLabel(""); //This holds boss insults.

	Combat battle = new Combat();
	Items itemed = new Items();
	MasterSkill ms = new MasterSkill();

	JProgressBar playerHealth = new JProgressBar(); //the following is code for health and mana bars
	JProgressBar playerMana = new JProgressBar();	
	JProgressBar enemyMana = new JProgressBar();
	final JProgressBar enemyHealth = new JProgressBar();

	final JButton btnSkill = new JButton("Skill 1"); //skill 1 button
	final JButton btnSkill_1 = new JButton("Skill 2"); //skill 2 button
	final JButton btnSkill_2 = new JButton("Skill 3"); //skill 3 button

	JRadioButton rdbtnWeeb = new JRadioButton("Weeb 2", true);
	JRadioButton rdbtnWeeb_1 = new JRadioButton("Weeb 3");
	JRadioButton rdbtnWeeb_2 = new JRadioButton("Weeb 4");
	ButtonGroup	groupRadioButtons = new ButtonGroup ();


	String toSetTextfield = "Game time started!";

	int presskey=0;
	boolean battleActive=false;
	int randomkey =randomnum();

	int [] rooms = m.roomReturner(); //rooms returned are stored in this array
	int [] items = m.itemReturner(); //items returned are stored in this array
	int startingRoom = m.startingRoomReturner(); //starting room is stored here
	int bossRoom1 = m.bossRoomReturner(); //boss room stored here
	int [] teleporter1 = m.telePanel1Returner(); //items returned are stored in this array
	int [] teleporter2= m.telePanel2Returner(); //items returned are stored in this array
	int [] cor1 = m.teleCorner1Returner(); //items returned are stored in this array
	int [] cor2 = m.teleCorner2Returner(); //items returned are stored in this array
	int currentWeeb = 0;
	int rdbtnWeebRepresents =1;
	int rdbtnWeebRepresents1 = 2;
	int rdbtnWeebRepresents2 = 3;
	int cooldown=0;
	int[][] panelCheck=new int[25][4];
	boolean [] itemCheck = new boolean [25]; //boolean array to check if item is generated
	JLabel imgLabel[][]=new JLabel[25][4];
	ImageIcon img1[]=new ImageIcon[100];
	//int [] telePanel1 = m.panel1Returner();
	//int [] telePanel2 = m.panel2Returner();
	//int [] teleCor1 = m.corner1Returner();
	//int [] teleCor2 = m.corner2Returner();

	//integers

	private int [] a = new int [25]; //an int array



	//panels
	JPanel storyScreen = new JPanel(); //story panel
	JPanel mainMenu = new JPanel(); //main menu panel
	JPanel controlsScreen = new JPanel(); //control screen panel
	JPanel combatScreen = new JPanel(); //combat screen panel
	JPanel mapScreen = new JPanel(); //map screen panel
	JPanel helpScreen = new JPanel(); //help screen panel
	JPanel gameoverScreen = new JPanel(); //game over screen panel

	//image icons
	ImageIcon img3; //sprite
	ImageIcon imgW; //white

	//rooms
	ImageIcon imgB; //black
	ImageIcon imgB2; //black
	ImageIcon imgB3; //black
	ImageIcon imgB4; //black
	ImageIcon imgB5; //black
	ImageIcon imgB6; //black
	ImageIcon imgB7; //black
	ImageIcon imgB8; //black
	ImageIcon imgB9; //black
	ImageIcon imgB10; //black
	ImageIcon imgB11; //black
	ImageIcon imgB12; //black
	ImageIcon imgB13; //black
	ImageIcon imgB14; //black
	ImageIcon imgB15; //black
	ImageIcon imgB16; //black
	ImageIcon imgB17; //black
	ImageIcon imgB18; //black
	ImageIcon imgB19; //black
	ImageIcon imgB20; //black
	ImageIcon imgB21; //black
	ImageIcon imgB22; //black
	ImageIcon imgB23; //black
	ImageIcon imgB24; //black
	ImageIcon imgB25; //black


	//items
	ImageIcon imgI; 
	ImageIcon imgI2; 
	ImageIcon imgI3; 
	ImageIcon imgI4; 
	ImageIcon imgI5; 
	ImageIcon imgI6; 
	ImageIcon imgI7; 
	ImageIcon imgI8; 
	ImageIcon imgI9; 
	ImageIcon imgI10; 
	ImageIcon imgI11; 
	ImageIcon imgI12; 
	ImageIcon imgI13; 
	ImageIcon imgI14; 
	ImageIcon imgI15; 
	ImageIcon imgI16; 
	ImageIcon imgI17; 
	ImageIcon imgI18; 
	ImageIcon imgI19; 
	ImageIcon imgI20; 
	ImageIcon imgI21; 
	ImageIcon imgI22; 
	ImageIcon imgI23; 
	ImageIcon imgI24; 
	ImageIcon imgI25; 

	//Boss Room
	ImageIcon imgBossRoom;

	//starting room
	ImageIcon imgStartRoom;

	//boss room "square"
	ImageIcon imgDoYaKnowDeWey;

	//
	ImageIcon imgG; //game over
	ImageIcon imgC; //cory in the house
	ImageIcon imgJesus; //jesus
	ImageIcon imgJosh; //Josh
	ImageIcon imgTRex; //TRex
	ImageIcon imgTrump; //trump
	ImageIcon imgJasan; //jasan (enemyweeb1)
	ImageIcon imgDrBlob; //dr blob (enemyweeb2)

	//JLabels 
	JLabel weebPlayer = new JLabel (""); //weeb player sprite in combat screen

	//boss label
	JLabel deWey = new JLabel ("");

	//Item Labels
	JLabel[] item = new JLabel[25]; 
	JLabel bossRoom = new JLabel (""); //Boss room
	JLabel startRoom = new JLabel (""); //Start room
	JLabel spriteImage = new JLabel(""); //player sprite in map screen
	JLabel gameoverImage = new JLabel(""); //game over image for gameoverScreen
	JLabel whiteRoom = new JLabel(""); //actually black background 


	//

	//room labels
	JLabel blackRoom = new JLabel (""); //basic rooms (ignore name of variable)
	JLabel blackRoom2 = new JLabel (""); 
	JLabel blackRoom3 = new JLabel (""); 
	JLabel blackRoom4 = new JLabel (""); 
	JLabel blackRoom5 = new JLabel (""); 
	JLabel blackRoom6 = new JLabel (""); 
	JLabel blackRoom7 = new JLabel (""); 
	JLabel blackRoom8 = new JLabel (""); 
	JLabel blackRoom9 = new JLabel (""); 
	JLabel blackRoom10 = new JLabel (""); 
	JLabel blackRoom11 = new JLabel (""); 
	JLabel blackRoom12 = new JLabel (""); 
	JLabel blackRoom13 = new JLabel (""); 
	JLabel blackRoom14 = new JLabel (""); 
	JLabel blackRoom15 = new JLabel (""); 
	JLabel blackRoom16 = new JLabel (""); 
	JLabel blackRoom17 = new JLabel (""); 
	JLabel blackRoom18 = new JLabel (""); 
	JLabel blackRoom19 = new JLabel (""); 
	JLabel blackRoom20 = new JLabel (""); 
	JLabel blackRoom21 = new JLabel (""); 
	JLabel blackRoom22 = new JLabel (""); 
	JLabel blackRoom23 = new JLabel (""); 
	JLabel blackRoom24 = new JLabel (""); 
	JLabel blackRoom25 = new JLabel (""); 
	//


	JLabel jesusWeeb = new JLabel (""); //jesus weeb
	JLabel joshWeeb = new JLabel (""); //josh weeb
	JLabel tRexWeeb = new JLabel (""); //T-Rex weeb
	JLabel trumpWeeb = new JLabel (""); //trump weeb 
	JLabel jasanWeeb = new JLabel (""); //jasan weeb
	JLabel drBlobWeeb = new JLabel (""); //dr blob weeb

	//variables
	int x = 0; //initial x val of player
	int y = 0; //initial y val of player


	private JLabel txtInsertMovesHere ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		groupRadioButtons.add (rdbtnWeeb_2);
		groupRadioButtons.add (rdbtnWeeb_1);
		groupRadioButtons.add (rdbtnWeeb);
		combatScreen.add (rdbtnWeeb);
		combatScreen.add (rdbtnWeeb_1);
		combatScreen.add (rdbtnWeeb_2);
		//	rdbtnWeeb.setVisible(true);
		//	rdbtnWeeb_1.setVisible(true);
		//	rdbtnWeeb_2.setVisible(true);

		for (int counter = 0; counter < 25; counter++)
		{
			item[counter] = new JLabel (""); 
		}

		//sets rooms invisible
		blackRoom.setVisible(false);
		blackRoom2.setVisible(false);
		blackRoom3.setVisible(false);
		blackRoom4.setVisible(false);
		blackRoom5.setVisible(false);
		blackRoom6.setVisible(false);
		blackRoom7.setVisible(false);
		blackRoom8.setVisible(false);
		blackRoom9.setVisible(false);
		blackRoom10.setVisible(false);
		blackRoom11.setVisible(false);
		blackRoom12.setVisible(false);
		blackRoom13.setVisible(false);
		blackRoom14.setVisible(false);
		blackRoom15.setVisible(false);
		blackRoom16.setVisible(false);
		blackRoom17.setVisible(false);
		blackRoom18.setVisible(false);
		blackRoom19.setVisible(false);
		blackRoom20.setVisible(false);
		blackRoom21.setVisible(false);
		blackRoom22.setVisible(false);
		blackRoom23.setVisible(false);
		blackRoom24.setVisible(false);
		blackRoom25.setVisible(false);

		//sets items invisible
		for (int h = 0; h < 25; h++)
		{
			item [h].setVisible(false);
		}



		//boss room 

		imgBossRoom = new ImageIcon("bossRoom.png");
		Image imageBossRoom = imgBossRoom.getImage();
		Image newimgBossRoom = imageBossRoom.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgBossRoom = new ImageIcon(newimgBossRoom);
		bossRoom.setIcon(imgBossRoom);
		bossRoom.setBounds(721, 15, 352, 194); 

		//boss "square"
		imgDoYaKnowDeWey = new ImageIcon ("DoYaNoweDeWeyy.png");
		Image imageDeWey = imgDoYaKnowDeWey.getImage();
		Image newImgDeWey = imageDeWey.getScaledInstance(100, 75, java.awt.Image.SCALE_SMOOTH);
		imgDoYaKnowDeWey = new ImageIcon(newImgDeWey);
		deWey.setIcon(imgDoYaKnowDeWey);

		//start room 

		imgStartRoom = new ImageIcon("startingRoom.png");
		Image imageStartRoom = imgStartRoom.getImage();
		Image newimgStartRoom = imageStartRoom.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgStartRoom = new ImageIcon(newimgStartRoom);
		startRoom.setIcon(imgStartRoom);
		startRoom.setBounds(1074, 15, 352, 194); 


		//loop
		for (int h = 0; h < a.length; h++)
		{
			a[h] = h+1;
		}
		//room generator
		for (int j = 0; j < rooms.length; j++)
		{
			if (rooms[j] == 1) //if rooms at j equals 1
			{
				blackRoom.setVisible(true); //sets the room to visible
			}
			if (rooms[j] == 2)
			{
				blackRoom2.setVisible(true);
			}
			if (rooms[j] == 3)
			{
				blackRoom3.setVisible(true);
			}
			if (rooms[j] == 4)
			{
				blackRoom4.setVisible(true);
			}
			if (rooms[j] == 5)
			{
				blackRoom5.setVisible(true);
			}
			if (rooms[j] == 6)
			{
				blackRoom6.setVisible(true);
			}
			if (rooms[j] == 7)
			{
				blackRoom7.setVisible(true);
			}
			if (rooms[j] == 8)
			{
				blackRoom8.setVisible(true);
			}
			if (rooms[j] == 9)
			{
				blackRoom9.setVisible(true);
			}
			if (rooms[j] == 10)
			{
				blackRoom10.setVisible(true);
			}
			if (rooms[j] == 11)
			{
				blackRoom11.setVisible(true);
			}
			if (rooms[j] == 12)
			{
				blackRoom12.setVisible(true);
			}
			if (rooms[j] == 13)
			{
				blackRoom13.setVisible(true);
			}
			if (rooms[j] == 14)
			{
				blackRoom14.setVisible(true);
			}
			if (rooms[j] == 15)
			{
				blackRoom15.setVisible(true);
			}
			if (rooms[j] == 16)
			{
				blackRoom16.setVisible(true);
			}
			if (rooms[j] == 17)
			{
				blackRoom17.setVisible(true);
			}
			if (rooms[j] == 18)
			{
				blackRoom18.setVisible(true);
			}
			if (rooms[j] == 19)
			{
				blackRoom19.setVisible(true);
			}
			if (rooms[j] == 20)
			{
				blackRoom20.setVisible(true);
			}
			if (rooms[j] == 21)
			{
				blackRoom21.setVisible(true);
			}
			if (rooms[j] == 22)
			{
				blackRoom22.setVisible(true);
			}
			if (rooms[j] == 23)
			{
				blackRoom23.setVisible(true);
			}
			if (rooms[j] == 24)
			{
				blackRoom24.setVisible(true);
			}
			if (rooms[j] == 25)
			{
				blackRoom25.setVisible(true);
			}

		}

		//boss room generator

		if (bossRoom1 == 6) //if bossRoom1 equals 6
		{
			bossRoom.setBounds(15, 210, 352, 194); //set its boundary to this position
			deWey.setBounds(75, 240, 75, 75); //sets the boss square location
			deWey.setVisible(true);
		}
		if (bossRoom1 == 7) //same for the rest
		{
			bossRoom.setBounds(368, 210, 352, 194); 
			deWey.setBounds(450, 240, 75, 75); //sets the boss square location
			deWey.setVisible(true);
		}
		if (bossRoom1 == 8)
		{
			bossRoom.setBounds(721, 210, 352, 194); 
			deWey.setBounds(800, 240, 75, 75); //sets the boss square location
			deWey.setVisible(true);
		}
		if (bossRoom1 == 9)
		{
			bossRoom.setBounds(1074, 210, 352, 194); 
			deWey.setBounds(1150, 240, 75, 75); //sets the boss square location
			deWey.setVisible(true);
		}
		if (bossRoom1 == 10)
		{
			bossRoom.setBounds(1427, 210, 352, 194); 
			deWey.setBounds(1540, 240, 75, 75); //sets the boss square locationa
			deWey.setVisible(true);
		}
		if (bossRoom1 == 11)
		{
			bossRoom.setBounds(15, 405, 352, 194); 
			deWey.setBounds(75, 435, 75, 75); //sets the boss square location
			deWey.setVisible(true);
		}
		if (bossRoom1 == 12)
		{
			bossRoom.setBounds(368, 405, 352, 194); 
			deWey.setBounds(450, 435, 75, 75); //sets the boss square location
			deWey.setVisible(true);
		}
		if (bossRoom1 == 13)
		{
			bossRoom.setBounds(721, 405, 352, 194); 
			deWey.setBounds(800, 435, 75, 75); //sets the boss square location
			deWey.setVisible(true);
		}
		if (bossRoom1 == 14)
		{
			bossRoom.setBounds(1074, 405, 352, 194); 
			deWey.setBounds (1150, 435, 75, 75); //sets the boss square location
			deWey.setVisible(true);
		} 
		if (bossRoom1 == 15)
		{
			bossRoom.setBounds(1427, 405, 352, 194); 
			deWey.setBounds(1540, 405, 75, 75); //sets the boss square location
			deWey.setVisible(true);
		}
		if (bossRoom1 == 16)
		{
			bossRoom.setBounds(15, 600, 352, 194); 
			deWey.setBounds(75, 630, 75, 75); //sets the boss square location
			deWey.setVisible(true);
		}
		if (bossRoom1 == 17)
		{
			bossRoom.setBounds(368, 600, 352, 194); 
			deWey.setBounds(450, 630, 75, 75); //sets the boss square location
			deWey.setVisible(true);
		}
		if (bossRoom1 == 18)
		{
			bossRoom.setBounds(721, 600, 352, 194); 
			deWey.setBounds(800, 630, 75, 75); //sets the boss square location
			deWey.setVisible(true);
		}
		if (bossRoom1 == 19)
		{
			bossRoom.setBounds(1074, 600, 352, 194); 
			deWey.setBounds(1150, 630, 75, 75); //sets the boss square location
			deWey.setVisible(true);
		}
		if (bossRoom1 == 20)
		{
			bossRoom.setBounds(1427, 600, 352, 194); 
			deWey.setBounds(1540, 630, 75, 75); //sets the boss square location
			deWey.setVisible(true);
		}
		if (bossRoom1 == 21)
		{
			bossRoom.setBounds(15, 795, 352, 194);
			deWey.setBounds(75, 825, 75, 75); //sets the boss square location
			deWey.setVisible(true);
		}
		if (bossRoom1 == 22)
		{
			bossRoom.setBounds(368, 795, 352, 194);
			deWey.setBounds(450, 825, 75, 75); //sets the boss square location
			deWey.setVisible(true);
		}
		if (bossRoom1 == 23)
		{
			bossRoom.setBounds(721, 795, 352, 194);
			deWey.setBounds(800, 825, 75, 75); //sets the boss square location
			deWey.setVisible(true);
		}
		if (bossRoom1 == 24)
		{
			bossRoom.setBounds(1074, 795, 352, 194); 
			deWey.setBounds(1150, 825, 75, 75); //sets the boss square location
			deWey.setVisible(true);
		}
		if (bossRoom1 == 25)
		{
			bossRoom.setBounds(1427, 795, 352, 194);
			deWey.setBounds(1540, 825, 75, 75); //sets the boss square location
			deWey.setVisible(true);
		}


		//starting room generator
		if (startingRoom == 1)
		{
			startRoom.setBounds(15, 15, 352, 194);
			x = 100;
			y = 50;
		}
		if (startingRoom == 2)
		{
			startRoom.setBounds(368, 15, 352, 194);
			x = 400;
			y = 50;
		}
		if (startingRoom == 3)
		{
			startRoom.setBounds(721, 15, 352, 194);
			x = 800;
			y = 50;
		}
		if (startingRoom == 4)
		{
			startRoom.setBounds(1074, 15, 352, 194);
			x = 1200;
			y = 50;
		}
		if (startingRoom == 5)
		{
			startRoom.setBounds(1427, 15, 352, 194);
			x = 1500;
			y= 50;
		}
		if (startingRoom == 6)
		{
			startRoom.setBounds(15, 210, 352, 194);
			x = 100;
			y = 300;
		}
		if (startingRoom == 7)
		{
			startRoom.setBounds(368, 210, 352, 194);
			x = 500;
			y = 300;
		}
		if (startingRoom == 8)
		{
			startRoom.setBounds(721, 210, 352, 194);
			x = 800;
			y = 300;
		}
		if (startingRoom == 9)
		{
			startRoom.setBounds(1074, 210, 352, 194);
			x = 1200;
			y = 300;
		}
		if (startingRoom == 10)
		{
			startRoom.setBounds(1427, 210, 352, 194 );
			x = 1500;
			y = 300;
		}
		if (startingRoom == 11)
		{
			startRoom.setBounds(15, 405, 352, 194);
			x = 100;
			y = 500;
		}
		if (startingRoom == 12)
		{
			startRoom.setBounds(368, 405, 352, 194);
			x = 500;
			y = 500;
		}
		if (startingRoom == 13)
		{
			startRoom.setBounds(721, 405, 352, 194);
			x = 800;
			y = 500;
		}
		if (startingRoom == 14)
		{
			startRoom.setBounds(1074, 405, 352, 194);
			x = 1200;
			y = 500;
		}
		if (startingRoom == 15)
		{
			startRoom.setBounds(1427, 405, 352, 194);
			x = 1500;
			y = 500;
		}
		if (startingRoom == 16)
		{
			startRoom.setBounds(15, 600, 352, 194);
			x = 100;
			y = 700;
		}
		if (startingRoom == 17)
		{
			startRoom.setBounds(368, 600, 352, 194);
			x = 500;
			y = 700;
		}
		if (startingRoom == 18)
		{
			startRoom.setBounds(721, 600, 352, 194);
			x = 800;
			y = 700;
		}
		if (startingRoom == 19)
		{
			startRoom.setBounds(1074, 600, 352, 194);
			x = 1200;
			y = 700;
		}
		if (startingRoom == 20)
		{
			startRoom.setBounds(1427, 600, 352, 194);
			x = 1500;
			y = 700;
		}


		//item generator
		for (int counter2 = 0; counter2 < 4; counter2++)
		{
			itemCheck [counter2] = false;
		}
		for (int s = 0; s < items.length; s++) //runs as long as item generation
		{
			if (items [s] == 1) //if items equals 1
			{
				item[0].setVisible(true); //sets the first item visible
				itemCheck [0] = true;
			}
			if (items [s] == 2) //same for the rest of items
			{
				item[1].setVisible(true);
				itemCheck [1] = true;
			}
			if (items [s] == 3)
			{
				item[2].setVisible(true);
				itemCheck [2] = true;
			}
			if (items [s] == 4)
			{
				item[3].setVisible(true);
				itemCheck [3] = true;
			}
			if (items [s] == 5)
			{
				item[4].setVisible(true);
				itemCheck [4] = true;
			}
			if (items [s] == 6)
			{
				item[5].setVisible(true);
				itemCheck [5] = true;
			}
			if (items [s] == 7)
			{
				item[6].setVisible(true); 
				itemCheck [6] = true;
			}
			if (items [s] == 8)
			{
				item[7].setVisible(true); 
				itemCheck [7] = true;
			}
			if (items [s] == 9)
			{
				item[8].setVisible(true); 
				itemCheck [8] = true;
			}
			if (items [s] == 10)
			{
				item[9].setVisible(true); 
				itemCheck [9] = true;
			}
			if (items [s] == 11)
			{
				item[10].setVisible(true); 
				itemCheck [10] = true;
			}
			if (items [s] == 12)
			{
				item[11].setVisible(true); 
				itemCheck [11] = true;
			}
			if (items [s] == 13)
			{
				item[12].setVisible(true); 
				itemCheck [12] = true;
			}
			if (items [s] == 14)
			{
				item[13].setVisible(true);
				itemCheck [13] = true;
			}
			if (items [s] == 15)
			{
				item[14].setVisible(true); 
				itemCheck [14] = true;
			}
			if (items [s] == 16)
			{
				item[15].setVisible(true); 
				itemCheck [15] = true;
			}
			if (items [s] == 17)
			{
				item[16].setVisible(true); 
				itemCheck [16] = true;
			}
			if (items [s] == 18)
			{
				item[17].setVisible(true); 
				itemCheck [17] = true;
			}
			if (items [s] == 19)
			{
				item[18].setVisible(true); 
				itemCheck [18] = true;
			}
			if (items [s] == 20)
			{
				item[19].setVisible(true); 
				itemCheck [19] = true;
			}
			if (items [s] == 21)
			{
				item[20].setVisible(true); 
				itemCheck [20] = true;
			}
			if (items [s] == 22)
			{
				item[21].setVisible(true); 
				itemCheck [21] = true;
			}
			if (items [s] == 23)
			{
				item[22].setVisible(true);
				itemCheck [22] = true;
			}
			if (items [s] == 24)
			{
				item[23].setVisible(true); 
				itemCheck [23] = true;
			}
			if (items [s] == 25)
			{
				item[24].setVisible(true); 
				itemCheck [24] = true;
			}

		}


		//room white background (THE FOLLOWING SET OF CODE IS FOR ROOM IMAGES)

		imgB = new ImageIcon("basicRoom.png");
		Image imageB = imgB.getImage();
		Image newimgB = imageB.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB = new ImageIcon(newimgB);
		blackRoom.setIcon(imgB);
		blackRoom.setBounds(15, 15, 352, 194); 

		//
		imgB2 = new ImageIcon("basicRoom.png");
		Image imageB2 = imgB2.getImage();
		Image newimgB2 = imageB2.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB2 = new ImageIcon(newimgB2);
		blackRoom2.setIcon(imgB2);
		blackRoom2.setBounds(368, 15, 352, 194); 

		//
		imgB3 = new ImageIcon("basicRoom.png");
		Image imageB3 = imgB3.getImage();
		Image newimgB3 = imageB3.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB3 = new ImageIcon(newimgB3);
		blackRoom3.setIcon(imgB3);
		blackRoom3.setBounds(721, 15, 352, 194); 

		//
		imgB4 = new ImageIcon("basicRoom.png");
		Image imageB4 = imgB4.getImage();
		Image newimgB4 = imageB4.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB4 = new ImageIcon(newimgB4);
		blackRoom4.setIcon(imgB4);
		blackRoom4.setBounds(1074, 15, 352, 194); 

		//
		imgB5 = new ImageIcon("basicRoom.png");
		Image imageB5 = imgB5.getImage();
		Image newimgB5 = imageB5.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB5 = new ImageIcon(newimgB5);
		blackRoom5.setIcon(imgB5);
		blackRoom5.setBounds(1427, 15, 352, 194); 

		//
		imgB6 = new ImageIcon("basicRoom.png");
		Image imageB6 = imgB6.getImage();
		Image newimgB6 = imageB6.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB6 = new ImageIcon(newimgB6);
		blackRoom6.setIcon(imgB6);
		blackRoom6.setBounds(15, 210, 352, 194); 

		//
		imgB7 = new ImageIcon("basicRoom.png");
		Image imageB7 = imgB7.getImage();
		Image newimgB7 = imageB7.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB7 = new ImageIcon(newimgB7);
		blackRoom7.setIcon(imgB7);
		blackRoom7.setBounds(368, 210, 352, 194); 

		//
		imgB8 = new ImageIcon("basicRoom.png");
		Image imageB8 = imgB8.getImage();
		Image newimgB8 = imageB8.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB8 = new ImageIcon(newimgB8);
		blackRoom8.setIcon(imgB8);
		blackRoom8.setBounds(721, 210, 352, 194); 

		//
		imgB9 = new ImageIcon("basicRoom.png");
		Image imageB9 = imgB9.getImage();
		Image newimgB9 = imageB9.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB9 = new ImageIcon(newimgB9);
		blackRoom9.setIcon(imgB9);
		blackRoom9.setBounds(1074, 210, 352, 194); 

		//
		imgB10 = new ImageIcon("basicRoom.png");
		Image imageB10 = imgB10.getImage();
		Image newimgB10 = imageB10.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB10 = new ImageIcon(newimgB10);
		blackRoom10.setIcon(imgB10);
		blackRoom10.setBounds(1427, 210, 352, 194); 

		//
		imgB11 = new ImageIcon("basicRoom.png");
		Image imageB11 = imgB11.getImage();
		Image newimgB11 = imageB11.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB11 = new ImageIcon(newimgB11);
		blackRoom11.setIcon(imgB11);
		blackRoom11.setBounds(15, 405, 352, 194); 

		//
		imgB12 = new ImageIcon("basicRoom.png");
		Image imageB12 = imgB12.getImage();
		Image newimgB12 = imageB12.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB12 = new ImageIcon(newimgB12);
		blackRoom12.setIcon(imgB12);
		blackRoom12.setBounds(368, 405, 352, 194); 

		//
		imgB13 = new ImageIcon("basicRoom.png");
		Image imageB13 = imgB13.getImage();
		Image newimgB13 = imageB13.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB13 = new ImageIcon(newimgB13);
		blackRoom13.setIcon(imgB13);
		blackRoom13.setBounds(721, 405, 352, 194); 

		//
		imgB14 = new ImageIcon("basicRoom.png");
		Image imageB14 = imgB14.getImage();
		Image newimgB14 = imageB14.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB14 = new ImageIcon(newimgB14);
		blackRoom14.setIcon(imgB14);
		blackRoom14.setBounds(1074, 405, 352, 194); 

		//
		imgB15 = new ImageIcon("basicRoom.png");
		Image imageB15 = imgB15.getImage();
		Image newimgB15 = imageB15.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB15 = new ImageIcon(newimgB15);
		blackRoom15.setIcon(imgB15);
		blackRoom15.setBounds(1427, 405, 352, 194); 

		//
		imgB16 = new ImageIcon("basicRoom.png");
		Image imageB16 = imgB16.getImage();
		Image newimgB16 = imageB16.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB16 = new ImageIcon(newimgB16);
		blackRoom16.setIcon(imgB16);
		blackRoom16.setBounds(15, 600, 352, 194); 

		//
		imgB17 = new ImageIcon("basicRoom.png");
		Image imageB17 = imgB17.getImage();
		Image newimgB17 = imageB17.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB17 = new ImageIcon(newimgB17);
		blackRoom17.setIcon(imgB17);
		blackRoom17.setBounds(368, 600, 352, 194); 

		//
		imgB18 = new ImageIcon("basicRoom.png");
		Image imageB18 = imgB18.getImage();
		Image newimgB18 = imageB18.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB18 = new ImageIcon(newimgB18);
		blackRoom18.setIcon(imgB18);
		blackRoom18.setBounds(721, 600, 352, 194); 

		//
		imgB19 = new ImageIcon("basicRoom.png");
		Image imageB19 = imgB19.getImage();
		Image newimgB19 = imageB19.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB19 = new ImageIcon(newimgB19);
		blackRoom19.setIcon(imgB19);
		blackRoom19.setBounds(1074, 600, 352, 194); 

		//
		imgB20 = new ImageIcon("basicRoom.png");
		Image imageB20 = imgB20.getImage();
		Image newimgB20 = imageB20.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB20 = new ImageIcon(newimgB20);
		blackRoom20.setIcon(imgB20);
		blackRoom20.setBounds(1427, 600, 352, 194); 

		//
		imgB21 = new ImageIcon("basicRoom.png");
		Image imageB21 = imgB21.getImage();
		Image newimgB21 = imageB21.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB21 = new ImageIcon(newimgB21);
		blackRoom21.setIcon(imgB21);
		blackRoom21.setBounds(15, 795, 352, 194); 

		//
		imgB22 = new ImageIcon("basicRoom.png");
		Image imageB22 = imgB22.getImage();
		Image newimgB22 = imageB22.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB22 = new ImageIcon(newimgB22);
		blackRoom22.setIcon(imgB22);
		blackRoom22.setBounds(368, 795, 352, 194); 

		//
		imgB23 = new ImageIcon("basicRoom.png");
		Image imageB23 = imgB23.getImage();
		Image newimgB23 = imageB23.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB23 = new ImageIcon(newimgB23);
		blackRoom23.setIcon(imgB23);
		blackRoom23.setBounds(721, 795, 352, 194); 

		//
		imgB24 = new ImageIcon("basicRoom.png");
		Image imageB24 = imgB24.getImage();
		Image newimgB24 = imageB24.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB24 = new ImageIcon(newimgB24);
		blackRoom24.setIcon(imgB24);
		blackRoom24.setBounds(1074, 795, 352, 194); 

		//
		imgB25 = new ImageIcon("basicRoom.png");
		Image imageB25 = imgB25.getImage();
		Image newimgB25 = imageB25.getScaledInstance(352, 194, java.awt.Image.SCALE_SMOOTH);
		imgB25 = new ImageIcon(newimgB25);
		blackRoom25.setIcon(imgB25);
		blackRoom25.setBounds(1427, 795, 352, 194); 

		//END OF ROOMS	

		//Item images (THE FOLLOWING SET OF CODE IS FOR ITEM IMAGES)
		imgI = new ImageIcon("item.png");
		Image imageI = imgI.getImage();
		Image newimgI = imageI.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI = new ImageIcon(newimgI);
		item[0].setIcon(imgI);
		item[0].setBounds(115, 115, 19, 21); 



		//
		imgI2 = new ImageIcon("item.png");
		Image imageI2 = imgI2.getImage();
		Image newimgI2 = imageI2.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI2 = new ImageIcon(newimgI2);
		item[1].setIcon(imgI2);
		item[1].setBounds(470, 115, 19, 21); 

		//
		imgI3 = new ImageIcon("item.png");
		Image imageI3 = imgI3.getImage();
		Image newimgI3 = imageI3.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI3 = new ImageIcon(newimgI3);
		item[2].setIcon(imgI3);
		item[2].setBounds(820, 115, 19, 21); 

		//
		imgI4 = new ImageIcon("item.png");
		Image imageI4 = imgI4.getImage();
		Image newimgI4 = imageI4.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI4 = new ImageIcon(newimgI4);
		item[3].setIcon(imgI4);
		item[3].setBounds(1175, 115, 19, 21); 

		//
		imgI5 = new ImageIcon("item.png");
		Image imageI5 = imgI5.getImage();
		Image newimgI5 = imageI5.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI5 = new ImageIcon(newimgI5);
		item[4].setIcon(imgI5);
		item[4].setBounds(1530, 115, 19, 21); 

		//
		imgI6 = new ImageIcon("item.png");
		Image imageI6 = imgI6.getImage();
		Image newimgI6 = imageI6.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI6 = new ImageIcon(newimgI6);
		item[5].setIcon(imgI6);
		item[5].setBounds(115, 310, 19, 21); 

		//
		imgI7 = new ImageIcon("item.png");
		Image imageI7 = imgI7.getImage();
		Image newimgI7 = imageI7.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI7 = new ImageIcon(newimgI7);
		item[6].setIcon(imgI7);
		item[6].setBounds(470, 310, 19, 21); 

		//
		imgI8 = new ImageIcon("item.png");
		Image imageI8 = imgI8.getImage();
		Image newimgI8 = imageI8.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI8 = new ImageIcon(newimgI8);
		item[7].setIcon(imgI8);
		item[7].setBounds(820, 310, 19, 21); 

		//
		imgI9 = new ImageIcon("item.png");
		Image imageI9 = imgI9.getImage();
		Image newimgI9 = imageI9.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI9 = new ImageIcon(newimgI9);
		item[8].setIcon(imgI9);
		item[8].setBounds(1175, 310, 19, 21); 

		//
		imgI10 = new ImageIcon("item.png");
		Image imageI10 = imgI10.getImage();
		Image newimgI10 = imageI10.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI10 = new ImageIcon(newimgI10);
		item[9].setIcon(imgI10);
		item[9].setBounds(1530, 310, 19, 21); 

		//
		imgI11 = new ImageIcon("item.png");
		Image imageI11 = imgI11.getImage();
		Image newimgI11 = imageI11.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI11 = new ImageIcon(newimgI11);
		item[10].setIcon(imgI11);
		item[10].setBounds(115, 505, 19, 21); 

		//
		imgI12 = new ImageIcon("item.png");
		Image imageI12 = imgI12.getImage();
		Image newimgI12 = imageI12.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI12 = new ImageIcon(newimgI12);
		item[11].setIcon(imgI12);
		item[11].setBounds(470, 505, 19, 21); 

		//
		imgI13 = new ImageIcon("item.png");
		Image imageI13 = imgI13.getImage();
		Image newimgI13 = imageI13.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI13 = new ImageIcon(newimgI13);
		item[12].setIcon(imgI13);
		item[12].setBounds(820, 505, 19, 21); 

		//
		imgI14 = new ImageIcon("item.png");
		Image imageI14 = imgI14.getImage();
		Image newimgI14 = imageI14.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI14 = new ImageIcon(newimgI14);
		item[13].setIcon(imgI14);
		item[13].setBounds(1175, 505, 19, 21); 

		//
		imgI15 = new ImageIcon("item.png");
		Image imageI15 = imgI15.getImage();
		Image newimgI15 = imageI15.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI15 = new ImageIcon(newimgI15);
		item[14].setIcon(imgI15);
		item[14].setBounds(1530, 505, 19, 21); 

		//
		imgI16 = new ImageIcon("item.png");
		Image imageI16 = imgI16.getImage();
		Image newimgI16 = imageI16.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI16 = new ImageIcon(newimgI16);
		item[15].setIcon(imgI16);
		item[15].setBounds(115, 700, 19, 21); 

		//
		imgI17 = new ImageIcon("item.png");
		Image imageI17 = imgI17.getImage();
		Image newimgI17 = imageI17.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI17 = new ImageIcon(newimgI17);
		item[16].setIcon(imgI17);
		item[16].setBounds(470, 700, 19, 21); 

		//
		imgI18 = new ImageIcon("item.png");
		Image imageI18 = imgI18.getImage();
		Image newimgI18 = imageI18.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI18 = new ImageIcon(newimgI18);
		item[17].setIcon(imgI18);
		item[17].setBounds(820, 700, 19, 21); 

		//
		imgI19 = new ImageIcon("item.png");
		Image imageI19 = imgI19.getImage();
		Image newimgI19 = imageI19.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI19 = new ImageIcon(newimgI19);
		item[18].setIcon(imgI19);
		item[18].setBounds(1175, 700, 19, 21); 

		//
		imgI20 = new ImageIcon("item.png");
		Image imageI20 = imgI20.getImage();
		Image newimgI20 = imageI20.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI20 = new ImageIcon(newimgI20);
		item[19].setIcon(imgI20);
		item[19].setBounds(1530, 700, 19, 21); 

		//
		imgI21 = new ImageIcon("item.png");
		Image imageI21 = imgI21.getImage();
		Image newimgI21 = imageI21.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI21 = new ImageIcon(newimgI21);
		item[20].setIcon(imgI21);
		item[20].setBounds(115, 895, 19, 21); 

		//
		imgI22 = new ImageIcon("item.png");
		Image imageI22 = imgI22.getImage();
		Image newimgI22 = imageI22.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI22 = new ImageIcon(newimgI22);
		item[21].setIcon(imgI22);
		item[21].setBounds(470, 895, 19, 21); 

		//
		imgI23 = new ImageIcon("item.png");
		Image imageI23 = imgI23.getImage();
		Image newimgI23 = imageI23.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI23 = new ImageIcon(newimgI23);
		item[22].setIcon(imgI23);
		item[22].setBounds(820, 895, 19, 21); 

		//
		imgI24 = new ImageIcon("item.png");
		Image imageI24 = imgI24.getImage();
		Image newimgI24 = imageI24.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI24 = new ImageIcon(newimgI24);
		item[23].setIcon(imgI24);
		item[23].setBounds(1175, 895, 19, 21); 

		//
		imgI25 = new ImageIcon("item.png");
		Image imageI25 = imgI25.getImage();
		Image newimgI25 = imageI25.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		imgI25 = new ImageIcon(newimgI25);
		item[24].setIcon(imgI25);
		item[24].setBounds(1530, 895, 19, 21);


		//END OF ITEMS

		//teleporter panels
		//im not commenting cause its too much work, if you want me to comment, message me
		int x2=15;
		int y2=15;

		for (int loop=0;loop<25;loop++) {
			for (int z=0;z<4;z++) 
			{
				if (z==0)
				{
					System.out.println(loop);
					if(loop==0)
					{
						y2=20;
						x2=15;
					}
					else if(loop==1)
					{
						y2=20;
						x2=370;
					}
					else if(loop==2)
					{
						y2=20;
						x2=725;
					}
					else if(loop==3)
					{
						y2=20;
						x2=1080;
					}
					else if(loop==4)
					{
						y2=20;
						x2=1430;
					}
					else if(loop==5)
					{
						y2=215;
						x2=15;
					}
					else if(loop==6)
					{
						y2=215;
						x2=370;
					}
					else if(loop==7)
					{
						y2=215;
						x2=725;
					}
					else if(loop==8)
					{
						y2=215;
						x2=1080;
					}
					else if(loop==9)
					{
						y2=215;
						x2=1430;
					}
					else if(loop==10)
					{
						y2=410;
						x2=15;
					}
					else if(loop==11)
					{
						y2=410;
						x2=370;
					}
					else if(loop==12)
					{
						y2=410;
						x2=725;
					}
					else if(loop==13)
					{
						y2=410;
						x2=1080;
					}
					else if(loop==14)
					{
						y2=410;
						x2=1430;
					}
					else if(loop==15)
					{
						y2=605;
						x2=15;
					}
					else if(loop==16)
					{
						y2=605;
						x2=370;
					}
					else if(loop==17)
					{
						y2=605;
						x2=725;
					}
					else if(loop==18)
					{
						y2=605;
						x2=1080;
					}
					else if(loop==19)
					{
						y2=605;
						x2=1430;
					}
					else if(loop==20)
					{
						y2=800;
						x2=15;
					}
					else if(loop==21)
					{
						y2=800;
						x2=370;
					}
					else if(loop==22)
					{
						y2=800;
						x2=725;
					}
					else if(loop==23)
					{
						y2=800;
						x2=1080;
					}
					else if(loop==24)
					{
						y2=800;
						x2=1430;
					}
				}

				img1[loop] = new ImageIcon("teleboy.png");
				Image img = img1[loop].getImage();
				Image img3= img.getScaledInstance(15, 15, java.awt.Image.SCALE_SMOOTH);
				img1[loop] = new ImageIcon(img3);
				imgLabel[loop][z]=new JLabel("");
				imgLabel[loop][z].setIcon(img1[loop]);
				imgLabel[loop][z].setBounds(x2, y2, 15, 15); 

				if (z % 2==0)
				{
					x2=x2+330;
				}
				else
				{
					x2=x2-330;
					y2=y2+170;
				}
			}


		}

		for (int counter = 0; counter < 25; counter++)
		{
			for (int counter2 = 0; counter2 < 4; counter2++)
			{
				imgLabel[counter][counter2].setVisible(false);
			}
		}
		for (int counter = 0; counter < 25; counter++)
		{
			for (int counter2 = 0; counter2 < 4; counter2++)
			{
				panelCheck[counter][counter2]=0;
			}
		}

		for (int counter1 = 0; counter1 < 100; counter1++)
		{

			for (int counter2 = 0; counter2 < teleporter1.length; counter2++)
			{
				for (int counter2B = 0; counter2B < 25; counter2B++)
				{
					for (int counter4 = 0; counter4 < 4; counter4++)
					{

						if (teleporter1[counter2]==counter2B+1)
						{

							if (cor1[counter2]==counter4+1)
							{
								imgLabel[counter2B][counter4].setVisible(true);				
								panelCheck[counter2B][counter4]=1;
							}

						}

					}
				}
			}


			for (int counter3 = 0; counter3 < teleporter2.length; counter3++)
			{
				for (int counter3B = 0; counter3B < 25; counter3B++)
				{
					for (int counter5 = 0; counter5 < 4; counter5++)
					{

						if (teleporter2[counter3]==counter3B+1)
						{

							if (cor2[counter3]==counter5+1)
							{
								imgLabel[counter3B][counter5].setVisible(true);
								panelCheck[counter3B][counter5]=2;
							}

						}

					}
				}
			}


		}
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //gets screen size
		double width = screenSize.getWidth(); //stores screen size in width
		double height = screenSize.getHeight(); //stores height
		int width2 = (int) width; //changes from double to int
		int height2 = (int) height;
		frame = new JFrame();
		frame.setBounds(0, 0, 811, 553);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		mainMenu.setBackground(Color.DARK_GRAY);


		frame.getContentPane().add(mainMenu, "name_8892531078083");
		mainMenu.setLayout(null);

		JLabel label = new JLabel("Hungry Weeb Hunters");
		label.setForeground(Color.CYAN);
		label.setBounds(10, 11, 775, 220);
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
		mainMenu.add(label);


		JButton button = new JButton("Start"); //start button
		button.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				mainMenu.setVisible(false);
				storyScreen.setVisible(true);
			}
		});
		button.setBounds(10, 242, 736, 58);
		mainMenu.add(button);

		final JButton btnMSAttack = new JButton("Attack Up");
		btnMSAttack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ms.attackUp();
				btnMSAttack.setVisible(false);
			}
		});
		btnMSAttack.setBounds(482, 334, 89, 23);
		combatScreen.add(btnMSAttack);

		final JButton btnMSDefence = new JButton("Defence Up");
		btnMSDefence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ms.defenceUp();
				btnMSDefence.setVisible(false);
			}
		});
		btnMSDefence.setBounds(482, 385, 89, 23);
		combatScreen.add(btnMSDefence);

		JButton button_1 = new JButton("Help"); //help button
		button_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				mainMenu.setVisible(false);
				controlsScreen.setVisible(true);
			}
		});
		button_1.setBounds(10, 311, 736, 58);
		mainMenu.add(button_1);

		JButton button_2 = new JButton("Exit"); //exit button
		button_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit (0);
			}
		});
		button_2.setBounds(10, 380, 736, 58);
		mainMenu.add(button_2);
		
		JLabel lblEnterFullscreen = new JLabel("Enter Fullscreen!");
		lblEnterFullscreen.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblEnterFullscreen.setForeground(Color.CYAN);
		lblEnterFullscreen.setBounds(10, 460, 736, 43);
		mainMenu.add(lblEnterFullscreen);
		controlsScreen.setBackground(Color.DARK_GRAY);


		frame.getContentPane().add(controlsScreen, "name_9000964603976");
		controlsScreen.setLayout(null);

		JLabel label_1 = new JLabel("Controls");
		label_1.setForeground(Color.CYAN);
		label_1.setBackground(Color.DARK_GRAY);
		label_1.setBounds(29, 11, 756, 114);
		label_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
		controlsScreen.add(label_1);

		JTextArea txtrTheWasdControl = new JTextArea();
		txtrTheWasdControl.setForeground(Color.CYAN);
		txtrTheWasdControl.setBackground(Color.DARK_GRAY);
		txtrTheWasdControl.setBounds(29, 125, 721, 194);
		txtrTheWasdControl.setText("The W/A/S/D control movement. W is forward, A is left, \r\nS is backward, D is right. You press the button on the \r\nscreen pertaining to the attack to trigger attacks in combat \r\nroom/combat screen. Use your mouse to select buttons.");
		txtrTheWasdControl.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		txtrTheWasdControl.setEditable(false);
		controlsScreen.add(txtrTheWasdControl);

		JButton btnBack_1 = new JButton("Back"); //back button for controls screen
		btnBack_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				controlsScreen.setVisible(false);
				mainMenu.setVisible(true);
			}
		});
		btnBack_1.setBounds(25, 330, 725, 67);
		controlsScreen.add(btnBack_1);


		storyScreen.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(storyScreen, "name_9207961988878");
		storyScreen.setLayout(null);

		JLabel label_2 = new JLabel("Here's the story so far...");
		label_2.setForeground(Color.CYAN);
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(38, 31, 690, 42);
		label_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		storyScreen.add(label_2);

		JTextArea txtrYoureAWeeaboo = new JTextArea();
		txtrYoureAWeeaboo.setForeground(Color.CYAN);
		txtrYoureAWeeaboo.setBackground(Color.DARK_GRAY);
		txtrYoureAWeeaboo.setBounds(38, 96, 690, 246);
		txtrYoureAWeeaboo.setText("You\u2019re a weeaboo adventuring through the anime convention trying to \r\nget a limited edition body pillow. But you have to fight other weeaboos \r\nalong the way to prove you\u2019re worthy of it. Sometimes you can capture \r\nthe weeaboos you defeat and turn them into your fighters. After \r\ndefeating each mini boss at the end of each map you get a limited \r\nedition figurine that gives you a stat boost. If you need to know what\r\na weeb is, look no further then Jasan Rai.\r\n");
		txtrYoureAWeeaboo.setRows(20);
		txtrYoureAWeeaboo.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		txtrYoureAWeeaboo.setEditable(false);
		storyScreen.add(txtrYoureAWeeaboo);


		playerHealth.setMaximum((int) battle.playerParty.playerWeeb[battle.activeWeeb].eHealthD);


		JButton btnBack = new JButton("Back"); //back button for story screen
		btnBack.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				storyScreen.setVisible(false);
				mainMenu.setVisible(true);
			}
		});
		btnBack.setBounds(38, 418, 690, 58);
		storyScreen.add(btnBack);

		JButton btnStart = new JButton("Start"); //start button for story screen
		btnStart.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		btnStart.addActionListener(new ActionListener() {
			public  void actionPerformed(ActionEvent e) 
			{
				storyScreen.setVisible(false);
				mapScreen.setVisible(true);
				mapScreen.requestFocus();
			}
		});
		btnStart.setBounds(38, 353, 690, 58);
		storyScreen.add(btnStart);
		combatScreen.setBackground(Color.DARK_GRAY);


		frame.getContentPane().add(combatScreen, "name_9351144406110");
		combatScreen.setLayout(null);

		JButton btnFlee = new JButton("Flee"); //flee button
		btnFlee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (battle.flee () == true)
				{
					battle.resetBattle ();
					btnMSAttack.setVisible(true);
					btnMSDefence.setVisible(true);
					combatScreen.setVisible (false);
					mapScreen.setVisible (true);
					mapScreen.requestFocus();
				}
				else
				{
					toSetTextfield = toSetTextfield +("Escape attempt failed!");
					enemyAttack();
					
					combatScreenSetUp(battle);
				}
				
			}
		});
		btnFlee.setBounds(581, 334, 89, 23);
		combatScreen.add(btnFlee);

		JButton btnHelp = new JButton("Help"); //help button for combat screen

		btnHelp.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) 
			{
				helpScreen.setVisible(true);
				combatScreen.setVisible(false);
			}
		});
		btnHelp.setBounds(581, 385, 89, 23);
		combatScreen.add(btnHelp);

		JButton btnCapture = new JButton("CAPTURE"); //capture button
		btnCapture.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (battle.catchW () == true) //Method to determine if the capture attempt is a success.
				{
					//battle.playerParty.captureWeeb (battle.enemyWeeb); //Adds the enemy weeb to the player's party.
					battle.resetBattle ();
					resetPicStix();
					btnMSAttack.setVisible(true);
					btnMSDefence.setVisible(true);
					combatScreen.setVisible (false);
					mapScreen.setVisible (true);
					mapScreen.requestFocus(true);
				}
				else //If the capture attempt fails.
				{
					txtInsertMovesHere.setText ("Capture attempt failed!");
				}

			}

		});

		btnCapture.setBounds(380, 334, 89, 74);

		combatScreen.add(btnCapture);

		JButton btnBasicAttack = new JButton("Basic Attack"); //basic attack button

		btnBasicAttack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (battle.enemyWeeb.eHealthC >= 0)
				{				
					int firstHealth = (int)battle.enemyWeeb.eHealthC;
					battle.choice (1);
					int secondHealth = (int)battle.enemyWeeb.eHealthC;
					toSetTextfield = "You used basic attack! It dealt " + (firstHealth-secondHealth) + " health damage!";
					//txtInsertMovesHere.setText();
					//enemyHealth.setValue((int)battle.enemyWeeb.eHealthC);
					//battle.enemyWeeb.eHealthC -=5;
					//System.out.println("A");
					if (battle.enemyWeeb.eHealthC < 0)
					{
						toSetTextfield = toSetTextfield+ ("Battle Over! The enemy has run out of health!");
						//battle.resetBattle ();
						//System.out.println("B");
					}
					else
					{						
						//System.out.println("C");
					}
				}
				if (battle.enemyWeeb.eHealthC <= 0){
					label15.setText("You won! Also this message was surprisingly hard to code in!");
				}
				enemyAttack();
				combatScreenSetUp(battle);
				if (battle.enemyWeeb.eHealthC <= 0)
				{
					txtInsertMovesHere.setText ("You won!");
					mapScreen.setVisible(true);
					btnMSAttack.setVisible(true);
					btnMSDefence.setVisible(true);
					combatScreen.setVisible(false);

					resetPicStix();
					battle.resetBattle ();

					if(battle.enemyWeeb.weebType == 2)
					{
						txtInsertMovesHere.setText ("Congratuauauaualtions, you beat the whole game!");
						mapScreen.setVisible(false);
					}
					mapScreen.requestFocus();
				}else if (battle.playerParty.playerWeeb[battle.activeWeeb].eHealthC <= 0)
				{
					txtInsertMovesHere.setText ("You lost!");
					battle.resetBattle ();
					resetPicStix();
					gameoverScreen.setVisible(true);
					btnMSAttack.setVisible(true);
					btnMSDefence.setVisible(true);
					combatScreen.setVisible(false);

				}

			}
		});

		btnBasicAttack.setBounds(126, 334, 145, 74);

		combatScreen.add(btnBasicAttack);



		btnSkill.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (battle.enemyWeeb.eHealthC >= 0)
				{					
					int firstHealth = (int)battle.enemyWeeb.eHealthC;
					battle.choice (2);
					int secondHealth = (int)battle.enemyWeeb.eHealthC;
					toSetTextfield = "You used " + btnSkill.getText() + "! It dealt " + (firstHealth-secondHealth) + " health damage!";
					//enemyHealth.setValue((int)battle.enemyWeeb.eHealthC);
					//battle.enemyWeeb.eHealthC -=5;
					//System.out.println("A");
					if (battle.enemyWeeb.eHealthC < 0)
					{
						toSetTextfield = toSetTextfield +("Battle Over! The enemy has run out of health!");
						//battle.resetBattle ();
						//System.out.println("B");
					}
					else
					{						
						//System.out.println("C");
					}
				}
				if (battle.enemyWeeb.eHealthC <= 0){
					label15.setText("You won! Also this message was surprisingly hard to code in!");
				}
				enemyAttack();
				combatScreenSetUp(battle);
				if (battle.enemyWeeb.eHealthC <= 0)
				{
					txtInsertMovesHere.setText ("You won!");
					mapScreen.setVisible(true);

					combatScreen.setVisible(false);


					battle.resetBattle ();
					resetPicStix();
					btnMSAttack.setVisible(true);
					btnMSDefence.setVisible(true);

					if(battle.enemyWeeb.weebType == 2)
					{
						label15.setText("You won! Also this message was surprisingly hard to code in!");
						mapScreen.setVisible(false);
					}
					mapScreen.requestFocus();
				}else if (battle.playerParty.playerWeeb[battle.activeWeeb].eHealthC <= 0)
				{
					txtInsertMovesHere.setText ("You lost!");
					battle.resetBattle ();
					btnMSAttack.setVisible(true);
					btnMSDefence.setVisible(true);
					resetPicStix();
					gameoverScreen.setVisible(true);
					combatScreen.setVisible(false);

				}

			}
		});
		btnSkill.setBounds(281, 334, 89, 23);
		combatScreen.add(btnSkill);




		btnSkill_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (battle.enemyWeeb.eHealthC >= 0)
				{					
					int firstHealth = (int)battle.enemyWeeb.eHealthC;
					int firstAttack = (int)battle.enemyWeeb.eAttackC;
					int firstDefense = (int)battle.enemyWeeb.eDefenseC;
					int firstMana = (int)battle.enemyWeeb.eManaC;

					battle.choice (3);
					int secondHealth = (int)battle.enemyWeeb.eHealthC;
					int secondAttack = (int)battle.enemyWeeb.eAttackC;
					int secondDefense = (int)battle.enemyWeeb.eDefenseC;
					int secondMana = (int)battle.enemyWeeb.eManaC;
					toSetTextfield = "You used " + btnSkill_1.getText() + "!";
					if (firstHealth != secondHealth)
					{
						toSetTextfield = toSetTextfield + " It dealt " + (firstHealth-secondHealth) + " health damage!";

					}
					if (firstAttack != secondAttack)
					{
						toSetTextfield = toSetTextfield + " It dealt " + (firstAttack-secondAttack) + " attack damage!";

					}
					if (firstDefense != secondDefense)
					{
						toSetTextfield = toSetTextfield + " It dealt " + (firstDefense-secondDefense) + "defense damage!";

					}
					if (firstMana != secondMana)
					{
						toSetTextfield = toSetTextfield + " It dealt " + (firstMana-secondMana) + " Mana damage!";

					}
					//enemyHealth.setValue((int)battle.enemyWeeb.eHealthC);
					//battle.enemyWeeb.eHealthC -=5;
					//System.out.println("A");
					if (battle.enemyWeeb.eHealthC < 0)
					{
						toSetTextfield = toSetTextfield +("Battle Over! The enemy has run out of health!");
						//battle.resetBattle ();
						//System.out.println("B");
					}
					else
					{						
						//System.out.println("C");
					}
				}
				if (battle.enemyWeeb.eHealthC <= 0){
					toSetTextfield = "You won! Also this message was surprisingly hard to code in!";
				}
				enemyAttack();
				combatScreenSetUp(battle);
				if (battle.enemyWeeb.eHealthC <= 0)
				{
					txtInsertMovesHere.setText ("You won!");
					mapScreen.setVisible(true);
					combatScreen.setVisible(false);


					battle.resetBattle ();
					resetPicStix();
					btnMSAttack.setVisible(true);
					btnMSDefence.setVisible(true);

					if(battle.enemyWeeb.weebType == 2)
					{
						txtInsertMovesHere.setText ("Congratuauauaualtions, you beat the whole game!");
						mapScreen.setVisible(false);
					}
					mapScreen.requestFocus();
				}else if (battle.playerParty.playerWeeb[battle.activeWeeb].eHealthC <= 0)
				{
					txtInsertMovesHere.setText ("You lost!");
					battle.resetBattle ();
					resetPicStix();
					btnMSAttack.setVisible(true);
					btnMSDefence.setVisible(true);

					gameoverScreen.setVisible(true);
					combatScreen.setVisible(false);

				}

			}});

		btnSkill_1.setBounds(281, 360, 89, 23);

		combatScreen.add(btnSkill_1);




		btnSkill_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (battle.enemyWeeb.eHealthC >= 0)
				{					
					int firstHealth = (int)battle.enemyWeeb.eHealthC;
					int firstAttack = (int)battle.enemyWeeb.eAttackC;
					int firstDefense = (int)battle.enemyWeeb.eDefenseC;
					int firstMana = (int)battle.enemyWeeb.eManaC;

					battle.choice (4);
					int secondHealth = (int)battle.enemyWeeb.eHealthC;
					int secondAttack = (int)battle.enemyWeeb.eAttackC;
					int secondDefense = (int)battle.enemyWeeb.eDefenseC;
					int secondMana = (int)battle.enemyWeeb.eManaC;
					toSetTextfield = "You used " + btnSkill_2.getText() + "!";
					if (firstHealth != secondHealth)
					{
						toSetTextfield = toSetTextfield + " It dealt " + (firstHealth-secondHealth) + " health damage!";

					}
					if (firstAttack != secondAttack)
					{
						toSetTextfield = toSetTextfield + " It dealt " + (firstAttack-secondAttack) + " attack damage!";

					}
					if (firstDefense != secondDefense)
					{
						toSetTextfield = toSetTextfield + " It dealt " + (firstDefense-secondDefense) + "defense damage!";

					}
					if (firstMana != secondMana)
					{
						toSetTextfield = toSetTextfield + " It dealt " + (firstMana-secondMana) + " Mana damage!";

					}
					//enemyHealth.setValue((int)battle.enemyWeeb.eHealthC);
					//battle.enemyWeeb.eHealthC -=5;
					//System.out.println("A");
					if (battle.enemyWeeb.eHealthC < 0)
					{
						toSetTextfield = toSetTextfield +("Battle Over! The enemy has run out of health!");
						//battle.resetBattle ();
						//System.out.println("B");
					}
					else
					{						
						//System.out.println("C");
					}
				}
				if (battle.enemyWeeb.eHealthC <= 0){
					toSetTextfield = "You won! Also this message was surprisingly hard to code in!";
				}
				enemyAttack();
				combatScreenSetUp(battle);
				if (battle.enemyWeeb.eHealthC <= 0)
				{
					txtInsertMovesHere.setText ("You won!");
					mapScreen.setVisible(true);
					combatScreen.setVisible(false);


					battle.resetBattle ();
					resetPicStix();
					btnMSAttack.setVisible(true);
					btnMSDefence.setVisible(true);

					if(battle.enemyWeeb.weebType == 2)
					{
						txtInsertMovesHere.setText ("Congratuauauaualtions, you beat the whole game!");
						mapScreen.setVisible(false);
					}
					mapScreen.requestFocus();
				}else if (battle.playerParty.playerWeeb[battle.activeWeeb].eHealthC <= 0)
				{
					txtInsertMovesHere.setText ("You lost!");
					battle.resetBattle ();
					resetPicStix();
					
					btnMSAttack.setVisible(true);
					btnMSDefence.setVisible(true);
					gameoverScreen.setVisible(true);
					combatScreen.setVisible(false);

				}

			}
		});

		btnSkill_2.setBounds(281, 385, 89, 23);

		combatScreen.add(btnSkill_2);





		JButton btnItem = new JButton("Item"); //item button

		btnItem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				//itemed.setItem("Pocky");
				itemed.useItem ();
			}

		});

		btnItem.setBounds(27, 334, 89, 74);

		combatScreen.add(btnItem);




		txtInsertMovesHere = new JLabel();

		//txtInsertMovesHere.setEditable(false);

		txtInsertMovesHere.setBackground(Color.DARK_GRAY);

		txtInsertMovesHere.setForeground(Color.CYAN);

		txtInsertMovesHere.setText("INSERT MOVES HERE");

		txtInsertMovesHere.setBounds(373, 222, 1000, 101);

		combatScreen.add(txtInsertMovesHere);

		//txtInsertMovesHere.setColumns(10);


		JButton btnSwitch = new JButton("Switch"); //Combat screen switch weeb button
		btnSwitch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnWeeb.isSelected ())
				{
					battle.switchWeeb (rdbtnWeebRepresents);
					int saver = rdbtnWeebRepresents;
					rdbtnWeebRepresents = currentWeeb;
					currentWeeb = saver;
					battle.switchWeeb (saver);
					System.out.println ("Current Weeb: " + currentWeeb);
				}
				else if (rdbtnWeeb_1.isSelected ())
				{
					battle.switchWeeb (rdbtnWeebRepresents1);
					int saver = rdbtnWeebRepresents1;
					rdbtnWeebRepresents1 = currentWeeb;
					currentWeeb = saver;
					battle.switchWeeb (saver);
					System.out.println ("Current Weeb: " + currentWeeb);
				}
				else if (rdbtnWeeb_2.isSelected ())
				{
					battle.switchWeeb (rdbtnWeebRepresents2);
					int saver = rdbtnWeebRepresents2;
					rdbtnWeebRepresents2 = currentWeeb;
					currentWeeb = saver;
					battle.switchWeeb (saver);
					System.out.println ("Current Weeb: " + currentWeeb);
				}
			}
		});

		btnSwitch.setBounds(380, 419, 89, 23);

		combatScreen.add(btnSwitch);
		combatScreen.add(btnSwitch);
		mapScreen.setBackground(Color.DARK_GRAY);


		frame.getContentPane().add(mapScreen, "name_5850265353464");
		mapScreen.setLayout(null);


		//Weeb Sprite image

		img3 = new ImageIcon("weeb3.png");
		Image image3 = img3.getImage();
		Image newimg3 = image3.getScaledInstance(19, 21, java.awt.Image.SCALE_SMOOTH);
		img3 = new ImageIcon(newimg3);
		spriteImage.setIcon(img3);
		spriteImage.setBounds(x, y, 19, 21);
		mapScreen.add(spriteImage);
		for (int counter = 0; counter < 25; counter++)
		{	
			for (int counter2 = 0; counter2 < 4; counter2++)
			{
				mapScreen.add(imgLabel[counter][counter2]);
			}

		}

		//boss square
		mapScreen.add(deWey);

		//items
		mapScreen.add(item[0]);
		mapScreen.add(item[1]);
		mapScreen.add(item[2]);
		mapScreen.add(item[3]);
		mapScreen.add(item[4]);
		mapScreen.add(item[5]);
		mapScreen.add(item[6]);
		mapScreen.add(item[7]);
		mapScreen.add(item[8]);
		mapScreen.add(item[9]);
		mapScreen.add(item[10]);
		mapScreen.add(item[11]);
		mapScreen.add(item[12]);
		mapScreen.add(item[13]);
		mapScreen.add(item[14]);
		mapScreen.add(item[15]);
		mapScreen.add(item[16]);
		mapScreen.add(item[17]);
		mapScreen.add(item[18]);
		mapScreen.add(item[19]);
		mapScreen.add(item[20]);
		mapScreen.add(item[21]);
		mapScreen.add(item[22]);
		mapScreen.add(item[23]);
		mapScreen.add(item[24]);


		mapScreen.add(bossRoom); //boss room
		mapScreen.add(startRoom); //start room

		//basic rooms
		mapScreen.add(blackRoom);
		mapScreen.add(blackRoom2);
		mapScreen.add(blackRoom3);
		mapScreen.add(blackRoom4);
		mapScreen.add(blackRoom5);
		mapScreen.add(blackRoom6);
		mapScreen.add(blackRoom7);
		mapScreen.add(blackRoom8);
		mapScreen.add(blackRoom9);
		mapScreen.add(blackRoom10);
		mapScreen.add(blackRoom11);
		mapScreen.add(blackRoom12);
		mapScreen.add(blackRoom13);
		mapScreen.add(blackRoom14);
		mapScreen.add(blackRoom15);
		mapScreen.add(blackRoom16);
		mapScreen.add(blackRoom17);
		mapScreen.add(blackRoom18);
		mapScreen.add(blackRoom19);
		mapScreen.add(blackRoom20);
		mapScreen.add(blackRoom21);
		mapScreen.add(blackRoom22);
		mapScreen.add(blackRoom23);
		mapScreen.add(blackRoom24);
		mapScreen.add(blackRoom25);





		//Weeb player in combat screen image

		imgC = new ImageIcon("weeb3.png");
		Image imageC = imgC.getImage();
		Image newimgC = imageC.getScaledInstance(200, 190, java.awt.Image.SCALE_SMOOTH);
		imgC = new ImageIcon(newimgC);
		weebPlayer.setIcon(imgC);
		weebPlayer.setBounds(50, 125, 200, 190);
		combatScreen.add(weebPlayer);

		//game over image in gameoverScreen

		imgG = new ImageIcon("coryInTheHouse.png");
		Image imageG = imgG.getImage();
		Image newimgG = imageG.getScaledInstance(700, 800, java.awt.Image.SCALE_SMOOTH);
		imgG = new ImageIcon(newimgG);
		gameoverImage.setIcon(imgG);
		gameoverImage.setBounds(900, 72, 700, 800);
		gameoverScreen.add(gameoverImage);

		//room black background

		imgW = new ImageIcon("blackSquare.png");
		Image imageW = imgW.getImage();
		Image newimgW = imageW.getScaledInstance(width2 - 150, height2 - 100, java.awt.Image.SCALE_SMOOTH);
		imgW = new ImageIcon(newimgW);
		whiteRoom.setIcon(imgW);
		whiteRoom.setBounds(10, 11, width2 - 150, height2 - 100);
		mapScreen.add(whiteRoom);


		//Jesus Weeb image

		imgJesus = new ImageIcon("Jesus.png");
		Image imageJesus = imgJesus.getImage();
		Image newimgJesus = imageJesus.getScaledInstance(300, 400, java.awt.Image.SCALE_SMOOTH);
		imgJesus = new ImageIcon(newimgJesus);
		jesusWeeb.setIcon(imgJesus);
		jesusWeeb.setBounds(803, 87, 300, 400);
		combatScreen.add(jesusWeeb);

		//Josh weeb image

		imgJosh = new ImageIcon("josh.png");
		Image imageJosh = imgJosh.getImage();
		Image newimgJosh = imageJosh.getScaledInstance(300, 400, java.awt.Image.SCALE_SMOOTH);
		imgJosh = new ImageIcon(newimgJosh);
		joshWeeb.setIcon(imgJosh);
		joshWeeb.setBounds(1103, 87, 300, 400);
		combatScreen.add(joshWeeb);

		//TRex weeb image

		imgTRex = new ImageIcon("TRex.png");
		Image imageTR = imgTRex.getImage();
		Image newimgTR = imageTR.getScaledInstance(300, 400, java.awt.Image.SCALE_SMOOTH);
		imgTRex = new ImageIcon(newimgTR);
		tRexWeeb.setIcon(imgTRex);
		tRexWeeb.setBounds(1403, 87, 300, 400);
		combatScreen.add(tRexWeeb);

		//Trump weeb image

		imgTrump = new ImageIcon("trump.png");
		Image imageTrump = imgTrump.getImage();
		Image newimgTrump = imageTrump.getScaledInstance(300, 400, java.awt.Image.SCALE_SMOOTH);
		imgTrump = new ImageIcon(newimgTrump);
		trumpWeeb.setIcon(imgTrump);
		trumpWeeb.setBounds(1103, 587, 300, 400);
		combatScreen.add(trumpWeeb);

		//Jasan weeb image

		imgJasan = new ImageIcon("enemyWeeb1.png");
		Image imageJasan = imgJasan.getImage();
		Image newimgJasan = imageJasan.getScaledInstance(350, 400, java.awt.Image.SCALE_SMOOTH);
		imgJasan = new ImageIcon(newimgJasan);
		jasanWeeb.setIcon(imgJasan);
		jasanWeeb.setBounds(803, 587, 350, 400);
		combatScreen.add(jasanWeeb);

		//Dr Blob weeb image

		imgDrBlob = new ImageIcon("enemyWeeb2.png");
		Image imageDrBlob = imgDrBlob.getImage();
		Image newimgDrBlob = imageDrBlob.getScaledInstance(300, 400, java.awt.Image.SCALE_SMOOTH);
		imgDrBlob = new ImageIcon(newimgDrBlob);
		drBlobWeeb.setIcon(imgDrBlob);
		drBlobWeeb.setBounds(1403, 587, 300, 400);
		combatScreen.add(drBlobWeeb);

		
		
		JButton btnRestore = new JButton("Restore"); //restore button
		btnRestore.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ms.restore();
			}
		});
		btnRestore.setBounds(581, 360, 89, 23);
		combatScreen.add(btnRestore);

		JButton btnGameOver = new JButton("Game Over"); //temp game over button
		btnGameOver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				gameoverScreen.setVisible(true);
				combatScreen.setVisible(false);
			}
		});
		btnGameOver.setBounds(394, 476, 139, 23);
		combatScreen.add(btnGameOver);










		helpScreen.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(helpScreen, "name_2043750759608");
		helpScreen.setLayout(null);

		JLabel lblHelp = new JLabel("HELP!"); //help screen label
		lblHelp.setForeground(Color.CYAN);
		lblHelp.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblHelp.setBounds(44, 23, 741, 95);
		helpScreen.add(lblHelp);

		JTextArea txtrLol = new JTextArea(); //help screen text area
		txtrLol.setForeground(Color.CYAN);
		txtrLol.setBackground(Color.DARK_GRAY);
		txtrLol.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		txtrLol.setText("Click the button corresponding to what you \r\nwant to do. Example: \"I want to use skill 1!\"\r\nclick skill 1. Duh. You don't have to watch\r\nRick and Morty to understand this concept.");
		txtrLol.setBounds(44, 143, 741, 153);
		helpScreen.add(txtrLol);

		JButton backHelp = new JButton("Back");
		backHelp.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		backHelp.setBounds(44, 328, 741, 70);
		helpScreen.add(backHelp);


		gameoverScreen.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(gameoverScreen, "name_595441359401");
		gameoverScreen.setLayout(null);

		JLabel lblYouSuck = new JLabel("You Suck!");
		lblYouSuck.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		lblYouSuck.setForeground(Color.CYAN);
		lblYouSuck.setBounds(221, 72, 542, 252);
		gameoverScreen.add(lblYouSuck);
		mapScreen.requestFocusInWindow(); //requests focus
		backHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				combatScreen.setVisible(true);
				helpScreen.setVisible(false);
			}
		});



		//movement in map screen
		mapScreen.addKeyListener(new KeyListener()  //adds key listener to the map screen
				{

			public void keyPressed(KeyEvent e)
			{
				System.out.println ("hello there, general kenobi!");
				System.out.println(presskey);
				double anotherVariable = Math.random();
				if (anotherVariable >0.99)
				{
					MinigamesV2 v = new MinigamesV2();

					if (anotherVariable >0.995){
						v.initializeRockPaperScissors();

					}else{
						v.initializePD();
					}
				}


				System.out.println("it hfusdh");
				if (presskey >= randomkey ) 
				{
					double soWeSomeKindOfSuicideSquad = Math.random()*5;
					if (soWeSomeKindOfSuicideSquad < 1)
					{
						battle.enemyWeeb.changeTypeOfWeebObject (0);
						toSetTextfield = "You are facing Jesus!";	
					}else if (soWeSomeKindOfSuicideSquad < 2)
					{
						battle.enemyWeeb.changeTypeOfWeebObject (1);
						toSetTextfield = "You are facing Rex!";	
					}
					else if (soWeSomeKindOfSuicideSquad < 3)
					{
						battle.enemyWeeb.changeTypeOfWeebObject (3);
						toSetTextfield = "You are facing DrBlob!";	
					}else if (soWeSomeKindOfSuicideSquad < 4)
					{
						battle.enemyWeeb.changeTypeOfWeebObject (4);
						toSetTextfield = "You are facing Josh!";	
					}else if (soWeSomeKindOfSuicideSquad < 5)
					{
						battle.enemyWeeb.changeTypeOfWeebObject (5);
						toSetTextfield = "You are facing Trump!";	
					}

					battle.resetBattle();
					resetPicStix();
					btnMSAttack.setVisible(true);
					btnMSDefence.setVisible(true);
					battleActive=true;
					mapScreen.setVisible(false);
					combatScreen.setVisible(true);
					picStix();
					combatScreenSetUp(battle);
					System.out.println("it");
					//spriteImage.setVisible(false);
					randomkey=randomnum();
					presskey=0;
				}


				if (e.getKeyCode() == KeyEvent.VK_S) //listener for s key
				{
					System.out.println("button pressed");
					presskey++;
					y += 5; //movement

					if (y > 970) //boundaries (will depend on rooms generated
					{
						y -= 5; //movement
					} //add an else if for room boundaries
					else if (y>190&&y<215)
					{
						y -= 5; //movement
					}
					else if  (y>385&&y<410)
					{
						y -= 5; //movement
					}
					else if  (y>580&&y<605)
					{
						y -= 5; //movement
					}
					else if  (y>775&&y<800)
					{
						y -= 5; //movement
					}


				}


				if (e.getKeyCode() == KeyEvent.VK_W) //listener for w 
				{
					System.out.println("button pressed");
					presskey++;
					y -= 5; //movement

					if (y < 20) //boundary
					{
						y += 5; //movement
					}
					else if (y>190&&y<215)
					{
						y += 5; //movement
					}
					else if (y>385&&y<410)
					{
						y += 5; //movement
					}
					else if (y>580&&y<605)
					{
						y += 5; //movement
					}
					else if (y>775&&y<800)
					{
						y += 5; //movement
					}


				}

				if (e.getKeyCode() == KeyEvent.VK_A) //a key 
				{
					System.out.println("button pressed");
					presskey++;
					x -= 5; //movement

					if (x < 15) //boundary
					{
						x += 5; //movement
					}
					else if (x>345&&x<370)
					{
						x += 5; //movement
					}
					else if (x>700&&x<725)
					{
						x += 5; //movement
					}
					else if (x>1055&&x<1080)
					{
						x += 5; //movement
					}
					else if (x>1410&&x<1430)
					{
						x += 5; //movement
					}

				}

				if (e.getKeyCode() == KeyEvent.VK_D) //d key
				{
					System.out.println("button pressed");
					presskey++;
					x += 5; //movement

					if (x > 1760) //boundary
					{
						x-=5;
					}
					else if (x>345&&x<370)
					{
						x-=5;
					}
					else if (x>700&&x<725)
					{
						x-=5;
					}
					else if (x>1055&&x<1080)
					{
						x-=5;
					}
					else if (x>1410&&x<1430)
					{
						x-=5;
					}

				}
				spriteImage.setBounds(x, y, 19, 21); //sets new position of player sprite
				//item checker
				for (int counter = 0; counter < 25; counter++)
				{

					//System.out.println("X2:"+item[counter].getX()+"  Y2:"+item[counter].getY());
					if ((y>=item[counter].getY()-10&&y<=item[counter].getY()+10)&&(x>item[counter].getX()-10&&x<item[counter].getX()+10))
					{   
						if (itemCheck[counter]==true)
						{
							itemCheck[counter]=false;
							item[counter].setVisible(false);
							System.out.print("esketit");
							itemed.randomItem();
						}
					}
				}

				//boss room checker
				if ((y>=deWey.getY()+10&&y<=deWey.getY()+50)&&(x>=deWey.getX()+15&&x<=deWey.getX()+50))
				{   
					battle.enemyWeeb.changeTypeOfWeebObject (2);
					toSetTextfield = "You are facing the BOSS!, Jasan Rai!";
					battle.resetBattle();
					resetPicStix();
					btnMSAttack.setVisible(true);
					btnMSDefence.setVisible(true);
					combatScreenSetUp(battle);
					mapScreen.setVisible(false);
					combatScreen.setVisible(true);
					picStix();
					System.out.print("U Have Found De Wey");
				}

				//teleporter panels
				loop1:
					for (int counter = 0; counter < 25; counter++)
					{ 
						for (int counter2 = 0; counter2 < 4; counter2++)
						{ 
							if (y==imgLabel[counter][counter2].getY()&&x==imgLabel[counter][counter2].getX())
							{   
								if (panelCheck[counter][counter2]==1)
								{
									for (int counter3 = 0; counter3 < teleporter1.length; counter3++)
									{ 
										if (teleporter1[counter3]==counter+1)
										{
											if (cor1[counter3]==counter2+1)
											{
												for (int counter4 = 0; counter4 < 4; counter4++)
												{

													if (cor2[counter3]==counter4+1)
													{
														int y5=counter;
														int x4=teleporter2[counter3]-1;
														int y4=cor2[counter3];
														int x5=counter4;
														System.out.println("X4:"+x4+ " Y4:"+y4+ " X5:"+x5+" Y5:"+y5);
														int x3=imgLabel[x4][x5].getX();
														int y3=imgLabel[x4][x5].getY();
														spriteImage.setBounds(x3, y3, 19, 21); //sets new position of player sprite
														x=x3;
														y=y3;

														break loop1;
													}
												}
											}
										}
									}
								}
								else if(panelCheck[counter][counter2]==2)
								{
									for (int counter3 = 0; counter3 < teleporter2.length; counter3++)
									{ 
										if (teleporter2[counter3]==counter+1)
										{
											if (cor2[counter3]==counter2+1)
											{
												for (int counter4 = 0; counter4 < 4; counter4++)
												{

													if (cor1[counter3]==counter4+1)
													{
														int y5=counter;
														int x4=teleporter1[counter3]-1;
														int y4=cor1[counter3];
														int x5=counter4;
														System.out.println("X4:"+x4+ " Y4:"+y4+ " X5:"+x5+" Y5:"+y5);
														int x3=imgLabel[x4][x5].getX();
														int y3=imgLabel[x4][x5].getY();
														spriteImage.setBounds(x3, y3, 19, 21); //sets new position of player sprite
														x=x3;
														y=y3;

														break loop1;
													}
												}
											}
										}
									}	
								}
								else 
								{

								}
							}
						}

					}
				System.out.println("X: " +  x + " Y: " + y);
			}

			public void keyReleased(KeyEvent e) { //this has to be here for movement to work
				// TODO Auto-generated method stub
			}

			public void keyTyped(KeyEvent e) { //also has to be here
				// TODO Auto-generated method stub
			}
				});
	}

	public void enemyAttack ()
	{
		double [] attackInfo = battle.enemyWeeb.attackChooser(battle.playerParty.playerWeeb[battle.activeWeeb].eDefenseC, battle.playerParty.playerWeeb[battle.activeWeeb].eAttackC, battle.playerParty.playerWeeb[battle.activeWeeb].eHealthD);


		if(attackInfo.length != 0) 
		{
			if (attackInfo[0] == 0)
			{
				toSetTextfield = toSetTextfield + " \n The enemy dealt " + ((int)attackInfo[1]) + " health damage!";
				battle.playerParty.playerWeeb[battle.activeWeeb].eHealthC-=(int)attackInfo[1];
			}else if (attackInfo[0] == 1)
			{
				toSetTextfield = toSetTextfield + " \n The enemy dealt " + ((int)attackInfo[1]) + " attack damage!";
				battle.playerParty.playerWeeb[battle.activeWeeb].eAttackC-=(int)attackInfo[1];
			}else if (attackInfo[0] == 2)
			{
				toSetTextfield = toSetTextfield + " \n The enemy dealt " + ((int)attackInfo[1]) + " defense damage!";
				battle.playerParty.playerWeeb[battle.activeWeeb].eDefenseC-=(int)attackInfo[1];
			}else if (attackInfo[0] == 3)
			{
				toSetTextfield = toSetTextfield + " \n The enemy dealt " + ((int)attackInfo[1]) + " mana damage!";
				battle.playerParty.playerWeeb[battle.activeWeeb].eManaC-=(int)attackInfo[1];
			}
		}else {
			toSetTextfield = toSetTextfield + " \n The enemy boosted it's own stats!";
		}

	}

	public void combatScreenSetUp (final Combat battle) //New Stuff
	{


		if (battle.enemyWeeb.eHealthC <= 0){
			txtInsertMovesHere.setText ("You won!");
			label15.setText("You won blababababbababababababbababababbababab");
		}
		else
		{
			//label15.setText("");
			txtInsertMovesHere.setText (toSetTextfield);
		}



		toSetTextfield = "";
		playerHealth.setFont(new Font("Tahoma", Font.BOLD, 12));
		playerHealth.setBackground(Color.WHITE);
		playerHealth.setValue((int)battle.playerParty.playerWeeb[battle.activeWeeb].eHealthD);
		playerHealth.setForeground(new Color(0, 204, 51));
		playerHealth.setStringPainted(true);
		playerHealth.setBounds(10, 11, 235, 31);
		combatScreen.add(playerHealth);
		playerHealth.setString(battle.playerParty.playerWeeb[battle.activeWeeb].eHealthC+"/"+battle.playerParty.playerWeeb[battle.activeWeeb].eHealthD);


		playerMana.setFont(new Font("Tahoma", Font.BOLD, 11));		
		playerMana.setForeground(Color.CYAN);
		playerMana.setStringPainted(true);
		playerMana.setForeground(new Color(0, 204, 255));
		enemyMana.setString(battle.playerParty.playerWeeb[battle.activeWeeb].eManaC+"/"+battle.playerParty.playerWeeb[battle.activeWeeb].eManaD);
		playerMana.setValue((int)battle.playerParty.playerWeeb[battle.activeWeeb].eManaC); //New Stuff
		playerMana.setMaximum((int)battle.playerParty.playerWeeb[battle.activeWeeb].eManaD); //New Stuff
		enemyMana.setBounds(10, 42, 146, 14);
		combatScreen.add(playerMana);


		enemyHealth.setFont(new Font("Tahoma", Font.BOLD, 12));
		enemyHealth.setForeground(Color.RED);
		enemyHealth.setStringPainted(true);
		enemyHealth.setMaximum((int)battle.enemyWeeb.eHealthD); //New stuff
		enemyHealth.setValue((int)battle.enemyWeeb.eHealthC);
		enemyHealth.setString(battle.enemyWeeb.eHealthC+"/"+battle.enemyWeeb.eHealthD);
		enemyHealth.setBounds(521, 11, 235, 31);
		combatScreen.add(enemyHealth);


		enemyMana.setFont(new Font("Tahoma", Font.BOLD, 11));
		enemyMana.setForeground(Color.BLUE);
		enemyMana.setStringPainted(true);
		enemyMana.setString(battle.enemyWeeb.eManaC+"/"+battle.enemyWeeb.eManaD);
		enemyMana.setMaximum((int)battle.enemyWeeb.eManaD);
		enemyMana.setValue((int)battle.enemyWeeb.eManaC);
		enemyMana.setBounds(610, 42, 146, 14);
		combatScreen.add(enemyMana);

		if (battle.getActive () == 1)
		{
			rdbtnWeeb.setText ("Weeb 2");
			rdbtnWeeb_1.setText ("Weeb 3");
			rdbtnWeeb_2.setText ("Weeb 4");
			rdbtnWeebRepresents = 1;
			rdbtnWeebRepresents1 = 2;
			rdbtnWeebRepresents2 = 3;
		}
		else if (battle.getActive () == 2)
		{
			rdbtnWeeb.setText ("Weeb 1");
			rdbtnWeeb_1.setText ("Weeb 3");
			rdbtnWeeb_2.setText ("Weeb 4");
			rdbtnWeebRepresents = 0;
			rdbtnWeebRepresents1 = 2;
			rdbtnWeebRepresents2 = 3;
		}
		else if (battle.getActive () == 3)
		{
			rdbtnWeeb.setText ("Weeb 1");
			rdbtnWeeb_1.setText ("Weeb 2");
			rdbtnWeeb_2.setText ("Weeb 4");
			rdbtnWeebRepresents = 0;
			rdbtnWeebRepresents1 = 1;
			rdbtnWeebRepresents2 = 3;
		}
		else
		{
			rdbtnWeeb.setText ("Weeb 1");
			rdbtnWeeb_1.setText ("Weeb 2");
			rdbtnWeeb_2.setText ("Weeb 3");
			rdbtnWeebRepresents = 0;
			rdbtnWeebRepresents1 = 1;
			rdbtnWeebRepresents2 = 2;
		}
		if (battle.getNum () == 1)
		{
			rdbtnWeeb.setVisible (false);
			rdbtnWeeb_1.setVisible (false);
			rdbtnWeeb_2.setVisible (false);
		}
		else if (battle.getNum () == 2)
		{
			rdbtnWeeb.setVisible (true);
			rdbtnWeeb_1.setVisible (false);
			rdbtnWeeb_2.setVisible (false);
		}
		else if (battle.getNum () == 3)
		{
			rdbtnWeeb.setVisible (true);
			rdbtnWeeb_1.setVisible (true);
			rdbtnWeeb_2.setVisible (false);
		}
		else
		{
			rdbtnWeeb.setVisible (true);
			rdbtnWeeb_1.setVisible (true);
			rdbtnWeeb_2.setVisible (true);
		}
		if (battle.playerParty.playerWeeb [battle.activeWeeb].weebType == 3)
		{
			btnSkill.setText ("throwChunksOfBod");
			btnSkill_1.setText ("split");
			btnSkill_2.setText ("rapidCellReproduction");
		}
		else if (battle.playerParty.playerWeeb [battle.activeWeeb].weebType == 4)
		{
			btnSkill.setText ("playAltoSax");
			btnSkill_1.setText ("flirtWithLadies");
			btnSkill_2.setText ("eatPizza");
		}
		else if (battle.playerParty.playerWeeb [battle.activeWeeb].weebType == 5)
		{
			btnSkill.setText ("golf");
			btnSkill_1.setText ("lie");
			btnSkill_2.setText ("invest");
		}


		if (battle.enemyWeeb.weebType == 2)
		{
			int randomInsult = (int) Math.round(Math.random()*10); //These are the insults.
			switch (randomInsult)
			{
			case 0:
				label15.setText("You mother is very similar to a whale in that she is fat!");
				break;
			case 1:
				label15.setText("You're not the dumbest person on the planet, but you sure better hope he doesn't die.");
				break;

			case 2:
				label15.setText("You clearly aren't cut out for this. Why don't you try something simpler, like Manpreet's game?");
				break;

			case 3:
				label15.setText(" Did you ever hear the tragedy of Darth Plagueis The Wise?  I thought not, you're pretty dumb.");
				break;
			case 4:
				label15.setText("You are weak like an hamster!");
				break;
			case 5:
				label15.setText("You play Weeb Hunters like Mack Peters plays chess!");
				break;
			case 6:
				label15.setText("You probably waste all your money on avocado toast like a filthy millenial!");
				break;
			case 7:
				label15.setText("You face resembles a mushroom!");
				break;
			case 8:
				label15.setText("Are you French by any chance?");
				break;
			case 9:
				label15.setText("HAHAHAHHAHAHAHAHAHHAHAHAHAHAHAHAHAHA WEAK!");
				break;
			}

			label15.setForeground(Color.CYAN);
			label15.setBounds(759, 500, 470, 121);
			label15.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
			combatScreen.add(label15);
		}
	}
	
	static Image getScaledImage(Image srcImg, int w, int h){ //method for image generation, solely for GUI, just ignore
		BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB); 
		Graphics2D g2 = resizedImg.createGraphics();

		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.drawImage(srcImg, 0, 0, w, h, null);
		g2.dispose();

		return resizedImg;
	}

	//gary
	
	public void picStix()
	{
		if(battle.enemyWeeb.weebType==0)
		{
			jesusWeeb.setVisible(true);
		}
		else if(battle.enemyWeeb.weebType==1)
		{
			jasanWeeb.setVisible(true);
		}
		else if (battle.enemyWeeb.weebType==2)
		{
			tRexWeeb.setVisible(true);
		}
		else if(battle.enemyWeeb.weebType==3)
		{
			drBlobWeeb.setVisible(true);
		}
		else if(battle.enemyWeeb.weebType==4)
		{
			joshWeeb.setVisible(true);
		}
		else if(battle.enemyWeeb.weebType==5)
		{
			trumpWeeb.setVisible(true);
		}
	}
	
	public void resetPicStix()
	{
		jesusWeeb.setVisible(false);
		jasanWeeb.setVisible(false);
		tRexWeeb.setVisible(false);
		drBlobWeeb.setVisible(false);
		joshWeeb.setVisible(false);
		trumpWeeb.setVisible(false);
	}

	public int  randomnum()
	{
		int num= (int) (Math.random()*150);
		num = 100 + num;
		return num;
	}
}
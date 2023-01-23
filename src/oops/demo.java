package oops;

import java.util.Scanner;

public class demo{
    public static void main(String[] args) { 
    	Instructions a=new Instructions();
    	a.print_ins();
    	System.out.println("ENTER ANY KEY TO CONTINUE");
    	Scanner option = new Scanner(System.in);
    	char temp = option.next().charAt(0);
    	System.out.println("Enter number of players(1/2)");
    	Scanner temp100=new Scanner(System.in);
    	int p=temp100.nextInt();
    	if(p==2) {
    		System.out.println("------------------------------------------------------SHIP PLACEMENT------------------------------------------------------");
    		Player one=new Player();
    		one.a.grid_stmu="--------------------PLAYER 1  INFO(at ship placment)----------------\n";
    		System.out.println("-----------------------------------------------------OPPONENT 1 GRID------------------------------------------------------");
    		one.option(1);
    		Player two=new Player();
    		System.out.println("-----------------------------------------------------OPPONENT 2 GRID------------------------------------------------------");
    		two.a.grid_stmu="--------------------PLAYER 2  INFO(at ship placment)----------------\n";
    		two.option(1);
    		
    		System.out.println("-----------------------------------------------------X-GAME BEIGINS-X------------------------------------------------------");
        	Attack samp=new Attack();
        	samp.attack_stu="----------------------ATTACK INFO------------------ \n";
        	int i=0;
        	while(one.count()!=17 && two.count()!=17 ) {
        		if(i%2==0) {
        			samp.attack_stu=samp.attack_stu+"PLAYER 1 TURN \n";
        			System.out.println("-----------------------------------------------------OPPONENT 1 TURN------------------------------------------------------");
        			samp.display(one, two,1);
        			samp.flag_main=0;
        		}
        		else {
        			samp.attack_stu=samp.attack_stu+"PLAYER 2 TURN \n";
        			System.out.println("-----------------------------------------------------OPPONENT 2 TURN------------------------------------------------------");
        			samp.display(two, one,1);
        			samp.flag_main=0;
        		}
        		i++;
        	}
        	System.out.println(one.a.grid_stmu+"\n"+two.a.grid_stmu+"\n"+samp.attack_stu);
        if(one.count()==17) {
    		System.out.println("PLAYER ONE WINS");
    	}
    	else if(two.count()==17) {
    		System.out.println("PLAYER TWO WINS");
    	}
    	}
    	else {
    		System.out.println("------------------------------------------------------SHIP PLACEMENT------------------------------------------------------");
    		Player one=new Player();
    		one.a.grid_stmu="--------------------PLAYER 1  INFO(at ship placment)----------------\n";
    		System.out.println("-----------------------------------------------------PLACE YOUR SHIPS------------------------------------------------------");
    		one.option(1);
    		Bot bot=new Bot();
    		bot.stack.add("06");
    		bot.stack.add("77");
    		bot.stack.add("73");
    		bot.stack.add("57");
    		bot.stack.add("04");
    		bot.stack.add("20");
    		bot.stack.add("71");
    		bot.stack.add("75");
    		bot.stack.add("17");
    		bot.stack.add("02");
    		bot.stack.add("00");
    		bot.stack.add("60");
    		bot.stack.add("53");
    		bot.stack.add("42");
    		bot.stack.add("46");
    		bot.stack.add("62");
    		bot.stack.add("35");
    		bot.stack.add("31");
    		bot.stack.add("44");
    		bot.stack.add("24");
    		bot.stack.add("55");
    		bot.stack.add("26");
    		bot.stack.add("22");
    		bot.stack.add("37");
    		bot.stack.add("40");
    		bot.stack.add("64");
    		bot.stack.add("13");
    		bot.stack.add("15");
    		bot.stack.add("51");
    		bot.stack.add("11");
    		bot.stack.add("66");
    		bot.stack.add("33");
    		Attack samp=new Attack();
    		samp.attack_stu=samp.attack_stu+"----------------------ATTACK INFO------------------ \n";
    		int i=0;
    		while(one.count()!=17 && bot.bot.count()!=17) {
    			if(i%2==0) {
    				samp.attack_stu=samp.attack_stu+"PLAYER TURN \n";
    				System.out.println("-----------------------------------------------------YOUR TURN------------------------------------------------------");
    				samp.display(one,bot.bot,1);
    				samp.flag_main=0;
    			}
    			else {
    				samp.attack_stu=samp.attack_stu+"BOT TURN \n";
    				bot.attack(one);
    			}
    			i++;
    		}
    		System.out.println(one.a.grid_stmu+"\n"+samp.attack_stu);
    		if(one.count()==17) {
        		System.out.println("PLAYER WINS");
        	}
        	else if(bot.bot.count()==17) {
        		System.out.println("COMPUTER WINS");
        	}
    	}
    	}
    
}

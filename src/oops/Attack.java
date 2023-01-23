package oops;

import java.util.Scanner;

//one is should have visible base i.e;two should have navigation
public class Attack extends Player{
	public String attack_stu;
	int ii;
	int flag_main=0;
	public void resetter(Player x,int i) {
		point p5=x.a.one_5;
		point p4=x.a.two_4;
		point p3_1=x.a.three_3_3;
		point p3_2=x.a.three_3_4;
		point p2=x.a.five_2;
		if(p5.getI()==p5.getR()) {
			if(p5.getJ()>p5.getS()) {
				int k=p5.getS();
				while(k<=p5.getJ()) {
					if(x.a.grid[p5.getI()][k]=='O') {
						x.a.grid[p5.getI()][k]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[p5.getI()][k]==' '||x.a.grid[p5.getI()][k]=='@') {
							x.a.grid[p5.getI()][k]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p5.getS();
				while(k<=p5.getJ()) {
					if(x.a.grid[p5.getI()][k]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==5) {
					attack_stu=attack_stu+"suken whole 5 blocked ship \n";
					k=p5.getS();
					while(k<=p5.getJ()) {
						x.a.grid[p5.getI()][k]='#';
						
						k++;
					}
				}
			}
			else {
				int k=p5.getJ();
				while(k<=p5.getS()) {
					if(x.a.grid[p5.getI()][k]=='O') {
						x.a.grid[p5.getI()][k]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[p5.getI()][k]==' '||x.a.grid[p5.getI()][k]=='@') {
							x.a.grid[p5.getI()][k]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p5.getJ();
				while(k<=p5.getS()) {
					if(x.a.grid[p5.getI()][k]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==5) {
					attack_stu=attack_stu+"suken whole 5 blocked ship \n";
					k=p5.getJ();
					while(k<=p5.getS()) {
						x.a.grid[p5.getI()][k]='#';
						
						k++;
					}
				}
			}
		}
		else {
			if(p5.getI()>p5.getR()) {
				int k=p5.getR();
				while(k<=p5.getI()) {
					if(x.a.grid[k][p5.getJ()]=='O') {
						x.a.grid[k][p5.getJ()]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[k][p5.getJ()]==' '||x.a.grid[k][p5.getJ()]=='@') {
							x.a.grid[k][p5.getJ()]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p5.getR();
				while(k<=p5.getI()) {
					if(x.a.grid[k][p5.getJ()]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==5) {
					attack_stu=attack_stu+"suken whole 5 blocked ship \n";
					k=p5.getR();
					while(k<=p5.getI()) {
						x.a.grid[k][p5.getJ()]='#';
						
						k++;
					}
				}
			}
			else {
				int k=p5.getI();
				while(k<=p5.getR()) {
					if(x.a.grid[k][p5.getJ()]=='O') {
						x.a.grid[k][p5.getJ()]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[k][p5.getJ()]==' '||x.a.grid[k][p5.getJ()]=='@') {
							x.a.grid[k][p5.getJ()]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p5.getI();
				while(k<=p5.getR()) {
					if(x.a.grid[k][p5.getJ()]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==5) {
					attack_stu=attack_stu+"suken whole 5 blocked ship \n";
					k=p5.getI();
					while(k<=p5.getR()) {
						x.a.grid[k][p5.getJ()]='#';
						
						k++;
					}
				}
			}
		}
		if(p4.getI()==p4.getR()) {
			if(p4.getJ()>p4.getS()) {
				int k=p4.getS();
				while(k<=p4.getJ()) {
					if(x.a.grid[p4.getI()][k]=='O') {
						x.a.grid[p4.getI()][k]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[p4.getI()][k]==' '||x.a.grid[p4.getI()][k]=='@') {
							x.a.grid[p4.getI()][k]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p4.getS();
				while(k<=p4.getJ()) {
					if(x.a.grid[p4.getI()][k]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==4) {
					k=p4.getS();
					while(k<=p4.getJ()) {
						x.a.grid[p4.getI()][k]='#';
						
						k++;
					}
					attack_stu=attack_stu+"suken whole 4 blocked ship \n";
				}
			}
			else {
				int k=p4.getJ();
				while(k<=p4.getS()) {
					if(x.a.grid[p4.getI()][k]=='O') {
						x.a.grid[p4.getI()][k]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[p4.getI()][k]==' '||x.a.grid[p4.getI()][k]=='@') {
							x.a.grid[p4.getI()][k]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p4.getJ();
				while(k<=p4.getS()) {
					if(x.a.grid[p4.getI()][k]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==4) {
					attack_stu=attack_stu+"suken whole 4 blocked ship \n";
					k=p4.getJ();
					while(k<=p4.getS()) {
						x.a.grid[p4.getI()][k]='#';
						k++;
					}
				}
			}
		}
		else {
			if(p4.getI()>p4.getR()) {
				int k=p4.getR();
				while(k<=p4.getI()) {
					if(x.a.grid[k][p4.getJ()]=='O') {
						x.a.grid[k][p4.getJ()]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[k][p4.getJ()]==' '||x.a.grid[k][p4.getJ()]=='@') {
							x.a.grid[k][p4.getJ()]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p4.getR();
				while(k<=p4.getI()) {
					if(x.a.grid[k][p4.getJ()]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==4) {
					attack_stu=attack_stu+"suken whole 4 blocked ship \n";
					k=p4.getR();
					while(k<=p4.getI()) {
						x.a.grid[k][p4.getJ()]='#';
						k++;
					}
				}
			}
			else {
				int k=p4.getI();
				while(k<=p4.getR()) {
					if(x.a.grid[k][p4.getJ()]=='O') {
						x.a.grid[k][p4.getJ()]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[k][p4.getJ()]==' '||x.a.grid[k][p4.getJ()]=='@') {
							x.a.grid[k][p4.getJ()]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p4.getI();
				while(k<=p4.getR()) {
					if(x.a.grid[k][p4.getJ()]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==4) {
					attack_stu=attack_stu+"suken whole 4 blocked ship \n";
					k=p4.getI();
					while(k<=p4.getR()) {
						x.a.grid[k][p4.getJ()]='#';
						k++;
					}
				}
			}
		}
		if(p3_1.getI()==p3_1.getR()) {
			if(p3_1.getJ()>p3_1.getS()) {
				int k=p3_1.getS();
				while(k<=p3_1.getJ()) {
					if(x.a.grid[p3_1.getI()][k]=='O') {
						x.a.grid[p3_1.getI()][k]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[p3_1.getI()][k]==' '||x.a.grid[p3_1.getI()][k]=='@') {
							x.a.grid[p3_1.getI()][k]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p3_1.getS();
				while(k<=p3_1.getJ()) {
					if(x.a.grid[p3_1.getI()][k]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==3) {
					attack_stu=attack_stu+"suken whole 3 blocked ship \n";
					k=p3_1.getS();
					while(k<=p3_1.getJ()) {
						x.a.grid[p3_1.getI()][k]='#';
						k++;
					}
				}
			}
			else {
				int k=p3_1.getJ();
				while(k<=p3_1.getS()) {
					if(x.a.grid[p3_1.getI()][k]=='O') {
						x.a.grid[p3_1.getI()][k]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[p3_1.getI()][k]==' '||x.a.grid[p3_1.getI()][k]=='@') {
							x.a.grid[p3_1.getI()][k]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p3_1.getJ();
				while(k<=p3_1.getS()) {
					if(x.a.grid[p3_1.getI()][k]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==3) {
					attack_stu=attack_stu+"suken whole 3 blocked ship \n";
					k=p3_1.getJ();
					while(k<=p3_1.getS()) {
						x.a.grid[p3_1.getI()][k]='#';
						k++;
					}
				}
			}
		}
		else {
			if(p3_1.getI()>p3_1.getR()) {
				int k=p3_1.getR();
				while(k<=p3_1.getI()) {
					if(x.a.grid[k][p3_1.getJ()]=='O') {
						x.a.grid[k][p3_1.getJ()]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[k][p3_1.getJ()]==' '||x.a.grid[k][p3_1.getJ()]=='@') {
							x.a.grid[k][p3_1.getJ()]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p3_1.getR();
				while(k<=p3_1.getI()) {
					if(x.a.grid[k][p3_1.getJ()]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==3) {
					attack_stu=attack_stu+"suken whole 3 blocked ship \n";
					k=p3_1.getR();
					while(k<=p3_1.getI()) {
						x.a.grid[k][p3_1.getJ()]='#';
						k++;
					}
				}
			}
			else {
				int k=p3_1.getI();
				while(k<=p3_1.getR()) {
					if(x.a.grid[k][p3_1.getJ()]=='O') {
						x.a.grid[k][p3_1.getJ()]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[k][p3_1.getJ()]==' '||x.a.grid[k][p3_1.getJ()]=='@') {
							x.a.grid[k][p3_1.getJ()]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p3_1.getI();
				while(k<=p3_1.getR()) {
					if(x.a.grid[k][p3_1.getJ()]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==3) {
					attack_stu=attack_stu+"suken whole 3 blocked ship \n";
					k=p3_1.getI();
					while(k<=p3_1.getR()) {
						x.a.grid[k][p3_1.getJ()]='#';
						k++;
					}
				}
			}
		}
		if(p3_2.getI()==p3_2.getR()) {
			if(p3_2.getJ()>p3_2.getS()) {
				int k=p3_2.getS();
				while(k<=p3_2.getJ()) {
					if(x.a.grid[p3_2.getI()][k]=='O') {
						x.a.grid[p3_2.getI()][k]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[p3_2.getI()][k]==' '||x.a.grid[p3_2.getI()][k]=='@') {
							x.a.grid[p3_2.getI()][k]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p3_2.getS();
				while(k<=p3_2.getJ()) {
					if(x.a.grid[p3_2.getI()][k]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==3) {
					attack_stu=attack_stu+"suken whole 3 blocked ship \n";
					k=p3_2.getS();
					while(k<=p3_2.getJ()) {
						x.a.grid[p3_2.getI()][k]='#';
						k++;
					}
				}
			}
			else {
				int k=p3_2.getJ();
				while(k<=p3_2.getS()) {
					if(x.a.grid[p3_2.getI()][k]=='O') {
						x.a.grid[p3_2.getI()][k]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[p3_2.getI()][k]==' '||x.a.grid[p3_2.getI()][k]=='@') {
							x.a.grid[p3_2.getI()][k]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p3_2.getJ();
				while(k<=p3_2.getS()) {
					if(x.a.grid[p3_2.getI()][k]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==3) {
					attack_stu=attack_stu+"suken whole 3 blocked ship \n";
					k=p3_2.getJ();
					while(k<=p3_2.getS()) {
						x.a.grid[p3_2.getI()][k]='#';
						k++;
					}
				}
			}
		}
		else {
			if(p3_2.getI()>p3_2.getR()) {
				int k=p3_2.getR();
				while(k<=p3_2.getI()) {
					if(x.a.grid[k][p3_2.getJ()]=='O') {
						x.a.grid[k][p3_2.getJ()]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[k][p3_2.getJ()]==' '||x.a.grid[k][p3_2.getJ()]=='@') {
							x.a.grid[k][p3_2.getJ()]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p3_2.getR();
				while(k<=p3_2.getI()) {
					if(x.a.grid[k][p3_2.getJ()]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==3) {
					attack_stu=attack_stu+"suken whole 3 blocked ship \n";
					k=p3_2.getR();
					while(k<=p3_2.getI()) {
						x.a.grid[k][p3_2.getJ()]='#';
						k++;
					}
				}
			}
			else {
				int k=p3_2.getI();
				while(k<=p3_2.getR()) {
					if(x.a.grid[k][p3_2.getJ()]=='O') {
						x.a.grid[k][p3_2.getJ()]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[k][p3_2.getJ()]==' '||x.a.grid[k][p3_2.getJ()]=='@') {
							x.a.grid[k][p3_2.getJ()]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p3_2.getI();
				while(k<=p3_2.getR()) {
					if(x.a.grid[k][p3_2.getJ()]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==3) {
					attack_stu=attack_stu+"suken whole 3 blocked ship \n";
					k=p3_2.getI();
					while(k<=p3_2.getR()) {
						x.a.grid[k][p3_2.getJ()]='#';
						k++;
					}
				}
			}
		}
		if(p2.getI()==p2.getR()) {
			if(p2.getJ()>p2.getS()) {
				int k=p2.getS();
				while(k<=p2.getJ()) {
					if(x.a.grid[p2.getI()][k]=='O') {
						x.a.grid[p2.getI()][k]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[p2.getI()][k]==' '||x.a.grid[p2.getI()][k]=='@') {
							x.a.grid[p2.getI()][k]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p2.getS();
				while(k<=p2.getJ()) {
					if(x.a.grid[p2.getI()][k]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==2) {
					attack_stu=attack_stu+"suken whole 2 blocked ship \n";
					k=p2.getS();
					while(k<=p2.getJ()) {
						x.a.grid[p2.getI()][k]='#';
						k++;
					}
				}
			}
			else {
				int k=p2.getJ();
				while(k<=p2.getS()) {
					if(x.a.grid[p2.getI()][k]=='O') {
						x.a.grid[p2.getI()][k]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[p2.getI()][k]==' '||x.a.grid[p2.getI()][k]=='@') {
							x.a.grid[p2.getI()][k]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p2.getJ();
				while(k<=p2.getS()) {
					if(x.a.grid[p2.getI()][k]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==2) {
					attack_stu=attack_stu+"suken whole 2 blocked ship \n";
					k=p2.getJ();
					while(k<=p2.getS()) {
						x.a.grid[p2.getI()][k]='#';
						k++;
					}
				}
			}
		}
		else {
			if(p2.getI()>p2.getR()) {
				int k=p2.getR();
				while(k<=p2.getI()) {
					if(x.a.grid[k][p2.getJ()]=='O') {
						x.a.grid[k][p2.getJ()]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[k][p2.getJ()]==' '||x.a.grid[k][p2.getJ()]=='@') {
							x.a.grid[k][p2.getJ()]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p2.getR();
				while(k<=p2.getI()) {
					if(x.a.grid[k][p2.getJ()]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==2) {
					attack_stu=attack_stu+"suken whole 2 blocked ship \n";
					k=p2.getR();
					while(k<=p2.getI()) {
						x.a.grid[k][p2.getJ()]='#';
						k++;
					}
				}
				
			}
			else {
				int k=p2.getI();
				while(k<=p2.getR()) {
					if(x.a.grid[k][p2.getJ()]=='O') {
						x.a.grid[k][p2.getJ()]='X';
						attack_stu=attack_stu+"(got shot)\n";
					}
					if(i==1) {
						if(x.a.grid[k][p2.getJ()]==' '||x.a.grid[k][p2.getJ()]=='@') {
							x.a.grid[k][p2.getJ()]='*';
						}
					}
					k++;
				}
				int flag=0;
				k=p2.getI();
				while(k<=p2.getR()) {
					if(x.a.grid[k][p2.getJ()]=='X') {
						flag++;
					}
					k++;
				}
				if(flag==2) {
					attack_stu=attack_stu+"suken whole 2 blocked ship \n";
					k=p2.getI();
					while(k<=p2.getR()) {
						x.a.grid[k][p2.getJ()]='#';
						k++;
					}
				}
			}
		}
	}
	public void display(Player one,Player two,int z) {
		int kk=0;
		int yy=0;
		int flag_ard=0;
		while(kk<=7) {
			yy=0;
			while(yy<=7) {
				if(two.a.grid[kk][yy]=='@') {
					flag_ard++;
				}
				yy++;
			}
			kk++;
		}
		if(flag_ard==0) {
			two.a.ArdaratePosition();
		}
		int i=0;
		int j=0;
		while(i<8) {
			j=0;
			while(j<8) {
				if(two.a.grid[i][j]=='*') {
					two.a.grid[i][j]=' ';
				}
				j++;
			}
			i++;
		}
		resetter(two,-1);
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("|                                                         |                                                           |");
		System.out.println("|                YOUR BASE                                |                    OPPONENT BASE                          |");
		System.out.println("|                                                         |                                                           |");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("|                                                         |                                                           |");
		System.out.println("|                                                         |           0     1     2     3     4     5     6     7     |");
		System.out.println("|  ___   ___   ___   ___   ___   ___   ___   ___          |	     ___   ___   ___   ___   ___   ___   ___   ___    |");
		System.out.println("| | "+one.a.grid[0][0]+" | | "+one.a.grid[0][1]+" | | "+one.a.grid[0][2]+" | | "+one.a.grid[0][3]+" | | "+one.a.grid[0][4]+" | | "+one.a.grid[0][5]+" | | "+one.a.grid[0][6]+" | | "+one.a.grid[0][7]+" |	  |	    | "+two.a.grid[0][0]+" | | "+two.a.grid[0][1]+" | | "+two.a.grid[0][2]+" | | "+two.a.grid[0][3]+" | | "+two.a.grid[0][4]+" | | "+two.a.grid[0][5]+" | | "+two.a.grid[0][6]+" | | "+two.a.grid[0][7]+" | 0 |");
		System.out.println("| |___| |___| |___| |___| |___| |___| |___| |___|	  |	    |___| |___| |___| |___| |___| |___| |___| |___|   |");
		System.out.println("|  ___   ___   ___   ___   ___   ___   ___   ___ 	  |	     ___   ___   ___   ___   ___   ___   ___   ___    |");
		System.out.println("| | "+one.a.grid[1][0]+" | | "+one.a.grid[1][1]+" | | "+one.a.grid[1][2]+" | | "+one.a.grid[1][3]+" | | "+one.a.grid[1][4]+" | | "+one.a.grid[1][5]+" | | "+one.a.grid[1][6]+" | | "+one.a.grid[1][7]+" |	  |	    | "+two.a.grid[1][0]+" | | "+two.a.grid[1][1]+" | | "+two.a.grid[1][2]+" | | "+two.a.grid[1][3]+" | | "+two.a.grid[1][4]+" | | "+two.a.grid[1][5]+" | | "+two.a.grid[1][6]+" | | "+two.a.grid[1][7]+" | 1 |");
		System.out.println("| |___| |___| |___| |___| |___| |___| |___| |___|	  |	    |___| |___| |___| |___| |___| |___| |___| |___|   |");
		System.out.println("|  ___   ___   ___   ___   ___   ___   ___   ___ 	  |	     ___   ___   ___   ___   ___   ___   ___   ___    |");
		System.out.println("| | "+one.a.grid[2][0]+" | | "+one.a.grid[2][1]+" | | "+one.a.grid[2][2]+" | | "+one.a.grid[2][3]+" | | "+one.a.grid[2][4]+" | | "+one.a.grid[2][5]+" | | "+one.a.grid[2][6]+" | | "+one.a.grid[2][7]+" |	  |	    | "+two.a.grid[2][0]+" | | "+two.a.grid[2][1]+" | | "+two.a.grid[2][2]+" | | "+two.a.grid[2][3]+" | | "+two.a.grid[2][4]+" | | "+two.a.grid[2][5]+" | | "+two.a.grid[2][6]+" | | "+two.a.grid[2][7]+" | 2 |");
		System.out.println("| |___| |___| |___| |___| |___| |___| |___| |___|	  |	    |___| |___| |___| |___| |___| |___| |___| |___|   |");
		System.out.println("|  ___   ___   ___   ___   ___   ___   ___   ___ 	  |	     ___   ___   ___   ___   ___   ___   ___   ___    |");
		System.out.println("| | "+one.a.grid[3][0]+" | | "+one.a.grid[3][1]+" | | "+one.a.grid[3][2]+" | | "+one.a.grid[3][3]+" | | "+one.a.grid[3][4]+" | | "+one.a.grid[3][5]+" | | "+one.a.grid[3][6]+" | | "+one.a.grid[3][7]+" |	  |	    | "+two.a.grid[3][0]+" | | "+two.a.grid[3][1]+" | | "+two.a.grid[3][2]+" | | "+two.a.grid[3][3]+" | | "+two.a.grid[3][4]+" | | "+two.a.grid[3][5]+" | | "+two.a.grid[3][6]+" | | "+two.a.grid[3][7]+" | 3 |");
		System.out.println("| |___| |___| |___| |___| |___| |___| |___| |___|	  |	    |___| |___| |___| |___| |___| |___| |___| |___|   |");
		System.out.println("|  ___   ___   ___   ___   ___   ___   ___   ___ 	  |	     ___   ___   ___   ___   ___   ___   ___   ___    |");
		System.out.println("| | "+one.a.grid[4][0]+" | | "+one.a.grid[4][1]+" | | "+one.a.grid[4][2]+" | | "+one.a.grid[4][3]+" | | "+one.a.grid[4][4]+" | | "+one.a.grid[4][5]+" | | "+one.a.grid[4][6]+" | | "+one.a.grid[4][7]+" |	  |	    | "+two.a.grid[4][0]+" | | "+two.a.grid[4][1]+" | | "+two.a.grid[4][2]+" | | "+two.a.grid[4][3]+" | | "+two.a.grid[4][4]+" | | "+two.a.grid[4][5]+" | | "+two.a.grid[4][6]+" | | "+two.a.grid[4][7]+" | 4 |");
		System.out.println("| |___| |___| |___| |___| |___| |___| |___| |___|	  |	    |___| |___| |___| |___| |___| |___| |___| |___|   |");
		System.out.println("|  ___   ___   ___   ___   ___   ___   ___   ___ 	  |	     ___   ___   ___   ___   ___   ___   ___   ___    |");
		System.out.println("| | "+one.a.grid[5][0]+" | | "+one.a.grid[5][1]+" | | "+one.a.grid[5][2]+" | | "+one.a.grid[5][3]+" | | "+one.a.grid[5][4]+" | | "+one.a.grid[5][5]+" | | "+one.a.grid[5][6]+" | | "+one.a.grid[5][7]+" |	  |	    | "+two.a.grid[5][0]+" | | "+two.a.grid[5][1]+" | | "+two.a.grid[5][2]+" | | "+two.a.grid[5][3]+" | | "+two.a.grid[5][4]+" | | "+two.a.grid[5][5]+" | | "+two.a.grid[5][6]+" | | "+two.a.grid[5][7]+" | 5 |");
		System.out.println("| |___| |___| |___| |___| |___| |___| |___| |___|	  |	    |___| |___| |___| |___| |___| |___| |___| |___|   |");
		System.out.println("|  ___   ___   ___   ___   ___   ___   ___   ___ 	  |	     ___   ___   ___   ___   ___   ___   ___   ___    |");
		System.out.println("| | "+one.a.grid[6][0]+" | | "+one.a.grid[6][1]+" | | "+one.a.grid[6][2]+" | | "+one.a.grid[6][3]+" | | "+one.a.grid[6][4]+" | | "+one.a.grid[6][5]+" | | "+one.a.grid[6][6]+" | | "+one.a.grid[6][7]+" |	  |	    | "+two.a.grid[6][0]+" | | "+two.a.grid[6][1]+" | | "+two.a.grid[6][2]+" | | "+two.a.grid[6][3]+" | | "+two.a.grid[6][4]+" | | "+two.a.grid[6][5]+" | | "+two.a.grid[6][6]+" | | "+two.a.grid[6][7]+" | 6 |");
		System.out.println("| |___| |___| |___| |___| |___| |___| |___| |___|	  |	    |___| |___| |___| |___| |___| |___| |___| |___|   |");
		System.out.println("|  ___   ___   ___   ___   ___   ___   ___   ___ 	  |	     ___   ___   ___   ___   ___   ___   ___   ___    |");
		System.out.println("| | "+one.a.grid[7][0]+" | | "+one.a.grid[7][1]+" | | "+one.a.grid[7][2]+" | | "+one.a.grid[7][3]+" | | "+one.a.grid[7][4]+" | | "+one.a.grid[7][5]+" | | "+one.a.grid[7][6]+" | | "+one.a.grid[7][7]+" |	  |	    | "+two.a.grid[7][0]+" | | "+two.a.grid[7][1]+" | | "+two.a.grid[7][2]+" | | "+two.a.grid[7][3]+" | | "+two.a.grid[7][4]+" | | "+two.a.grid[7][5]+" | | "+two.a.grid[7][6]+" | | "+two.a.grid[7][7]+" | 7 |");
		System.out.println("| |___| |___| |___| |___| |___| |___| |___| |___|	  |	    |___| |___| |___| |___| |___| |___| |___| |___|   |");
		System.out.println("|                                                         |                                                           |");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		if(ii==3) {
			ii=0;
			flag_main=-1;
			resetter(two,1);
		}
		findArdarate(one,two);
		
    }
	public void findArdarate(Player one,Player two) {
		int i=0;
    	int j=0;
    	int tempj=-1;
    	int tempi=-1;
    	while(i<8) {
    		j=0;
    		while(j<8) {
    			if(two.a.grid[i][j]=='@') {
    				tempj=j;
    				tempi=i;
    				break;
    			}
    			j++;
    		}
    		if(tempi!=-1) {
    			break;
    		}
    		i++;
    	}
    	navigate(tempi,tempj,one,two);
	}
	public void navigate(int i,int j,Player one,Player two) {
		System.out.println(ii);
    	while(flag_main==0) {
    		Scanner option = new Scanner(System.in);
        	char temp = option.next().charAt(0);
    		if(temp=='a'||temp=='A') {
        		if(j==0) {
            		if(two.a.grid[i][7]==' ') {
            			two.a.grid[i][j]=' ';
            			two.a.grid[i][7]='@';
            		}
            		else {
            			int aa=7;
            			while(aa>=0) {
            				if(two.a.grid[i][aa]==' ') {
            					two.a.grid[i][aa]='@';
            					two.a.grid[i][j]=' ';
            					break;
            				}
            				aa--;
            			}
            		}
            	}
        		else {
        			if(two.a.grid[i][j-1]==' ') {
        				two.a.grid[i][j]=' ';
        				two.a.grid[i][j-1]='@';
        			}
        			else {
        				int aa=j;
        				int bb=0;
        				while(bb==0) {
        						if(aa==0) {
            						aa=7;
            					}
        						if(two.a.grid[i][aa]==' ') {
        							two.a.grid[i][aa]='@';
        							two.a.grid[i][j]=' ';
        							bb=1;
        							break;
        						}
        						aa--;
        				}
        			}
        		}
        		display(one,two,-1);
        	}
        	else if(temp=='D'||temp=='d') {
        		if(j==7) {
        			if(two.a.grid[i][0]==' ') {
        				two.a.grid[i][j]=' ';
        				two.a.grid[i][0]='@';
        			}
        			else {
        				int aa=0;
        				while(aa<=7) {
        					if(two.a.grid[i][aa]==' ') {
        						two.a.grid[i][aa]='@';
        						two.a.grid[i][j]=' ';
        						break;
        					}
        					aa++;
        				}
        			}
        		}
        		else {
        			if(two.a.grid[i][j+1]==' ') {
        				two.a.grid[i][j+1]='@';
        				two.a.grid[i][j]=' ';
        			}
        			else {
        				int aa=j;
        				int bb=0;
        				while(bb==0) {
        					if(aa==7) {
        						aa=0;
        					}
        					if(two.a.grid[i][aa]==' ') {
        						two.a.grid[i][j]=' ';
        						two.a.grid[i][aa]='@';
        						bb=1;
        					}
        					aa++;
        				}
        				
        			}
        		}
        		display(one,two,-1);
        	}
        	else if(temp=='w'||temp=='W') {
        		if(i==0) {
            		if(two.a.grid[7][j]==' ') {
            			two.a.grid[i][j]=' ';
            			two.a.grid[7][j]='@';
            		}
            		else {
            			int aa=7;
            			while(aa>=0) {
            				if(two.a.grid[aa][j]==' ') {
            					two.a.grid[aa][j]='@';
            					two.a.grid[i][j]=' ';
            					break;
            				}
            				aa--;
            			}
            		}
            	}
        		else {
        			if(two.a.grid[i-1][j]==' ') {
        				two.a.grid[i][j]=' ';
        				two.a.grid[i-1][j]='@';
        			}
        			else {
        				int aa=i;
        				int bb=0;
        				while(bb==0) {
        						if(aa==0) {
            						aa=7;
            					}
        						if(two.a.grid[aa][j]==' ') {
        							two.a.grid[aa][j]='@';
        							two.a.grid[i][j]=' ';
        							bb=1;
        							break;
        						}
        						aa--;
        				}
        			}
        		}
        		display(one,two,-1);
        	}
        	else if(temp=='s'||temp=='S') {
        		if(i==7) {
        			if(two.a.grid[0][j]==' ') {
        				two.a.grid[i][j]=' ';
        				two.a.grid[0][j]='@';
        			}
        			else {
        				int aa=0;
        				while(aa<=7) {
        					if(two.a.grid[aa][j]==' ') {
        						two.a.grid[aa][j]='@';
        						two.a.grid[i][j]=' ';
        						break;
        					}
        					aa++;
        				}
        			}
        		}
        		else {
        			if(two.a.grid[i+1][j]==' ') {
        				two.a.grid[i+1][j]='@';
        				two.a.grid[i][j]=' ';
        			}
        			else {
        				int aa=j;
        				int bb=0;
        				while(bb==0) {
        					if(aa==7) {
        						aa=0;
        					}
        					if(two.a.grid[aa][j]==' ') {
        						two.a.grid[i][j]=' ';
        						two.a.grid[aa][j]='@';
        						bb=1;
        					}
        					aa++;
        				}
        				
        			}
        		}
        		display(one,two,-1);
        	}
        	else if(temp=='x'||temp=='X') {
        		ii++;
        		System.out.println(ii);
        		two.a.grid[i][j]='O';
        		attack_stu=attack_stu+"Shot at ("+i+","+j+")";
        		display(one,two,1);
        	}
        	else if(temp>=48 && temp<=55) {
        		int i1=temp;
        		i1-=48;
        		System.out.println("enter horizontal choice");
        		int j1=option.nextInt();
        		ii++;
        		two.a.grid[i][j1]='O';
        	}
        	else {
        		System.out.println("enter choice from A,S,D,F or vertical choice(btw 0 and 7)");
        		findArdarate(one,two);
        	}
    	}
    	
	}
}

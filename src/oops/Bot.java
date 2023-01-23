package oops;

import java.util.*;
import java.lang.Math;
public class Bot implements attacking{
	Stack<String> stack = new Stack<String>();
	Player bot=new Player();
	Bot(){
		bot.a.grid[0][0]=' ';
		float y=(float) Math.random();
	    y=y*100;
	    int x=(int) y;
	    x=x%4;
		if(x==0) {
			bot.a.grid[0][1]='*';bot.a.grid[0][2]='*';bot.a.grid[0][3]='*';
			bot.a.grid[2][1]='*';bot.a.grid[2][2]='*';bot.a.grid[2][3]='*';bot.a.grid[2][4]='*';bot.a.grid[2][5]='*';
			bot.a.grid[4][2]='*';bot.a.grid[5][2]='*';
			bot.a.grid[4][4]='*';bot.a.grid[5][4]='*';bot.a.grid[6][4]='*';bot.a.grid[7][4]='*';
			bot.a.grid[3][7]='*';bot.a.grid[4][7]='*';bot.a.grid[5][7]='*';
			bot.a.one_5.setPoint(2, 1, 2, 5);
			bot.a.two_4.setPoint(4, 4, 7, 4);
			bot.a.three_3_3.setPoint(3, 7, 5, 7);
			bot.a.three_3_4.setPoint(0, 1, 0, 3);
			bot.a.five_2.setPoint(4, 4, 5, 4);
		}
		else if(x==1) {
			bot.a.grid[0][1]='*';bot.a.grid[1][1]='*';bot.a.grid[2][1]='*';
			bot.a.grid[5][2]='*';bot.a.grid[5][3]='*';bot.a.grid[5][4]='*';bot.a.grid[5][5]='*';bot.a.grid[5][6]='*';
			bot.a.grid[0][6]='*';bot.a.grid[1][6]='*';
			bot.a.grid[1][4]='*';bot.a.grid[2][4]='*';bot.a.grid[3][4]='*';bot.a.grid[4][4]='*';
			bot.a.grid[7][2]='*';bot.a.grid[7][3]='*';bot.a.grid[7][4]='*';
			bot.a.one_5.setPoint(5, 2, 5, 6);
			bot.a.two_4.setPoint(1, 4, 4, 4);
			bot.a.three_3_3.setPoint(0, 1, 2, 1);
			bot.a.three_3_4.setPoint(7, 2, 7, 4);
			bot.a.five_2.setPoint(0, 6, 1, 6);
		}
		else if(x==2) {
			bot.a.grid[3][3]='*';bot.a.grid[3][4]='*';bot.a.grid[3][5]='*';
			bot.a.grid[0][0]='*';bot.a.grid[0][1]='*';bot.a.grid[0][2]='*';bot.a.grid[0][3]='*';bot.a.grid[0][4]='*';
			bot.a.grid[1][6]='*';bot.a.grid[2][6]='*';
			bot.a.grid[7][3]='*';bot.a.grid[7][4]='*';bot.a.grid[7][5]='*';bot.a.grid[7][6]='*';
			bot.a.grid[4][1]='*';bot.a.grid[4][2]='*';bot.a.grid[4][3]='*';
			bot.a.one_5.setPoint(0, 0, 0, 4);
			bot.a.two_4.setPoint(7, 3, 7, 6);
			bot.a.three_3_3.setPoint(3, 3, 3, 5);
			bot.a.three_3_4.setPoint(4, 1, 4, 3);
			bot.a.five_2.setPoint(1, 6, 2, 6);
		}
		else if(x==3) {
			bot.a.grid[3][3]='*';bot.a.grid[4][3]='*';bot.a.grid[5][3]='*';
			bot.a.grid[2][2]='*';bot.a.grid[2][3]='*';bot.a.grid[2][4]='*';bot.a.grid[2][5]='*';bot.a.grid[2][6]='*';
			bot.a.grid[6][0]='*';bot.a.grid[7][0]='*';
			bot.a.grid[3][6]='*';bot.a.grid[4][6]='*';bot.a.grid[5][6]='*';bot.a.grid[6][6]='*';
			bot.a.grid[0][3]='*';bot.a.grid[0][4]='*';bot.a.grid[0][5]='*';
			bot.a.one_5.setPoint(2, 2, 2, 6);
			bot.a.two_4.setPoint(3, 6, 6, 6);
			bot.a.three_3_3.setPoint(3, 3, 5, 3);
			bot.a.three_3_4.setPoint(0, 3, 0, 5);
			bot.a.five_2.setPoint(6, 0, 7, 0);
		}
	}
	public void attack(Player one) {
		int shoots=0;
		int flag=0;
		int flag_3=0;
		String x=stack.pop();
		int one0=x.charAt(0);
		int one1=x.charAt(1);
		one0=one0-48;
		one1=one1-48;
		int i=0;
		int j=0;
		int tempi=-1;
		int tempj=-1;
		int flag_1=0;
		int flag_6=0;
		Attack samp=new Attack();
		while(shoots<3) {
			while(i<8) {
				j=0;
				while(j<8) {
					if(one.a.grid[i][j]=='X') {
						tempi=i;
						tempj=j;
						break;
					}
					j++;
				}
				if(tempi!=-1) {
					break;
				}
				i++;
			}
			if(flag_1!=0) {
				flag=-1;
			}
			if(tempi!=-1 || flag_6==-1 || tempi==-1) {
			int chumma=0;
				while(chumma==0) {
				if(one.a.grid[one0][one1]=='*') {
					one.a.grid[one0][one1]='X';
					shoots++;
					chumma=1;
					break;
				}
				else if(one.a.grid[one0][one1]==' '||one.a.grid[one0][one1]=='@') {
					one.a.grid[one0][one1]='O';
					shoots++;
					chumma=1;
					break;
				}
				else if(one.a.grid[one0][one1]=='#'||one.a.grid[one0][one1]=='O') {
					while(one.a.grid[one0][one1]=='#'||one.a.grid[one0][one1]=='O') {
						x=stack.pop();
						one0=x.charAt(0);
						one1=x.charAt(1);
						one0=one0-48;
						one1=one1-48;
					}
				}
				}
			}
			else {
				 i=0;
				j=0;
				for(i=0;i<8;i++) {
					for(j=0;j<8;j++) {
						if(one.a.grid[i][j]=='*') {
							one.a.grid[i][j]=' ';
						}
					}
				}

					
					i=0;
					while(i<8) {
						j=0;
						while(j<8) {
							if(one.a.grid[i][j]=='X') {
								tempi=i;
								tempj=j;
							}
							j++;
						}
						i++;
					}
						if(one.a.grid[tempi][tempj+1]==' '|| one.a.grid[tempi][tempj+1]=='@') {
							flag=-1;
							one.a.grid[tempi][tempj+1]='O';
							shoots++;
							samp.resetter(one, -1);
						}
						if(one.a.grid[tempi][tempj+1]=='X' && shoots<3) {
							flag=-1;
							int k=tempj+1+1;
							while(k<8 && one.a.grid[tempi][k-1]!='O' && shoots<3) {
								System.out.println("k"+k);
								if(one.a.grid[tempi][k]!='X'&& one.a.grid[tempi][k]!='#') {
								one.a.grid[tempi][k]='O';
								shoots++;
								}
								else {
									break;
								}
								k++;
								samp.resetter(one, -1);
							}
						}
						i=0;
						while(i<8) {
							j=0;
							while(j<8) {
								if(one.a.grid[i][j]=='X') {
									tempi=i;
									tempj=j;
									break;
								}
								j++;
							}
							if(tempi!=-1) {
								break;
							}
							i++;
						}
						if(one.a.grid[tempi][tempj-1]==' '|| one.a.grid[tempi][tempj-1]=='@') {
							flag=-1;
							one.a.grid[tempi][tempj-1]='O';
							shoots++;
							samp.resetter(one, -1);
						}
						if(one.a.grid[tempi][tempj-1]=='X' && shoots<3) {
							flag=-1;
							int k=tempj-1-1;
							while(k>-1 && one.a.grid[tempi][k-1]!='O' && shoots<3) {
								if(one.a.grid[tempi][k]!='X'&& one.a.grid[tempi][k]!='#') {
								one.a.grid[tempi][k]='O';
								shoots++;
								}
								else {
									break;
								}
								k--;
								samp.resetter(one, -1);
							}
						}
						

		}
			flag_6=-1;
	}
		samp.resetter(one, 1);
		shoots=0;
}
}
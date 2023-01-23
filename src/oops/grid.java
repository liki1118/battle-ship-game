package oops;

import java.util.Scanner;
public class grid implements ships,Navigation{
	public String grid_stmu;
	public int one=5;
	public int two=4;
	public int three=3;
	public int four=3;
	public int five=2;
	public point one_5=new point();
	public point two_4=new point();
	public point three_3_3=new point();
	public point three_3_4=new point();
	public point five_2=new point();
	public char[][] grid=new char[8][8];
	public grid() {
		int i=0;
		int j=0;
		while(i<8) {
			j=0;
			while(j<8) {
				grid[i][j]=' ';
				j++;
			}
			i++;
		}
		grid[0][0]='@';
	}
    public void gridDisplay(int n) {
    	int i=0;
    	int j=0;
    	while(j<8) {
    		if(j==0) {
    			System.out.print("   "+j);
    		}
    		else if(j!=0) {
    			System.out.print("     "+j);
    		}
    		j++;
    	}
    	System.out.print("\n");
    	while(i<8) {
    		j=0;
			int k=0;
			while(k<8) {
				System.out.print("  ___ ");
				k++;
			}
			System.out.println("");
    		while(j<8) {
    			
    			System.out.print(" | ");
    			System.out.print(grid[i][j]);
    			System.out.print(" |");
    			j++;
    			}
    		j=0;
			System.out.print("\n");
			int flag=0;
			while(j<8){
			   if(flag==0) {
				   System.out.print(i+"|");
				   flag=-1;
			   }
			   else {
				   System.out.print(" |");
			   }
			System.out.print("___");
			System.out.print("|");
			j++;
			}
			System.out.print("\n");
			flag=0;
	    	i++;
    	}
    	if(one==-1&&two==-1&&three==-1&&four==-1&&five==-1) {
    		System.out.println("Hurray!!!your ship placement has been done");
    		n=-1;
    		int tempk=0;
    		System.out.println("do you want to replace the ships(y/n)");
        	Scanner option = new Scanner(System.in);
        	char tempc = option.next().charAt(0);
        	while(tempk==0) {
        		if(tempc=='Y'||tempc=='y'||tempc=='N'||tempc=='n') {
        			break;
        		}
        		else {
        			System.out.println("Enter the valid option(y/n)");
        			tempc=option.next().charAt(0);
        		}
        	}
        	if(tempc=='y'||tempc=='Y') {
        		remove();
        	}
        	else {
        		grid_stmu=grid_stmu+"Got ready for the battle \n";
        		System.out.println("Get Ready For The Battle");
        		findArdarate(-1);
        	}
    	}
    	if(n==1) {
    		findArdarate(1);
    	}
    }
    public void navigation(int i,int j) {
    	Scanner option = new Scanner(System.in);
    	char temp = option.next().charAt(0);
    	if(temp=='a'||temp=='A') {
    		if(j==0) {
        		if(grid[i][7]==' ') {
        			grid[i][j]=' ';
        			grid[i][7]='@';
        		}
        		else {
        			int aa=7;
        			while(aa>=0) {
        				if(grid[i][aa]==' ') {
        					grid[i][aa]='@';
        					grid[i][j]=' ';
        					break;
        				}
        				aa--;
        			}
        		}
        	}
    		else {
    			if(grid[i][j-1]==' ') {
    				grid[i][j]=' ';
    				grid[i][j-1]='@';
    			}
    			else {
    				int aa=j;
    				int bb=0;
    				while(bb==0) {
    						if(aa==0) {
        						aa=7;
        					}
    						if(grid[i][aa]==' ') {
    							grid[i][aa]='@';
    							grid[i][j]=' ';
    							bb=1;
    							break;
    						}
    						aa--;
    				}
    			}
    		}
    		gridDisplay(1);
    	}
    	else if(temp=='D'||temp=='d') {
    		if(j==7) {
    			if(grid[i][0]==' ') {
    				grid[i][j]=' ';
    				grid[i][0]='@';
    			}
    			else {
    				int aa=0;
    				while(aa<=7) {
    					if(grid[i][aa]==' ') {
    						grid[i][aa]='@';
    						grid[i][j]=' ';
    						break;
    					}
    					aa++;
    				}
    			}
    		}
    		else {
    			if(grid[i][j+1]==' ') {
    				grid[i][j+1]='@';
    				grid[i][j]=' ';
    			}
    			else {
    				int aa=j;
    				int bb=0;
    				while(bb==0) {
    					if(aa==7) {
    						aa=0;
    					}
    					if(grid[i][aa]==' ') {
    						grid[i][j]=' ';
    						grid[i][aa]='@';
    						bb=1;
    					}
    					aa++;
    				}
    				
    			}
    		}
    		gridDisplay(1);
    	}
    	else if(temp=='w'||temp=='W') {
    		if(i==0) {
        		if(grid[7][j]==' ') {
        			grid[i][j]=' ';
        			grid[7][j]='@';
        		}
        		else {
        			int aa=7;
        			while(aa>=0) {
        				if(grid[aa][j]==' ') {
        					grid[aa][j]='@';
        					grid[i][j]=' ';
        					break;
        				}
        				aa--;
        			}
        		}
        	}
    		else {
    			if(grid[i-1][j]==' ') {
    				grid[i][j]=' ';
    				grid[i-1][j]='@';
    			}
    			else {
    				int aa=i;
    				int bb=0;
    				while(bb==0) {
    						if(aa==0) {
        						aa=7;
        					}
    						if(grid[aa][j]==' ') {
    							grid[aa][j]='@';
    							grid[i][j]=' ';
    							bb=1;
    							break;
    						}
    						aa--;
    				}
    			}
    		}
    		gridDisplay(1);
    	}
    	else if(temp=='s'||temp=='S') {
    		if(i==7) {
    			if(grid[0][j]==' ') {
    				grid[i][j]=' ';
    				grid[0][j]='@';
    			}
    			else {
    				int aa=0;
    				while(aa<=7) {
    					if(grid[aa][j]==' ') {
    						grid[aa][j]='@';
    						grid[i][j]=' ';
    						break;
    					}
    					aa++;
    				}
    			}
    		}
    		else {
    			if(grid[i+1][j]==' ') {
    				grid[i+1][j]='@';
    				grid[i][j]=' ';
    			}
    			else {
    				int aa=j;
    				int bb=0;
    				while(bb==0) {
    					if(aa==7) {
    						aa=0;
    					}
    					if(grid[aa][j]==' ') {
    						grid[i][j]=' ';
    						grid[aa][j]='@';
    						bb=1;
    					}
    					aa++;
    				}
    				
    			}
    		}
    		gridDisplay(1);
    	}
    	else if(temp=='x'||temp=='X') {
    		positionAI(i,j);
    	}
    	else if(temp=='r'||temp=='R') {
        	remove();
    	}
    	else {
    		System.out.println("ENter valid input(A,S,W,D,X)");
    		navigation(i,j);
    	}
    }
    public void findArdarate(int z) {
    	int i=0;
    	int j=0;
    	int tempj=-1;
    	int tempi=-1;
    	while(i<8) {
    		j=0;
    		while(j<8) {
    			if(grid[i][j]=='@') {
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
    	if(z==1) {
    	navigation(tempi,tempj);
    	}
    	else {
    		grid[tempi][tempj]=' ';
    	}
    }
    public void positionAI(int i,int j) {
        char len;
    	System.out.println("Enter the ship length(5,4,3,2)");
    	Scanner choice=new Scanner(System.in);
    	len=choice.next().charAt(0);
    	int temp=0;
    	while(temp==0) {
    		if(len=='5'||len=='4'||len=='3'||len=='2') {
    			break;
    		}
    		else {
    			System.out.println("Enter the valid length(5,4,3,2)");
    			len=choice.next().charAt(0);
    		}
    	}
    	int length;
    	length=len;
    	length=len-48;
    	int cho=65;
    	String s1=new String();
    	String s2=new String();
    	String s3=new String();
    	String s4=new String();
    	s1="z";s2="z";s3="z";s4="z";
    	if(i-length+1>=0&&grid[(i-length+1)][j]==' ') {
    		int check=0;
    		int r=i-length+1;
    		while(r<=i) {
    			if(grid[r][j]!=' '&&grid[r][j]!='@') {
    				check++;
    			}
    			r++;
    		}
    		if(check==0) {
    			grid[(i-length+1)][j]=(char) cho;
    			s1=(char) cho+". ("+(i-length+1)+","+j+")";
        		cho++;
    		}
    	}
    	if(j+length-1<=7&&grid[i][(j+length-1)]==' ') {
    		int check=0;
    		int r=j;
    		while(r<=(j+length-1)) {
    			if(grid[i][r]!=' '&&grid[i][r]!='@') {
    				check++;
    			}
    			r++;
    		}
    		if(check==0) {
        		grid[i][(j+length-1)]=(char) cho;
        		s2=(char) cho+". ("+i+","+(j+length-1)+")";
        		cho++;
    		}
    	}
    	if(i+length-1<=7&&grid[(i+length-1)][j]==' ') {
    		int check=0;
    		int r=i;
    		while(r<=(i+length-1)) {
    			if(grid[r][j]!=' '&&grid[r][j]!='@') {
    				check++;
    			}
    			r++;
    		}
    		if(check==0) {
        		grid[(i+length-1)][j]=(char) cho;
        		s3=(char) cho+". ("+(i+length-1)+","+j+")";
        		cho++;
    		}
    	}
    	if(j-length+1>=0&&grid[i][j-length+1]==' ') {
    		int check=0;
    		int r=j-length+1;
    		while(r<=j) {
    			if(grid[i][r]!=' '&&grid[i][r]!='@') {
    				check++;
    			}
    			r++;
    		}
    		if(check==0) {
    			grid[i][(j-length+1)]=(char) cho;
    			s4=(char) cho+". ("+i+","+(j-length+1)+")";
        		cho++;	
    		}
    	}
    	gridDisplay(-1);
    	int flago=0;
    	if(s1!="z") {
    		System.out.println(s1);
    		flago++;
    	}
    	if(s2!="z") {
    		System.out.println(s2);
    		flago++;
    	}
    	if(s3!="z") {
    		System.out.println(s3);
    		flago++;
    	}
    	if(s4!="z") {
    		System.out.println(s4);
    		flago++;
    	}
    	if(flago!=0) {
    		System.out.println("do you want to place the ship(y/n)");
        	Scanner option = new Scanner(System.in);
        	char tempc = option.next().charAt(0);
        	while(temp==0) {
        		if(tempc=='Y'||tempc=='y'||tempc=='N'||tempc=='n') {
        			break;
        		}
        		else {
        			System.out.println("Enter the valid option(y/n)");
        			tempc=option.next().charAt(0);
        		}
        	}
        	if(tempc=='n'||tempc=='N') {
        		if(i-length+1>=0&&(grid[(i-length+1)][j]=='A'||grid[(i-length+1)][j]=='B'||grid[(i-length+1)][j]=='C'||grid[(i-length+1)][j]=='D')) {
            		grid[(i-length+1)][j]=' ';
            	}
            	if(j+length-1<=7&&(grid[i][(j+length-1)]=='A'||grid[i][(j+length-1)]=='B'||grid[i][(j+length-1)]=='C'||grid[i][(j+length-1)]=='D')) {
            		grid[i][(j+length-1)]=' ';
            	}
            	if(i+length-1<=7&&(grid[(i+length-1)][j]=='A'||grid[(i+length-1)][j]=='B'||grid[(i+length-1)][j]=='C'||grid[(i+length-1)][j]=='D')) {
            		grid[(i+length-1)][j]=' ';
            	}
            	if(j-length+1>=0&&(grid[i][j-length+1]=='A'||grid[i][j-length+1]=='B'||grid[i][j-length+1]=='C'||grid[i][j-length+1]=='D')) {
            		grid[i][(j-length+1)]=' ';
            	}
        		gridDisplay(1);
        	}
        	else {
        		System.out.println("Enter the point of the ship to be placed");
        		tempc=option.next().charAt(0);
        		int flag=0;
        		int s,a;
        		while(flag!=-1) {
        			for(s=0;s<8;s++) {
            			for(a=0;a<8;a++) {
            				if(grid[s][a]==tempc||grid[s][a]==(tempc-32)) {
            					flag=-1;
            					int t=0;
            					int y=0;
            					for(t=0;t<8;t++) {
            						for(y=0;y<8;y++) {
            							if(grid[t][y]!='*'&&grid[t][y]!='X'&&grid[t][y]!='#'&&grid[t][y]!='O') {
            								grid[t][y]=' ';
            							}
            						}
            					}
            					shipPostion(i,j,s,a,length);
            					break;
            				}
            			}
            			if(flag!=0) {
            				break;
            			}
            		}
        			if(flag==0) {
        				System.out.println("Enter the valid ship point to be placed");
            			tempc=option.next().charAt(0);
        			}
        		}
        	}
    	}
    	else {
    		System.out.println("There were no possible positions to place this ship");
    		gridDisplay(1);
    	}
    }
	public void shipPostion(int i,int j,int s, int a, int length) {
		if(length==5) {
			if(one==-1) {
				System.out.println("you had placed maximum boat of length "+length);
				grid_stmu=grid_stmu+"tried to place 5 blocked ship again";
			}
			else {
				placer(i,j,s,a,1);
				grid_stmu=grid_stmu+"placed 5 blocks ship at ("+i+","+j+")(staring co-oridnates) ("+s+","+a+")(end co-rdinates) \n";
				one_5.setPoint(i,j,s,a);
				one=-1;
			}
		}
		if(length==4) {
			if(two==-1) {
				System.out.println("you had placed maximum boat of length "+length);
				grid_stmu=grid_stmu+"tried to place 4 blocked ship again";
			}
			else {
				placer(i,j,s,a,1);
				grid_stmu=grid_stmu+"placed 4 blocks ship at ("+i+","+j+")(staring co-oridnates) ("+s+","+a+")(end co-rdinates) \n";
				two_4.setPoint(i,j,s,a);
				two=-1;
			}
		}
		if(length==3) {
			if(three==-1&&four==-1) {
				System.out.println("you had placed maximum boat of length "+length);
				grid_stmu=grid_stmu+"tried to place 3 blocked ship again";
			}
			else {
				placer(i,j,s,a,1);
				if(three!=-1) {
					three_3_3.setPoint(i,j,s,a);
					three=-1;
					grid_stmu=grid_stmu+"placed 3 blocks ship at ("+i+","+j+")(staring co-oridnates) ("+s+","+a+")(end co-rdinates) \n";
				}
				else {
					three_3_4.setPoint(i,j,s,a);
					four=-1;
					grid_stmu=grid_stmu+"placed 3 blocks ship at ("+i+","+j+")(staring co-oridnates) ("+s+","+a+")(end co-rdinates) \n";
				}
			}
		}
		if(length==2) {
			if(five==-1) {
				System.out.println("you had placed maximum boat of length "+length);
				grid_stmu=grid_stmu+"tried to place 2 blocked ship again";
			}
			else {
				placer(i,j,s,a,1);
				five_2.setPoint(i,j,s,a);
				five=-1;
				grid_stmu=grid_stmu+"placed 2 blocks ship at ("+i+","+j+")(staring co-oridnates) ("+s+","+a+")(end co-rdinates) \n";
			}
		}
		ArdaratePosition();
		gridDisplay(1);
	}
	public void placer(int i,int j,int s, int a,int n) {
		if(j==a) {
			if(s<i) {
				while(s<=i) {
					if(n==1) {
					grid[s][j]='*';
					}
					else if(n==-1){
						grid[s][j]=' ';
					}
					s++;
				}
			}
			else if(i<s) {
				while(i<=s) {
					if(n==1) {
					grid[i][j]='*';
					}
					else if(n==-1){
						grid[i][j]=' ';
					}
					i++;
				}
		    }
		}
		else if(i==s) {
			if(a<j) {
				while(a<=j) {
					if(n==1) {
					grid[i][a]='*';
					}
					else if(n==-1){
						grid[i][j]=' ';
					}
					a++;
				}
			}
			else if(j<a) {
				while(j<=a) {
					if(n==1) {
					grid[i][j]='*';
					}
					else if(n==-1){
						grid[i][j]=' ';
					}
					j++;
				}
		    }
		}
	}
	public void ArdaratePosition() {
		int i=0;
		int j=0;
		int flag=0;
		for(i=0;i<8;i++) {
			for(j=0;j<8;j++) {
				if(grid[i][j]==' ') {
					grid[i][j]='@';
					flag=-1;
					break;
				}
			}
			if(flag!=0) {
				break;
			}
		}
	}
	public void remove() {
		System.out.println("ENter length of the ship to be removed");
		Scanner w=new Scanner(System.in);
		int length=w.nextInt();
		int tempi=0;
    	while(tempi==0) {
    		if(length==5||length==4||length==3||length==2) {
    			break;
    		}
    		else {
    			System.out.println("Enter the valid length");
    			length=w.nextInt();
    		}
    	}
    	if(length==5&&one==-1) {
    		int i=one_5.getI();int j=one_5.getJ();int r=one_5.getR();int s=one_5.getS();
    		placer(i,j,r,s,-1);
    		one=5;
    		grid_stmu=grid_stmu+"5 block ship removed \n";
    	}
    	else if(length==4&&two==-1) {
    		int i=two_4.getI();int j=two_4.getJ();int r=two_4.getR();int s=two_4.getS();
    		placer(i,j,r,s,-1);
    		two=4;
    		grid_stmu=grid_stmu+"4 block ship removed \n";
    	}
    	else if(length==3&&three==-1) {
    		int i=three_3_3.getI();int j=three_3_3.getJ();int r=three_3_3.getR();int s=three_3_3.getS();
    		placer(i,j,r,s,-1);
    		if(four==-1) {
    			i=three_3_4.getI();j=three_3_4.getJ();r=three_3_4.getR();s=three_3_4.getS();
        		placer(i,j,r,s,-1);
        		four=3;
    		}
    		three=3;
    		grid_stmu=grid_stmu+"3 block ship removed \n";
    	}
    	else if(length==2&&five==-1) {
    		int i=five_2.getI();int j=five_2.getJ();int r=five_2.getR();int s=five_2.getS();
    		placer(i,j,r,s,-1);
    		five=2;
    		grid_stmu=grid_stmu+"2 block ship removed \n";
    	}
    	else {
    		System.out.println("Your ship of lenght-> "+length+"is not placed yet");
    		grid_stmu=grid_stmu+"tried to remove the non placed ship \n";
    	}
    	gridDisplay(1);
	}
    
}
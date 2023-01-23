package oops;

public class Player {
	public grid a=new grid();
	public void option(int i) {
		if(i==1) {
			a.gridDisplay(1);
		}
		if(i==-1) {
			a.gridDisplay(-1);
		}
	}
	public int count() {
		int i=0;
		int j=0;
		int count=0;
		while(i<=7) {
			 j=0;
			while(j<=7) {
				if(a.grid[i][j]=='#') {
					count++;
				}
				j++;
			}
			i++;
		}
		return count;
	}
}

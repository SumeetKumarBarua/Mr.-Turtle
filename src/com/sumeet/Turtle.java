package com.sumeet;

public class Turtle {
	private Integer xPos=0;
	private Integer yPos=0;
	private Character currentdir='N';
	
	public Integer getxPos() {
		return xPos;
	}
	public void setxPos(Integer xPos) {
		this.xPos = xPos;
	}
	public Integer getyPos() {
		return yPos;
	}
	public void setyPos(Integer yPos) {
		this.yPos = yPos;
	}
	
	
	public Character getCurrentdir() {
		return currentdir;
	}
	public void setCurrentdir(Character currentdir) {
		this.currentdir = currentdir;
	}
	public void changeDirection(Character dir){
		
		if(dir.equals('R'))
		{
			if(this.currentdir.equals('N')){
			
				this.currentdir='E';
			}
			
			else	if(this.currentdir.equals('E')){
				
				this.currentdir='S';		
						}
			
			else	if(this.currentdir.equals('S')){
				
				this.currentdir='W';
			}
			
			else	if(this.currentdir.equals('W')){
				this.currentdir='N';
			}
		}


		if(dir.equals('L'))
		{
			if(this.currentdir.equals('N')){
				this.currentdir='W';
			}
			
			else	if(this.currentdir.equals('W')){
				this.currentdir='S';		
						}
			
			else	if(this.currentdir.equals('S')){
				this.currentdir='E';
			}
			
			else	if(this.currentdir.equals('E')){
				this.currentdir='N';
			}
		}
		
	}

	public void move(){
		Integer x=this.xPos;
		Integer y=this.yPos;
	
		if(this.currentdir.equals('N')){
			y+=1;
		}
		 if(this.currentdir.equals('E')){
			x+=1;
		}
		 if(this.currentdir.equals('S')){
			y-=1;
		}
		 if(this.currentdir.equals('W')){
			x-=1;
		}
	
		 if(x>=0 && y>=0){	
			this.xPos=x;
			this.yPos=y;
		 }
	}

}

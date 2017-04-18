package com.sumeet;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Turtle tur=new Turtle();
		Arena arena=new Arena(4, 4);
		String s="FFFFFFFFFRRFLF";
		String s1[]=s.split("");
		
		for (String str : s1) {
		
			if(str.equals("F")){
				if((tur.getxPos()>=arena.getxPos() || tur.getyPos()>=arena.getyPos())){
					System.out.println("1"+str);
						continue;
					}
				else{
				tur.move();
				}
			}
			else if(str.equals("R") || str.equals("L")){
				tur.changeDirection(str.charAt(0));
			}
			else
			continue;
			
			//System.out.println(tur.getxPos()+"  "+tur.getyPos()+"  "+tur.getCurrentdir());
		}
		
		
		
		
		System.out.println((tur.getxPos()+1)+"  "+(tur.getyPos()+1)+"  "+tur.getCurrentdir());
		
		
		
		

	}

}

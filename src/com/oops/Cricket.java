package com.oops;

public class Cricket {

	private static final int fourRun = 4;
    //Instance	Variables	- constitute	the	state	of	an	object
	private int score;
	//Behavior	- all	the	methods	that	are	part	of	the	class
	//An	object	of	this	type	has	behavior	based	on	the	
	//methods	four,	six	and	getScore
	public void four(){
					score =	score +	fourRun;
	}
	
	public void six(){
					score =	score +	6;
	}
	
	public int getScore()	{
					return score;
	}
	
	public static void main(String[]	args)	{
					Cricket	scorer	=	new Cricket();
					scorer.six();
					//State	of	scorer	is	(score	=>	6)
					scorer.four();
					//State	of	scorer	is	(score	=>	10)
					System.out.println(scorer.getScore());
	}
}


package com.estuate;

public class Cricket {

	private int id;
	private String player_name;
	private String  role;
	private int runs;
	private int wickets;
	public Cricket(int id, String player_name, String role, int runs, int wickets) {
		super();
		this.id = id;
		this.player_name = player_name;
		this.role = role;
		this.runs = runs;
		this.wickets = wickets;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public Cricket() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Hi my id is "+id +"\n I am "+player_name+"\n my role is "+role +"\n I scored "+runs+" runs" +"\n I have taken "+wickets +" wickets";
	}
	
}

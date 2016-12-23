package fcu.iecs.oop.pokemon;

public class Pokemon implements Fightable {
	
	private String nickname;
	private PokemonType type;
	private int cp;
	
	public Pokemon( String nickname, PokemonType type, int cp ) {
		super();
		this.nickname = nickname;
		this.type = type;
		this.cp = cp;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public PokemonType getType() {
		return type;
	}
	
	public int getCp() {
		return cp;
	}
	
	public void setNickname( String nickname ) {
		this.nickname = nickname;
	}
	
	public void setCp( int cp ) {
		this.cp = cp;
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
}

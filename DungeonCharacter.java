//Dungeon Character class written by Nicholas Valentine

public abstract class DungeonCharacter
{
	private int hitPoints;
	private int strength;
	private int dextarity;
	private int stamina;
	//etc)
	private String name;
	AttackType attacktype;
	SpecialAttack special;
	
	public DungeonCharacter()
	{
		this.hitPoints = 0;
		this.strength = 0;
		this.dextarity = 0;
		this.stamina = 0;
		this.name = "derp";
	}
	public DungeonCharacter(int hp, int str, int dex, int stam, String tempName)
	{
		this.hitPoints = hp;
		this.strength = str;
		this.dextarity = dex;
		this.stamina = stam;
		this.name = tempName;
	}
	
	public void attack(DungeonCharacter defender)
	{
		attacktype.attack(defender);
	}
	
	public void special(DungeonCharacter defender)
	{
		special.SpecialAttack(defender);
	}
	
	public void modifyHealth(int damage)
	{
		this.hitPoints -= damage;
	}
	
	public int getHealth()
	{
		return hitPoints;
	}
}
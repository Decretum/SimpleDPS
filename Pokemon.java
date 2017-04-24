
public class Pokemon {
	
	Move qMove;
	Move cMove;
	int energy;
	int damage;
	int cooldown;
	
	public Pokemon( Move q, Move c ) {
		qMove = q;
		cMove = c;
		energy = 0;
		damage = 0;
		cooldown = 0;
	}
	
	public Pokemon( Move q, Move c, int startEnergy ) {
		qMove = q;
		cMove = c;
		energy = startEnergy;
		damage = 0;
		cooldown = 0;
	}
	
	public int attack() {
		if ( cooldown == 0 ) {
			if ( energy >= cMove.energy ) {
				damage += cMove.damage;
				cooldown = cMove.delay;
				energy -= cMove.energy;
			} else {
				damage += qMove.damage;
				cooldown = qMove.delay;
				energy += qMove.energy;
			}
		} else {
			cooldown--;
		}
		return damage;
	}
	

}

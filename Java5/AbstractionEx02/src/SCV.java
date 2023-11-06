
public class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint  = MAX_HP;
	}
	
	void repair(Repairable r) {
		if( r instanceof Unit ) {
			Unit u = (Unit)r;
			while(u.hitPoint != MAX_HP	 ) {
				u.hitPoint;
			}
		}
	}
}

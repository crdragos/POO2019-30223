package javasmmr.zoowsome.models.animals;

public class Monkey extends Mamal {
	
		public Monkey(double maintenanceCost, double dangerPerc) {
			super(maintenanceCost, dangerPerc);
			this.setName("kingKong");
			this.setNormalBodyTemp(36);
			this.setNrOfLegs(4);
			this.setPercBodyHair(100);
		}
		
		public boolean kill() {
			double randomNr = Math.random();
			if (randomNr < this.getDangerPerc()) {
				return true;
			} else {
				return false;
			}
		}
	
}

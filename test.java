public class test {
    
	public static void main( String[] args ) {
		Move bite = new Move( 6, 5, 4 );
		Move stoneedge = new Move( 100, 23, 100 );
		Move crunch = new Move( 70, 32, 33 );
		
		Move dbreath = new Move( 6, 5, 4 );
		Move dtail = new Move( 15, 11, 9 );
		Move dclaw = new Move( 50, 17, 33 );
		Move outrage = new Move( 110, 39, 50 );
		Move hurricane = new Move( 110, 27, 100 );
		
		// Testing B/SE and B/Crunch Ttar
		// Testing DB/DC, DT/Outrage, and DT/Hurricane Dnite at 328 ATT
		
		Pokemon[] list = new Pokemon[5];
		list[0] = new Pokemon( bite, stoneedge, 81 );
		list[1] = new Pokemon( bite, crunch, 81 );
		list[2] = new Pokemon( dbreath, dclaw, 74 );
		list[3] = new Pokemon( dtail, outrage, 74 );
		list[4] = new Pokemon( dtail, hurricane, 74 );
		
		for ( int clock = 0; clock < 1000; clock++ ) {
			System.out.printf( "%3d00ms", clock );
			for ( int x = 0; x < list.length; x++ ) {
				System.out.printf( "%5d ", list[x].attack() );
			}
			System.out.println();
		}
		
		
	}
}

package javaofclassic.chapter12.enumex;

enum Direction { EAST, SOUTH, WEST, NORTH }

class Ex12_5 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1="+d1);   //d1=EAST
        System.out.println("d2="+d2);   //d2=WEST
        System.out.println("d3="+d3);   //d3=EAST

        System.out.println("d1==d2 ? "+ (d1==d2));  // d1==d2 ? false
        System.out.println("d1==d3 ? "+ (d1==d3));  // d1==d3 ? true
        System.out.println("d1.equals(d3) ? "+ d1.equals(d3));  // d1.equals(d3) ? true
//		System.out.println("d2 > d3 ? "+ (d1 > d3)); // 에러
        System.out.println("d1.compareTo(d3) ? "+ (d1.compareTo(d3))); // d1.compareTo(d3) ? 0
        System.out.println("d1.compareTo(d2) ? "+ (d1.compareTo(d2)));  // d1.compareTo(d2) ? -2

        switch(d1) {
            case EAST: // 출력
                System.out.println("The direction is EAST."); break;
            case SOUTH:
                System.out.println("The direction is SOUTH."); break;
            case WEST:
                System.out.println("The direction is WEST."); break;
            case NORTH:
                System.out.println("The direction is NORTH."); break;
            default:
                System.out.println("Invalid direction."); break;
        }

        Direction[] dArr = Direction.values();

        for(Direction d : dArr)  // for(Direction d : Direction.values())
            System.out.printf("%s=%d%n", d.name(), d.ordinal());

        /*
        EAST=0
        SOUTH=1
        WEST=2
        NORTH=3
        */
    }
}

// STAR PATTERNS ASSIGNMENT

public class Main
{
	public static void main(String[] args) {

	    System.out.println("TELUSKO IN STAR PATTERN\n");

	    for(int r=1;r<=7;r++) {
            for (int c = 1; c <= 61; c++) {

                

                if (c <= 7) {                                          // T

                    if (r == 1 || c == 4) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

                if (c == 8 || c == 9) System.out.print("  ");         // space

                if (c >= 10 && c <= 16) {                             // E
                    if (r == 1 || r == 4 || r == 7 || c == 10) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

                if (c == 17 || c == 18) System.out.print("  ");        // space

                if (c >= 19 && c <= 25) {                              // L
                    if (r == 7 || c == 19) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

                if (c == 26 || c == 27) System.out.print("  ");       // space

                if (c >= 28 && c <= 34) {                             // U
                    if (r == 7 || c == 28 || c == 34) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

                if (c == 35 || c == 36) System.out.print("  ");     // space

                if (c >= 37 && c <= 43) {                           // S
                    if (r == 7 || r == 1 || r == 4 || (r < 4 && c == 37) || (r > 4 && c == 43)) {
                        System.out.print("* ");
                    } 
                    else {
                        System.out.print("  ");
                    }
                }

                if (c == 44 || c == 45) System.out.print("  ");     // space

                if (c >= 46 && c <= 52) {                            // K
                    if (c == 46 || ((r ==1||r==7) && c == 52) || ((r == 2 || r==6) && c == 50) || ((r ==3|| r==5) && c == 48) || (r==4  && c==47) ){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }

                if (c == 53 || c == 54) System.out.print("  ");      // space

                if (c >= 55) {                                      // O
                    if (c == 55 || c == 61 || r == 1 || r == 7) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

        System.out.println("\nINEURON IN STAR PATTERN\n");

        for(int r=1;r<=7;r++) {
            for (int c = 1; c <= 61; c++) {
                int i=r;
                int j=c;

                if (c <= 7) {                                           // I

                    if (r == 1 || c == 4 || r==7) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                
                 if (c == 8 || c == 9) System.out.print("  ");          // space

                if (c >= 10 && c <= 16) {                               // N
                    if ( j==9+i || c == 16 || c == 10) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

                if (c == 17 || c == 18) System.out.print("  ");         // space

                if (c >= 19 && c <= 25) {                               // E
                    if (r == 7 || c == 19 ||r==1 || r==4) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

                if (c == 26 || c == 27) System.out.print("  ");         // space

                if (c >= 28 && c <= 34) {                               // U
                    if (r == 7 || c == 28 || c == 34) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

                if (c == 35 || c == 36) System.out.print("  ");         // space

                if (c >= 37 && c <= 43) {                               // R
                    if (c == 37 || r== 1 || r==4 || (r <= 4 && c == 43) || (r ==7 && c == 43) ||(r ==6 && c == 41) ||(r ==5 && c==39) ){System.out.print("* ");} 
                    else {
                        System.out.print("  ");
                    }
                }

                if (c == 44 || c == 45) System.out.print("  ");         // space

                if (c >= 46 && c <= 52) {                               // O
                    if (c == 46 || r==1 || c==52 || r==7){
                        System.out.print("* ");}
                    else {
                        System.out.print("  ");
                    }
                }

                if (c == 53 || c == 54) System.out.print("  ");         // space

                if (c >= 55) {                                          // N
                    if (c == 55 || c == 61 || j==54+i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
		
		
	}
}

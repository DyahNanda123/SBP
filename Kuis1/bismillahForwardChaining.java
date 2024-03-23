public class bismillahForwardChaining {
    static boolean faktaA = true;
    static boolean faktaE = true;
    static boolean faktaB, faktaC, faktaD, faktaF, faktaG, faktaH, faktaI, faktaJ, faktaK;

    public static void main(String[] args) {
        forwardChaining();

        System.out.println("Fakta : A dan E");
        System.out.println("Aturan:");
        
        System.out.println("R1: If A and B then C");
        System.out.println("R2: If C then D");
        System.out.println("R3: If A and E then F");
        System.out.println("R4: If A then G");
        System.out.println("R5: If F and G then D");
        System.out.println("R6: If G and E then H");
        System.out.println("R7: If C and H then I");
        System.out.println("R8: If I and A then J");
        System.out.println("R9: If G then J");
        System.out.println("R10: If J then K");
        
        System.out.println("\nHasil Forward Chaining:");

        System.out.println("Apakah K bernilai benar? " + faktaK);
    }

    public static void forwardChaining() {
        // Implementasi aturan-aturan sebagai if 
        if (faktaA = true) {
            faktaC = true && faktaG == true; // menggunakan aturan R1 dan R4
        }
        if (faktaC = true ) { 
            faktaD = true; // menggunakan aturan R2
        }
        if (faktaE = true) { 
            faktaF = true; // menggunakan aturan R3
        }
        if (faktaF = true) {
            faktaD = true; // menggunakan aturan R5
        }
        if (faktaG = true) {
            faktaH = true & faktaJ == true; // menggunakan aturan R6 dan R9
        }
        if (faktaH = true) {
            faktaI = true; // menggunakan aturan R7
        }
        if (faktaI = true) {
            faktaJ = true; // menggunakan aturan R8
        }
        if (faktaJ = true) {
            faktaK = true; // menggunakan aturan R10
        }
    }
}

public class Main {

    public static void main(String[] args) {
        BigArray bigboye = new BigArray();
        Element[] giganticArray = bigboye.getArray();

        printInstructions();

        int count = 1;

        for (Element cation : giganticArray) {
            if (cation.getCharge() > 0) {
                for (Element anion : giganticArray) {
                    if (anion.getCharge() < 0) {
                        System.out.println("#" + count + ": " + findSymbol(cation, anion) + ": " + findName(cation, anion));
                        count++;
                    }
                }
            }
        }
    }

    public static void printInstructions() {
        System.out.println("welcome to my crappy attempt at automating this");
        System.out.println("if you want to add a new element, declare a new one and add it to the array");
        System.out.println("formatting follows: [symbol][subscript][symbol][subscript]");
    }

    // returns symbol string in form (
    public static String findSymbol(Element cation, Element anion) {
        int cationCharge = cation.getCharge();
        int anionCharge = anion.getCharge() * -1;
        
        int commonMultiple = lcm(cation.getCharge(), anion.getCharge());
        
        // this breaks sometimes and I don't know why
        if (commonMultiple < 0) {
            commonMultiple *= -1;
        }
        
        int cationSubscript = commonMultiple / cationCharge;
        int anionSubscript = commonMultiple / anionCharge;

        String foo = "";

        // messy way of checking coefficients, but it works
        if (cationSubscript > 1 && anionSubscript > 1) {
            foo = cation.getSymbol() + cationSubscript + anion.getSymbol() + anionSubscript;
        } else if (anionSubscript > 1) {
            foo = cation.getSymbol() + anion.getSymbol() + anionSubscript;
        } else if (cationSubscript > 1) {
            foo = cation.getSymbol() + cationSubscript + anion.getSymbol();
        } else {
            foo = cation.getSymbol() + anion.getSymbol();
        }

        return foo;
    }

    public static String findName(Element cation, Element anion) {
        return cation.getName() + " " + anion.getIdeName();
    }

    // everything below is a straight rip from googling "java lcm stack overflow". credit to their respective authors.
    public static int lcm(int a, int b) {
        return (a * b) / gcf(a, b);
    }

    public static int gcf(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return (gcf(b, a % b));
        }
    }
}

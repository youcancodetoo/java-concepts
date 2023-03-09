public class Comparisons {

    public static void main(String[] args) {
        System.out.println("#############################################");
        compareEqualEqualAndEquals();
        System.out.println("#############################################");
    }

    private static void compareEqualEqualAndEquals(){
        System.out.println("Comparison: == vs .equals()\n");

        System.out.println("--------------------");
        /*
         * == VS .equals()
         * Case - 1: Constant Pool
         */
        String constObj1 = "abc";
        String constObj2 = "abc";
        System.out.println("constObj1 is '"+constObj1+"' and constObj2 is '"+constObj2+"'");
        System.out.println("constObj1 == constObj2 : "+(constObj1 == constObj2));
        System.out.println("constObj1.equals(constObj2) : "+(constObj1.equals(constObj2)));

        System.out.println("--------------------");
        /*
         * == VS .equals()
         * Case - 1: Not using Constant Pool
         */
        String obj1 = "def";
        String obj2 = new String("def");
        System.out.println("obj1 is '"+obj1+"' and obj2 is new String(\"def\")");
        System.out.println("obj1 == obj2 : "+(obj1 == obj2));
        System.out.println("obj1.equals(obj2) : "+(obj1.equals(obj2)));

        System.out.println("--------------------");
        System.out.println("\nConclusion:");
        System.out.println("== compares values as well as objects");
        System.out.println("equals() compares only values of two objects");
    }
}

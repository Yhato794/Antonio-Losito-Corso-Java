public class Outerclass {

    int x = 10;
    String ciao = "Ciao";

    private class Innerclass {
        int y = 5;
        String ciaone = "Ciaone";

        public class returnx {
            public int returnVar() {
                return x;
            }
        }

    }

    // public static void main(String[] args) {
    //     Outerclass out = new Outerclass();
    //     Outerclass.Innerclass in = out.new Innerclass();
    //     Outerclass.Innerclass.returnx x= in.new returnx();
    //     System.out.println(out.x + in.y);
    //     System.out.println(out.ciao + " " + in.ciaone);
    // }
}
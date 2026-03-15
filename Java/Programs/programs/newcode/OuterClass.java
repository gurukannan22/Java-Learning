package programs.newcode;

public class OuterClass {
    int tDate = 30112025;
    static class Inner{
        int yDate = 29112025;
        static class SubInner{
            int dBYDate = 28112025;
        }
    }

    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        System.out.println(oc.tDate);

        OuterClass.Inner in = new Inner();
        System.out.println(in.yDate);

        OuterClass.Inner.SubInner si = new Inner.SubInner();
        System.out.println(si.dBYDate);


    }
}

public class LambdaClass {
    int a;

    public static void main(String[] args) {
        LambdaClass obj = new LambdaClass();
        System.out.println(obj.a);
        FuncInter funcInter = new FuncInter() {
            @Override
            public int print(int eded1, int eded2) {
                System.out.println(eded1);
                System.out.println(eded2);
                return eded1 + eded2;
            }
        };
        int a = 17;
        System.out.println(funcInter.print(3, 4));
        FuncInter funcInter1 = (eded1, eded2) -> {
            System.out.println(eded1);
            System.out.println(eded2);
            return eded1 + eded2 + a;
        };
        System.out.println(funcInter1.print(3, 4));
    }
}

package inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(4);
//        System.out.println(box.l+" "+ box.h+" "+ box.w);
        BoxWeight b1=new BoxWeight();
        BoxWeight b2=new BoxWeight(2,3,4,5);
        System.out.println(b2.l+" "+ b2.h+" "+ b2.w+" "+b2.weight);
    }
}

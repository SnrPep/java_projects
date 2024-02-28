public class TestShape {
    public static void main(String[] args){
        Ball sh1 = new Ball(5);
        Cylinder sh2 = new Cylinder(5, 5);
        Pyramid sh3 = new Pyramid(5, 6);
        Pyramid sh4 = new Pyramid(6, 10);
        Ball sh5 = new Ball(7);
        Ball sh6 = new Ball(8);
        Ball sh7 = new Ball(9);
        Ball sh8 = new Ball(10);
        Ball sh9 = new Ball(11);
        Ball sh10 = new Ball(12);

        Box box = new Box(1000);
        box.add(sh1);
        box.add(sh2);
        box.add(sh3);
        box.add(sh4);
        box.add(sh5);
        box.add(sh6);
        box.add(sh7);
        box.add(sh8);
        box.add(sh9);
        box.add(sh10);
    }
}

 class animal{
    final void characteristics(){
        int legs=4;
        int ears=2;
        int eyes=2;
        int tail=1;
        System.out.println("General Characteristics of an Animal are:");
        System.out.println("Legs:"+legs);
        System.out.println("Eyes:"+eyes);
        System.out.println("Ears:"+ears);
        System.out.println("Tail:"+tail);
    }
}
public class dog extends animal {
    final void sound(){
System.out.println();
        System.out.println("Additional CHaracteristics");
        System.out.println("sound: Bhow Bhow");
    }
    public static void main(String[] args) {
        dog d = new dog();
        d.characteristics();
        d.sound();
    }
    
}

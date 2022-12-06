public class bsp1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        
        //Der logische und-Operator sorgt dafür das eine Bedingung nur wahr ist wenn beide Teilbedingungen wahr sind
        if (a == 0 && b == 1) {
            System.out.println("beide Bedingungen sind wahr");
        }

        //Der logische oder-Operator sorgt dafür das eine Bedingung wahr ist wenn mindestens eine Teilbedingungen wahr ist
        if (a == 0 || b ==20) {
            System.out.println("Mindestens eine Bedingung ist wahr");
        }

        //Der Inkrementor vor Ausführung ++a vergrößert eine Zahl und führt dann eine Operation(z.B. println) oder einen vergleich(z.B. ==) durch
        if (++a==2) {
            System.out.println("Die Variable a wurde vor Prüfung der Bedingung um eins erhöht");

            a = 1;
        }
        System.out.println(++a);
        a = 1;

        //Der Inkrementor nach Ausführung a++ vergrößert eine Zahl nachdem eine Operation(z.B. println) oder einen vergleich(z.B. ==) durchgeführt wurde
        if (a++==1) {
            System.out.println("Die Variable a wurde nach Prüfung der Bedingung um eins erhöht");
            System.out.println(a);
            a=1;
        }
        System.out.println("A wird nach Ausführung " + a++);
        System.out.println(a);

        //Die Dekrementoren --a und a-- verhalten sich genauso
    }
}

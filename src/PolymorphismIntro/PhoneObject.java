package PolymorphismIntro;

import MyUtils.GenericUtils;

import java.lang.management.GarbageCollectorMXBean;

public class PhoneObject {
    public static void main(String[] args) {
        Iphone iphoneMax = new Iphone("Iphone13 Max",1400.0);

        System.out.println(iphoneMax);
        iphoneMax.texting(5402829857l);
        iphoneMax.downloadApp();
        iphoneMax.iMessage(15402829857l);

        GenericUtils.StarSeparation();

        Samsung SamsungGalaxy = new Samsung("Samsung Galaxys22",1200.0);
        System.out.println(SamsungGalaxy);
        SamsungGalaxy.texting(15402829857l);
        SamsungGalaxy.calling(5402829857l);
        SamsungGalaxy.downloadApp();
        SamsungGalaxy.helloSamsung();
    }
}

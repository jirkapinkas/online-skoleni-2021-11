package cz.java.skoleni.helloworld;

import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {
        String ucetSPaddingem = StringUtils.leftPad("123456/5050", 20, "0");
        System.out.println(ucetSPaddingem);
        System.out.println("hello world funguje!!!");
    }

}

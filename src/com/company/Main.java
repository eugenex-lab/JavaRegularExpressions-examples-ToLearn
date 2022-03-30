package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String string_reverse = ("Hello World");
        // string.matches("[a-zA-Z]+")
        boolean f = string_reverse.matches("Hello World.");
//        System.out.println(f);


        String w = "Hello wE IN HERE FFuck off we in this bitch ";
        // replace spaces with e
        String w1 = w.replaceAll(" ", "XX");
//        System.out.println(w1);

        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));
// match the string using regex


        String regEXp = "I want a \\w+."; // \\w+ is a word
        System.out.println(challenge1.matches(regEXp));
        String challenge2 = "I want a ball.";
        System.out.println(challenge2.matches(regEXp));

        System.out.println("******$$$***");

        String regExp1 = "I want a (bike|ball).";
        System.out.println(challenge1.matches(regExp1));
        System.out.println(challenge2.matches(regExp1));

        System.out.println("******$$$***");

        String regExp3 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());


        System.out.println("******$$$***");

        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches() + matcher.group());

        System.out.println("******$$$***");

        String challenge5 = "zaaabccccccccdddefffg";
        System.out.println(challenge5.matches("^za{3}bc{8}d{3}ef{3}g$"));


        System.out.println("****************$$$******************");
        System.out.println(challenge5.matches("^za{3}bc{8}d{3}ef{3}g$"));
        System.out.println(challenge5.replaceAll("^za{3}bc{8}d{3}ef{3}g$", "REPLACED"));

        System.out.println("****************$$$******************");
        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^[A-z][a-z]+\\.\\d+$"));

        System.out.println("****************$$$******************");

        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern9 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher9 = pattern9.matcher(challenge9);
//        System.out.println(matcher9.matches());   // true
        while (matcher9.find()) {
            System.out.println(matcher9.group(1));
        }
        System.out.println(challenge9.matches("[A-Za-z]+\\.(\\d+)\\s"));
        while(matcher9.find()) {
            System.out.println("Occurrence: " + matcher9.group(1));
        }

        System.out.println("****************$$$******************");


        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern10 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher10 = pattern10.matcher(challenge10);
        while(matcher10.find()) {
            System.out.println("Occurrence: start = " + matcher10.start(1) + " end = " + (matcher10.end(1) -1));
        }

        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher11 = pattern11.matcher(challenge11);
        while(matcher11.find()) {
            System.out.println("Occurrence: " + matcher11.group(1));
        }
        System.out.println("*********************");


        String challenge11a = "{0, 2}, {0, 5}, {1, 3}, {2, 4} {x, y}, {6, 34}, {11, 12}";
        Pattern pattern11a = Pattern.compile("\\{(\\d+, \\d+)\\}");
        Matcher matcher11a = pattern11a.matcher(challenge11a);
        while(matcher11a.find()) {
            System.out.println("Occurrence: " + matcher11a.group(1));
        }


        String challenge12 = "11111";
        /// print matches for true
        System.out.println(challenge12.matches("^[1-9]\\d*$")); // true

        String challenge13 = "11111-11111";
        /// print prints for true
        System.out.println(challenge13.matches("^\\d{5}-\\d{5}$")); // true

        System.out.println(challenge12.matches("^\\d{5}(-\\d{4})?$"));
        System.out.println(challenge13.matches("^\\d{5}(-\\d{5})?$"));

    }
}

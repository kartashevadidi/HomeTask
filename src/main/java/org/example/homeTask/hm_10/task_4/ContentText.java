package org.example.homeTask.hm_10.task_4;

public class ContentText {
    public static void main(String[] args) {
        String text = "While major gameplay components are already in place and functioning, players help is needed to add some of the smaller features and content. Of course polishing the overall experience is important at the same time. Game has been extensively tested in closed group, but it is always important to hear fresh suggestions from larger crowd that come from various gaming backgrounds. Plan is to make the game as good as possible but without compromising the core idea.";
        String[] words = text.split(" ");

        int addCount = 0;
        int goodCount = 0;
        int alertCount = 0;
        int planCount = 0;

        for (String word : words) {
            if (word.contains("alert")) {
                ++alertCount;
                System.out.println("alert count = " + alertCount);
            }
            if (word.contains("add")) {
                ++addCount;
                System.out.println("add count = " + addCount);
            }
            if (word.contains("good")) {
                ++goodCount;
                System.out.println("good count = " + goodCount);
            }
            if (word.contains("plan")) {
                ++planCount;
                System.out.println("plan count = " + planCount);
            }
        }

    }
}

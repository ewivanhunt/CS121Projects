package weekTwo;

import javax.swing.*;

public class WordGame {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age"));
        String cityname = JOptionPane.showInputDialog(null, "Enter your city");
        String collegename = JOptionPane.showInputDialog(null, "Enter your college");
        String majorname = JOptionPane.showInputDialog(null, "Enter your major");
        String animalname = JOptionPane.showInputDialog(null, "Enter your animal");
        String petname = JOptionPane.showInputDialog(null, "Enter your pet name");

        String story = generateStory(name, age, cityname, collegename, majorname, animalname, petname);
        JOptionPane.showMessageDialog(null, story, "Generated Story", JOptionPane.INFORMATION_MESSAGE);
    }
    public static String generateStory(String name, int age, String cityname, String collegename, String majorname, String animalname, String petname) {
        String story = "There once lived a person named " + name + " who lived in " + cityname + ". ";
        story += "At the age of " + age + ", " + name + " went to college at " + collegename + ". ";
        story += name + "graduated with a " + majorname + ". ";
        story += "Then, " + name + " adopted a(n) " + animalname + " named " + petname + ". ";
        story += "They both lived happily ever after.";

        return story;

    }
}

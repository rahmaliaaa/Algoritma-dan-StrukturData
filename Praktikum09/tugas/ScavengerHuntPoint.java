package tugas;
import java.util.Scanner;

public class ScavengerHuntPoint {
    private String question;
    private String answer;
    private ScavengerHuntPoint nextPoint;
    private ScavengerHuntPoint prevPoint;

    public ScavengerHuntPoint(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.nextPoint = null;
        this.prevPoint = null;
    }
    public String getQuestion() {
        return question;
    }
    public String getAnswer() {
        return answer;
    }
    public void setNextPoint(ScavengerHuntPoint nextPoint) {
        this.nextPoint = nextPoint;
    }
    public ScavengerHuntPoint getNextPoint() {
        return nextPoint;
    }
    public void setPrevPoint(ScavengerHuntPoint prevPoint) { //double linked list
        this.prevPoint = prevPoint;
    }
    public ScavengerHuntPoint getPrevPoint() { //double linked list
        return prevPoint;
    }
    public boolean checkAnswer(String playerAnswer) {
        return answer.equalsIgnoreCase(playerAnswer);
    }
}


public class ScavengerHuntPoint {
    private String question;
    private String answer;
    private ScavengerHuntPoint nextPoint;

    public ScavengerHuntPoint(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.nextPoint = null;
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
    public boolean checkAnswer(String playerAnswer) {
        return answer.equalsIgnoreCase(playerAnswer);
    }
}


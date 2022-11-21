public enum Week {
    PONIDELNIK("On Monday I have Java lesson.") ,
    VTORNIK("On Tuesday I have English.");
    private String lessons;

    Week(String lessons) {
        this.lessons = lessons;
    }

    public String getLessons() {
        return lessons;
    }

    public void setLessons(String lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Week{" +
                "lessons='" + lessons + '\'' +
                '}'+super.toString();
    }
}

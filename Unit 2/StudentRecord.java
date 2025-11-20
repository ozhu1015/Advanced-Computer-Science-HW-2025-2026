public class StudentRecord {
    // instance variables
    private String name;
    private int[] scores;

    // constructors
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // getters
    // to-do: implement getters
    // to-do: implement getTestScore

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // inherited methods
    // to-do: implement toString
    public String toString() {
        String string = name + "'s scores: [";
        for (int i = 0; i < scores.length - 1; i++) {
            string += scores[i] + ", ";
        }
        string += scores[scores.length - 1] + "]";
        return string;
    }

    // methods
    public boolean equals(StudentRecord other) {
        for (int i = 0; i < scores.length; i++) {
            if (this.scores[i] == other.scores[i]) {
                continue;
            } else {
                return false;
            }
        }
        if (this.name.equals(other.name)) {
            return true;
        } else {
            return false;
        }
    }

    public double getAverage(int first, int last) {
        double sum = 0;
        for (int i = first; i <= last; i++) {
            sum += scores[i];
        }
        return sum / (last - first + 1);
    }

    public int getTestScore(int testNumber) {
        if (0 > testNumber || testNumber >= scores.length) {
            return -1;
        }
        return scores[testNumber];
    }

    /*
     * returns the average (arithmetic mean) of the values in scores
     * precondition: 0 <= first < last < scores.length
     * 
     * @param first - the first index of the scores array
     * 
     * @param last - the last index of the scores array
     * 
     * @return the double average of the values in scores
     */

    /*
     * Determines if each successive value in scores is greater
     * than or equal to the previous value
     * 
     * @return true if student has improved, false otherwise
     */
    public boolean hasImproved() {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] <= scores[i + 1]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    /*
     * The method determines if the student has improved and returns the average
     * score appropriately:
     * If the student has improved, returns the average
     * of the top half of the scores array.
     * Otherwise, returns the average of all of the values in scores
     * 
     * @return the double average of test scores
     */

    public double getFinalAverage() {
        if (this.hasImproved()) {
            return this.getAverage(scores.length / 2, scores.length - 1);
        } else {
            return this.getAverage(0, scores.length - 1);
        }
    }

}
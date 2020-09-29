import java.util.ArrayList;
import java.util.Collections;

public class Student extends Person{

    private ArrayList<Integer> test_score = new ArrayList<Integer>();
    private int test_count=0;

    Student(String name){
        super(name);
    }

    public int getTest_count() {
        return test_count;
    }

    public void setTest_score(ArrayList<Integer> test_score) {
        this.test_score = test_score;
    }

    public ArrayList<Integer> getTest_score(){
        return test_score;
    }

    /**
     * addTestScore() methode adds a score in the test scores array for the student
     * and increments the counter of the taken test
     *
     * @author Valentina Gjorgjieska
     * @version 1.0
     * @since 2020-09-29
     */
    public void addTestScore(int score){
        test_score.add(test_count,score);
        test_count++;
    }

    /**
     * @return The average number of the test scores for the student
     * calculated by summing the scores of the tests and dividing with the number of scores
     *
     * @author Valentina Gjorgjieska
     * @version 1.0
     * @since 2020-09-29
     */
    public float averageTestScore(){
        float averageScore=0;
        int sum=0;
        //if the array is not empty
        if(test_score.size()!=0){
            //sum all the test scores from the array list
            for (int i = 0; i < test_count; i++) {
                sum += test_score.get(i);
            }
            //calculate average number by dividing the sum of the test scores from the array list
            // by the number of elements
            averageScore = (float) sum / test_count;
        }
        return averageScore;
    }

    /**
     * @return The median of the test scores for the student
     * calculated by ordering array list of the scores in ascending order and finding the middle element of the array
     * for odd number of elements and for even number of elements calculating the average of the two middle elements
     *
     * @author Valentina Gjorgjieska
     * @version 1.0
     * @since 2020-09-29
     */
    public float medianTestScore(){
        float medianScore=0;
        //if the array is not empty
        if(test_score.size()!=0){
            //order the array list in a ascending order
            Collections.sort(test_score);
            //even number of elements in the array list
            if (test_count % 2 == 0) {
                medianScore = test_score.get(test_count / 2 - 1) + test_score.get(test_count / 2);
                medianScore = medianScore / 2;
            }
            //odd number of elements in the array list
            else {
                int i = test_count / 2;
                medianScore = (float) test_score.get(i);
            }
        }
        return  medianScore;
    }
}

public class PracticeClass
{
    private String Question1;
    private String Option1;
    private String Option2;
    private String Option3;
    private String Option4;
    char answerA= 'A', answerB = 'B', answerC = 'C', answerD = 'D';
    char correctAnswer;
  
    public PracticeClass(String first, String choose1, String choose2, String choose3, String choose4)
    {
        Question1 = first;
        Option1 = choose1;
        Option2 = choose2;
        Option3 = choose3;
        Option4 = choose4;
    }
    public void print ()
    {
        System.out.println (Question1);
        
    
    }
}

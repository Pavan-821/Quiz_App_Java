import java.util.*;
public class QuestionService {
    String Select[]=new String[3];
    Question[] questions=new Question[3];
    public QuestionService(){
        questions[0]=new Question(1, "What is captial of India?", "1.Delhi", "2.New Delhi" , "3.Mumbai", "4.Chennai", "2");
        questions[1]=new Question(2, "Who is Prime minister of India", "1.Indira Gandhi", "2.Abdul Kalam", "3.Narendra Modi", "4.Rahul Gandhi", "3");
        questions[2]=new Question(3, "Where is India gate is located?", "1.Mumbai", "2.New Delhi", "3.Chennai", "4.Visakhapatnam", "2");
    }
    public void PlayQuiz(){
        int i=0;
        for(Question q:questions){
            System.out.println("Question no: "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner s=new Scanner(System.in);
            Select[i]=s.nextLine();
            i++;

        }
        for(String s: Select){
            System.out.println(s);
        }
    }
    public void printScore()
    {
        int score=0;
        for(int i=0;i<questions.length;i++){
            Question que=questions[i];
            String answer=que.getAnswer();
            String Useranswer=Select[i];
            if(answer.equals(Useranswer)){
                score++;
            }
        }
        System.out.println("Score is: "+score);
    }
}
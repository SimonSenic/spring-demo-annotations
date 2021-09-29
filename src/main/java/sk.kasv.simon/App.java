package sk.kasv.simon;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach myCoach = context.getBean("tennisCoach", Coach.class);
        System.out.println(myCoach.getDailyWorkout() +" " +myCoach.getDailyFortune());
        context.close();
    }
}

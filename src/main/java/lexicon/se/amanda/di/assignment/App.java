package lexicon.se.amanda.di.assignment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lexicon.se.amanda.di.assignment.config.ComponentScanConfig;
import lexicon.se.amanda.di.assignment.data_access.StudentDao;
import lexicon.se.amanda.di.assignment.util.UserInputService;

public class App 
{
    public static void main( String[] args )
    {
        
    	AnnotationConfigApplicationContext context = 
    			new AnnotationConfigApplicationContext(ComponentScanConfig.class);
    	
    	//StudentDao studentDao = context.getBean(StudentDao.class);
    	
    	UserInputService userInputService = context.getBean(UserInputService.class);
    	
    	System.out.println(userInputService.getInt());
    	
    	context.close();
    }
}

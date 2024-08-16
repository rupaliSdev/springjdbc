package jdbcConfig.com.springjdbc;


import jdbcConfig.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentDao studentDao=  ctx.getBean("studentDao",StudentDao.class);
        System.out.println(studentDao.getAllStudents());

    }
}


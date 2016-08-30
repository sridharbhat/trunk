import java.io.File;  
import java.util.List;  
  
import javax.xml.bind.JAXBContext;  
import javax.xml.bind.JAXBException;  
import javax.xml.bind.Unmarshaller;  
   
public class Db2 {  
    public static void main(String[] args) {  
   
     try {  
   
        File file = new File("C:\\PSI\\Tickets\\R82\\Auto_deployments\\GetDBdetails\\login-config.xml");  
        JAXBContext jaxbContext = JAXBContext.newInstance(Db1.class);  
   
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
        Db1 que= (Db1) jaxbUnmarshaller.unmarshal(file);  
          
        System.out.println(que.getAuthentication());  
        System.out.println("Answers:");  
        /*List<Answer> list=que.getAnswers();  
        for(Answer ans:list)  
          System.out.println(ans.getId()+" "+ans.getAnswername()+"  "+ans.getPostedby());  */
   
      } catch (JAXBException e) {  
        e.printStackTrace();  
      }  
   
    }  
}  

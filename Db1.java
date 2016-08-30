import java.util.List;  
  
import javax.xml.bind.annotation.XmlAttribute;  
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;  
  
@XmlRootElement  
public class Db1 {  
private String authentication;  
//private String questionname;  
//private List moduleoptionname;  
public Db1() {}  
public Db1(String authentication, String questionname, List moduleoptionname) {  
    super();  
    this.setAuthentication(authentication);  
  //  this.questionname = questionname;  
   //// this.setModuleoptionname(moduleoptionname);  
}
@XmlAttribute 
public String getAuthentication() {
	return authentication;
}
public void setAuthentication(String authentication) {
	this.authentication = authentication;
}
//@XmlAttribute 
/*public List getModuleoptionname() {
	return moduleoptionname;
}
public void setModuleoptionname(List moduleoptionname) {
	this.moduleoptionname = moduleoptionname;
}  
*/
  
}  
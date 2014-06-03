package tutorial;
import com.opensymphony.xwork2.ActionSupoort;
public class Justatry extends Actionsupport;{
	public final static String MESSAGE="Struts2 is up and running ...";
	private string message;
	public String getMessage(){
		return message;
	}
	public void setMessage(String message){
		this.message=message;
	}
	public String execute() throws Exception{
		setMessage(MESSAGE);
		return SUCCESS;
	}
}

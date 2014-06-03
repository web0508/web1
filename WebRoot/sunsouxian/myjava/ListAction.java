import javax.servlet.http.HttpServletRequest;

public class ListAction extends Action{
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response)
	String pageString=request.getParameter("page");
	if(pageString==null||pageString.length()==0){
		pageString="1";
	}
}
int currentPage=0;
try{
	currentPage=Integer.parseInt(pageString);//µ±Ç°Ò³Âë
} catch(Exception e) {}
if(currentPage==0){
	currentPage=1;
}

int pageSize=3;

List<Student>users=manage.findPageAll(currentPage,pageSize);
request.setAttribute("users",users);
request.setAttribute("currentPage",currentPage);
return mapping.findForward("display");
}
private IStudentManager manager;
public IStudentManager getManager(){
	return manager;
}
public void setManager(IStudentManager manager){
	this.manager=manager;
}


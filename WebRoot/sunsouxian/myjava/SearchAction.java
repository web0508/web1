public class SearchAction extends Action {public ActionForward execute(ActionMapping mapping, ActionForm form,

HttpServletRequest request, HttpServletResponse response) {

List<Student> users = manager.findStudentByUsername(request.getParameter(

"username"));if(users == null) {request.setAttribute("message", "�Ҳ����û���Ϣ");

return mapping.findForward("error");

}

request.setAttribute("users",users);// �����û��б�return mapping.findForward("result");}

private IStudentManager manager;

public IStudentManager getManager() {

return manager;}public void setManager(IStudentManager manager) {

this.manager = manager;

}

}
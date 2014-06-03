public class SearchAction extends Action {public ActionForward execute(ActionMapping mapping, ActionForm form,

HttpServletRequest request, HttpServletResponse response) {

List<Student> users = manager.findStudentByUsername(request.getParameter(

"username"));if(users == null) {request.setAttribute("message", "找不到用户信息");

return mapping.findForward("error");

}

request.setAttribute("users",users);// 保存用户列表return mapping.findForward("result");}

private IStudentManager manager;

public IStudentManager getManager() {

return manager;}public void setManager(IStudentManager manager) {

this.manager = manager;

}

}
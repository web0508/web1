public class DeleteAction extends Action {

public ActionForward execute(ActionMapping mapping, ActionForm form,

HttpServletRequest request, HttpServletResponse response) {

try {

int id = Integer.parseInt(request.getParameter("id"));

Student student = manager.findById(id);

if(manager.delete(student)) {

return mapping.findForward("list");

}

} catch (Exception e) { }request.setAttribute("message", "无法删除用户。");return mapping.findForward("error");

}

private IStudentManager manager;

public IStudentManager getManager() {return manager;}public void setManager(IStudentManager manager) {this.manager = manager;

}

}
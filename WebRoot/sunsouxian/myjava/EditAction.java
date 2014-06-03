public ActionForward execute(ActionMapping mapping, ActionForm form,

HttpServletRequest request, HttpServletResponse response) {

try {

int id = Integer.parseInt(request.getParameter("id"));

Student student = manager.findById(id);

if(student != null) {

request.setAttribute("student", student);

return mapping.findForward("edit");

}} catch (Exception e) {}

request.setAttribute("message", "��ѡ����Ч���û������޸ġ�");

return mapping.findForward("error");

}

private IStudentManager manager;

public IStudentManager getManager() {return manager;}

public void setManager(IStudentManager manager) {

this.manager = manager;

}

}
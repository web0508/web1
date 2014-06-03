public class SaveAction extends Action {

public ActionForward execute(ActionMapping mapping, ActionForm form,

HttpServletRequest request, HttpServletResponse response) {

StudentForm studentForm = (StudentForm) form;

try {

int id = studentForm.getId();

Student student = manager.findById(id);

if(student != null) {

student.setAge(studentForm.getAge());

student.setUsername(studentForm.getUsername());

student.setPassword(studentForm.getPassword());

if(manager.update(student)) {return mapping.findForward("list");

} else {request.setAttribute("message", "�û���Ϣ����ʧ��");}

} else {request.setAttribute("message", "Ҫ�޸ĵ��û�������"); }

} catch (Exception e) {request.setAttribute("message", "�û���Ϣ����ʧ��:" + e);}

return mapping.findForward("error");

}private IStudentManager manager;public IStudentManager getManager() {

return manager;

}

public void setManager(IStudentManager manager) {

this.manager = manager;

}

}
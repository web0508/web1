public class NewAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response){
		StudentForm studentForm=(StudentForm) form;
		try {
			StudentForm studentForm=new Student();
			student.setAge(studentForm.getAge());
			student.setUsername(studentForm.getUsername());
			student.setPassword(studentForm.getPassword());

			if(manager.save(student)) {

			return mapping.findForward("list");

			} else {
            request.setAttribute("message", "�û���Ϣ����ʧ�ܡ�");
			}

			} catch (Exception e) {

			request.setAttribute("message", "�û���Ϣ����ʧ��:" + e);

			}
		    return mapping.findForward("error");
	}

			private IStudentManager manager;
			public IStudentManager getManager() {
				return manager;
			}

			public void setManager(IStudentManager manager) {
				this.manager = manager;
			}
}
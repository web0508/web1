function checkForm(form){
	if(form.username.value==""){
		alert("姓名不能为空，请重新输入！")
		form.username.focus();
		return false;
	}
}
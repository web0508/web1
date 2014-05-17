    package com.action;  
      
    import com.opensymphony.xwork2.ActionSupport;  
      
    public class dataactionld extends ActionSupport {  
        private String username;  
        private String usersex;  
        private String userphone;
        private String reMsg; //返回消息 在登录成功或者失败页面显示；  
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
			System.out.print(username);
		}
		public String getUsersex() {
			return usersex;
		}
		public void setUsersex(String usersex) {
			this.usersex = usersex;
		}
		public String getUserphone() {
			return userphone;
		}
		public void setUserphone(String userphone) {
			this.userphone = userphone;
		}
		public String getReMsg() {
			return reMsg;
		}
		public void setReMsg(String reMsg) {
			this.reMsg = reMsg;
		}
          
       
      
   
    }  
package com.wipro.sample;

public class HelloWorld {
        private String msg;

		public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}
        public void disp()
        {
        	System.out.println(this.msg);
        }
}


package org.bs.front.pojo.user;


import java.io.Serializable;

public class CityBean implements Serializable {
	private static final long serialVersionUID = 2454822677199984181L;
           
	     private   Integer  id;
	     
	     private   String   name;
	     
	     private   String   code;
	     
	     private   Integer  pid;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public Integer getPid() {
			return pid;
		}

		public void setPid(Integer pid) {
			this.pid = pid;
		}

	@Override
	public String toString() {
		return "CityBean{" +
				"id=" + id +
				", name='" + name + '\'' +
				", code='" + code + '\'' +
				", pid=" + pid +
				'}';
	}
}

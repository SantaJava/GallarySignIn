package model;

import java.util.Date;

public class Member {
	private String userId;
	private String password;
	private String cellPhone;
	private String email;
	private String address;
	private String name;
	private Date regDate;
	private Date updateDate;

	public Member() {
		super();
	}

	public Member(String name, String userId, String password, String cellPhone, String email, String address, Date regDate,
			Date updateDate) {
		super();
		this.name = name;
		this.userId = userId;
		this.password = password;
		this.cellPhone = cellPhone;
		this.email = email;
		this.address = address;
		this.regDate = regDate;
		this.updateDate = updateDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public static class Builder { // 내부 클래스 : static이 안붙으면 바깥 인스턴스가 있는거고 붙으면 독립적인 부분.
		// 디폴트 생성자 자동 배정.
		private String userId;
		private String password;
		private String cellPhone;
		private String email;
		private String address;
		private String name;

		private Date regDate;
		private Date updateDate;

		// setter만 가져온다. Builder 를 통해 method chaining이 가능해짐.
		public Builder setUserId(String userId) {
			this.userId = userId;
			return this;
		}

		public Builder setPassword(String password) {
			this.password = password;
			return this;
		}

		public Builder setCellPhone(String cellPhone) {
			this.cellPhone = cellPhone;
			return this;
		}

		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}

		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}

		public Builder setRegDate(Date regDate) {
			this.regDate = regDate;
			return this;
		}

		public Builder setUpdateDate(Date updateDate) {
			this.updateDate = updateDate;
			return this;
		}
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Member build() {
			
			return new Member(name, userId, password, cellPhone, email, address, regDate, updateDate);
		}

	}
}

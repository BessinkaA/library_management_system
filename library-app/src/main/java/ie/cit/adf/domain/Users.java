package ie.cit.adf.domain;

import java.util.UUID;

public class Users {
	
		private String userId;
		private String userName;
		private String userAddress;
		private String userCity;
		private String userRegistrationDate;

		public Users() {
			this.userId = UUID.randomUUID().toString();
		}

		
		public String getUserId() {
			return userId;
		}


		public void setUserId(String userId) {
			this.userId = userId;
		}


		public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}


		public String getUserAddress() {
			return userAddress;
		}


		public void setUserAddress(String userAddress) {
			this.userAddress = userAddress;
		}


		public String getUserCity() {
			return userCity;
		}


		public void setUserCity(String userCity) {
			this.userCity = userCity;
		}


		public String getUserRegistrationDate() {
			return userRegistrationDate;
		}


		public void setUserRegistrationDate(String userRegistrationDate) {
			this.userRegistrationDate = userRegistrationDate;
		}


		@Override
		public String toString() {
			return "Users [user id=" + userId + ", user name=" + userName
					+ ", user address=" + userAddress + ",user city=" + userCity
					+ ",user registration date=" + userRegistrationDate + "]";
		}
	
}

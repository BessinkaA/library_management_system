package ie.cit.adf.domain;

import java.util.UUID;

public class Users {
	
		private String user_id;
		private String user_name;
		private String user_street_address;
		private String user_city;
		private String user_registration_date;

		public Users() {
			this.user_id = UUID.randomUUID().toString();
		}

		
		public String getUser_id() {
			return user_id;
		}


		public void setUser_id(String user_id) {
			this.user_id = user_id;
		}


		public String getUser_name() {
			return user_name;
		}


		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}


		public String getUser_street_address() {
			return user_street_address;
		}


		public void setUser_street_address(String user_street_address) {
			this.user_street_address = user_street_address;
		}


		public String getUser_city() {
			return user_city;
		}


		public void setUser_city(String user_city) {
			this.user_city = user_city;
		}


		public String getUser_registration_date() {
			return user_registration_date;
		}


		public void setUser_registration_date(String user_registration_date) {
			this.user_registration_date = user_registration_date;
		}


		@Override
		public String toString() {
			return "Users [user id=" + user_id + ", user name=" + user_name
					+ ", user address=" + user_street_address + ",user city=" + user_city
					+ ",user registration date=" + user_registration_date + "]";
		}
	
}

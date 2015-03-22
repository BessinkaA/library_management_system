package ie.cit.adf.domain;

import java.util.UUID;

public class Transactions {
	
	private String transaction_id;
	private String transaction_type;
	private String transaction_date;

	public Transactions() {
		this.transaction_id = UUID.randomUUID().toString();
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	public String getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(String transaction_date) {
		this.transaction_date = transaction_date;
	}

	@Override
	public String toString() {
		return "Transactions [transaction_id=" + transaction_id
				+ ", transaction_type=" + transaction_type
				+ ", transaction_date=" + transaction_date + "]";
	}
}

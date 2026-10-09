package collections;

import java.util.Objects;

public class SubscriberManager {
	private int id;
	private String name;
	private String email;
	private String plan;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public SubscriberManager(int id, String name, String email, String plan) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.plan = plan;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, name, plan);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SubscriberManager other = (SubscriberManager) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(plan, other.plan);
	}

	@Override
	public String toString() {
		return "SubsciberManager [id=" + id + ", name=" + name + ", email=" + email + ", plan=" + plan + "]";
	}

}

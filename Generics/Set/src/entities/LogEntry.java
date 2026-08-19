package entities;

import java.time.Instant;
import java.util.Objects;

public class LogEntry {
	String user;
	Instant entry;
	
	public LogEntry() {
		
	}

	public LogEntry(String user, Instant entry) {
		this.user = user;
		this.entry = entry;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Instant getEntry() {
		return entry;
	}

	public void setEntry(Instant entry) {
		this.entry = entry;
	}

	@Override
	public int hashCode() {
		return Objects.hash(user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(user, other.user);
	}

	
}

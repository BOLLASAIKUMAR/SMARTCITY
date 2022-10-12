package SMARTCITYPROJECT;

public class AIR_LINE
{
private String name;
private String visa;
private String source;
private String destination;
private long dob;
private String email;
private long phn;
private long pay;
private int seats;

public int getSeats() {
	return seats;
}
public void setSeats(int seats) {
	this.seats = seats;
}
public AIR_LINE()
{
	
}
public AIR_LINE(String name, String visa, String source, String destination, long dob, String email, long phn,
		long pay, int seats) {
	super();
	this.name = name;
	this.visa = visa;
	this.source = source;
	this.destination = destination;
	this.dob = dob;
	this.email = email;
	this.phn = phn;
	this.pay = pay;
	this.seats = seats;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getVisa() {
	return visa;
}

public void setVisa(String visa) {
	this.visa = visa;
}

public String getSource() {
	return source;
}

public void setSource(String source) {
	this.source = source;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public long getPay() {
	return pay;
}

public void setPay(long pay) {
	this.pay = pay;
}
public long getDob() {
	return dob;
}
public void setDob(long dob) {
	this.dob = dob;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhn() {
	return phn;
}
public void setPhn(long phn) {
	this.phn = phn;
}

}

package lambdaExpression;

public class Member {
private String name;
private String id;
private Address address;

public Member(String name,String id, Address adrress) {
 this.name = name;
 this.id = id;
 this.address = address;
}
public String getName() {return name;}
public String getId() {return id;}
public Address getAddress() {return address;}
}

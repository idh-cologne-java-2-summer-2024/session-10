package idh.java;

public class Student {
    String name;
    int id;
    
    static int lastId;

    public Student(String name) {
	this.id = lastId++;
	this.name = name;
    }

    @Override
    public String toString() {
	return this.name + " (Id: " + this.id + ")";
    }

}

package org.example.serialization;

import java.io.*;

public class Serial implements Serializable{

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student= new Student("Surila","smail@gmail.com",30,"Pune");
        FileOutputStream fileOutputStream= new FileOutputStream("src/main/java/org/example/serialization/abc.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Object state serialized ");

        FileInputStream fileInputStream= new FileInputStream("src/main/java/org/example/serialization/abc.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Student student1=(Student)objectInputStream.readObject();

        student1.display();
        System.out.println("Object deserialized");
        System.out.println(student1);





    }
}

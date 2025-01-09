package main.java.org.anup.generics.ex2;

/*public class Box {

    public Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}*/

//Before generics, we can store any type of objects in the collection, i.e., non-generic.
// Now generics force the java programmer to store a specific type of objects.

//Generic types allow you to define a class, interface, or method with placeholders (type parameters) for the data types they will work with.
// This enables code reusability and type safety,
// as it allows you to create classes, interfaces, or methods that can operate on various types without needing to rewrite the code for each type.
public class Box<T>{

    public T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

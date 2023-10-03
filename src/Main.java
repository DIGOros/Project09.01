// 1. Demonstrate the creation of a new class and its object.
class MyClass {
}

// 2. Demonstrate a class with a public method and its call.
class MyClassWithMethod {
    public void print(String s) {
        System.out.println(s);
    }
}

// 3. Demonstrate a class with a private method.
class MyClassWithPrivateMethod {
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}

// 4. Demonstrate the use of a constructor. Use a print to the console inside the constructor.
class MyClassWithConstructor {
    public MyClassWithConstructor() {
        System.out.println("Constructor called.");
    }
}

// 5. Demonstrate public properties of various data types.
class MyClassWithPublicProperties {
    public int intValue = 10;
    public double doubleValue = 3.14;
    public boolean booleanValue = true;
    public String stringValue = "Hello, World!";

    public void displayValues() {
        System.out.println("int: " + intValue);
        System.out.println("double: " + doubleValue);
        System.out.println("boolean: " + booleanValue);
        System.out.println("String: " + stringValue);
    }
}

// 6. Demonstrate private properties.
class MyClassWithPrivateProperties {
    private int intValue = 10;
    private double doubleValue = 3.14;
    private boolean booleanValue = true;
    private String stringValue = "Hello, World!";

    public void displayValues() {
        System.out.println("int: " + intValue);
        System.out.println("double: " + doubleValue);
        System.out.println("boolean: " + booleanValue);
        System.out.println("String: " + stringValue);
    }
}

// 7. Create getters and setters for several private properties (int, double, boolean, String).
class MyClassWithGettersSetters {
    private int intValue;
    private double doubleValue;
    private boolean booleanValue;
    private String stringValue;

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public boolean isBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
}

// 8. Demonstrate the use of constructors with arguments. Create corresponding objects.
class MyClassWithConstructorArgs {
    private int intValue;
    private double doubleValue;
    private boolean booleanValue;
    private String stringValue;

    public MyClassWithConstructorArgs(int intValue, double doubleValue, boolean booleanValue, String stringValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
        this.booleanValue = booleanValue;
        this.stringValue = stringValue;
    }

    public void displayValues() {
        System.out.println("int: " + intValue);
        System.out.println("double: " + doubleValue);
        System.out.println("boolean: " + booleanValue);
        System.out.println("String: " + stringValue);
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Object creation
        MyClass obj1 = new MyClass();

        // 2. Object creation and method call
        MyClassWithMethod obj2 = new MyClassWithMethod();
        obj2.print("print it");

        // 3. Object creation (private method cannot be called outside the class)
        MyClassWithPrivateMethod obj3 = new MyClassWithPrivateMethod();

        // 4. Object creation with constructor (constructor is called during object creation)
        MyClassWithConstructor obj4 = new MyClassWithConstructor();

        // 5. Object creation and access to public properties
        MyClassWithPublicProperties obj5 = new MyClassWithPublicProperties();
        System.out.println("Accessing properties through object:");
        System.out.println("int: " + obj5.intValue);
        System.out.println("double: " + obj5.doubleValue);
        System.out.println("boolean: " + obj5.booleanValue);
        System.out.println("String: " + obj5.stringValue);
        obj5.displayValues();

        // 6. Object creation and access to private properties (inside the class)
        MyClassWithPrivateProperties obj6 = new MyClassWithPrivateProperties();
        obj6.displayValues();

        // 7. Object creation with getters and setters
        MyClassWithGettersSetters obj7 = new MyClassWithGettersSetters();
        obj7.setIntValue(42);
        obj7.setDoubleValue(2.718);
        obj7.setBooleanValue(true);
        obj7.setStringValue("Hello, Getters and Setters!");
        System.out.println("int: " + obj7.getIntValue());
        System.out.println("double: " + obj7.getDoubleValue());
        System.out.println("boolean: " + obj7.isBooleanValue());
        System.out.println("String: " + obj7.getStringValue());

        // 8. Object creation with constructor arguments
        MyClassWithConstructorArgs obj8 = new MyClassWithConstructorArgs(42, 2.718, true, "Constructor Args");
        obj8.displayValues();
    }
}

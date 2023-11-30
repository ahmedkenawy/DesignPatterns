# Design Patterns
Welcome to the Design Patterns Repository! 🎨✨

This repository serves as a comprehensive resource for understanding and implementing software design patterns. Design patterns are proven solutions to common problems encountered in software design and development. Whether you're a seasoned developer looking to enhance your design skills or a newcomer eager to grasp fundamental design concepts, this repository has you covered.

## Key Features:

-   **In-Depth Documentation:** Explore detailed explanations, use cases, and implementation examples for a variety of design patterns.
    
-   **Diagrams and Visualizations:** Visualize design patterns with clear diagrams to enhance understanding.
    
-   **Code Samples:** Find practical code samples in multiple programming languages, making it easy to apply these patterns in your projects.
    
-   **Real-world Examples:** Discover real-world scenarios where these patterns are commonly applied, providing insights into their practical utility.

## Contents:

-   Creational Patterns: Patterns that deal with object creation mechanisms.
-   Structural Patterns: Patterns that focus on the composition of classes or objects.
-   Behavioral Patterns: Patterns that define communication between classes and objects.

## How to Contribute:

We encourage contributions! If you have a new design pattern, an improvement, or a correction, feel free to submit a pull request.


## Lets Start....

  **Creational Design Pattern**
Creational design patterns deal with the process of object creation in software design. They provide mechanisms for creating objects in a manner that is flexible, efficient, and promotes decoupling of the client code from the objects being created. Creational design patterns often involve abstraction of the instantiation process, allowing a system to be independent of how its objects are created, composed, and represented.

Here are some common creational design patterns:

1.  **Singleton Pattern:**
    -   Ensures that a class has only one instance and provides a global point of access to it. It is useful when exactly one object is needed to coordinate actions across the system.
2.  **Factory Method Pattern:**   
    -   Defines an interface for creating an object but lets subclasses alter the type of objects that will be created. It provides an interface for creating instances of a class, with its subclasses deciding which class to instantiate.
3.  **Abstract Factory Pattern:**
    -   Provides an interface for creating families of related or dependent objects without specifying their concrete classes. It is useful when a system must be independent of how its objects are created, composed, and represented.
4.  **Builder Pattern:**
    -   Separates the construction of a complex object from its representation, allowing the same construction process to create various representations. It is particularly useful when an object needs to be constructed with numerous possible configurations.
5.  **Prototype Pattern:**
    -   Creates new objects by copying an existing object, known as the prototype. It is useful when the cost of creating a new instance of an object is more expensive than copying an existing instance.

Each creational design pattern addresses specific concerns related to object creation, instantiation, and composition. The choice of which pattern to use depends on the requirements and constraints of the specific problem at hand. These patterns help improve code flexibility, maintainability, and the overall design of the system.

 ## 1-Singleton Design Pattern
   
   
The Singleton Design Pattern ensures that a class has only one instance and provides a global point of access to that instance. It is a creational pattern that is often used when exactly one object is needed to coordinate actions across the system, such as a configuration manager, logging service, or a connection pool.

Here are the key features and characteristics of the Singleton Design Pattern:
1.  **Single Instance:**
    -   The Singleton pattern ensures that a class has only one instance and provides a global point of access to it.
2.  **Global Access Point:**
        -   It provides a global point of access to the single instance, making it easy to reach from anywhere in the application.
3.  **Lazy Initialization:**
    -   The instance is usually created only when it is first needed (lazy initialization). This helps improve performance by avoiding unnecessary instantiation.
4.  **Private Constructor:**
    -   The Singleton class typically has a private constructor to prevent direct instantiation from outside the class.
5.  **Static Instance Method:**
    -   The class often provides a static method (e.g., `getInstance()`) that returns the singleton instance. This method is responsible for creating the instance if it does not exist.

**~~life_without_singleton🤬~~**

    public  class  Authentication {
    // No static variable for a single instance  
    public  Authentication(){ 
    // Constructor can be used for instantiation
    }
    // No getInstance method  
    // Other methods and properties as needed }
Now you can create instances of `Authentication` using its public constructor:

    Authentication auth1 = new Authentication();
    Authentication auth2 = new Authentication();
    
    // auth1 and auth2 are independent instances

life with Singleton 💕
explore creational package / singleton package

 ## 2-Factory Desing Pattern
 
The Factory Method Design Pattern is a creational pattern that provides an interface for creating objects in a super class but allows subclasses to alter the type of objects that will be created. It falls under the broader category of creational design patterns, which deal with object creation mechanisms.

### Key Components:

1.  **Product:**
    
    -   This is the interface or abstract class that declares the interface for the objects created by the factory method.
2.  **ConcreteProduct:**
    
    -   This is the implementation of the Product interface. It represents the actual object that the factory method creates.
3.  **Creator:**
    
    -   This is the abstract class or interface that declares the factory method. It may also contain other methods for creating products.
4.  **ConcreteCreator:**
    
    -   This is the subclass of Creator that implements the factory method to create an instance of a ConcreteProduct.

### How It Works:

1.  **Product Interface:**
    
    -   Define an interface or abstract class (Product) that represents the type of objects the factory method will create.
2.  **ConcreteProduct Implementations:**
    
    -   Create one or more classes (ConcreteProduct) that implement the Product interface, representing the specific types of objects to be created.
3.  **Creator Interface or Abstract Class:**
    
    -   Declare an interface or abstract class (Creator) that includes the factory method signature. This method returns an instance of the Product.
4.  **ConcreteCreator Implementation:**
    
    -   Implement a class (ConcreteCreator) that extends the Creator and provides the specific implementation of the factory method, creating an instance of a ConcreteProduct.
 
 ~~life-without-factory🤬~~

    // Without Factory Method Pattern
    // Report interface
    interface Report {
    void generate();
    }
    // ConcreteReport implementations
    class PDFReport implements Report {
    public void generate() {
        System.out.println("Generating a PDF report");
    }
    }
    class ExcelReport implements Report {
    public void generate() {
        System.out.println("Generating an Excel report");
    }
    }
    // Client code directly creates report instances
    
    public class ClientWithoutFactory {
    public static void main(String[] args) {
        Report pdfReport = new PDFReport();
        pdfReport.generate();  // Output: Generating a PDF report

        Report excelReport = new ExcelReport();
        excelReport.generate();  // Output: Generating an Excel report
    }
    }

In this example, the client code directly creates instances of `PDFReport` and `ExcelReport` to generate reports. Similar to the previous vehicle example, this approach has drawbacks:

1.  **Direct Instantiation:**
    
    -   The client code needs to know the concrete classes (`PDFReport` and `ExcelReport`) and instantiate them directly.
2.  **Tight Coupling:**
    
    -   The client code is tightly coupled to the specific implementations of the reports. If new report types are introduced, the client code needs to be modified.
3.  **Scalability Issues:**
    
    -   As the application grows, managing report creation in a centralized way becomes challenging. If there are changes in the report generation process, modifications must be made throughout the client code.

The Factory Method pattern can be applied to address these issues, allowing for more flexibility in adding new report types and promoting better code organization.

life with Factory 💕 
explore creational package / factory package


## 3-Abstart Factory Pattern

 
 The Abstract Factory Design Pattern is a creational pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. It involves a set of interfaces for creating various products, and each concrete factory is responsible for producing objects of a particular kind within the product family.

### Key Components:

1.  **AbstractProduct:**
    
    -   This is the interface or abstract class that declares the interface for a type of product in the product family.
2.  **ConcreteProduct:**
    
    -   This is the implementation of the AbstractProduct interface. It represents the actual object that the abstract factory creates.
3.  **AbstractFactory:**
    
    -   This is the interface or abstract class that declares the factory methods for creating the abstract products. It represents the abstract factory that creates a family of products.
4.  **ConcreteFactory:**
    
    -   This is the implementation of the AbstractFactory interface. It provides concrete implementations for creating products of a specific kind within the product family.

### How It Works:

1.  **AbstractProduct Interface:**
    
    -   Define interfaces or abstract classes (AbstractProduct) for each type of product in the product family.
2.  **ConcreteProduct Implementations:**
    
    -   Create one or more classes (ConcreteProduct) that implement each AbstractProduct interface, representing the specific types of objects to be created.
3.  **AbstractFactory Interface or Abstract Class:**
    
    -   Declare an interface or abstract class (AbstractFactory) that includes factory methods for creating instances of each AbstractProduct.
4.  **ConcreteFactory Implementations:**
    
    -   Implement classes (ConcreteFactory) that extend the AbstractFactory and provide specific implementations of the factory methods, creating instances of ConcreteProduct.
5.  **Client Code:**
    
    -   The client code interacts with the AbstractFactory and AbstractProduct interfaces, without directly instantiating the ConcreteProduct classes.


 ~~life-without-Abstract factory🤬~~
Let's consider an example without using the Abstract Factory pattern. In this case, we'll directly instantiate the specific UI elements for Windows and MacOS without the abstraction provided by an abstract factory:

    // ConcreteProduct implementations for Windows
    class WindowsButton {
    public void click() {
        System.out.println("Windows button clicked");
    }
    }
    class WindowsCheckbox {
    public void check() {
        System.out.println("Windows checkbox checked");
    }
    }
    // ConcreteProduct implementations for MacOS
    class MacOSButton {
    public void click() {
        System.out.println("MacOS button clicked");
    }
    }
    class MacOSCheckbox {
    public void check() {
        System.out.println("MacOS checkbox checked");
    }
    }
    // Client code directly creates product instances
    public class ClientWithoutAbstractFactory {
    public static void main(String[] args) {
        // Create Windows UI elements
        WindowsButton windowsButton = new WindowsButton();
        WindowsCheckbox windowsCheckbox = new WindowsCheckbox();

        windowsButton.click();      // Output: Windows button clicked
        windowsCheckbox.check();    // Output: Windows checkbox checked

        // Create MacOS UI elements
        MacOSButton macOSButton = new MacOSButton();
        MacOSCheckbox macOSCheckbox = new MacOSCheckbox();

        macOSButton.click();        // Output: MacOS button clicked
        macOSCheckbox.check();      // Output: MacOS checkbox checked
    }
    }

In this example, the client code directly creates instances of Windows and MacOS UI elements. While this approach is straightforward, it has drawbacks:

1.  **Direct Instantiation:**
    
    -   The client code needs to know the concrete classes (`WindowsButton`, `WindowsCheckbox`, `MacOSButton`, `MacOSCheckbox`) and instantiate them directly.
2.  **Tight Coupling:**
    
    -   The client code is tightly coupled to the specific implementations of the UI elements. If new UI elements or variations are introduced, the client code needs to be modified.
3.  **Scalability Issues:**
    
    -   As the application grows, managing UI element creation in a centralized way becomes challenging. If there are changes in the UI element creation process, modifications must be made throughout the client code.

The Abstract Factory pattern would address these issues by providing an abstraction for creating families of related or dependent objects and promoting loose coupling between the client code and the specific product classes.


life with Abstract Factory 💕  
explore creational package / abstract factory package


***What is ther Difference Between Factory And Abstract Factory***

> the Factory Method pattern deals with creating a single product through a method, while the Abstract Factory pattern deals with creating families of related products through multiple interfaces.


## 4-Builder Pattern
 
 
 The Builder Design Pattern is a creational pattern that separates the construction of a complex object from its representation. It allows the same construction process to create various representations of the object. This pattern is particularly useful when an object needs to be constructed with a large number of optional components or configurations.

### Key Components:

1.  **Product:**
    
    -   This is the complex object being constructed. It often contains a large number of optional components or configurations.
2.  **Builder:**
    
    -   This is the interface or abstract class that declares the steps required to build the product. It defines methods for constructing each part of the product.
3.  **ConcreteBuilder:**
    
    -   This is the implementation of the Builder interface. It provides specific implementations for each step of the construction process. It is responsible for maintaining the state of the product being constructed.
4.  **Director:**
    
    -   This is an optional component that orchestrates the construction process using a builder. It defines a higher-level interface to construct the product, hiding the details of the construction steps.
5.  **Client:**
    
    -   This is the entity that initiates the construction process. It interacts with the builder to specify the configuration of the product.

### How It Works:

1.  **Builder Interface:**
    
    -   Define an interface or abstract class (Builder) that declares the methods needed to construct each part of the product.
2.  **ConcreteBuilder Implementations:**
    
    -   Create one or more classes (ConcreteBuilder) that implement the Builder interface. Each ConcreteBuilder provides specific implementations for building the product.
3.  **Product Class:**
    
    -   Define a class (Product) that represents the complex object being constructed. It should have methods to set the various components or configurations.
4.  **Director (Optional):**
    
    -   Create an optional class (Director) that defines a higher-level interface for constructing the product. It uses a builder to orchestrate the construction steps.
5.  **Client Code:**
    
    -   The client code interacts with the Builder or Director to specify the desired configuration of the product and initiate the construction process.

 ~~life-without-Builder Desinge Pattern🤬~~


    
	   public class Computer {	

	    private String processor;
	    private int memory;
	    private int storage;
	    private String graphicsCard;

    // Constructor with many parameters
    public Computer(String processor, int memory, int storage, String graphicsCard) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
    }

    // Getter methods...

    public static void main(String[] args) {
        // Creating a Computer object without the Builder pattern
        Computer computer = new Computer("Intel i7", 16, 512, "NVIDIA GeForce RTX 3080");
        
        // Use the constructed Computer object
        System.out.println("Processor: " + computer.getProcessor());
        System.out.println("Memory: " + computer.getMemory() + "GB");
        System.out.println("Storage: " + computer.getStorage() + "GB SSD");
        System.out.println("Graphics Card: " + computer.getGraphicsCard());
    }
    }


life with Builder 💕  
explore creational package / builder package

 ## 5-ProtoType Desing Pattern
 
 The Prototype Design Pattern is a creational design pattern that allows the creation of new objects by copying an existing object, known as the prototype. Instead of creating new instances using a constructor, objects are cloned. This pattern is particularly useful when the cost of creating a new instance of an object is more expensive or complex than copying an existing one.

### Key Components:

1.  **Prototype Interface or Abstract Class:**
    
    -   Declares the method for cloning itself. It can be an interface or an abstract class.
2.  **Concrete Prototype:**
    
    -   Implements the cloning method declared in the prototype interface. It represents the object that can be cloned.
3.  **Client:**
    
    -   Creates new objects by asking a prototype to clone itself.

### How It Works:

1.  **Prototype Interface:**
    
    -   Declare an interface or abstract class with a method for cloning itself.
2.  **Concrete Prototype Implementations:**
    
    -   Create one or more classes that implement the prototype interface. These classes represent objects that can be cloned.
3.  **Client Code:**
    
    -   The client code requests the creation of new objects by asking a prototype to clone itself. The client doesn't need to know the concrete class of the object being cloned.

 ~~life-without-ProtoType Pattern🤬~~

    // Without Prototype Pattern
    // Shape interface
		interface Shape {
    void draw();
    }

	// Concrete implementations of Shape
	class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
    }

	class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
	}

	// Client code
	public class Client {
    public static void main(String[] args) {
        // Creating objects directly using constructors
        Shape circle = new Circle();
        Shape square = new Square();

        // Drawing the objects
        circle.draw();  // Output: Drawing a Circle
        square.draw();  // Output: Drawing a Square
    }
    }

In this example, each time a new shape is needed, the client code directly creates instances of the concrete classes (`Circle` and `Square`) using their constructors. While this approach works, it doesn't provide the benefits of the Prototype pattern, such as avoiding the need for complex object creation logic in the client code and reducing the cost of creating new objects.




life with ProtoType 💕  
explore creational package / prototype package

_______________________

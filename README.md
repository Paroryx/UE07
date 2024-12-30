# Software Development Exercises - UE07  

## 📜 Tasks  
This exercise focuses on object-oriented programming concepts, including converting static methods to instance methods, using access modifiers (`private`, `public`), and managing immutable fields with `final`. The tasks also emphasize creating and testing a multi-class production system.  

### 1. Refactoring the Previous Assignment  
Rework the `Machine`, `Company`, and `Factory` classes from the previous assignment to:  
- Replace static methods (`buildMachine`, `buildFactory`) with constructors.  
- Convert static methods (`print`, `run`, `work`, `serviceCosts`) to instance methods.  
- Ensure all fields are private, and those that remain unchanged are marked `final`.  
- Provide public getter methods for all fields in `Machine`.  
- Adapt the `main` method in `Company` to utilize the new constructors and instance methods.  

---

### 2. Multi-Class Production System  
Develop a simulation of a production system with the following components:  

#### **CountedResource**  
- Represents a specific resource type and its quantity.  
- Fields:  
  - `String name` (public, immutable): The resource name (e.g., "Wood").  
  - `int n` (public, immutable): The quantity.  
- Constructors:  
  1. Takes both the resource name and quantity.  
  2. Defaults the quantity to 1 if only the name is provided.  

#### **Product**  
- Represents a product and its required resources.  
- Fields:  
  - `String name` (public, immutable): The product name (e.g., "Table").  
  - `CountedResource[] requirements` (private, immutable): The required resources for production.  
- Methods:  
  - `CountedResource[] getRequirements()`: Returns a copy of the requirements array to prevent external modification.  

#### **Storage**  
- Represents a fixed-size storage facility for resources and products.  
- Fields:  
  - `String[] store` (private, immutable): Array representing storage slots.  
- Methods:  
  - `boolean add(String objectName)`: Adds an object to the first free slot.  
  - `CountedResource count(String objectName)`: Returns the count of a specific resource.  
  - `boolean remove(String objectName)`: Removes the first occurrence of an object.  
  - `boolean remove(String objectName, int n)`: Removes `n` instances of an object, if available.  
  - `boolean canBuild(Product p)`: Checks if enough resources are available for a product.  
  - `void print()`: Prints the storage content to the console.  

#### **ProductionBuilding**  
- Represents a building that produces a specific product.  
- Fields:  
  - `Storage storage` (public, immutable): The storage facility for the building.  
  - `Product product` (public, immutable): The product produced by the building.  
- Methods:  
  - `boolean add(String... resourceNames)`: Adds multiple resources to the storage.  
  - `int produce()`: Produces as many units of the product as resources allow.  

#### **ProductionApp**  
- Demonstrates the functionality of the system by creating and testing three production buildings:  
  1. A building that produces multiple units of a product.  
  2. A building that produces exactly one unit of a product.  
  3. A building that cannot produce any products due to insufficient resources.  

---

## 📂 Project Structure  

``src/``

- ``In.java`` Helper class for input  
- ``Out.java`` Helper class for output  
- ``Machine.java`` Refactored class with instance methods and private fields  
- ``Factory.java`` Refactored class with instance methods and private fields  
- ``Company.java`` Refactored class demonstrating the new object-oriented approach  
- ``CountedResource.java`` Represents a resource and its quantity  
- ``Product.java`` Represents a product and its requirements  
- ``Storage.java`` Manages storage of resources and products  
- ``ProductionBuilding.java`` Represents a building that produces products  
- ``ProductionApp.java`` Entry point demonstrating the production system  

``tests/``

- ``Testprotokolle.txt`` Test cases and results for all tasks  

---

## 🛠 Tools  
- **Programming Language:** Java  
- **Editor:** Visual Studio Code with [JavaWiz](https://github.com/SSW-JKU/javawiz) extension  

---

## 📝 License  
This project is licensed under the [MIT License](LICENSE).
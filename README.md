# Nutritional-Facts-OOP-GSLC2
As an implementation of interface and abstract in JAVA OOP, here is an example code where there are 5 given selections of protein sources, namely Chicken, Beef, Lamb, Fish, and Eggs. Users are asked to input the one of the 5 protein sources, its weight (in grams), and gender. Note that the code is adult only for the sake of more restricted daily protein intake. 

# Abstract 
Definition : A class that is not able to be instantiated on its own, by means that we cannot create objects directly from it.
To put in perspective, abstract class is a partially completed blueprint for a class, where it can contain regular methods with implementations or abstract methods without implementations

In my code, the abstract class, named "AbstractProtein" is responsible for displaying the template for table of nutritional facts and daily protein intake for both gender

# Interface
Definition : A contract or set of rules which a class must obey. 
Usually contains a set of methods or functions representing each functionality

In my code, the interface contains 2 activities, such as 
Displaying nutritional facts of a certain weight of protein
and checking daily protein intake based on user's gender

# Abstract and Interface Difference
- Multiple Inheritance : Multiple interfaces can be implemented by a class, meaning a class can follow multiple sets of rules defined by different interfaces. Meanwhile, abstract class can only be extended by a class
- Instantiation : It is possible to create an instance of an interface, but it is not possible for an abstract class. Moreover, it is possible to either create an instance of a concrete class to implement an interface or extends an abstract class
- Implementation : Interface only consists of method signatures (name of method) without any implementation, while abstract can include both implemented and abstract methods.
- Representation : Interface is used to define common behaviors among classes that could be shared, meanwhile, abstract classes are used to provive default rules or blueprints that contains characteristics to a group of related classes. 

# Code Output Example

Template and User Input: 

![image](https://github.com/fatpiggu9/Nutritional-Facts-OOP-GSLC2/assets/127531908/0f194fcc-097a-46f6-9993-05244ae2f4af)



Expected Output if daily protein intake is fulfilled: 

![image](https://github.com/fatpiggu9/Nutritional-Facts-OOP-GSLC2/assets/127531908/9aaa3948-c1b0-4ed1-b435-7ad47a4058e7)



Expected Output if daily protein intake is not fulfilled:

![image](https://github.com/fatpiggu9/Nutritional-Facts-OOP-GSLC2/assets/127531908/1efe4039-25a3-4347-8132-338fd7b617f5)

*REQUIREMENTS*

* Groovy
* Java 8

*BEFORE*
Clone this repository and run the AppTest to see if code works ok.
For every pattern there is a test written in the Groovy Spock with @PendingFeature annotation -> take a look here:
http://spockframework.org/spock/javadoc/1.1-SNAPSHOT/spock/lang/PendingFeature.html

If you change your code correctly, it means that you implement the feature and you will have to
remove the @PendingFeature annotation from existing test.

*Java Design Patterns*

*Creational Design Patterns*

* Singleton
* Factory
* Abstract Factory
* Builder
* Prototype

*Structural Design Patterns*

* Adapter
* Composite
* Proxy
* Flyweight
* Facade
* Bridge
* Decorator

*Behavioral Design Patterns*

* Template Method
* Mediator
* Chain of Responsibility
* Observer
* Strategy
* Command
* State
* Visitor
* Interpreter
* Iterator
* Memento

*TASKS*

All of patterns mentioned above are partially developed. 
The main object of this workshops is to reach a DoD for every pattern implementation:
1. Implement pattern in suitable package.
2. If there is a basic implementation, extend it or fix the bugs.
3. Check if there are tests for this pattern implementation.
4. If tests exist - make sure that they'll be green.
5. If there is a @PendingImplementation on them -> remove it if you implementation has been done.
6. If there is no tests in the package, implement them using Junit.
7. Change TODO which you already implemented to DONE

*LINKS*

* http://spockframework.org/
* http://groovy-lang.org/
* https://www.agilealliance.org/glossary/definition-of-done/

*KNOWLEDGE BASE*
* groovy
* spock
* lombok
**Inversion of Control** - is a principle in software engineering which transfers the control of objects or portions of a program to a container or framework

In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. Otherwise, a bean is simply one of many objects in your application. Beans, and the dependencies among them, are reflected in the configuration metadata used by a container.

**The scope of a bean** defines the life cycle and visibility of that bean in the contexts we use it.

The latest version of the Spring framework defines 6 types of scopes:

singleton
prototype
request
session
application
websocket
The last four scopes mentioned, request, session, application and websocket, are only available in a web-aware application.

A bean with the prototype scope will return a different instance every time it is requested from the container. It is defined by setting the value prototype to the @Scope annotation in the bean definition:



**Section 2 Basic bean define**

We should next:
1) spring-context dependency pom.xml
2) crate context Main.java
3) register Conf class MyConfig.java
4) define beans

We can set priority (if bean invokes by Classname) via @Primary
or invokes bean by name context.getBean(<name>). If name not defined - spring 
gives name of method with Lower case first letter,
or we can override this by @Bean(name = "china")

**Section 3 Stereotype Bean define**
With stereotype annotations, you add the annotation above the class for which you need to have an instance in the Spring context. 
When doing so, we say that you’ve marked the class as a component. When the app creates the Spring context, 
Spring creates an instance of the class you marked as a component and adds that instance to its context. 
We’ll still have a configuration class when we use this approach to tell Spring where to look for the classes 
annotated with stereotype annotations.

1) Using the @Component annotation, mark the classes for which you want Spring 
to add an instance to its context (in our case Parrot).
2) Using @ComponentScan annotation over the configuration class, instruct 
Spring on where to find the classes you marked.

Bean must have a non-args constructor

_@Bean_: Provides complete flexibility in bean creation and configuration, allowing you to specify parameters and configuration in methods.
_@Component_: Provides simple automatic registration of beans, but with less flexibility in controlling creation and configuration, although you can use additional facilities for initialization and configuration.

Use @PostConstruct to initialize bean. Constructor does not use, because constructor is called before all other dependencies are implemented into this component.
@Component
```public class Person {
private String name;
private int age;

    // Конструктор и методы

    @PostConstruct
    public void init() {
        // Инициализация после создания
    }
}
```

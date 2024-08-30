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


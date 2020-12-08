# WebToolsHomework4
This includes all assignments for Webtools
Part 1 – Spring Framework Reference Documentation

Chapter 1. The IoC Container [https://docs.spring.io/spring/docs/5.2.x/spring-framework-reference/core.html (Links to an external site.)]

This chapter covers the Spring Framework implementation of the Inversion of Control (IoC) principle. IoC is also known as dependency injection (DI). It is a process whereby objects define their dependencies (that is, the other objects they work with) only through constructor arguments, arguments to a factory method, or properties that are set on the object instance after it is constructed or returned from a factory method. The container then injects those dependencies when it creates the bean. This process is fundamentally the inverse (hence the name, Inversion of Control) of the bean itself controlling the instantiation or location of its dependencies by using direct construction of classes or a mechanism such as the Service Locator pattern.

 

Part 2 – Reading Assignment

    https://www.safaribooksonline.com/library/view/spring-in-action/9781617291203/kindle_split_009.html (Links to an external site.)

    https://www.safaribooksonline.com/library/view/spring-in-action/9781617291203/kindle_split_010.html (Links to an external site.)

 

Part 3 – Programming Assignment

Redo HW1-Part 3 in Spring MVC, and use AbstractPdfView to send the user a PDF containing the information submitted.

 

Part 4 – Programming Assignment

Redo HW3-Part4 using Spring MVC. Use an Interceptor to sanitize inputs. Use IoC to create instances.

Use BeanNameUrlHandlerMapping for the controllers.

https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/servlet/handler/BeanNameUrlHandlerMapping.html (Links to an external site.)

 

Part 5 – Programming Assignment

Redo HW3-Part5 using Spring MVC. Use an Interceptor to sanitize inputs. Use IoC to create instances.

Use SimpleUrlHandlerMapping for the controllers.

https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/servlet/handler/SimpleUrlHandlerMapping.html (Links to an external site.)

 

Part 6 – Programming Assignment

Redo HW3-Part6 using Spring MVC. Use an Interceptor to sanitize inputs. Use IoC to create instances.

Use Annotated Controllers.

 

Part 7 – Programming Assignment

Create a utility class that has a get method returning a string (it could be any random message). Use Spring’s IoC container to inject this into the handler method, and simply retrieve and pass this message to the view page. Use context to create an instance of the utility class. Do not use new operator.

 

Part 8 – Programming Assignment

Redo Part 7 of this assignment, and use annotations.

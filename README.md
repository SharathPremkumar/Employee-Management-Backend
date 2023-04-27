# Employee-Management-Backend

# Project-Documentation

<p align="center">
  <a href="" rel="noopener">
 <img width=200px height=200px src="https://i.imgur.com/6wj0hh6.jpg" alt="Project logo"></a>
</p>

<h3 align="center">Employee-Management-Backend</h3>

<div align="center">
  
 [![Status](https://img.shields.io/badge/status-active-success.svg)]() 

  [![GitHub Pull Requests](https://img.shields.io/github/issues-pr/kylelobo/The-Documentation-Compendium.svg)]()

</div>

---

<p align="center">This is a JAVA Backend Project By using Spring boot, MySQL DataBase & Hibernate JPA, Where Admin Can Add the Create the Employee data, Retrieve the data, Update and delete the data. This CRUD operation is tested using postman, by using the end point connectors of this backend code we can connect with the frontend User Interface applications.
    <br> 
</p>

## 📝 Table of Contents
- [About](#about)
- [Getting Started](#getting_started)
- [Deployment](#deployment)
- [Usage](#usage)
- [Built Using](#built_using)
- [Authors](#authors)
- [Acknowledgments](#acknowledgement)

## 🧐 About <a name = "about"></a>
The purpose of this project is to save the employee credentials in the web application, this project provides the features where an Admin or HR manager can create each individual employee details and retrieve them whenever it is required to them.
In order to achieve this functionality we have developed the code in such a way that, user can perform each individual operation using different API's.

This may not serve a full stack we application project, but this is a complete backend code where a frontend developer can use the end point connectors from here and design the web page using whatever frontend technolgies to serve a better user interface to the user. but for functionality testing we have used Postman API platform and successfully tested and finalized all the API's.

## 🏁 Getting Started <a name = "getting_started"></a>
- When you run the code on the eclipse IDE, spring boot application will be get started with the server port number.
- With the help of Hibernate JPA database will also be get connected.
- Use that port number with http url and test with all end point connectors that are available in Controller class.
- See [deployment](#deployment) for notes on how to deploy the project on a live system.

### Prerequisites
- First You need to download all the softwares provide in the [Built Using](#built_using) section links.
- Installation is very simple, steps are available in the youtube as well as in google also.
- But remember the port number of the MySQL server, because you need to provide that to database connectivity.
- Also remeber the port numbers of Tomcat server for http connection.

### Installing

Fist Click ond NetBeans URL and Install it and Then
After Completing the download start the SetUP 
After SetUp has been Started you need to select on Custom and click on Next
You can see the Available Products
In the Click on MySQL Server and go inside of it and Drag it to the Product to be installed Box
Do the Same for MySQL Application and MySQL Shell and Click on Next 
After that You can see the Installation Set Up and click on Execute and Product will install one by one 
After completing the SetUp click on next and on Product Configuration Click on Next 
Now Type and networking will be visible and there you Check for port no 3306 and keep the default and Click on next 
Net set Root password keep Clicking on Next and Execute Your MySQL installation will be completed .
Then Download the MYSQL Connectors Jar file and JCalendar Jar file from Same MySQL Website   and then Extract it and keep it in one folder


## 🔧 Running the tests <a name = "tests"></a>
First you need Open Apache Netbeans application and then you can import this Project from Git Hub and you can also add all the liberaries which you downloaded
that is MySQL Connector liberary and another one is Jcalendar liberary and then another one is you need to Create one Database of name GreenBus and inside of that you need to create 2 tables, one is bookings table containing of 6 columns of name Id, BusNo, Seat, Customer, Mobile, Date here another one Seats table which will contain 5 tables of name Id, BusNo, Seat, Date, Status. In both the table Seat column reperesents the Seat No. By using Left Join Query we can get required output in the Booking Panel.   

## 🎈 Usage <a name="usage"></a>
The main Use of this is a complete backend code where a frontend developer can use the end point connectors from here and design the web page using whatever frontend technolgies to serve a better user interface to the user. but for functionality testing we have used Postman API platform and successfully tested and finalized all the API's.

## 🚀 Deployment <a name = "deployment"></a>
First Extract the file from GitHub and import it into eclipse IDE and you can run the program, So that it will automatically generate the database table and then you can run the code in eclipse IDE or Spring tool suite, after that test the API's in the Postman API platform.

## ⛏️ Built Using <a name = "built_using"></a>
- [MySQL Community](https://dev.mysql.com/downloads/installer/) - Commandline client
- [SQLyog](https://webyog.com/product/sqlyog/) - SQL IDE
- [JDK 17](https://www.oracle.com/in/java/technologies/downloads/#java17) - Java Development Kit
- [Eclipse](https://eclipseide.org/) - Eclipse IDE
- [Apache Tomcat](https://tomcat.apache.org/) - Tomcat Server
- [Spring.io](https://start.spring.io/) - Spring Initializer
- [Postman](https://www.postman.com/downloads/) - Postman API Platform

## ✍️ Authors <a name = "authors"></a>
- [Sharath P](https://github.com/SharathPremkumar) - FSD

## 🎉 Acknowledgements <a name = "acknowledgement"></a>
- Skill-Lync
- Google sources
- Youtube

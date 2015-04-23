# maven-spring-hibernatejpa-jersey-ajax
Basically this is a maven based web project where i integrated Spring 3.6 and hibernate 3 and spring-jpa and with jersey and in the frontend i used to ajax to sent out a request to REST.


This project demonstrate how to use Hibernate with Spring framework to do the data manipulation works(insert, select, update and delete) in SQL server database ( u can switch any other relational database using datasource property in applicationContext.xml file under resources file).

Here in this instead beans.xml for the new beans created everytime i used component scan and for hibernate entities i used packagesToScan property to autoscan the entities instead of writing persistence.xml

#Future Releases:
1. Integrating servlet filters
2. using apache bean utils for converting entities to UI pojos and viceversa.


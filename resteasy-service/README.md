# About

A maven archetype to create a skeleton [RESTEasy](http://www.jboss.org/resteasy/) webapp. 

# Usage

```
cd resteasy-service

#Build and install the archetype
mvn install 

#Displays a list of locally installed archetypes 
mvn archetype:generate -DarchetypeCatalog=local

# Choose "org.sl:resteasy-service-archetype (resteasy-service-archetype)" and complete the prompts

```

Once your project has been created, you can test it using the maven jetty plugin

```
cd project-dir

mvn jetty:run

```

The server defaults to <http://localhost:8080>


# Dependencies

* resteasy-jaxrs 2.2.3.GA
* resteasy-jackson-provider 2.2.3.GA
* jackson-jaxrs 1.9.7
* jetty-maven-plugin 8.1.9.v20130131 (Development only)



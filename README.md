Simple Rest App
=============


This is the REST-API app for **Library** management. 

----------


API Provided 
------------------

**Path**  :     =>    

**Markdown Extra** has a special syntax for tables:

**Path** | Value returned
-------- | ---
"/"      | book list


Run app : 
---------

	1. Start the Server.
	2. Hit the Url http://localhost:8080/

For this app. Let's provide documentation using Swagger.


Add swagger2 Dependency to Gradle: 
---------
	1. Add springfox-swagger2 dependency in gradle project.
	2. Install these dependency gradle.
	3. Provide Swagger configuration.
		I. Specify routes for which swagger can generate documentation.
		
Visit URL : http://localhost:8080/v2/api-docs
See the generated swagger.json file.

		
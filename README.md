# Pantry-Kinvey-Backend
My Contribution/Source code for a project undertaken with 5 other developers where we created an Android app called Pantry

Introduction
------------
Pantry was an Android application developed by a team of developers(yours included) which attempted to create an app that served as a user's shopping list/pantry list. In the application, the user could add, remove or edit any ingredients that they had stored in their pantry/fridge, and also they could select a group of ingredients and receive recipes they could make with those selected ingredients.
I was tasked with creating the entire backend of the application using a Cloud database service called Kinvey. Using their API, and the following database schema I designed, I created the database, all the classes, functions and connnections needed to integrate it with the front end being developed by the other developers. This code was added by me to empty functions/empty onClick listeners where they designed to have things happen in the front-end UI design on the application.

Database Setup:
* The database was based off a relational database schema but later, to fit with the architecture of the Kinvey Cloud database service, it was changed to two tables where the first table had an attribute that served as a reference to tuples inside of the second table in a one to many relationship (similar to a foreign key relationship in a SQL database).


Technologies Used
-------------
* Android Studio
* Kinvey (https://www.progress.com/kinvey)
* Gradle
* Java 

Screenshots
-------------
* Actual database design using references:
<img src="https://user-images.githubusercontent.com/39919952/61494434-c43e4e80-a97b-11e9-9c0c-f8be74a12e8f.png" height="400" alt="Screenshot"/> 

* Example ER Diagrams from previous relational model:
<img src="https://user-images.githubusercontent.com/39919952/61494430-c2748b00-a97b-11e9-9b0c-29f87ab2c051.png" height="400" alt="Screenshot"/> 
<img src="https://user-images.githubusercontent.com/39919952/61494448-cf917a00-a97b-11e9-8ce2-09b95c813bab.png" height="400" alt="Screenshot"/> 

Pre-requisites
--------------

- Latest version of Android Studio
(However, since the Cloud database service is no longer maintained with a monthly fee, it is no longer available so this example application of accessing Kinvey database is obsolete and no longer will work)

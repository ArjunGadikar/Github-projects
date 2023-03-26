# Github-projects

First I signed up for MonogoDB and created a Account with login id and password.Then created a Free online MongoDB cloud database Cluster0

After creating account in MongoDB, and setting up everything required.
Then to access the network the current IP Address has to be given to the MongoDB to connect with Databases in MongoDB shell 
Then I connected Cluster0 for Database Deployments

After clicking to connect its asks to choose a connection method to connect Cluster0 with.
I chose connect with the MongoDB Shell tool as my pre-formatted connection string 

After connecting successfully, and clicked to connect
Cluster0 provides the Mongosh application to download
And link of connection string to use in application command line to run mongosh 
and show database.

After downloading the mongosh, I Extracted a file in a folder and opened bin folder were the    
application .exe was located
Were with path I opened command prompt  

In command prompt line 
First I entered name of application mongosh in command line to start and connect
Then checked the version by commanding in line> mongosh --version 

Then I pasted the Connection string link which was provided in cluster0 to connect the MongoDB shell. To connect mongosh Application and MongoDB Database Cluster0
mongosh "mongodb+srv://cluster0.hqccgoa.mongodb.net/myFirstDatabase" --apiVersion 1 --username arjungadikar208
Then its asks for password :

After entering password 
The mongosh application connects with MongoDB Server Database Cluster0 through connection string in command prompt to run commands and show database
example:
Connecting to:          mongodb+srv://<credentials>@cluster0.hqccgoa.mongodb.net/myFirstDatabase?appName=mongosh+1.8.0
Using MongoDB:          5.0.15 (API Version 1)
Using Mongosh:          1.8.0
Atlas atlas-u5ydpx-shard-0 [primary] myFirstDatabase>

Show dbs/<Table name> is the command to display the data about table from Database.
 Now for the example the default database is visible. Admin & Local

Then I created my new database with command > use arjundb
( Database: arjundb )
Then created collections named emp with command db.emp.insert
     ( Collections: emp )
 Then inserted records in database collections Successfully







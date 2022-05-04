Bachelor Project Title: 
	- Artificial Intelligence based Solution for Mental Health Issues 
	- Rules-based chatbot using sentiment analysis

Description of the problem to be solved:
	- In order to load the messages, the bot needs to connect to a database. The connection must be unique. For connecting to the database, there are needed: the ip address of the database, the port and the database name.
	 
Advantages:
	- Now, the connection will not be duplicated.
	- There could not be multiple connections at the same time.
	- The lazy instantiation offers the opportunity to create the connection when it is needed. In this way, we do not waste resources

Disadvantages:
	- Can generate synchronisation problems.
	- It can generate a bottleneck, causing app performance issues.  
	
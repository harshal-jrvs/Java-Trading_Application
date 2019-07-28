# Introduction  
- Briefly explain what does this project do (e.g. it an online stock trading simulation REST API which can blah..blah) and who can use this API (e.g. front-end developer, mobile developer, and traders can utilize this REST API)  
- Briefly talk about technologies used in this project(e.g. It's a MicroService which is implemented with SpringBoot. PSQL database. IEX market data)  
  
# Quick Start  
- Prequiresites: Java, Docker, CentOS 7  
- PSQL init - Database initialization is done by running the following script `/scripts/start_trading.sh`. This script will start the docker initialize database and populate it with necessary tables.
- git clone and mvn build  
- Start Springboot app using a following shell script  `/scripts/start_trading.sh` and once the application started it can be accessible using Swagger-UI and through Postman app. To access it via Postman you would need to download and import it to Postman through this link `http://localhost:8080/v2/api-docs`. To use Swagger-UI use this following link `http://localhost:5000/swagger-ui.html`
  - This trading application uses few environment variable that has been initialized by user in the OS. To run this application first user must setup their own Enviornment variable as shown below.
  ```add enviornment variable to ~/.bash_profile
  #run `idea` in terminal to propagate the enviornment vaiable
  PSQL_URL jdbc:postgresql://localhost:5432/jrvstrading
  PSQL_USER postgres
  PSQL_PASSWORD password (Can be anything)
  SPRING_PROFILES_ACTIVE dev
  IEX_PUB_TOKEN your_iex_token
  ```
- How to consume REST API? (Swagger screenshot and postman with OpenAPI Specification, e.g. [http://35.231.122.184:5000/v2/api-docs](http://35.231.122.184:5000/v2/api-docs)  
  
# REST API Usage  
## Swagger  
Swagger is an open-source software framework backed by a large ecosystem of tools that helps developers design, build, document, and consume RESTful Web services. API design is prone to errors, and it’s extremely difficult and time-consuming to spot and rectify mistakes when modeling APIs thus using swagger simplify the job of developer who can test their endpoints using swagger graphical user interface (GUI).
 
## Quote Controller  
- Quote Controller job is to `create` ,`Read` and `Update` quote  related information which is being retrieved from IEX cloud using HTTP request and is cached into `quote` table in the database `jrvstrading`  using JDBC connection.
- 
- There are five endpoints for this controller which are listed below with brief description:
  - GET `/quote/dailyList`: list all securities that are available to trading in this trading system
  - GET `/quote/iex/ticker/{ticker}`: Display the IEX market data for user defined ticker
  - POST `/quote/tickerId/{tickerId}`: Add a new ticker to the dailyList (quote table)
  - PUT `/quote/`: Update a given quote in the quote table
  - PUT `/quote/iexMarketData`: Update all quotes from IEX which is an external market data source  
## Trader Controller  
- High-level description for trader controller(e.g. it can manage trader and account information. it can deposit and withdraw fund from a given account)  
- briefly explain your endpoints in this controller  
##Order Controller  
- High-level description for this controller.  
- briefly explain your endpoints in this controller  
  - /order/MarketOrder: explain what is a market order, and how does your business logic work.   
## App controller  
- GET `/health` to make sure SpringBoot app is up and running  
## Optional(Dashboard controller)  
  
# Architecture  
- Draw a component diagram which contains controller, service, DAO, storage layers (you can mimic the diagram from the guide)  
- briefly explain the following logic layers or components (3-5 sentences for each)  
  - Controller   
  - Service  
  - Dao  
  - SpringBoot: webservlet/TomCat and IoC  
  - PSQL and IEX  
  
# Improvements  
- at least 5 improvements
<!--stackedit_data:
eyJoaXN0b3J5IjpbLTE5OTY0MDMxOTAsLTE4OTQ2Njk3NjQsLT
EwMzg5NjUyOTYsLTE4MzU2NzIwNzAsODUwNjYzOTUwLC0zMDU4
MjIwMzIsMTc4MDI5ODkxNCwyMDQ0MDg0MSwtMTkwMTIyODk4Ny
wtNTAyMDAzODRdfQ==
-->
#Instruction on how to use our website and database;

- Step1: install MyEclipse, MySQL, Tomcat 6.0 or higher on your computer, MySQLWorkBench(for better testing)

- Step2: import Existing project called "UnivHousing" in MyEclipse

- Step3: in Mysql create database called "housing", paste all the information from [table files](/db/housing.sql) and [test files](/db/testData.sql) in MySql.

- Step4: run the project in MyEclispe as MyEclipse Server Application, in the console you will see for example the "Server startup in 6704ms", which means the server is all set.

- Step5: The website is on port 8000, which means you would like to visit localhost:8000/UnivHousing to visit the website

- Step6: begin testing, in your web explorer you will see the initial page and you can login as guest/student/supervisor, remember that the initial password has been set as "123456", you only need the Unity id or approval id to login (find them in Database, you can use SELECT s.id FROM student s).

- Step7: now you can test the system as you wish (for new request, like new lease, new ticket, new termination, when you submit, there is no response notice when you have successfully submitted, but you can view them in the view options, some forms will be empty if you do not submit new request or if you do not load our test data)

Full Report can be viewed at [here](/Final_report.pdf)

CSC540 Database project by Team 6: 
shou3, yhuang34, ldong6, sxu11


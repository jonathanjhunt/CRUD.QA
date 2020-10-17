## STICK.ME Online To-Do List (CRUD Project 1) - Jonathan Hunt (QA CN)

### Resources:
- Presentation:
- Agile Project Plan: https://qatraineerelder.atlassian.net/jira/software/projects/TW/boards/5
- Website: http://127.0.0.1:5500/main.html

### Brief

The outlines of this project have been determined in the specification. The task is to "create a CRUD application with the utilisation of supporting tools, methodologies and technologies that encapsulate all core modules covered during training". 

In this project I have designed a functioning website that allows a user to create tasks on post-it notes. The functionality of the website allows the user to "create, read, update and delete" values in a database that can be read and rendered by the front end to meet the specification of the project. 

##Requirements
To meet the requirements that the project has specified I have included in my project:

- An agile scrum board
- A database that includes one table
- A functioning java based backend that adheres to best practice and design principles
- A functioning front end with javascript functionality that connects tot he backend via an API
- Testing of the backend that provides a coverage of 90%
- Evidence of GIT staging to ensure best practices were met during code development
- A detailed read-me explaining the process of development.

## Development Proccess
[![Agile Board](https://i.imgur.com/3aQUXXi.jpg "Agile Board")](https://i.imgur.com/3aQUXXi.jpg "Agile Board")

## Risk Assessment
Link to Risk Assessment: https://drive.google.com/file/d/1FMS2-W0sFldtJT-DQJNYTlD0vz56ssUM/view?usp=sharing
[![Risk Assesment](https://i.imgur.com/0ujemcS.jpg "Risk Assesment")](https://i.imgur.com/0ujemcS.jpg "Risk Assesment")

##ERD 
Due to the simplicity of the project, there is only one small table for the database. The ERD can be seen below:
[![ERD](https://i.imgur.com/rO5DRS4.jpg "ERD")](https://i.imgur.com/rO5DRS4.jpg "ERD")
##Testing
Two test the backend JAVA files, JUnit and Mockito tests were created to test all of the functions within the code. These tests are designed to input variables into the function with a known expected outcome to confirm the logic of the function is working correctly. 

To achieve an acceptable level of testing, all of the CRUD functionality must be covered as well as a general coverage of 80%. As shown below, a coverage of 90% was achieved across all of the classes within the backend. 

[![Testing Coverage](https://i.imgur.com/dDSJSJ1.jpg "Testing Coverage")](https://i.imgur.com/dDSJSJ1.jpg "Testing Coverage")
##Front-End Design
The original goal for this project was to design a front end that replicates a traditional cork board that people would have originally used to store ideas. The idea for this website was to fuse traditional none-digital elements of a task board with the modernity of digital solutions. 

Many people find comfort in non-digital solutions, even in the modern digital world. The idea of this board is that people can have the website open on a second or third monitor to store their to-do tasks. This could be particularly useful for software developers who most often work on multiple monitors at the same time. 

To replicate this, the background of the website is a cork board and when a user adds a new note, a traditional paper sticky note will appear on the board with the task contained within it. 

To utilise this function i sued the bootstrap card utility, that automatically arranges and stacks cards on the website. 

When the user loads into the website, they meet the landing page. The landing page informs the user that they have reched the website that they require and promotes the branding of the page. This is specified in the agile user stories and can be seen below:
[![Landing Page](https://i.imgur.com/AN4755Y.jpg "Landing Page")](https://i.imgur.com/AN4755Y.jpg "Landing Page")

Once the user has met the landing page, they will be redirected to the main page where they are able to create tasks. The design is simple and minamilistic to improve user functionality. 

On the main page, the user can read their current tasks, as well as create new ones, update exisiting tasks, and delete. 
[![Main Page](https://i.imgur.com/EO2YDOL.jpg "Main Page")](https://i.imgur.com/EO2YDOL.jpg "Main Page")

As the user creates more pages, the cards automatically stack and resize for readability on the website. This is a feature of bootstrap and is a useful feature to use as it minimises the length of the html code.

When the update button is pressed on any sticky note, an update box appears. This is automatically hidden before this button is pressed to avoid confusion and to improve usability for the user.
[![Usability](https://i.imgur.com/O0TMNgP.jpg "Usability")](https://i.imgur.com/O0TMNgP.jpg "Usability")
##Bugs & Known Issues
The functionality of this website is fairly basic, and there are not many things that can fail in terms of the front end of the program. 

The only issue that I am aware of at the moment is that the update button will not hide if the delete button is pressed on the task that is set to update. Although this bar is then removed if the page is refreshed. Although it is an issue, it does not affect the core functionality of the website and is not a serious threat.
##Future Improvements/Stretch Goals
As set out in my original project plan, there were some stretch goals outlined. The ultimate aim of the project is to make the board feel as traditional and non-digital as possible. To do this I would like to add a few features that give the user maximum control over the board. Three things that I would like to add to achieve this are:

- Ability to change the colour of the post it notes so that the user can organise tasks based on their priority and urgency.
- Ability to move the post it notes around the page with complete freedom so they can sort the notes into different sections of the page for organisation.
- Ability for the user to add their own images. If this website is going to be kept open on a screen, it would be nice for a user to add pictures of their family, like on a traditional board. This adds a level of personalisation to the page that will keep the user interested in the website and encourage return traffic.

## Author
Jonathan Hunt
## STICK.ME Online To-Do List (CRUD Project 1) - Jonathan Hunt (QA CN)

### Resources:
- Presentation:https://drive.google.com/file/d/1XdsQH2Pwc4zPnyQx8gx_dzeAJvGzN2O-/view?usp=sharing
- Agile Project Plan: https://jhunt-qa.atlassian.net/secure/RapidBoard.jspa?rapidView=2&projectKey=TDP&selectedIssue=TDP-10
- Website: http://127.0.0.1:5500/main.html

### Brief

The outlines of this project have been determined in the specification. The task is to "create a CRUD application with the utilisation of supporting tools, methodologies and technologies that encapsulate all core modules covered during training". 

In this project I have designed a functioning website that allows a user to create tasks on post-it notes. The functionality of the website allows the user to "create, read, update and delete" values in a database that can be read and rendered by the front end to meet the specification of the project. 

## Requirements
To meet the requirements that the project has specified I have included in my project:

- A Jira board with full expansion on user stories, use cases and tasks needed to complete the project.
- Clear Documentation from a design phase describing the architecture you will use for your project.
- A detailed Risk Assessment created at the beginning of your project.
- A relational database used to store data persistently for the project.
- A functional application created in the OOP language, following best practices and design principles, that you have covered during training, this application needs to meet the requirements set on your Kanban Board
- The application must have a functioning front-end website and integrated API.
- Fully designed test suites for the application you are creating, as well as automated tests for validation of the application.
- You must meet an acceptable level of test coverage in your backend and provide consistent reports and evidence that you have done so.
- Code fully integrated into a Version Control System

## Development Proccess
The project was planned using a Jira board. This was a useful tool for keeping track of the tasks required to meet the MVP for the project. Setting out requiremets in the format of a User Story makes it easy to visualise a task that needs to be completed and put it into action. 

The Jira board gives the option to track which tasks have been completed, which are still in progress and what is left to be done. This allows you to keep on schedule with advancements in the project.
[![Agile Board](https://i.imgur.com/3aQUXXi.jpg "Agile Board")](https://i.imgur.com/3aQUXXi.jpg "Agile Board")

## Risk Assessment
Link to Risk Assessment: https://drive.google.com/file/d/1FMS2-W0sFldtJT-DQJNYTlD0vz56ssUM/view?usp=sharing
[![Risk Assesment](https://i.imgur.com/0ujemcS.jpg "Risk Assesment")](https://i.imgur.com/0ujemcS.jpg "Risk Assesment")

## ERD 
Due to the simplicity of the project, there is only one small table for the database. The ERD can be seen below:
[![ERD](https://i.imgur.com/rO5DRS4.jpg "ERD")](https://i.imgur.com/rO5DRS4.jpg "ERD")
## Testing
Two test the backend JAVA files, JUnit and Mockito tests were created to test all of the functions within the code. These tests are designed to input variables into the function with a known expected outcome to confirm the logic of the function is working correctly. 

To achieve an acceptable level of testing, all of the CRUD functionality must be covered as well as a general coverage of 80%. As shown below, a coverage of 90% was achieved across all of the classes within the backend. 

[![Testing Coverage](https://i.imgur.com/dDSJSJ1.jpg "Testing Coverage")](https://i.imgur.com/dDSJSJ1.jpg "Testing Coverage")
## Front-End Design
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
## Bugs & Known Issues
The functionality of this website is fairly basic, and there are not many things that can fail in terms of the front end of the program. 

The only issue that I am aware of at the moment is that the update button will not hide if the delete button is pressed on the task that is set to update. Although this bar is then removed if the page is refreshed. Although it is an issue, it does not affect the core functionality of the website and is not a serious threat.
## Future Improvements/Stretch Goals
As set out in my original project plan, there were some stretch goals outlined. The ultimate aim of the project is to make the board feel as traditional and non-digital as possible. To do this I would like to add a few features that give the user maximum control over the board. Three things that I would like to add to achieve this are:

- Ability to change the colour of the post it notes so that the user can organise tasks based on their priority and urgency.
- Ability to move the post it notes around the page with complete freedom so they can sort the notes into different sections of the page for organisation.
- Ability for the user to add their own images. If this website is going to be kept open on a screen, it would be nice for a user to add pictures of their family, like on a traditional board. This adds a level of personalisation to the page that will keep the user interested in the website and encourage return traffic.

## Author
Jonathan Hunt

## Acknowledgements

Postman: https://www.postman.com/

SpringBoot: https://spring.io/projects/spring-boot

Jira: https://www.atlassian.com/software/jira

Eclipse: https://www.eclipse.org/

Visual Studio Code: https://code.visualstudio.com/

Bootstrap: https://getbootstrap.com/

JUnit: https://junit.org/junit5/

Mockito: https://site.mockito.org/

Git: https://github.com/


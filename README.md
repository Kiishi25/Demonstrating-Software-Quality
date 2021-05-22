# Demonstrating-Software-Quality
The aim of this project is to show how to deliver quality assurance in a software project. This README.md file can only be used as a guide line by the team when enforcing best quality practices on the project. The following items will be demonstrated in the document:
* Scrum sprint backlog and task estimation
* Unit testing and Test-Driven development
* Test coverage metric
* Team version-control 
* Code-review checklist

# Sprint Backlog & Task Estimatinon
### Sprint Backlog
| Task        | Point Estimation      | Priority  |Status   | Responsible   |
| :---        |    :----:   |         :---: |:---        |    :----:   | 
| Create POJOs.   | 1        | 1    | Completed   | Kiishi Ifebajo   |
| Create Controller class.    | 1        | 2   | Completed   | Kiishi Ifebajo   |
| Investigate and configure test coverage tools.   | 2       | 3   | Completed   | Kiishi Ifebajo   |
| Create method to add a Criterion.   | 2       |  4     | Completed   | Kiishi Ifebajo   |
| Create method to add a Student Grade.  | 2       |  5     | Completed   | Kiishi Ifebajo   |
| Create method for creating new rubrics. | 2       |  6     | Completed   | Kiishi Ifebajo   |
| Create method to add a Criterion to a Rubric | 2       |  7     | Completed   | Kiishi Ifebajo   |
| Create method to get a specific rubric by name   | 2       |  8     | Completed   | Kiishi Ifebajo   |
| Create method to create new student grade   | 2       |  9     | Completed   | Kiishi Ifebajo   |
| Create method to get a list of all Rubrics   | 2       |  10     | Completed   | Kiishi Ifebajo   |
| Create method to add a score for a particular criterion to a grade  | 2       |  11     | Completed   | Kiishi Ifebajo   |
| Create method to get all StudentGrades associated with a specific Rubric  | 2       |  12     | Completed   | Kiishi Ifebajo  |
| Create method to find average score of all student grades in a rubric | 3       |  13     | Completed   | Kiishi Ifebajo   |
| Create method to find standard deviation of all student grades in a rubric| 3       |  14     | Completed   | Kiishi Ifebajo  |
| Create method to find the minimum and maximum scores in a rubric| 3       |  15     | Completed   | Kiishi Ifebajo   |
| Create method to find average score of all student grades in a specific criterion of a rubric.| 3       |  16     | Completed   | Kiishi Ifebajo   |
| Create method to find standard deviation of all student grades in a specific criterion of a rubric.| 3       |  17     | Completed   | Kiishi Ifebajo   |
| Create method to find the minimum and maximum scores in a specific criterion of a rubric.| 3       |  18     | Completed   | Kiishi Ifebajo   |
<br />


###  Reason for Task Estimatinon
 I used story points to estimate tasks in the sprint backlog. Agile estimation is a method of measuring the time and effort required to accomplish a development task. The objective of Story Points is to make team estimating easier. Teams evaluate just how much time a product backlog item will take in comparison to other product backlog items, rather than looking at it and measuring it in hours.

Fibonacci sequence numbers were used to determine the estimations for the corresponding tasks. I chose the Fibonacci series because it permits proportional scaling of estimates rather than a linear number scale. In contrast to a linear scale of 1,2,3,4...etc, The Fibonacci sequence goes as follows: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89… and so on. Written as a rule, the expression is: 
**Xn = Xn-1 + Xn-2**

Bigger more complex tasks get more points and smaller tasks get fewer points. For example, the first task Creating POJOs is set as a baseline as it is mostly just generating getters and setters for variables. I set the estimation as 1 because it is quick to deliver and minimal complexity. Which should take about an hour. I know exactly what needs to be done and its going to take me little time. With reference to the baseline, I then estimated other tasks in terms of difficulty, frequency, and risk required. For the task Create method to find average score of all student grades in a specific criterion of a rubric was assigned an estimation of 3 as it takes a moderate time to deliver, moderate complexity with possible unknowns. I have a good idea what needs to be done, but it is going to take me a bit of time. On the order of about a day or more to deliver.

<p align="left">
  <img src="https://cdn-cashy-static-assets.lucidchart.com/marketing/blog/2020Q3/fibonacci-scale-agile/Fibonacci-scale.png"
        alt="Fibonacci sequence" width="500"/>
</p>

<br />

### Velocity
The primary metric in Scrum is velocity, which is an indicator of how much work a team can do in a single Sprint. Velocity is determined by adding the points for all completed User Stories at the end of the Sprint. The total number of user stories committed during a sprint should not exceed the average velocity of the past sprints.
The Team's main feedback mechanism is Velocity. It allows them to see if the improvements they make to their processes are helping or affecting their efficiency. Although the Scrum Team's velocity can fluctuate from Sprint to Sprint, a well-functioning Scrum Team's velocity should gradually increase by about 10% each Sprint over time. A decrease in average velocity is usually a sign that some part of the team's development process has become inefficient and should be brought up at the next retrospective.

The steps involved in Velocity-based Sprint Planning are as follows:

1. Calculate the team’s average velocity (from last 3 Sprints)
2. Select the items from the product backlog equal to the average velocity
3. Verify whether the tasks associated with the selected user stories are appropriate for the particular sprint
4. Estimate the tasks and check if the total work is consistent with past sprints


<p align="left">
  <img src="https://www.sealights.io/wp-content/uploads/2018/08/figure2.jpg"
        alt="Velocity" width="500"/>
</p>

It can also be visualized as the slope in a classic burndown chart.

<p align="left">
  <img src="https://agilewarrior.files.wordpress.com/2013/06/burndown-3-details.png?w=540"
        alt="Velocity" width="500"/>
</p>

###  Unit testing and Test-Driven development
Test Driven Development (TDD) is software development approach in which test cases are developed to specify and validate what the code will do. In simple terms, test cases for each functionality are created and tested first and if the test fails then the new code is written in order to pass the test and making code simple and bug-free. For example: testGetAllStudentGrades. The test passes if all names are found. **Link**  https://github.com/Kiishi25/Demonstrating-Software-Quality/pull/3/commits/73711f7fc520903e63162d63f0e9de5ec76cde06
<p align="left">
  <img src="http://19yw4b240vb03ws8qm25h366-wpengine.netdna-ssl.com/wp-content/uploads/Test-driven-development-cycle-Cybus-Nordic-APIs.png"
        alt="Test Driven" width="500"/>
</p>

##  Test Covering Metric

Test coverage is a measure used to describe the degree to which the source code of a program is executed when a particular test suite runs. A program with high test coverage, measured as a percentage, has had more of its source code executed during testing, which suggests it has a lower chance of containing undetected software bugs compared to a program with low test coverage. Many different metrics can be used to calculate test coverage; 

* Red -> Lines of code are not covered by a unit test

* Green -> Lines of code are covered by a unit test


##  Gitflow WorkFlow for Team Version Control
GitFlow is a cloning framework that helps you decide which branches to create and how they should be combined. By splitting the sprint tasks into separate branches, I was able to use this workflow. Rather than making only one branch, I split it into two: a main branch and a develop branch. Each function branch is then split off from develop and integrated back into develop once the task is completed.

##  Code Review

The primary purpose of code review is to make sure that the overall code health of Google’s code base is improving over time. All of the tools and processes of code review are designed to this end. There are code review tools and software, but the concept itself is important to understand. Code reviews should integrate with a team’s existing process.

 For example, if a team is using task branching workflows, initiate a code review after all the code has been written and automated tests have been run and passed–but before the code is merged upstream. This ensures the code reviewer’s time is spent checking for things machines miss, and prevents poor coding decisions from polluting the main line of development. 
<p align="left">
  <img src="https://cdn-media-1.freecodecamp.org/images/1*c8t6OXt7tMEUpeki-HEobg.jpeg"
        alt="Code Review" width="500"/>
</p>

1. **Readability**
Readability in software means that the code is easy to understand. In this case, understanding code means being able to easily see the code’s inputs and outputs, what each line of code is doing, and how it fits into the bigger picture.

2. **Security**
Security vulnerabilities often enter codebases because developers write code without thinking about security. This might mean that they write insecure code that introduces vulnerabilities into the system, or use libraries and tools that are out-of-date or have known security issues.

3. **Speed and Performance**
Consider performance across two dimensions: performance for users and resource consumption. Performance for users reflects a focus on how quickly your code performs for the end user. Lengthy database queries, unoptimized assets, and multiple API requests can all work to make your code feel slow.

4. **Reusability**
Check that the code is written with likely future use-cases in mind. For example, if you're reviewing code for a marketplace that is rapidly expanding its product range, make sure that the code can easily be updated to support new kinds of products in the future.

5. **Test Coverage and Test Quality**
Code review is as important for tests as it is for the code that is tested. This is because a flawed test is more dangerous than having no test. Passing tests allows the developer to feel secure and willing to push new code to production. But what if one of the tests is passing for the wrong reason, or isn’t testing what it is supposed to test? This kind of test can be a ticking time bomb, allowing bugs to sneak into your codebase.


6. **Scalability**
Consider scalability by imagining what might happen to the code you’re reviewing if it were put under unexpected load. What happens to your homepage if it goes viral and is hit with dozens of requests per second? What happens if a user with thousands of activities in your app decides to view their full activity log? 

7. **Documentation**
Check whether the code you’re reviewing requires extra documentation to go along with it. If it’s a new project, this means ensuring it has an adequate readme that explains why the project exists and how to use it.
**Link to my Commit**
https://github.com/Kiishi25/Demonstrating-Software-Quality/pull/1

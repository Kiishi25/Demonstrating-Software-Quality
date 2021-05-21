# Demonstrating-Software-Quality
The aim of this project is to show how to deliver quality assurance in a software project. This README.md file can only be used as a guide line by the team when enforcing best quality practices on the project. The following items will be demonstrated in the document:
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
 I used story points to estimates tasks in the sprint backlog. Agile estimation is a method of measuring the time and effort required to accomplish a development task. The objective of Story Points is to make team estimating easier. Teams evaluate just how much time a product backlog item will take in comparison to other product backlog items, rather than looking at it and measuring it in hours.

Fibonacci sequence numbers are used to determine the estimations for the corresponding tasks. I chose the Fibonacci series because it permits proportional scaling of estimates rather than a linear number scale. In contrast to a linear scale of 1,2,3,4...etc, The Fibonacci sequence goes as follows: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89… and so on. Written as a rule, the expression is: 
**Xn = Xn-1 + Xn-2**

Bigger more complex tasks get more points and smaller tasks get fewer points. For example, the first task Creating POJOs is set as a baseline as it is mostly just generating getters and setters for variables. I set the estimation as 1 because it is quick to deliver and minimal complexity. Which should take about an hour. I know exactly what needs to be done and its going to take me little time. With reference to the baseline, I then estimated other tasks in terms of difficulty, frequency, and risk required For the task Create method to find average score of all student grades in a specific criterion of a rubric was assigned an estimation of 3 as it takes a moderate time to deliver, moderate complexity with possible unknowns. I have a good idea what needs to be done, but it is going to take me a bit of time. On the order of about a day or more to deliver.

<p align="left">
  <img src="https://cdn-cashy-static-assets.lucidchart.com/marketing/blog/2020Q3/fibonacci-scale-agile/Fibonacci-scale.png"
        alt="Fibonacci sequence" width="500"/>
</p>

<br />

### Velocity
The primary metric in Scrum is velocity, which is an indicator of how much work a team can do in a single Sprint. Velocity is determined by adding the points for all completed User Stories at the end of the Sprint. The total number of user stories committed during a sprint should not exceed the average velocity of the past sprints.
The Team's main feedback mechanism is Velocity. It allows them to see if the improvements they make to their processes are helping or affecting their efficiency. Although the Scrum Team's velocity can fluctuate from Sprint to Sprint, a well-functioning Scrum Team's velocity should gradualy increase by about 10% each Sprint over time. A decrease in average velocity is usually a sign that some part of the team's development process has become inefficient and should be brought up at the next retrospective.

The steps involved in Velocity-based Sprint Planning are as follows:

1. Calculate the team average velocity (from last 3 Sprints)
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
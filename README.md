# Demonstrating-Software-Quality
The aim of this project is to show how to deliver quality assurance in a software project. This README.md file can only be used as a guide line by the team when enforcing best quality practices on the project. The following items will be demonstrated in the document:
* Scrum sprint backlog and task estimation
* Unit testing and Test-Driven development
* Test coverage metric
* Team version-control 
* Code-review checklist

# Sprint Backlog & Task Estimatinon
## Sprint 
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

# Sprint Backlog & Task Estimatinon
##  Reason for Task Estimatinon
 I used story points to estimate tasks in the sprint backlog. Agile estimation is a method of measuring the time and effort required to accomplish a development task. The objective of Story Points is to make team estimating easier. Teams evaluate just how much time a product backlog item will take in comparison to other product backlog items, rather than looking at it and measuring it in hours.

Fibonacci sequence numbers were used to determine the estimations for the corresponding tasks. I chose the Fibonacci series because it permits proportional scaling of estimates rather than a linear number scale. In contrast to a linear scale of 1,2,3,4...etc, The Fibonacci sequence goes as follows: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89… and so on. Written as a rule, the expression is: Xn = Xn-1 + Xn-2

Bigger more complex tasks get more points and smaller tasks get fewer points. For example, the first task Creating POJOs is set as a baseline as it is mostly just generating getters and setters for variables. I set the estimation as 1 because it is quick to deliver and minimal complexity. Which should take about an hour. I know exactly what needs to be done and its going to take me little time. With reference to the baseline, I then estimated other tasks in terms of difficulty, frequency, and risk required. For the task Create method to find average score of all student grades in a specific criterion of a rubric was assigned an estimation of 3 as it takes a moderate time to deliver, moderate complexity with possible unknowns. I have a good idea what needs to be done, but it is going to take me a bit of time. On the order of about a day or more to deliver.

<p align="left">
  <img src="https://cdn-cashy-static-assets.lucidchart.com/marketing/blog/2020Q3/fibonacci-scale-agile/Fibonacci-scale.png"
        alt="T-Shirt sizes" width="500"/>
</p>
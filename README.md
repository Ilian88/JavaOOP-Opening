# JavaOOP-Opening

#Task
##Problem description :
###Your task is to create a bakery, which stores employees by creating the classes described below.
First, write a Java class Employee with the following properties:
    • name: String
    • age: int
    • country: String
The class constructor should receive name, age and country and override the ToString() method in the following format:
"Employee: {name}, {age} ({country})"
Next, write a Java class Bakery that has employees (a collection, which stores the entity Employee). All entities inside the repository have the same properties. Also, the Bakery class should have those properties:
    • name: String
    • capacity: int
The class constructor should receive name and capacity, also it should initialize the employees with a new instance of the collection. Implement the following features:
    • Field employees – List that holds added Employees
    • Method add(Employee employee) – adds an entity to the data if there is room for him/her.
    • Method remove(String name) – removes an employee by given name, if such exists, and returns bool.
    • Method getOldestEmployee() – returns the oldest employee.
    • Method getEmployee(string name) – returns the employee with the given name.
    • Getter getCount() – returns the number of employees.
    • report() – returns a string in the following format:
        ◦ "Employees working at Bakery {bakeryName}:
{Employee1}
{Employee2}
(…)"

 

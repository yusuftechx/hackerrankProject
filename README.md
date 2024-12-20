# Used Operator to configure Vehicle Class

<body>
    <h1>Vehicle Class</h1>
    <p>This project implements a <strong>Vehicle class</strong> in Java, designed to simulate basic functionalities of a vehicle such as speed management, fuel calculations, passenger handling, and car state toggling (on/off). It uses Object-Oriented Programming (OOP) principles to provide a modular and flexible structure.</p>
    
<h2>Purpose</h2>
<p>The <strong>Vehicle class</strong> is a demonstration of Java programming concepts, including encapsulation, constructors, method definitions, and interactive user input. It simulates real-world functionalities of a vehicle, allowing developers to practice and understand OOP principles better.</p>

<h2>Features</h2>
    <ul>
        <li>Encapsulation with private variables and public getter/setter methods.</li>
        <li>Ability to manage fuel consumption and calculate distance metrics.</li>
        <li>Passenger management (add and remove passengers).</li>
        <li>Car state management (start and stop the car).</li>
        <li>Real-time updates to car attributes based on user input.</li>
        <li>Customizable car attributes, such as speed, weight, and condition.</li>
    </ul>

<h2>Characteristics</h2>
    <p>The <strong>Vehicle class</strong> includes the following attributes:</p>
    <ul>
        <li><strong>maxSpeed</strong>: The maximum speed of the car.</li>
        <li><strong>minSpeed</strong>: The minimum speed of the car.</li>
        <li><strong>weight</strong>: The weight of the vehicle.</li>
        <li><strong>isCarOn</strong>: A boolean indicating if the car is on or off.</li>
        <li><strong>condition</strong>: A character representing the car's condition (e.g., 'A' for excellent).</li>
        <li><strong>nameOfCar</strong>: The name of the car.</li>
        <li><strong>currentFuel</strong>: The current amount of fuel in gallons.</li>
        <li><strong>maxFuel</strong>: The maximum fuel capacity in gallons.</li>
        <li><strong>mpg</strong>: The car's miles per gallon efficiency.</li>
        <li><strong>numberOfPeopleInCar</strong>: The current number of passengers in the car.</li>
    </ul>

<h2>Methods</h2>
    <p>The <strong>Vehicle class</strong> includes the following methods:</p>
    <ul>
        <li><strong>printVariables()</strong>: Displays all attributes of the car.</li>
        <li><strong>upgradeMinSpeed()</strong>: Updates the minimum speed of the car.</li>
        <li><strong>addPassenger()</strong>: Increases the number of passengers in the car by one.</li>
        <li><strong>removePassenger()</strong>: Decreases the number of passengers in the car by one.</li>
        <li><strong>milesTillEmpty()</strong>: Calculates how many miles can be traveled with the current fuel.</li>
        <li><strong>maxMilesPerFillUp()</strong>: Calculates the maximum miles the car can travel on a full tank.</li>
        <li><strong>startCar()</strong>: Turns the car on.</li>
        <li><strong>stopCar()</strong>: Turns the car off.</li>
    </ul>

<h2>How to Use</h2>
    <ol>
        <li>Compile the code using a Java compiler (e.g., <code>javac Vehicle.java</code>).</li>
        <li>Run the program using the command <code>java Vehicle</code>.</li>
        <li>Follow the prompts to input vehicle details such as speed, weight, condition, etc.</li>
        <li>Interact with the various methods to see how the vehicle's attributes are updated and managed in real-time.</li>
    </ol>

<h2>Performance</h2>
<p>The <strong>Vehicle class</strong> is designed for efficient computation of attributes such as miles per gallon, passenger handling, and toggling the car's state. It ensures proper validation and handling of edge cases, such as attempting to remove passengers when none are present.</p>

<h2>Conclusion</h2>
<p>The <strong>Vehicle class</strong> is a robust implementation of a real-world object in Java. It serves as an excellent example for practicing OOP concepts, while also showcasing how to build functional and interactive Java applications.</p>
</body>

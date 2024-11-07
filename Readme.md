# Final Project

## Overview

This project is a simple console-based application that simulates a zoo management system. It allows users to interact with different animals, set their properties, display their characteristics, and simulate their movements and eating behaviors.

## Project Structure

The project consists of the following main files:

- `Animal.java`: An abstract base class representing a generic animal.
- `Tiger.java`: A class representing a tiger, extending the `Animal` class.
- `Dolphin.java`: A class representing a dolphin, extending the `Animal` class.
- `Penguin.java`: A class representing a penguin, extending the `Animal` class.
- `Main.java`: The main class containing the entry point of the application and the menu system for user interaction.
- `Eat.java`: An interface that defines the eating behavior for animals.
- `Swim.java`: An interface that defines the swimming behavior for animals.
- `Walk.java`: An interface that defines the walking behavior for animals.

## Classes and Their Responsibilities

### Animal.java

- **Properties**: `nameOfAnimal`, `weight`, `height`, `age`
- **Methods**:
    - `getNameOfAnimal()`, `setNameOfAnimal()`
    - `getWeight()`, `setWeight()`
    - `getHeight()`, `setHeight()`
    - `getAge()`, `setAge()`
    - `eatingFood()`: Prints a message indicating the animal is eating.

### Tiger.java

- **Properties**: `numberOfStripes`, `speed`, `soundLevel`
- **Methods**:
    - `getNumberOfStripes()`, `setNumberOfStripes()`
    - `getSpeed()`, `setSpeed()`
    - `getSoundLevel()`, `setSoundLevel()`
    - `walking()`: Prints a message indicating the tiger is walking.
    - `eatingCompleted()`: Prints a message indicating the tiger has finished eating.

### Dolphin.java

- **Properties**: `color`, `swimmingSpeed`
- **Methods**:
    - `getColor()`, `setColor()`
    - `getSwimmingSpeed()`, `setSwimmingSpeed()`
    - `swimming()`: Prints a message indicating the dolphin is swimming.
    - `eatingCompleted()`: Prints a message indicating the dolphin has finished eating.

### Penguin.java

- **Properties**: `walkSpeed`, `swimSpeed`, `isSwimming`
- **Methods**:
    - `getWalkSpeed()`, `setWalkSpeed()`
    - `getSwimSpeed()`, `setSwimSpeed()`
    - `isSwimming()`, `setSwimming()`
    - `walking()`: Prints a message indicating the penguin is walking.
    - `swimming()`: Prints a message indicating the penguin is swimming.
    - `eatingCompleted()`: Prints a message indicating the penguin has finished eating.

### Main.java

- **Responsibilities**:
    - Contains the main method which serves as the entry point of the application.
    - Implements a menu system to choose between different animals and perform various actions on them.
    - Uses `Scanner` for user input.

## Interfaces and Their Responsibilities

### Eat.java

- **Methods**:
    - `eatingFood()`: An abstract method to be implemented by classes that represent animals.

### Swim.java

- **Methods**:
    - `swimming()`: An abstract method to be implemented by classes that represent animals.

### Walk.java

- **Methods**:
    - `walking()`: An abstract method to be implemented by classes that represent animals.

# Zoo Management Application

## Running the Application
1. **Run the main class**: Execute `java Main` to start the application.
2. **Follow the on-screen instructions** to interact with the animals in the zoo.

## Menu System
The application provides a menu system to interact with the animals:

### Animal Choice Menu
- **Options**:
    - **1**: Tiger
    - **2**: Dolphin
    - **3**: Penguin

### Animal Details Manipulation Menu
- **Options**:
    - **1**: Set properties
    - **2**: Display properties
    - **3**: Display movement
    - **4**: Display eating

## Example Usage
1. **Choose an animal** from the animal choice menu.
2. **Set or display the properties** of the chosen animal.
3. **Simulate the movement or eating** behavior of the animal.

## Interacting with the Zoo

### Starting the Application
- **Run the Main class** to start the application.
- You will be presented with the **animal choice menu**.

### Choosing an Animal
- **Select an animal** by entering the corresponding number:
    - **1** for Tiger
    - **2** for Dolphin
    - **3** for Penguin

### Manipulating Animal Details
- After choosing an animal, you will see the **animal details manipulation menu**.
- **Options**:
    - **Set properties**: Enter characteristics like color, speed, etc.
    - **Display properties**: View the current characteristics of the animal.
    - **Display movement**: Simulate the animal's movement (e.g., walking, swimming).
    - **Display eating**: Simulate the animal's eating behavior.

### Setting Properties
- When setting properties, follow the prompts to enter the required details (e.g., color, speed, etc.).

### Displaying Properties
- When displaying properties, the current characteristics of the animal will be shown.

### Simulating Movement
- When displaying movement, the animal's movement behavior (e.g., walking, swimming) will be simulated.

### Simulating Eating
- When displaying eating, the animal's eating behavior will be simulated.

### Continuing or Exiting
- After each action, you will be asked if you want to:
    - **Continue with the current animal** (enter `1`)
    - **Return to the main menu** to choose another animal (enter `2`)

## Enjoy managing your virtual zoo!

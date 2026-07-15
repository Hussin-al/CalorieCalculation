# CalorieCalculation

A project that demonstrates the evolution of a simple Java console application into a modern Angular web application for calculating the **Total Daily Energy Expenditure (TDEE)**.

The repository contains two independent projects:

* **CalorieCalculation** – Java console application implementing the core BMR/TDEE calculation logic.
* **CalorieCalculation-UI** – Angular frontend providing a modern, responsive user interface for the same calculation.

---

## Project Overview

### 1. Java Console Application

The original version of the project focuses on the calculation logic.

**Features**

* Calculate Basal Metabolic Rate (BMR)
* Calculate Total Daily Energy Expenditure (TDEE)
* Store results in `calories.txt`
* Console-based user interaction

**Technologies**

* Java
* Object-Oriented Programming
* File I/O

---

### 2. Angular Web Application

The second project brings the same calculation logic to a modern web interface.

**Features**

* Responsive user interface
* Instant client-side calculation
* Bootstrap-based design
* No backend required

**Technologies**

* Angular
* TypeScript
* HTML
* CSS
* Bootstrap

---

## Repository Structure

```text
CalorieCalculation/
│
├── CalorieCalculation/          # Java console application
│
├── CalorieCalculation-UI/       # Angular frontend
│
└── README.md
```

---

## Getting Started

### Java Application

```bash
cd CalorieCalculation
javac src/dev/Main.java
java -cp src dev.Main
```

### Angular Application

```bash
cd CalorieCalculation-UI
npm install
npm start
```

The Angular application will be available at:

```text
http://localhost:4200
```

---

## How It Works

Both applications calculate:

* Basal Metabolic Rate (BMR)
* Total Daily Energy Expenditure (TDEE)

Required input:

* Weight
* Height
* Age
* Gender
* Activity Level

The Java application stores the result in a text file, while the Angular application performs all calculations directly in the browser.

---

## Calculation Formula

### BMR

**Male**

```text
88.362 + (13.397 × weight)
+ (4.799 × height)
− (5.677 × age)
```

**Female**

```text
447.593 + (9.247 × weight)
+ (3.098 × height)
− (4.330 × age)
```

### TDEE

```text
TDEE = BMR × Activity Factor
```

---

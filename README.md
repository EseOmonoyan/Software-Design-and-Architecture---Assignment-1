# Software-Design-and-Architecture---Assignment-1
Summary
    This project uses the Abstract Factory pattern to make smart-home device families (Bulb+Lock) for various brands (Bulb + Lock) for multiple brands
    (Brand A, Brand B) and uses the style of a Factory-Method to set the usage values upon creation of the objects (battery for locks, power for bulbs).
    The test file reads the valeus from a small text file to simulate a database.

Repository Structure
.
├── devices/                 - Product classes
├── factory/                 - SmartDeviceFactory + BrandAFactory, BrandBFactory
├── test/                    - Main.java (test file)
├── data/                    - Optional: if you store per-brand files here
├── device_values.txt        - test value
├── docs/                    
└── UML Diagram.png          - UML diagram of the design

Design Overview

Patterns Used
    Abstract Factory
    - Concrete classes (BrandAFactory, BrandBFactory).
    - Products created by each brand factory: Bulb and Lock
    Factory-Method step for usage
    - Usage set after object creation that is based on the date that is read from a file.

UML Diagram
- Overview of how classes interact in our code. Found in UML Diagram.png
Test FIle (Run)
    VS Code
    -   Install CodeRunner Extension
    -   Open test/Main.java
    -   Click Run on top right corner
    IntelliJ
    -   Open Main.java
    -   Click Run

Test Data Format (Left side: Device/Brand. Right side: Usage value)
-   BrandA_Bulb_Power:20
-   BrandB_Lock_Battery:130     

Expected Output
-   Smart Bulb with power usage: 10W
-   Smart Lock with battery consumption: 150mAh




# **Welcome to the CarOpsJavaProject!**#
This repository contains a Java project that focuses on car operations and management. Whether you're a car enthusiast, a developer looking to learn more about Java, or someone interested in automotive management systems, this project has something for you.

## **Introduction**

The CarOpsJavaProject aims to provide a comprehensive solution for managing various aspects of car operations. It utilizes Java programming language and incorporates object-oriented principles to create an efficient and scalable system. With this project, you can explore different functionalities related to car management, such as inventory management, maintenance tracking, and more.

## **Class Structure**
Vehicle: Represents a vehicle object with properties like Plate,Brand,Model and ProductionYear.

SystemUser: Represents a user of the system with properties like username,password,firstname,lastname

Engineer : Represents an engineer of the system which extends to a system user and checks if he is availiable or not

VehicleCatalog : Represents a catalogue of the vehicles

Task : Represents the task  with properties like name,cost and estimatedtime

SparePart : Represent the spareparts with properties like Name,CostPerPiece and TotalPieces

TaskAssignments : Represents the task of each engineer with properties like EngineerID,RepairTaskID,status,TaskAssignmentID and time

Report : Represents the reports with parametres like Date and ReportID

Repair : Represents the repairs with parametres like repairid,repairfolder,status,registry and totalrepairs

RepairFolder : Represents the repairfolders with parametres like session,repair,repairfolder,status,estimatedtime,totalcost and registry

Session : Represents the session of each repair with parameters like date,sessionid,totalsessions and folderid
Exchanges : Represent the exchanges with parameters like cost and exchange id
Registry : Contains the arraylists of the JavaProgram and the loops

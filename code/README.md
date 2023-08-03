## **Class Structure**
[Vehicle](https://github.com/iis22023/CarOpsJavaProject/blob/main/src/CarOps/Vehicle.java): Represents a vehicle object with properties like Plate,Brand,Model and ProductionYear.

[SystemUser](https://github.com/iis22023/CarOpsJavaProject/blob/main/src/CarOps/SystemUser.java): Represents a user of the system with properties like username,password,firstname,lastname

[Engineer](https://github.com/iis22023/CarOpsJavaProject/blob/main/src/CarOps/Engineer.java) : Represents an engineer of the system which extends to a system user and checks if he is availiable or not

[VehicleCatalog](https://github.com/iis22023/CarOpsJavaProject/blob/main/src/CarOps/VehicleCatalog.java) : Represents a catalogue of the vehicles

[Task](https://github.com/iis22023/CarOpsJavaProject/blob/main/src/CarOps/Task.java) : Represents the task  with properties like name,cost and estimatedtime

[SparePart](https://github.com/iis22023/CarOpsJavaProject/blob/main/src/CarOps/SparePart.java) : Represent the spareparts with properties like Name,CostPerPiece and TotalPieces

[TaskAssignments](https://github.com/iis22023/CarOpsJavaProject/blob/main/src/CarOps/TaskAssignment.java) : Represents the task of each engineer with properties like EngineerID,RepairTaskID,status,TaskAssignmentID and time

[Report](https://github.com/iis22023/CarOpsJavaProject/blob/main/src/CarOps/Report.java): Represents the reports with parametres like Date and ReportID

[Repair](https://github.com/iis22023/CarOpsJavaProject/blob/main/src/CarOps/Repair.java) : Represents the repairs with parametres like repairid,repairfolder,status,registry and totalrepairs

[RepairFolder](https://github.com/iis22023/CarOpsJavaProject/blob/main/src/CarOps/RepairFolder.java) : Represents the repairfolders with parametres like session,repair,repairfolder,status,estimatedtime,totalcost and registry

[Session](https://github.com/iis22023/CarOpsJavaProject/blob/main/src/CarOps/Session.java) : Represents the session of each repair with parameters like date,sessionid,totalsessions and folderid

[Exchanges](https://github.com/iis22023/CarOpsJavaProject/blob/main/src/CarOps/Exchanges.java) : Represent the exchanges with parameters like cost and exchange id

[Registry](https://github.com/iis22023/CarOpsJavaProject/blob/main/src/CarOps/Registry.java) : Contains the arraylists of the JavaProgram and the loops

[Main](https://github.com/iis22023/CarOpsJavaProject/blob/main/src/CarOps/Main.java) : The entry point of the application, contains the main method to start the program.

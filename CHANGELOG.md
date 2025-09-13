#Changelog

This file keeps track of all the changes made in the project.

---------------------------------------------------
##[1.0.4] -2025-09-09
-Created VehicleResponse and ResidentResponse so that it all show neccessary fields to the user.
##[1.0.3] -2025-09-08
-Added dto table for Visitor, Vehicle, Resident to add values and it only show mandatory fields in swagger(VehicleRequest, VisitorRequest, ResidentRequest)
##[1.0.2] -2025-09-05
-Added new operation to show all data.
-Validation in `getByName` to ensure first name (fname) and last name (lname) contain only letters (no numbers).

##[1.0.1] - 2025-09-04
###Added
- Success and Error messages when Saving Resident and Vehicle.

###Fixed
-Vehicle ID is now hidden in Swagger request.

##[1.0.0] - 2025-09-03
-First Version Created.
-Database Integration with PostgreSql.
-Create Resident and Vehicle API.(Also Vehicle linked with Resident )
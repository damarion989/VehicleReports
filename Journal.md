Phase 1: The basic plan
VehicleReport holds the steps that every report follows: get the GPS data, format the report, and log that it is finished. Putting the shared steps in one place avoids writing the same code twice.

The explanation I am working through is that abstract means VehicleReport is not a complete report by itself. The truck and bike classes must provide the formatting. The final keyword stops them from replacing generateReport and changing its step order.

The Hollywood Principle means the parent method decides when to call the subclass's formatting method. I still need help following how that call reaches the subclass.

Testing note: The assistant compiled VehicleReport with a temporary example class and ran it. The steps printed in the right order.

Phase 2: Truck and bike reports
TruckReport formats heavy cargo information. BikeReport formats small parcel information. Both use the GPS and logging code from VehicleReport. Main creates the two reports and starts them.

VehicleReport still controls the order, even when the object is a truck or bike report. I am still confused about inheritance and how a VehicleReport variable can refer to a TruckReport or BikeReport object. Could we walk through one call to generateReport line by line?

Testing note: The assistant compiled and ran both reports. Each printed GPS collection, its own formatting message, and then the log message.

Phase 3: The optional maintenance check
The maintenance hook is a yes-or-no method. It normally returns false, so maintenance is skipped. TruckReport returns true instead, so the truck gets the check. BikeReport keeps the default answer.

An abstract method has no default code, so a concrete subclass has to fill it in. A hook already has a default answer, so a subclass can leave it alone. I still need practice understanding how overriding a method changes which code runs.

Testing note: The assistant ran the program. The truck's maintenance message appeared after formatting and before logging. The bike had no maintenance message.

Phase 4: Checking the result
The assistant's final run had no compile or runtime errors. The truck printed GPS collection, heavy cargo formatting, maintenance, and logging. The bike printed GPS collection, parcel formatting, and logging.

## A.I ##

i did use a.i to help me with this cuz i was confused about abstract, final inheritance, and hooks, and with telling what each one does when reading the code

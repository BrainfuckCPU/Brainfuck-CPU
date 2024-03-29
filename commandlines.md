| Name | Fullname                 | Description                                                                                  |
|------|--------------------------|----------------------------------------------------------------------------------------------|
| HLT  | Halt                     | Halts the Clock/Stops Execution                                                              |
| RST  | Reset                    | Resets the Tape Memory, Tape Memory Counter and Program Counter, used to restart the program |
| RSM  | Reset Microstep          | Resets the Microstep Counter                                                                 |
| PCE  | Program Counter Enable   | Counts the program counter up                                                                |
| PCD  | Program Counter Down     | Counts the program counter down                                                              |
| PMO  | Program Memory Out       | Writes the current instruction onto the main bus                                             |
| TMO  | Tape Memory Out          | Writes the content of the Tape to the main bus                                               |
| TMI  | Tape Memory In           | Reads the content of the bus to the tape                                                     |
| TCU  | Tape Memory Counter Up   | Counts the memory counter up                                                                 |
| TCD  | Tape memory Counter Down | Counts the memory counter down                                                               |
| CUI  | Counter Unit Increase    | Increses the Counter Unit content                                                            |
| CUD  | Counter Unit Decrease    | Decreases the Counter Unit content                                                           |
| CI   | Counter Unit In          | Reads the content of the Bus into the Counter unit                                           |
| CO   | Counter Unit Out         | Writes the content of the Counter Unit to the Bus                                            |
| IOI  | IO In                    | Reads a single byte from the IO Unit onto the bus                                            |
| IOO  | IO Out                   | Writes the content of the bus to the IO Unit                                                 |
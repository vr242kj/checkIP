# checkIP

The task must be done in Java 8. You need to implement
create a console application that will write a welcome message to the user in the console and offer to enter an IP
address for verification. The entered IP address must be checked
for validity and blacklisting. If the entered IP address is invalid, then the program should display the message
Invalid IP address.
If there is an IP address in the blacklist, the program should display the message "Access disallowed".
If the IP address is not in the blacklist, the program should display the phrase "Accessallowed"

When starting the program and after each check, the program must write "Enter IP address or 'quit' to exit" 
and after entering the value, check the validity of the entered IP address and its presence in the black list. 
Interaction with the program should continue until the user enters the word quit. 
Information on the IP addresses to be blocked must be stored in the blacklist.txt file. 
The file must be located in the same directory as the jar file. The program should pick up updates in the file 
with information on IP addresses without restarting the application. To check the correctness of the program, 
you need to add or remove lines with IP addresses in the blacklist.txt file using any text editor. 
Appropriate application of changes to the application must be done on the fly (without having to restart the application).

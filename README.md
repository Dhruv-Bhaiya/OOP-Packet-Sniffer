The Project was to implement a Packet Sniffer.

#### HOST CLASS
A _DatagramSocket_ object "socket" is created with a specified PORT to send the packets.
The number of packets to be sent can be passed as an arguement.
We loop to call a random string generator to create the specified number of packets. The random string generator creates a string of characters from an alphanumeric character set of a specified length (7 here). The last packet to be sent contains the data starting with the string "quit...".
This string is a packaged in the form of a _DatagramPacket_ object "packet" that can be sent using UDP protocol.

#### ATTACKINGTRAFFIC CLASS
This class inherits the _Host_ class and contains an overloaded generate function which sends either the specified number of packets or 1050 packets by default.

#### REGULARTRAFFIC CLASS
This class inherits the _Host_ class and contains an overloaded generate function which sends either the specified number of packets or 5 packets by default.

#### PORTSCANNING CLASS
This class contains the function _sniff_ which sniffs, analyzes and displays all the information of the packet sent to it.

#### VICTIM/CLIENT CLASS
This class inherits the _PortScanning_ class and receives the incoming packets on a specified a PORT and forwards the packets for sniffing.

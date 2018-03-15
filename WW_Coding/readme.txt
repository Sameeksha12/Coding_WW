1) I have used Eclipse IDE for this coding challenge.

2)
 a) I have used simple concurrent access provided by Java util package.
ConcurrentLinkedQueue which can be accessed by various thread.
Its synchrnized and the java class accessing it, just need to implement 
runnable interface.

The SolutionApp class calls the randomizer thread and prime thread by passing
the input and output queue. 

Randomizer thread generates the number and adds it to the input queue and 
checkes outputqueue for any result for printing.

Prime thread checks input queue for input and calls the isPrime(int num) 
method and add the output to output queue.

The sample run works for 10 numbers and prime number within range 0 to 100 
which can be changed by asking user to give range before starting the threads
and option to end the thread.

b)Console Output:

Sample run for Prime Checker:
Prime checker started
Randomizer started
Added to input queue from randomizer:70
Added to input queue from randomizer:43
 Integer: 70 isPrime: false
 Integer: 43 isPrime: true
Added to input queue from randomizer:60
Added to input queue from randomizer:50
 Integer: 60 isPrime: false
 Integer: 50 isPrime: false
Added to input queue from randomizer:99
 Integer: 99 isPrime: false
Added to input queue from randomizer:83
Added to input queue from randomizer:7
 Integer: 83 isPrime: true
 Integer: 7 isPrime: true
Added to input queue from randomizer:62
 Integer: 62 isPrime: false
Added to input queue from randomizer:92

c) JMS provides the same functionality to communicate between software 
components of application. JMs provide destination Queue instance along with 
the connection between sender/consumer and receiver server.

I would setup destination queue in xml. And then start middleware
application server(eg:Glassfish) compatible with Eclipse. Then I will define 
JNDI Context class as both client and server would need this and it will 
contain the port number server is running on to serve the request received.

I would write the randomizer generating random number and checking in output 
queue which is defined in similar fashion as input queue suing xml initially.
First start by creating JNDI Context instance, get connection factory,create 
connection and use the connection object to create session and lookup for the
input queue and add the elements to it and then lookup output queue if it has
any object to print.

After that write Prime function providing the service to check if the input 
is prime or not which will start by creating JNDI Context instance, get 
connection factory, create connection and session and lookup for the queue 
defined and eventually start connection. And output the start of service and
start checking for input in queue and adding it to output queue defined in 
similar fashion as to input queue using xml.

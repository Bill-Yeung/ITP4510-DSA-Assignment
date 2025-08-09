# Supermarket Waiting Queue Simulation

This Java program simulates a supermarket queue system using a linked queue data structure.  
Customers arrive at a fixed rate (1 per minute), and are served by multiple counters.  
The simulation calculates waiting times and counter usage based on user input.

## Features

- Simulates customer arrivals and service over a given time period.
- Uses a custom linked queue implementation.
- Handles various exceptions (e.g., empty queue, overflow, invalid input).
- Tracks counter availability and customer wait times.

## How to Run

1. Compile all `.java` files in the `Program` directory.
2. Run `SupermarketQueue.java` as the main class.
3. When prompted, enter:
   - Simulation length (in minutes)
   - Number of counters
   - Service time per customer (in minutes)

## Example
--------------SETUP SIMULATION ENVIRONMENT---------------

Input simulation length (min): 2

Input number of counter: 2

--------------START SIMULATION --------------

At the beginning of iteration 1 ...

Input serving time for a new customer: 2

After 1 minute ##

Teller_1 [3] Teller_2 [0] Waiting Queue: [ ]

At the beginning of iteration 2 ...

Input serving time for a new customer: 2

After 2 minute ##

Teller_1 [3] Teller_2 [4] Waiting Queue: [ ]


--------------END SIMULATION --------------

Total minutes simulated: 2 minutes

Number of tellers: 2

Number of customers served: 2 customers


--------------DATA ANALYSIS --------------

Average serving time: 2 minutes

Maximum serving time: 2 minutes

Minimum serving time: 2 minutes

Total waiting time: 4 minutes

Average number of customers waiting in the queue: 1.0

Maximum queue length during the simulation: 1


## Project Structure

Program/  
├── LinkedList.java  
├── LinkedQueue.java  
├── Queue.java  
├── SupermarketQueue.java  
├── ListNode.java  
├── EmptyListException.java  
├── NegativeZeroException.java  
├── OverflowException.java  
├── QueueEmptyException.java  
├── QueueFullException.java  
├── WrongDataTypeException.java  

## Notes

- All exception classes are custom-built to handle specific edge cases.  
- The queue system is designed to be modular and reusable.  
- Customers are served in the order they arrive (FIFO).

## Custom Exceptions

This project includes several custom exception classes to handle specific edge cases and ensure robust input validation and queue operations.

| Exception Class             | Description |
|----------------------------|-------------|
| `NegativeZeroException`    | Thrown when the user inputs `0` or a negative number where only positive values are allowed. <br>**Example:** Simulation minutes and counter count must be positive; service time must not be negative. |
| `OverflowException`        | Thrown when the user inputs a number larger than the maximum value for a 32-bit signed integer (`2,147,483,647`). <br>**Example:** Inputting `2147483648` will trigger this exception. |
| `WrongDataTypeException`   | Thrown when the user inputs a value of the wrong data type. <br>**Example:** Entering a string or decimal when an integer is expected. |
| `QueueFullException`       | Thrown when the queue reaches its maximum capacity. |
| `QueueEmptyException`      | Thrown when attempting to dequeue from an empty queue. |
| `EmptyListException`       | Thrown when operations are performed on an empty linked list. |

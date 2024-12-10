# Tutorial Questions 10 December 2024

### What is a kernel of an OS?
The kernel is the core component of an operating system (OS) that manages system resources and facilitates communication between hardware and software. It operates in a privileged mode, allowing it to execute low-level operations such as managing memory, processes, and device drivers. The kernel handles system calls from user applications and ensures that they operate within the constraints of the system's resources.

### What is multiprogramming?
Multiprogramming is an OS capability that allows multiple processes to be loaded into memory and executed concurrently. The OS manages the execution of these processes by switching between them, maximizing CPU utilization and minimizing idle time. This is achieved by keeping several processes in memory and using techniques like context switching to allow the CPU to work on one process while others are waiting for I/O operations or other events.

### How is the execution context of a process used by the OS?
The execution context of a process includes all the information the OS needs to manage the process's execution, such as its program counter, register values, memory management information, and process state. When a context switch occurs (when the OS switches from one process to another), the OS saves the current process's execution context and loads the execution context of the next process to be run. This allows processes to resume execution from where they left off.

### List and briefly explain five storage management responsibilities of a typical OS.
1. **Memory Allocation**: The OS allocates memory to processes as needed and keeps track of which parts of memory are in use and which are free.
2. **Memory Protection**: The OS ensures that processes do not interfere with each other’s memory space, providing isolation and security.
3. **Virtual Memory Management**: The OS uses techniques like paging and segmentation to extend the apparent amount of memory available to processes beyond the physical memory.
4. **Swapping**: The OS can move processes between main memory and disk storage to optimize memory usage and ensure that active processes have the necessary memory resources.
5. **File System Management**: The OS manages data storage on disk drives, organizing files and directories, and providing access control and data integrity.

### Explain the distinction between a real address and a virtual address.
- **Real Address**: Also known as a physical address, this is the actual address in the computer's physical memory (RAM). It refers to a specific location where data is stored.
- **Virtual Address**: This is an address used by a program to access memory, which the OS translates into a real address through a process called address translation. Virtual addresses allow programs to use a larger address space than is physically available, providing abstraction and isolation among processes.

### Describe the round robin scheduling technique.
Round Robin (RR) is a preemptive scheduling algorithm used in time-sharing systems. Each process is assigned a fixed time slice (quantum) to execute. When a process's time slice expires, it is placed at the back of the queue, and the CPU scheduler selects the next process in the queue to execute. This method ensures that all processes receive equal CPU time, promoting fairness and responsiveness in multitasking environments.

### Explain the difference between a monolithic kernel and a microkernel.
- **Monolithic Kernel**: A monolithic kernel is a single large program that contains all the core functions of the OS, including device drivers, file system management, and memory management, all running in kernel mode. This can lead to better performance but less modularity and maintainability.
- **Microkernel**: A microkernel contains only the most essential functions of the OS, such as inter-process communication and basic scheduling, while other services (e.g., device drivers, file systems) run in user space. This design promotes modularity, easier debugging, and better security but may incur performance overhead due to increased context switching.

### What is multithreading?
Multithreading is the ability of a CPU or a single core in a multi-core processor to provide multiple threads of execution concurrently. Threads are the smallest unit of processing that can be scheduled by an OS. Multithreading allows for more efficient CPU usage and can improve application responsiveness by allowing multiple operations to occur simultaneously, such as handling user input while performing background calculations.

### Why is user mode and kernel mode considered good operating system design?
User mode and kernel mode are two distinct operating modes in an OS that enhance security and stability. 

- **User Mode**: In this mode, applications run with limited privileges, preventing them from directly accessing hardware or critical system resources. This isolation protects the OS and other processes from potential errors or malicious actions by user applications.
- **Kernel Mode**: The OS runs in kernel mode with full access to hardware and system resources. This allows it to perform sensitive operations safely.

**Example**: When a user application needs to read a file, it makes a system call to the OS. This triggers a switch from user mode to kernel mode, allowing the OS to access the file system and read the requested data. After the operation is completed, control returns to the user application, switching back to user mode.

### Explain why OSs evolved from simple batch systems to multi-programmed batch systems.
Simple batch systems executed jobs sequentially, which led to inefficient CPU utilization as the CPU would remain idle while waiting for I/O operations to complete. To address this, multi-programmed batch systems were developed, allowing multiple jobs to reside in memory simultaneously. This way, when one job was waiting for I/O, the CPU could switch to another job, improving overall system throughput and resource utilization.

### Explain why OSs evolved from multi-programmed batch systems to time-sharing systems.
The evolution from multi-programmed batch systems to time-sharing systems was driven by the need for interactive computing. Users wanted to interact with the system in real-time rather than waiting for batch jobs to complete. Time-sharing systems allowed multiple users to share system resources, providing each with a small time slice of CPU time. This enabled more responsive interactions and facilitated the development of applications that required immediate feedback, such as text editors and interactive databases.
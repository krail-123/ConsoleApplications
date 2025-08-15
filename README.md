Problem: Task Manager API (Console Version)

Goal: Build a simple console-based Java program that manages tasks with deadlines, priority, and status.

Requirements:

Task Details:

ID 

Title

Priority (HIGH, MEDIUM, LOW)

Deadline (date in yyyy-MM-dd format)

Status (PENDING, IN_PROGRESS, COMPLETED)

Features:

Add Task

Update Task (change title, priority, deadline, or status)

Delete Task by ID

List All Tasks sorted by:

Nearest deadline first

Then by priority (HIGH > MEDIUM > LOW)

Search Task by title keyword

Constraints:

Use Java Collections (List, Map, or both)

Store tasks in memory (no DB)

Validate inputs (e.g., date format, priority values)

Avoid duplicate titles

Keep it menu-driven so user can choose options repeatedly

Bonus points if you:

Use Enums for Priority and Status

Implement sorting using Comparator

Handle invalid inputs gracefully (loop until valid)
